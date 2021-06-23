package orchowski.tomasz.ecommercedemo.command;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemCommand {

    private Long id;

    @Size(min = 20, max = 1000,message = "Description must contains at least 20 characters and less than 1000")
    @NotBlank
    private String description;

    @Min(value = 0, message = "Price have to be greater than 0")
    @NotNull
    private Double price;

    @Min(value = 0, message = "Stock have to be at least 0")
    @NotNull
    private Integer stock;

}
