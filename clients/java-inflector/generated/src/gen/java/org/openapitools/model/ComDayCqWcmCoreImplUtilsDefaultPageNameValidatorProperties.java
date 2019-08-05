package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties   {
  @JsonProperty("nonValidChars")
  private ConfigNodePropertyString nonValidChars = null;

  /**
   **/
  public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties nonValidChars(ConfigNodePropertyString nonValidChars) {
    this.nonValidChars = nonValidChars;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nonValidChars")
  public ConfigNodePropertyString getNonValidChars() {
    return nonValidChars;
  }
  public void setNonValidChars(ConfigNodePropertyString nonValidChars) {
    this.nonValidChars = nonValidChars;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

