package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString damCfmComponentResourceType;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString damCfmComponentFileReferenceProp;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString damCfmComponentElementsProp;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString damCfmComponentVariationProp;
 /**
   * Get damCfmComponentResourceType
   * @return damCfmComponentResourceType
  **/
  @JsonProperty("dam.cfm.component.resourceType")
  public ConfigNodePropertyString getDamCfmComponentResourceType() {
    return damCfmComponentResourceType;
  }

  public void setDamCfmComponentResourceType(ConfigNodePropertyString damCfmComponentResourceType) {
    this.damCfmComponentResourceType = damCfmComponentResourceType;
  }

  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentResourceType(ConfigNodePropertyString damCfmComponentResourceType) {
    this.damCfmComponentResourceType = damCfmComponentResourceType;
    return this;
  }

 /**
   * Get damCfmComponentFileReferenceProp
   * @return damCfmComponentFileReferenceProp
  **/
  @JsonProperty("dam.cfm.component.fileReferenceProp")
  public ConfigNodePropertyString getDamCfmComponentFileReferenceProp() {
    return damCfmComponentFileReferenceProp;
  }

  public void setDamCfmComponentFileReferenceProp(ConfigNodePropertyString damCfmComponentFileReferenceProp) {
    this.damCfmComponentFileReferenceProp = damCfmComponentFileReferenceProp;
  }

  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentFileReferenceProp(ConfigNodePropertyString damCfmComponentFileReferenceProp) {
    this.damCfmComponentFileReferenceProp = damCfmComponentFileReferenceProp;
    return this;
  }

 /**
   * Get damCfmComponentElementsProp
   * @return damCfmComponentElementsProp
  **/
  @JsonProperty("dam.cfm.component.elementsProp")
  public ConfigNodePropertyString getDamCfmComponentElementsProp() {
    return damCfmComponentElementsProp;
  }

  public void setDamCfmComponentElementsProp(ConfigNodePropertyString damCfmComponentElementsProp) {
    this.damCfmComponentElementsProp = damCfmComponentElementsProp;
  }

  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentElementsProp(ConfigNodePropertyString damCfmComponentElementsProp) {
    this.damCfmComponentElementsProp = damCfmComponentElementsProp;
    return this;
  }

 /**
   * Get damCfmComponentVariationProp
   * @return damCfmComponentVariationProp
  **/
  @JsonProperty("dam.cfm.component.variationProp")
  public ConfigNodePropertyString getDamCfmComponentVariationProp() {
    return damCfmComponentVariationProp;
  }

  public void setDamCfmComponentVariationProp(ConfigNodePropertyString damCfmComponentVariationProp) {
    this.damCfmComponentVariationProp = damCfmComponentVariationProp;
  }

  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentVariationProp(ConfigNodePropertyString damCfmComponentVariationProp) {
    this.damCfmComponentVariationProp = damCfmComponentVariationProp;
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
    ComAdobeCqDamCfmImplComponentComponentConfigImplProperties comAdobeCqDamCfmImplComponentComponentConfigImplProperties = (ComAdobeCqDamCfmImplComponentComponentConfigImplProperties) o;
    return Objects.equals(this.damCfmComponentResourceType, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentResourceType) &&
        Objects.equals(this.damCfmComponentFileReferenceProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentFileReferenceProp) &&
        Objects.equals(this.damCfmComponentElementsProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentElementsProp) &&
        Objects.equals(this.damCfmComponentVariationProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentVariationProp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(damCfmComponentResourceType, damCfmComponentFileReferenceProp, damCfmComponentElementsProp, damCfmComponentVariationProp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties {\n");
    
    sb.append("    damCfmComponentResourceType: ").append(toIndentedString(damCfmComponentResourceType)).append("\n");
    sb.append("    damCfmComponentFileReferenceProp: ").append(toIndentedString(damCfmComponentFileReferenceProp)).append("\n");
    sb.append("    damCfmComponentElementsProp: ").append(toIndentedString(damCfmComponentElementsProp)).append("\n");
    sb.append("    damCfmComponentVariationProp: ").append(toIndentedString(damCfmComponentVariationProp)).append("\n");
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

