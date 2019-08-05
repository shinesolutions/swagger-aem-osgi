package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties   {
  @JsonProperty("supportedPaths")
  private ConfigNodePropertyArray supportedPaths = null;

  public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties supportedPaths(ConfigNodePropertyArray supportedPaths) {
    this.supportedPaths = supportedPaths;
    return this;
  }

   /**
   * Get supportedPaths
   * @return supportedPaths
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.supportedPaths, comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.supportedPaths);
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

