package org.openapitools.model;

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

public class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString damCfmComponentResourceType = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString damCfmComponentFileReferenceProp = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString damCfmComponentElementsProp = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString damCfmComponentVariationProp = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

