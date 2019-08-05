package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteCsrfImplCSRFServletProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteCsrfImplCSRFServletProperties   {
  @JsonProperty("csrf.token.expires.in")
  private ConfigNodePropertyInteger csrfTokenExpiresIn = null;

  @JsonProperty("sling.auth.requirements")
  private ConfigNodePropertyString slingAuthRequirements = null;

  public ComAdobeGraniteCsrfImplCSRFServletProperties csrfTokenExpiresIn(ConfigNodePropertyInteger csrfTokenExpiresIn) {
    this.csrfTokenExpiresIn = csrfTokenExpiresIn;
    return this;
  }

   /**
   * Get csrfTokenExpiresIn
   * @return csrfTokenExpiresIn
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCsrfTokenExpiresIn() {
    return csrfTokenExpiresIn;
  }

  public void setCsrfTokenExpiresIn(ConfigNodePropertyInteger csrfTokenExpiresIn) {
    this.csrfTokenExpiresIn = csrfTokenExpiresIn;
  }

  public ComAdobeGraniteCsrfImplCSRFServletProperties slingAuthRequirements(ConfigNodePropertyString slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
    return this;
  }

   /**
   * Get slingAuthRequirements
   * @return slingAuthRequirements
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingAuthRequirements() {
    return slingAuthRequirements;
  }

  public void setSlingAuthRequirements(ConfigNodePropertyString slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCsrfImplCSRFServletProperties comAdobeGraniteCsrfImplCSRFServletProperties = (ComAdobeGraniteCsrfImplCSRFServletProperties) o;
    return Objects.equals(this.csrfTokenExpiresIn, comAdobeGraniteCsrfImplCSRFServletProperties.csrfTokenExpiresIn) &&
        Objects.equals(this.slingAuthRequirements, comAdobeGraniteCsrfImplCSRFServletProperties.slingAuthRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfTokenExpiresIn, slingAuthRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCsrfImplCSRFServletProperties {\n");
    
    sb.append("    csrfTokenExpiresIn: ").append(toIndentedString(csrfTokenExpiresIn)).append("\n");
    sb.append("    slingAuthRequirements: ").append(toIndentedString(slingAuthRequirements)).append("\n");
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

