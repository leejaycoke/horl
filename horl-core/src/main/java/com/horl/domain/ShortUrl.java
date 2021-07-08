package com.horl.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Table(indexes = {
        @Index(name = "IDX_SHORT_URL_KEY", columnList = "key")}
)
@Getter
@NoArgsConstructor(access = PROTECTED)
public class ShortUrl extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false, length = 12)
    private String key;

    @Builder
    public ShortUrl(String key) {
        this.key = key;
    }
}
