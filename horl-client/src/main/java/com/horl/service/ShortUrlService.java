package com.horl.service;

import com.horl.domain.ShortUrl;
import com.horl.exception.AlreadyUrlExists;
import com.horl.repository.ShortUrlRepository;
import com.horl.web.request.CreateShortUrl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class ShortUrlService {

    private final ShortUrlRepository shortUrlRepository;

    @Transactional
    public Mono<ShortUrl> create(CreateShortUrl request) {
        if (shortUrlRepository.existsByUrl(request.getUrl())) {
            throw new AlreadyUrlExists();
        }

        return Mono.just(shortUrlRepository.save(ShortUrl.builder()
                .url(request.getUrl())
                .build()));
    }

    public Mono<ShortUrl> get(String key) {
        return Mono.justOrEmpty(shortUrlRepository.findByKey(key))
                .switchIfEmpty(Mono.error(new RuntimeException("not exists key=" + key)));
    }
}
