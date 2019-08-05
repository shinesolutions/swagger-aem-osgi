package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteCsrfImplCSRFServletProperties   {
  
  private ConfigNodePropertyInteger csrfTokenExpiresIn = null;
  private ConfigNodePropertyString slingAuthRequirements = null;

  public ComAdobeGraniteCsrfImplCSRFServletProperties () {

  }

  public ComAdobeGraniteCsrfImplCSRFServletProperties (ConfigNodePropertyInteger csrfTokenExpiresIn, ConfigNodePropertyString slingAuthRequirements) {
    this.csrfTokenExpiresIn = csrfTokenExpiresIn;
    this.slingAuthRequirements = slingAuthRequirements;
  }

    
  @JsonProperty("csrf.token.expires.in")
  public ConfigNodePropertyInteger getCsrfTokenExpiresIn() {
    return csrfTokenExpiresIn;
  }
  public void setCsrfTokenExpiresIn(ConfigNodePropertyInteger csrfTokenExpiresIn) {
    this.csrfTokenExpiresIn = csrfTokenExpiresIn;
  }

    
  @JsonProperty("sling.auth.requirements")
  public ConfigNodePropertyString getSlingAuthRequirements() {
    return slingAuthRequirements;
  }
  public void setSlingAuthRequirements(ConfigNodePropertyString slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
