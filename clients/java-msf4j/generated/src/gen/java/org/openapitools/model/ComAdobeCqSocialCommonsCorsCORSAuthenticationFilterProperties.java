package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;

/**
 * ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties   {
  @JsonProperty("cors.enabling")
  private ConfigNodePropertyBoolean corsEnabling = null;

  public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties corsEnabling(ConfigNodePropertyBoolean corsEnabling) {
    this.corsEnabling = corsEnabling;
    return this;
  }

   /**
   * Get corsEnabling
   * @return corsEnabling
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

