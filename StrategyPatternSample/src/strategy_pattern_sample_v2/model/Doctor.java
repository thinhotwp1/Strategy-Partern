package strategy_pattern_sample_v2.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Doctor extends Person{
    private String anotherProperties;
}
