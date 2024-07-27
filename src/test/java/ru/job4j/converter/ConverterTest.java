package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert140RblThen2Dollar() {
        float input = 140;
        float expected = 2.33f;
        float output = Converter.rubleToDollar(input);
        float value = 0.01f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}