package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqWcmCoreImplWCMDebugFilterProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean wcmdbgfilterEnabled = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean wcmdbgfilterJspDebug = null;
 /**
   * Get wcmdbgfilterEnabled
   * @return wcmdbgfilterEnabled
  **/
  @JsonProperty("wcmdbgfilter.enabled")
  public ConfigNodePropertyBoolean getWcmdbgfilterEnabled() {
    return wcmdbgfilterEnabled;
  }

  public void setWcmdbgfilterEnabled(ConfigNodePropertyBoolean wcmdbgfilterEnabled) {
    this.wcmdbgfilterEnabled = wcmdbgfilterEnabled;
  }

  public ComDayCqWcmCoreImplWCMDebugFilterProperties wcmdbgfilterEnabled(ConfigNodePropertyBoolean wcmdbgfilterEnabled) {
    this.wcmdbgfilterEnabled = wcmdbgfilterEnabled;
    return this;
  }

 /**
   * Get wcmdbgfilterJspDebug
   * @return wcmdbgfilterJspDebug
  **/
  @JsonProperty("wcmdbgfilter.jspDebug")
  public ConfigNodePropertyBoolean getWcmdbgfilterJspDebug() {
    return wcmdbgfilterJspDebug;
  }

  public void setWcmdbgfilterJspDebug(ConfigNodePropertyBoolean wcmdbgfilterJspDebug) {
    this.wcmdbgfilterJspDebug = wcmdbgfilterJspDebug;
  }

  public ComDayCqWcmCoreImplWCMDebugFilterProperties wcmdbgfilterJspDebug(ConfigNodePropertyBoolean wcmdbgfilterJspDebug) {
    this.wcmdbgfilterJspDebug = wcmdbgfilterJspDebug;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplWCMDebugFilterProperties {\n");
    
    sb.append("    wcmdbgfilterEnabled: ").append(toIndentedString(wcmdbgfilterEnabled)).append("\n");
    sb.append("    wcmdbgfilterJspDebug: ").append(toIndentedString(wcmdbgfilterJspDebug)).append("\n");
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

