package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties   {
  
  private ConfigNodePropertyString hcName = null;
  private ConfigNodePropertyArray hcTags = null;
  private ConfigNodePropertyString hcMbeanName = null;
  private ConfigNodePropertyString mbeanName = null;
  private ConfigNodePropertyString attributeName = null;
  private ConfigNodePropertyString attributeValueConstraint = null;

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties () {

  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties (ConfigNodePropertyString hcName, ConfigNodePropertyArray hcTags, ConfigNodePropertyString hcMbeanName, ConfigNodePropertyString mbeanName, ConfigNodePropertyString attributeName, ConfigNodePropertyString attributeValueConstraint) {
    this.hcName = hcName;
    this.hcTags = hcTags;
    this.hcMbeanName = hcMbeanName;
    this.mbeanName = mbeanName;
    this.attributeName = attributeName;
    this.attributeValueConstraint = attributeValueConstraint;
  }

    
  @JsonProperty("hc.name")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }
  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

    
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

    
  @JsonProperty("hc.mbean.name")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }
  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

    
  @JsonProperty("mbean.name")
  public ConfigNodePropertyString getMbeanName() {
    return mbeanName;
  }
  public void setMbeanName(ConfigNodePropertyString mbeanName) {
    this.mbeanName = mbeanName;
  }

    
  @JsonProperty("attribute.name")
  public ConfigNodePropertyString getAttributeName() {
    return attributeName;
  }
  public void setAttributeName(ConfigNodePropertyString attributeName) {
    this.attributeName = attributeName;
  }

    
  @JsonProperty("attribute.value.constraint")
  public ConfigNodePropertyString getAttributeValueConstraint() {
    return attributeValueConstraint;
  }
  public void setAttributeValueConstraint(ConfigNodePropertyString attributeValueConstraint) {
    this.attributeValueConstraint = attributeValueConstraint;
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
    return Objects.equals(hcName, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.hcName) &&
        Objects.equals(hcTags, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.hcTags) &&
        Objects.equals(hcMbeanName, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.hcMbeanName) &&
        Objects.equals(mbeanName, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.mbeanName) &&
        Objects.equals(attributeName, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.attributeName) &&
        Objects.equals(attributeValueConstraint, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.attributeValueConstraint);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
