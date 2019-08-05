package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger comAdobeAemScreensImplRemoteRequestTimeout = null;
 /**
   * Get comAdobeAemScreensImplRemoteRequestTimeout
   * @return comAdobeAemScreensImplRemoteRequestTimeout
  **/
  @JsonProperty("com.adobe.aem.screens.impl.remote.request_timeout")
  public ConfigNodePropertyInteger getComAdobeAemScreensImplRemoteRequestTimeout() {
    return comAdobeAemScreensImplRemoteRequestTimeout;
  }

  public void setComAdobeAemScreensImplRemoteRequestTimeout(ConfigNodePropertyInteger comAdobeAemScreensImplRemoteRequestTimeout) {
    this.comAdobeAemScreensImplRemoteRequestTimeout = comAdobeAemScreensImplRemoteRequestTimeout;
  }

  public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties comAdobeAemScreensImplRemoteRequestTimeout(ConfigNodePropertyInteger comAdobeAemScreensImplRemoteRequestTimeout) {
    this.comAdobeAemScreensImplRemoteRequestTimeout = comAdobeAemScreensImplRemoteRequestTimeout;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties {\n");
    
    sb.append("    comAdobeAemScreensImplRemoteRequestTimeout: ").append(toIndentedString(comAdobeAemScreensImplRemoteRequestTimeout)).append("\n");
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

