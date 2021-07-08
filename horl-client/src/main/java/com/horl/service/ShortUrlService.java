package com.horl.service;

import com.horl.domain.ShortUrl;
import com.horl.repository.ShortUrlRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class ShortUrlService {

    private final ShortUrlRepository shortUrlRepository;

    public Mono<ShortUrl> get(String key) {
        return Mono.justOrEmpty(shortUrlRepository.findByKey(key))
            .switchIfEmpty(Mono.error(new RuntimeException("not exists key=" + key)));
    }
}
