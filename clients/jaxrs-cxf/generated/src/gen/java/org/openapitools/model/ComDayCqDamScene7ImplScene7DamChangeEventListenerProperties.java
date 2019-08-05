package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths = null;
 /**
   * Get cqDamScene7DamchangeeventlistenerEnabled
   * @return cqDamScene7DamchangeeventlistenerEnabled
  **/
  @JsonProperty("cq.dam.scene7.damchangeeventlistener.enabled")
  public ConfigNodePropertyBoolean getCqDamScene7DamchangeeventlistenerEnabled() {
    return cqDamScene7DamchangeeventlistenerEnabled;
  }

  public void setCqDamScene7DamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled) {
    this.cqDamScene7DamchangeeventlistenerEnabled = cqDamScene7DamchangeeventlistenerEnabled;
  }

  public ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties cqDamScene7DamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled) {
    this.cqDamScene7DamchangeeventlistenerEnabled = cqDamScene7DamchangeeventlistenerEnabled;
    return this;
  }

 /**
   * Get cqDamScene7DamchangeeventlistenerObservedPaths
   * @return cqDamScene7DamchangeeventlistenerObservedPaths
  **/
  @JsonProperty("cq.dam.scene7.damchangeeventlistener.observed.paths")
  public ConfigNodePropertyArray getCqDamScene7DamchangeeventlistenerObservedPaths() {
    return cqDamScene7DamchangeeventlistenerObservedPaths;
  }

  public void setCqDamScene7DamchangeeventlistenerObservedPaths(ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths) {
    this.cqDamScene7DamchangeeventlistenerObservedPaths = cqDamScene7DamchangeeventlistenerObservedPaths;
  }

  public ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties cqDamScene7DamchangeeventlistenerObservedPaths(ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths) {
    this.cqDamScene7DamchangeeventlistenerObservedPaths = cqDamScene7DamchangeeventlistenerObservedPaths;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties {\n");
    
    sb.append("    cqDamScene7DamchangeeventlistenerEnabled: ").append(toIndentedString(cqDamScene7DamchangeeventlistenerEnabled)).append("\n");
    sb.append("    cqDamScene7DamchangeeventlistenerObservedPaths: ").append(toIndentedString(cqDamScene7DamchangeeventlistenerObservedPaths)).append("\n");
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

