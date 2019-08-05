package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties   {
  @JsonProperty("sling.servlet.extensions")
  private ConfigNodePropertyString slingServletExtensions = null;

  @JsonProperty("sling.servlet.paths")
  private ConfigNodePropertyString slingServletPaths = null;

  @JsonProperty("sling.servlet.methods")
  private ConfigNodePropertyString slingServletMethods = null;

  public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties slingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
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

  public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties slingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
    return this;
  }

   /**
   * Get slingServletPaths
   * @return slingServletPaths
  **/
  @Valid
  public ConfigNodePropertyString getSlingServletPaths() {
    return slingServletPaths;
  }

  public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
  }

  public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties slingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

   /**
   * Get slingServletMethods
   * @return slingServletMethods
  **/
  @Valid
  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }

  public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties = (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties) o;
    return Objects.equals(slingServletExtensions, comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.slingServletExtensions) &&
        Objects.equals(slingServletPaths, comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.slingServletPaths) &&
        Objects.equals(slingServletMethods, comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.slingServletMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletExtensions, slingServletPaths, slingServletMethods);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties {\n");
    
    sb.append("    slingServletExtensions: ").append(toIndentedString(slingServletExtensions)).append("\n");
    sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
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

