package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class ComDayCqCommonsImplExternalizerImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray externalizerDomains = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString externalizerHost = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString externalizerContextpath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean externalizerEncodedpath = null;
 /**
   * Get externalizerDomains
   * @return externalizerDomains
  **/
  @JsonProperty("externalizer.domains")
  public ConfigNodePropertyArray getExternalizerDomains() {
    return externalizerDomains;
  }

  public void setExternalizerDomains(ConfigNodePropertyArray externalizerDomains) {
    this.externalizerDomains = externalizerDomains;
  }

  public ComDayCqCommonsImplExternalizerImplProperties externalizerDomains(ConfigNodePropertyArray externalizerDomains) {
    this.externalizerDomains = externalizerDomains;
    return this;
  }

 /**
   * Get externalizerHost
   * @return externalizerHost
  **/
  @JsonProperty("externalizer.host")
  public ConfigNodePropertyString getExternalizerHost() {
    return externalizerHost;
  }

  public void setExternalizerHost(ConfigNodePropertyString externalizerHost) {
    this.externalizerHost = externalizerHost;
  }

  public ComDayCqCommonsImplExternalizerImplProperties externalizerHost(ConfigNodePropertyString externalizerHost) {
    this.externalizerHost = externalizerHost;
    return this;
  }

 /**
   * Get externalizerContextpath
   * @return externalizerContextpath
  **/
  @JsonProperty("externalizer.contextpath")
  public ConfigNodePropertyString getExternalizerContextpath() {
    return externalizerContextpath;
  }

  public void setExternalizerContextpath(ConfigNodePropertyString externalizerContextpath) {
    this.externalizerContextpath = externalizerContextpath;
  }

  public ComDayCqCommonsImplExternalizerImplProperties externalizerContextpath(ConfigNodePropertyString externalizerContextpath) {
    this.externalizerContextpath = externalizerContextpath;
    return this;
  }

 /**
   * Get externalizerEncodedpath
   * @return externalizerEncodedpath
  **/
  @JsonProperty("externalizer.encodedpath")
  public ConfigNodePropertyBoolean getExternalizerEncodedpath() {
    return externalizerEncodedpath;
  }

  public void setExternalizerEncodedpath(ConfigNodePropertyBoolean externalizerEncodedpath) {
    this.externalizerEncodedpath = externalizerEncodedpath;
  }

  public ComDayCqCommonsImplExternalizerImplProperties externalizerEncodedpath(ConfigNodePropertyBoolean externalizerEncodedpath) {
    this.externalizerEncodedpath = externalizerEncodedpath;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqCommonsImplExternalizerImplProperties {\n");
    
    sb.append("    externalizerDomains: ").append(toIndentedString(externalizerDomains)).append("\n");
    sb.append("    externalizerHost: ").append(toIndentedString(externalizerHost)).append("\n");
    sb.append("    externalizerContextpath: ").append(toIndentedString(externalizerContextpath)).append("\n");
    sb.append("    externalizerEncodedpath: ").append(toIndentedString(externalizerEncodedpath)).append("\n");
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

