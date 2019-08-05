package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
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

public class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown dimDefaultMode = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean dimAppcacheEnabled = null;
 /**
   * Get dimDefaultMode
   * @return dimDefaultMode
  **/
  @JsonProperty("dim.default.mode")
  public ConfigNodePropertyDropDown getDimDefaultMode() {
    return dimDefaultMode;
  }

  public void setDimDefaultMode(ConfigNodePropertyDropDown dimDefaultMode) {
    this.dimDefaultMode = dimDefaultMode;
  }

  public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties dimDefaultMode(ConfigNodePropertyDropDown dimDefaultMode) {
    this.dimDefaultMode = dimDefaultMode;
    return this;
  }

 /**
   * Get dimAppcacheEnabled
   * @return dimAppcacheEnabled
  **/
  @JsonProperty("dim.appcache.enabled")
  public ConfigNodePropertyBoolean getDimAppcacheEnabled() {
    return dimAppcacheEnabled;
  }

  public void setDimAppcacheEnabled(ConfigNodePropertyBoolean dimAppcacheEnabled) {
    this.dimAppcacheEnabled = dimAppcacheEnabled;
  }

  public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties dimAppcacheEnabled(ConfigNodePropertyBoolean dimAppcacheEnabled) {
    this.dimAppcacheEnabled = dimAppcacheEnabled;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties {\n");
    
    sb.append("    dimDefaultMode: ").append(toIndentedString(dimDefaultMode)).append("\n");
    sb.append("    dimAppcacheEnabled: ").append(toIndentedString(dimAppcacheEnabled)).append("\n");
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

