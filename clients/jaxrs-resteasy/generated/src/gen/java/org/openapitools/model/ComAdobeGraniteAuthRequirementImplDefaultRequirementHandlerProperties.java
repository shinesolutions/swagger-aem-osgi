package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties   {
  
  private ConfigNodePropertyArray supportedPaths = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("supportedPaths")
  public ConfigNodePropertyArray getSupportedPaths() {
    return supportedPaths;
  }
  public void setSupportedPaths(ConfigNodePropertyArray supportedPaths) {
    this.supportedPaths = supportedPaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties = (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties) o;
    return Objects.equals(supportedPaths, comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.supportedPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties {\n");
    
    sb.append("    supportedPaths: ").append(toIndentedString(supportedPaths)).append("\n");
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
