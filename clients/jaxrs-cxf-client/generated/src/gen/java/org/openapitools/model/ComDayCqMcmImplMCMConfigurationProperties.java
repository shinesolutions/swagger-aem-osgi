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

public class ComDayCqMcmImplMCMConfigurationProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray experienceIndirection = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray touchpointIndirection = null;
 /**
   * Get experienceIndirection
   * @return experienceIndirection
  **/
  @JsonProperty("experience.indirection")
  public ConfigNodePropertyArray getExperienceIndirection() {
    return experienceIndirection;
  }

  public void setExperienceIndirection(ConfigNodePropertyArray experienceIndirection) {
    this.experienceIndirection = experienceIndirection;
  }

  public ComDayCqMcmImplMCMConfigurationProperties experienceIndirection(ConfigNodePropertyArray experienceIndirection) {
    this.experienceIndirection = experienceIndirection;
    return this;
  }

 /**
   * Get touchpointIndirection
   * @return touchpointIndirection
  **/
  @JsonProperty("touchpoint.indirection")
  public ConfigNodePropertyArray getTouchpointIndirection() {
    return touchpointIndirection;
  }

  public void setTouchpointIndirection(ConfigNodePropertyArray touchpointIndirection) {
    this.touchpointIndirection = touchpointIndirection;
  }

  public ComDayCqMcmImplMCMConfigurationProperties touchpointIndirection(ConfigNodePropertyArray touchpointIndirection) {
    this.touchpointIndirection = touchpointIndirection;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMcmImplMCMConfigurationProperties {\n");
    
    sb.append("    experienceIndirection: ").append(toIndentedString(experienceIndirection)).append("\n");
    sb.append("    touchpointIndirection: ").append(toIndentedString(touchpointIndirection)).append("\n");
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

