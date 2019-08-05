package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties   {
  @JsonProperty("sling.servlet.selectors")
  private ConfigNodePropertyString slingServletSelectors = null;

  @JsonProperty("sling.servlet.extensions")
  private ConfigNodePropertyString slingServletExtensions = null;

  public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties slingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

   /**
   * Get slingServletSelectors
   * @return slingServletSelectors
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties slingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
    return this;
  }

   /**
   * Get slingServletExtensions
   * @return slingServletExtensions
  **/
  @ApiModelProperty(value = "")
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
    ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties = (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties) o;
    return Objects.equals(this.slingServletSelectors, comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties.slingServletSelectors) &&
        Objects.equals(this.slingServletExtensions, comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties.slingServletExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletSelectors, slingServletExtensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties {\n");
    
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

