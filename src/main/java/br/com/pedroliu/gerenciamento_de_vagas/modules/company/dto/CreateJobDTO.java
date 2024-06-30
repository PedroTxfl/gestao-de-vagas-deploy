package br.com.pedroliu.gerenciamento_de_vagas.modules.company.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Data;

@Data
public class CreateJobDTO {
    
    @Schema(example = "Vaga para pessoa desenvolvedora Java", requiredMode = RequiredMode.REQUIRED)
    private String description;
    
    @Schema(example = "GymPass, Unimed", requiredMode = RequiredMode.REQUIRED)
    private String benefits;

    @Schema(example = "PLENO", requiredMode = RequiredMode.REQUIRED)
    private String level;
}
