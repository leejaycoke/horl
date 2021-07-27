package com.horl.repository;

import com.horl.domain.QShortUrl;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import static com.horl.domain.QShortUrl.shortUrl;

@RequiredArgsConstructor
public class ShortUrlRepositoryImpl implements ShortUrlRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

}
