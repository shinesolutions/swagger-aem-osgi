package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqTaggingImplJcrTagManagerFactoryImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties   {
  @JsonProperty("validation.enabled")
  private ConfigNodePropertyBoolean validationEnabled = null;

  public ComDayCqTaggingImplJcrTagManagerFactoryImplProperties validationEnabled(ConfigNodePropertyBoolean validationEnabled) {
    this.validationEnabled = validationEnabled;
    return this;
  }

   /**
   * Get validationEnabled
   * @return validationEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getValidationEnabled() {
    return validationEnabled;
  }

  public void setValidationEnabled(ConfigNodePropertyBoolean validationEnabled) {
    this.validationEnabled = validationEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqTaggingImplJcrTagManagerFactoryImplProperties comDayCqTaggingImplJcrTagManagerFactoryImplProperties = (ComDayCqTaggingImplJcrTagManagerFactoryImplProperties) o;
    return Objects.equals(validationEnabled, comDayCqTaggingImplJcrTagManagerFactoryImplProperties.validationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationEnabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties {\n");
    
    sb.append("    validationEnabled: ").append(toIndentedString(validationEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

