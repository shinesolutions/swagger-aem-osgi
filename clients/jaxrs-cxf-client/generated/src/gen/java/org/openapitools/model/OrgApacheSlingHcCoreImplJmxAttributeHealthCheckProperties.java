package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
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

public class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString hcName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray hcTags = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString hcMbeanName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString mbeanName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString attributeName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString attributeValueConstraint = null;
 /**
   * Get hcName
   * @return hcName
  **/
  @JsonProperty("hc.name")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }

  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

 /**
   * Get hcTags
   * @return hcTags
  **/
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

 /**
   * Get hcMbeanName
   * @return hcMbeanName
  **/
  @JsonProperty("hc.mbean.name")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

 /**
   * Get mbeanName
   * @return mbeanName
  **/
  @JsonProperty("mbean.name")
  public ConfigNodePropertyString getMbeanName() {
    return mbeanName;
  }

  public void setMbeanName(ConfigNodePropertyString mbeanName) {
    this.mbeanName = mbeanName;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties mbeanName(ConfigNodePropertyString mbeanName) {
    this.mbeanName = mbeanName;
    return this;
  }

 /**
   * Get attributeName
   * @return attributeName
  **/
  @JsonProperty("attribute.name")
  public ConfigNodePropertyString getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(ConfigNodePropertyString attributeName) {
    this.attributeName = attributeName;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties attributeName(ConfigNodePropertyString attributeName) {
    this.attributeName = attributeName;
    return this;
  }

 /**
   * Get attributeValueConstraint
   * @return attributeValueConstraint
  **/
  @JsonProperty("attribute.value.constraint")
  public ConfigNodePropertyString getAttributeValueConstraint() {
    return attributeValueConstraint;
  }

  public void setAttributeValueConstraint(ConfigNodePropertyString attributeValueConstraint) {
    this.attributeValueConstraint = attributeValueConstraint;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties attributeValueConstraint(ConfigNodePropertyString attributeValueConstraint) {
    this.attributeValueConstraint = attributeValueConstraint;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties {\n");
    
    sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
    sb.append("    mbeanName: ").append(toIndentedString(mbeanName)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    attributeValueConstraint: ").append(toIndentedString(attributeValueConstraint)).append("\n");
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

