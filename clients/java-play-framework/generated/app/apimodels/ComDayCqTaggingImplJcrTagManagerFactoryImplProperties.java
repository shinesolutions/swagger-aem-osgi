package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqTaggingImplJcrTagManagerFactoryImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties   {
  @JsonProperty("validation.enabled")
  @Valid

  private ConfigNodePropertyBoolean validationEnabled;

  public ComDayCqTaggingImplJcrTagManagerFactoryImplProperties validationEnabled(ConfigNodePropertyBoolean validationEnabled) {
    this.validationEnabled = validationEnabled;
    return this;
  }

   /**
   * Get validationEnabled
   * @return validationEnabled
  **/
  public ConfigNodePropertyBoolean getValidationEnabled() {
    return validationEnabled;
  }

  public void setValidationEnabled(ConfigNodePropertyBoolean validationEnabled) {
    this.validationEnabled = validationEnabled;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

