package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingServletSelectors = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingServletExtensions = null;
 /**
   * Get slingServletSelectors
   * @return slingServletSelectors
  **/
  @JsonProperty("sling.servlet.selectors")
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties slingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

 /**
   * Get slingServletExtensions
   * @return slingServletExtensions
  **/
  @JsonProperty("sling.servlet.extensions")
  public ConfigNodePropertyString getSlingServletExtensions() {
    return slingServletExtensions;
  }

  public void setSlingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
  }

  public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties slingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

