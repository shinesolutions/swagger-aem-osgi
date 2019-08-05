package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
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

public class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jmxObjectname = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean active = null;
 /**
   * Get jmxObjectname
   * @return jmxObjectname
  **/
  @JsonProperty("jmx.objectname")
  public ConfigNodePropertyString getJmxObjectname() {
    return jmxObjectname;
  }

  public void setJmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
  }

  public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties jmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public ConfigNodePropertyBoolean getActive() {
    return active;
  }

  public void setActive(ConfigNodePropertyBoolean active) {
    this.active = active;
  }

  public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties active(ConfigNodePropertyBoolean active) {
    this.active = active;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties {\n");
    
    sb.append("    jmxObjectname: ").append(toIndentedString(jmxObjectname)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

