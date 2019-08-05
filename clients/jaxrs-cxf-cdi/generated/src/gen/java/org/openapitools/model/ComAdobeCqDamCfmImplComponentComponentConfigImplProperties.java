package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties   {
  
  private ConfigNodePropertyString damCfmComponentResourceType = null;

  private ConfigNodePropertyString damCfmComponentFileReferenceProp = null;

  private ConfigNodePropertyString damCfmComponentElementsProp = null;

  private ConfigNodePropertyString damCfmComponentVariationProp = null;


  /**
   **/
  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentResourceType(ConfigNodePropertyString damCfmComponentResourceType) {
    this.damCfmComponentResourceType = damCfmComponentResourceType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dam.cfm.component.resourceType")
  public ConfigNodePropertyString getDamCfmComponentResourceType() {
    return damCfmComponentResourceType;
  }
  public void setDamCfmComponentResourceType(ConfigNodePropertyString damCfmComponentResourceType) {
    this.damCfmComponentResourceType = damCfmComponentResourceType;
  }


  /**
   **/
  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentFileReferenceProp(ConfigNodePropertyString damCfmComponentFileReferenceProp) {
    this.damCfmComponentFileReferenceProp = damCfmComponentFileReferenceProp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dam.cfm.component.fileReferenceProp")
  public ConfigNodePropertyString getDamCfmComponentFileReferenceProp() {
    return damCfmComponentFileReferenceProp;
  }
  public void setDamCfmComponentFileReferenceProp(ConfigNodePropertyString damCfmComponentFileReferenceProp) {
    this.damCfmComponentFileReferenceProp = damCfmComponentFileReferenceProp;
  }


  /**
   **/
  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentElementsProp(ConfigNodePropertyString damCfmComponentElementsProp) {
    this.damCfmComponentElementsProp = damCfmComponentElementsProp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dam.cfm.component.elementsProp")
  public ConfigNodePropertyString getDamCfmComponentElementsProp() {
    return damCfmComponentElementsProp;
  }
  public void setDamCfmComponentElementsProp(ConfigNodePropertyString damCfmComponentElementsProp) {
    this.damCfmComponentElementsProp = damCfmComponentElementsProp;
  }


  /**
   **/
  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentVariationProp(ConfigNodePropertyString damCfmComponentVariationProp) {
    this.damCfmComponentVariationProp = damCfmComponentVariationProp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dam.cfm.component.variationProp")
  public ConfigNodePropertyString getDamCfmComponentVariationProp() {
    return damCfmComponentVariationProp;
  }
  public void setDamCfmComponentVariationProp(ConfigNodePropertyString damCfmComponentVariationProp) {
    this.damCfmComponentVariationProp = damCfmComponentVariationProp;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamCfmImplComponentComponentConfigImplProperties comAdobeCqDamCfmImplComponentComponentConfigImplProperties = (ComAdobeCqDamCfmImplComponentComponentConfigImplProperties) o;
    return Objects.equals(damCfmComponentResourceType, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentResourceType) &&
        Objects.equals(damCfmComponentFileReferenceProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentFileReferenceProp) &&
        Objects.equals(damCfmComponentElementsProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentElementsProp) &&
        Objects.equals(damCfmComponentVariationProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentVariationProp);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

