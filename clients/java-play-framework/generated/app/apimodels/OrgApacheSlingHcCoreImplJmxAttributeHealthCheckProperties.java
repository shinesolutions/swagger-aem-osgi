package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties   {
  @JsonProperty("hc.name")
  private ConfigNodePropertyString hcName = null;

  @JsonProperty("hc.tags")
  private ConfigNodePropertyArray hcTags = null;

  @JsonProperty("hc.mbean.name")
  private ConfigNodePropertyString hcMbeanName = null;

  @JsonProperty("mbean.name")
  private ConfigNodePropertyString mbeanName = null;

  @JsonProperty("attribute.name")
  private ConfigNodePropertyString attributeName = null;

  @JsonProperty("attribute.value.constraint")
  private ConfigNodePropertyString attributeValueConstraint = null;

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

   /**
   * Get hcName
   * @return hcName
  **/
  @Valid
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }

  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

   /**
   * Get hcTags
   * @return hcTags
  **/
  @Valid
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

   /**
   * Get hcMbeanName
   * @return hcMbeanName
  **/
  @Valid
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties mbeanName(ConfigNodePropertyString mbeanName) {
    this.mbeanName = mbeanName;
    return this;
  }

   /**
   * Get mbeanName
   * @return mbeanName
  **/
  @Valid
  public ConfigNodePropertyString getMbeanName() {
    return mbeanName;
  }

  public void setMbeanName(ConfigNodePropertyString mbeanName) {
    this.mbeanName = mbeanName;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties attributeName(ConfigNodePropertyString attributeName) {
    this.attributeName = attributeName;
    return this;
  }

   /**
   * Get attributeName
   * @return attributeName
  **/
  @Valid
  public ConfigNodePropertyString getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(ConfigNodePropertyString attributeName) {
    this.attributeName = attributeName;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties attributeValueConstraint(ConfigNodePropertyString attributeValueConstraint) {
    this.attributeValueConstraint = attributeValueConstraint;
    return this;
  }

   /**
   * Get attributeValueConstraint
   * @return attributeValueConstraint
  **/
  @Valid
  public ConfigNodePropertyString getAttributeValueConstraint() {
    return attributeValueConstraint;
  }

  public void setAttributeValueConstraint(ConfigNodePropertyString attributeValueConstraint) {
    this.attributeValueConstraint = attributeValueConstraint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

