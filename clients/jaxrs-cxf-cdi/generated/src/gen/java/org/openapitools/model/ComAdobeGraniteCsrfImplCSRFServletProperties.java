package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeGraniteCsrfImplCSRFServletProperties   {
  
  private ConfigNodePropertyInteger csrfTokenExpiresIn = null;

  private ConfigNodePropertyString slingAuthRequirements = null;


  /**
   **/
  public ComAdobeGraniteCsrfImplCSRFServletProperties csrfTokenExpiresIn(ConfigNodePropertyInteger csrfTokenExpiresIn) {
    this.csrfTokenExpiresIn = csrfTokenExpiresIn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("csrf.token.expires.in")
  public ConfigNodePropertyInteger getCsrfTokenExpiresIn() {
    return csrfTokenExpiresIn;
  }
  public void setCsrfTokenExpiresIn(ConfigNodePropertyInteger csrfTokenExpiresIn) {
    this.csrfTokenExpiresIn = csrfTokenExpiresIn;
  }


  /**
   **/
  public ComAdobeGraniteCsrfImplCSRFServletProperties slingAuthRequirements(ConfigNodePropertyString slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.auth.requirements")
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
    return Objects.equals(csrfTokenExpiresIn, comAdobeGraniteCsrfImplCSRFServletProperties.csrfTokenExpiresIn) &&
        Objects.equals(slingAuthRequirements, comAdobeGraniteCsrfImplCSRFServletProperties.slingAuthRequirements);
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

