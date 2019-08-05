package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray damCfmResourceTypes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray damCfmReferenceProperties = null;
 /**
   * Get damCfmResourceTypes
   * @return damCfmResourceTypes
  **/
  @JsonProperty("dam.cfm.resourceTypes")
  public ConfigNodePropertyArray getDamCfmResourceTypes() {
    return damCfmResourceTypes;
  }

  public void setDamCfmResourceTypes(ConfigNodePropertyArray damCfmResourceTypes) {
    this.damCfmResourceTypes = damCfmResourceTypes;
  }

  public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties damCfmResourceTypes(ConfigNodePropertyArray damCfmResourceTypes) {
    this.damCfmResourceTypes = damCfmResourceTypes;
    return this;
  }

 /**
   * Get damCfmReferenceProperties
   * @return damCfmReferenceProperties
  **/
  @JsonProperty("dam.cfm.referenceProperties")
  public ConfigNodePropertyArray getDamCfmReferenceProperties() {
    return damCfmReferenceProperties;
  }

  public void setDamCfmReferenceProperties(ConfigNodePropertyArray damCfmReferenceProperties) {
    this.damCfmReferenceProperties = damCfmReferenceProperties;
  }

  public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties damCfmReferenceProperties(ConfigNodePropertyArray damCfmReferenceProperties) {
    this.damCfmReferenceProperties = damCfmReferenceProperties;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

