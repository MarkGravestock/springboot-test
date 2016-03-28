package com.markgravestock.customer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class Greeting {

    @Getter
    private final long id;
    @Getter
    private final String content;
}