package com.horl.web;

import com.horl.domain.ShortUrl;
import com.horl.service.ShortUrlService;
import com.horl.web.request.CreateShortUrl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
public class IndexController {

    private final ShortUrlService shortUrlService;

    @PostMapping("/api/short-urls")
    public Mono<ShortUrl> create(@RequestBody @Valid CreateShortUrl request) {
        return shortUrlService.create(request);
    }
}
