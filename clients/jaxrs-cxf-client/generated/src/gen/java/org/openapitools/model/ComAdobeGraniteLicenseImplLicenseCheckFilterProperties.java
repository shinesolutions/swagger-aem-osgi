package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger checkInternval = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray excludeIds = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean encryptPing = null;
 /**
   * Get checkInternval
   * @return checkInternval
  **/
  @JsonProperty("checkInternval")
  public ConfigNodePropertyInteger getCheckInternval() {
    return checkInternval;
  }

  public void setCheckInternval(ConfigNodePropertyInteger checkInternval) {
    this.checkInternval = checkInternval;
  }

  public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties checkInternval(ConfigNodePropertyInteger checkInternval) {
    this.checkInternval = checkInternval;
    return this;
  }

 /**
   * Get excludeIds
   * @return excludeIds
  **/
  @JsonProperty("excludeIds")
  public ConfigNodePropertyArray getExcludeIds() {
    return excludeIds;
  }

  public void setExcludeIds(ConfigNodePropertyArray excludeIds) {
    this.excludeIds = excludeIds;
  }

  public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties excludeIds(ConfigNodePropertyArray excludeIds) {
    this.excludeIds = excludeIds;
    return this;
  }

 /**
   * Get encryptPing
   * @return encryptPing
  **/
  @JsonProperty("encryptPing")
  public ConfigNodePropertyBoolean getEncryptPing() {
    return encryptPing;
  }

  public void setEncryptPing(ConfigNodePropertyBoolean encryptPing) {
    this.encryptPing = encryptPing;
  }

  public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties encryptPing(ConfigNodePropertyBoolean encryptPing) {
    this.encryptPing = encryptPing;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties {\n");
    
    sb.append("    checkInternval: ").append(toIndentedString(checkInternval)).append("\n");
    sb.append("    excludeIds: ").append(toIndentedString(excludeIds)).append("\n");
    sb.append("    encryptPing: ").append(toIndentedString(encryptPing)).append("\n");
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

