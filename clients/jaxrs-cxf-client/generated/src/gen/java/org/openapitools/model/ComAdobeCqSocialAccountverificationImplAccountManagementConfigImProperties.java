package org.openapitools.model;

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

public class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean enable = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger ttl1 = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger ttl2 = null;
 /**
   * Get enable
   * @return enable
  **/
  @JsonProperty("enable")
  public ConfigNodePropertyBoolean getEnable() {
    return enable;
  }

  public void setEnable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties enable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
    return this;
  }

 /**
   * Get ttl1
   * @return ttl1
  **/
  @JsonProperty("ttl1")
  public ConfigNodePropertyInteger getTtl1() {
    return ttl1;
  }

  public void setTtl1(ConfigNodePropertyInteger ttl1) {
    this.ttl1 = ttl1;
  }

  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties ttl1(ConfigNodePropertyInteger ttl1) {
    this.ttl1 = ttl1;
    return this;
  }

 /**
   * Get ttl2
   * @return ttl2
  **/
  @JsonProperty("ttl2")
  public ConfigNodePropertyInteger getTtl2() {
    return ttl2;
  }

  public void setTtl2(ConfigNodePropertyInteger ttl2) {
    this.ttl2 = ttl2;
  }

  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties ttl2(ConfigNodePropertyInteger ttl2) {
    this.ttl2 = ttl2;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    ttl1: ").append(toIndentedString(ttl1)).append("\n");
    sb.append("    ttl2: ").append(toIndentedString(ttl2)).append("\n");
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

