package com.horl.web;

import com.horl.domain.ShortUrl;
import com.horl.repository.ShortUrlRepository;
import com.horl.service.ShortUrlService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
public class IndexController {

    private final ShortUrlService shortUrlService;

    @GetMapping("/asd")
    public Mono<String> index() {
        log.info("start");
        return shortUrlService.get("asd")
                .map(ShortUrl::getKey);
    }
}
