package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray damCfmResourceTypes;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray damCfmReferenceProperties;
 /**
  * Get damCfmResourceTypes
  * @return damCfmResourceTypes
  */
  @JsonProperty("dam.cfm.resourceTypes")
  public ConfigNodePropertyArray getDamCfmResourceTypes() {
    return damCfmResourceTypes;
  }

  /**
   * Sets the <code>damCfmResourceTypes</code> property.
   */
 public void setDamCfmResourceTypes(ConfigNodePropertyArray damCfmResourceTypes) {
    this.damCfmResourceTypes = damCfmResourceTypes;
  }

  /**
   * Sets the <code>damCfmResourceTypes</code> property.
   */
  public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties damCfmResourceTypes(ConfigNodePropertyArray damCfmResourceTypes) {
    this.damCfmResourceTypes = damCfmResourceTypes;
    return this;
  }

 /**
  * Get damCfmReferenceProperties
  * @return damCfmReferenceProperties
  */
  @JsonProperty("dam.cfm.referenceProperties")
  public ConfigNodePropertyArray getDamCfmReferenceProperties() {
    return damCfmReferenceProperties;
  }

  /**
   * Sets the <code>damCfmReferenceProperties</code> property.
   */
 public void setDamCfmReferenceProperties(ConfigNodePropertyArray damCfmReferenceProperties) {
    this.damCfmReferenceProperties = damCfmReferenceProperties;
  }

  /**
   * Sets the <code>damCfmReferenceProperties</code> property.
   */
  public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties damCfmReferenceProperties(ConfigNodePropertyArray damCfmReferenceProperties) {
    this.damCfmReferenceProperties = damCfmReferenceProperties;
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
    ComAdobeCqDamCfmImplConfFeatureConfigImplProperties comAdobeCqDamCfmImplConfFeatureConfigImplProperties = (ComAdobeCqDamCfmImplConfFeatureConfigImplProperties) o;
    return Objects.equals(this.damCfmResourceTypes, comAdobeCqDamCfmImplConfFeatureConfigImplProperties.damCfmResourceTypes) &&
        Objects.equals(this.damCfmReferenceProperties, comAdobeCqDamCfmImplConfFeatureConfigImplProperties.damCfmReferenceProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(damCfmResourceTypes, damCfmReferenceProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties {\n");
    
    sb.append("    damCfmResourceTypes: ").append(toIndentedString(damCfmResourceTypes)).append("\n");
    sb.append("    damCfmReferenceProperties: ").append(toIndentedString(damCfmReferenceProperties)).append("\n");
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

