package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString hcName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray hcTags;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString hcMbeanName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString mbeanName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString attributeName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString attributeValueConstraint;
 /**
  * Get hcName
  * @return hcName
  */
  @JsonProperty("hc.name")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }

  /**
   * Sets the <code>hcName</code> property.
   */
 public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  /**
   * Sets the <code>hcName</code> property.
   */
  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

 /**
  * Get hcTags
  * @return hcTags
  */
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  /**
   * Sets the <code>hcTags</code> property.
   */
 public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  /**
   * Sets the <code>hcTags</code> property.
   */
  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

 /**
  * Get hcMbeanName
  * @return hcMbeanName
  */
  @JsonProperty("hc.mbean.name")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  /**
   * Sets the <code>hcMbeanName</code> property.
   */
 public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  /**
   * Sets the <code>hcMbeanName</code> property.
   */
  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

 /**
  * Get mbeanName
  * @return mbeanName
  */
  @JsonProperty("mbean.name")
  public ConfigNodePropertyString getMbeanName() {
    return mbeanName;
  }

  /**
   * Sets the <code>mbeanName</code> property.
   */
 public void setMbeanName(ConfigNodePropertyString mbeanName) {
    this.mbeanName = mbeanName;
  }

  /**
   * Sets the <code>mbeanName</code> property.
   */
  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties mbeanName(ConfigNodePropertyString mbeanName) {
    this.mbeanName = mbeanName;
    return this;
  }

 /**
  * Get attributeName
  * @return attributeName
  */
  @JsonProperty("attribute.name")
  public ConfigNodePropertyString getAttributeName() {
    return attributeName;
  }

  /**
   * Sets the <code>attributeName</code> property.
   */
 public void setAttributeName(ConfigNodePropertyString attributeName) {
    this.attributeName = attributeName;
  }

  /**
   * Sets the <code>attributeName</code> property.
   */
  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties attributeName(ConfigNodePropertyString attributeName) {
    this.attributeName = attributeName;
    return this;
  }

 /**
  * Get attributeValueConstraint
  * @return attributeValueConstraint
  */
  @JsonProperty("attribute.value.constraint")
  public ConfigNodePropertyString getAttributeValueConstraint() {
    return attributeValueConstraint;
  }

  /**
   * Sets the <code>attributeValueConstraint</code> property.
   */
 public void setAttributeValueConstraint(ConfigNodePropertyString attributeValueConstraint) {
    this.attributeValueConstraint = attributeValueConstraint;
  }

  /**
   * Sets the <code>attributeValueConstraint</code> property.
   */
  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties attributeValueConstraint(ConfigNodePropertyString attributeValueConstraint) {
    this.attributeValueConstraint = attributeValueConstraint;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties = (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties) o;
    return Objects.equals(this.hcName, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.hcName) &&
        Objects.equals(this.hcTags, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.hcTags) &&
        Objects.equals(this.hcMbeanName, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.hcMbeanName) &&
        Objects.equals(this.mbeanName, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.mbeanName) &&
        Objects.equals(this.attributeName, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.attributeName) &&
        Objects.equals(this.attributeValueConstraint, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.attributeValueConstraint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcName, hcTags, hcMbeanName, mbeanName, attributeName, attributeValueConstraint);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

