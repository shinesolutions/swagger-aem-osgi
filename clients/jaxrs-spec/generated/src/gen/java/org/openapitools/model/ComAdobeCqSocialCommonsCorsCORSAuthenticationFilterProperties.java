package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties   {
  private ConfigNodePropertyBoolean corsEnabling;

  public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties() {
  }

  /**
   **/
  public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties corsEnabling(ConfigNodePropertyBoolean corsEnabling) {
    this.corsEnabling = corsEnabling;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cors.enabling")
  @Valid public ConfigNodePropertyBoolean getCorsEnabling() {
    return corsEnabling;
  }

  @JsonProperty("cors.enabling")
  public void setCorsEnabling(ConfigNodePropertyBoolean corsEnabling) {
    this.corsEnabling = corsEnabling;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties = (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties) o;
    return Objects.equals(this.corsEnabling, comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.corsEnabling);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
