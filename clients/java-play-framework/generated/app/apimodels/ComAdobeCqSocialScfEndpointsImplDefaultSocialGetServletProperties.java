package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties   {
  @JsonProperty("sling.servlet.selectors")
  private ConfigNodePropertyArray slingServletSelectors = null;

  @JsonProperty("sling.servlet.extensions")
  private ConfigNodePropertyString slingServletExtensions = null;

  public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties slingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

   /**
   * Get slingServletSelectors
   * @return slingServletSelectors
  **/
  @Valid
  public ConfigNodePropertyArray getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties slingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
    return this;
  }

   /**
   * Get slingServletExtensions
   * @return slingServletExtensions
  **/
  @Valid
  public ConfigNodePropertyString getSlingServletExtensions() {
    return slingServletExtensions;
  }

  public void setSlingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties = (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties) o;
    return Objects.equals(slingServletSelectors, comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.slingServletSelectors) &&
        Objects.equals(slingServletExtensions, comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.slingServletExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletSelectors, slingServletExtensions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties {\n");
    
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
    sb.append("    slingServletExtensions: ").append(toIndentedString(slingServletExtensions)).append("\n");
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

