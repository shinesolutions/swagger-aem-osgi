package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties   {
  
  private ConfigNodePropertyString nonValidChars = null;

  public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties () {

  }

  public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties (ConfigNodePropertyString nonValidChars) {
    this.nonValidChars = nonValidChars;
  }

    
  @JsonProperty("nonValidChars")
  public ConfigNodePropertyString getNonValidChars() {
    return nonValidChars;
  }
  public void setNonValidChars(ConfigNodePropertyString nonValidChars) {
    this.nonValidChars = nonValidChars;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties = (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties) o;
    return Objects.equals(nonValidChars, comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.nonValidChars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonValidChars);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties {\n");
    
    sb.append("    nonValidChars: ").append(toIndentedString(nonValidChars)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
