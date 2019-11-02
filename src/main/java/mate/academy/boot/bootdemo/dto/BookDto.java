package mate.academy.boot.bootdemo.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookDto {

    @NotNull
    @NotEmpty
    private String title;

    @NotNull
    @NotEmpty
    private Double price;

    @NotNull
    @NotEmpty
    private Integer year;
}
