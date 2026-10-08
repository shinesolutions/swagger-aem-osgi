package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("validation.enabled")
  private ConfigNodePropertyBoolean validationEnabled;

  /**
   * 
   * @return validationEnabled
   */
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
    return Objects.equals(this.validationEnabled, comDayCqTaggingImplJcrTagManagerFactoryImplProperties.validationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationEnabled);
  }

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
