package com.tmdals190.practice.springboot.web.dto;

import org.junit.Test;
import  static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    //롬복 기능 테스트 추가
    @Test
    public void 롬복_기능_테스트() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
