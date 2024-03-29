package ru.job4j.v1.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
@Schema(description = "Информация о пользователе")
@Data
public class CustomerDto {
    @Schema(description = "Идентификатор")
    private int id;
    @Schema(description = "Фамилия")
    private String name;
    @Schema(description = "Почта")
    private String email;
}
