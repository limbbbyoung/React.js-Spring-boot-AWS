package com.example.demo;

import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * DemoModel.java
 * Class lombok Test
 *
 * @author 임병영
 * @since 2022.11.23
 */

@Builder
@RequiredArgsConstructor
public class DemoModel {

    @NonNull
    private String id;
}
