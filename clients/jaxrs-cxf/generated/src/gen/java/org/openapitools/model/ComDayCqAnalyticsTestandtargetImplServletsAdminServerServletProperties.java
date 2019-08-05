package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString testandtargetEndpointUrl = null;
 /**
   * Get testandtargetEndpointUrl
   * @return testandtargetEndpointUrl
  **/
  @JsonProperty("testandtarget.endpoint.url")
  public ConfigNodePropertyString getTestandtargetEndpointUrl() {
    return testandtargetEndpointUrl;
  }

  public void setTestandtargetEndpointUrl(ConfigNodePropertyString testandtargetEndpointUrl) {
    this.testandtargetEndpointUrl = testandtargetEndpointUrl;
  }

  public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties testandtargetEndpointUrl(ConfigNodePropertyString testandtargetEndpointUrl) {
    this.testandtargetEndpointUrl = testandtargetEndpointUrl;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties {\n");
    
    sb.append("    testandtargetEndpointUrl: ").append(toIndentedString(testandtargetEndpointUrl)).append("\n");
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

