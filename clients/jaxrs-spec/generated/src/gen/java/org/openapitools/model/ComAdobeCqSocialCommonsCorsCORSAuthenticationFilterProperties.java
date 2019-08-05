package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties   {
  
  private @Valid ConfigNodePropertyBoolean corsEnabling = null;

  /**
   **/
  public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties corsEnabling(ConfigNodePropertyBoolean corsEnabling) {
    this.corsEnabling = corsEnabling;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cors.enabling")
  public ConfigNodePropertyBoolean getCorsEnabling() {
    return corsEnabling;
  }
  public void setCorsEnabling(ConfigNodePropertyBoolean corsEnabling) {
    this.corsEnabling = corsEnabling;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties = (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties) o;
    return Objects.equals(corsEnabling, comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.corsEnabling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corsEnabling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties {\n");
    
    sb.append("    corsEnabling: ").append(toIndentedString(corsEnabling)).append("\n");
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

