package kodlama.io.rentACar.core.utilities.excaptions;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ValidationProblemDetails extends ProblemDetails {
    private Map<String, String> validationErrors;
}
