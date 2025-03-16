package com.hanghae.movie;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class UrlStringTest {

    @DisplayName("url 형식이 아니면 예외가 발생한다")
    @ValueSource(strings = {"image.png"})
    @ParameterizedTest
    void validate(String url) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new UrlString(url));
    }
}
