package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jmxObjectname;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean active;
 /**
  * Get jmxObjectname
  * @return jmxObjectname
  */
  @JsonProperty("jmx.objectname")
  public ConfigNodePropertyString getJmxObjectname() {
    return jmxObjectname;
  }

  /**
   * Sets the <code>jmxObjectname</code> property.
   */
 public void setJmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
  }

  /**
   * Sets the <code>jmxObjectname</code> property.
   */
  public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties jmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
    return this;
  }

 /**
  * Get active
  * @return active
  */
  @JsonProperty("active")
  public ConfigNodePropertyBoolean getActive() {
    return active;
  }

  /**
   * Sets the <code>active</code> property.
   */
 public void setActive(ConfigNodePropertyBoolean active) {
    this.active = active;
  }

  /**
   * Sets the <code>active</code> property.
   */
  public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties active(ConfigNodePropertyBoolean active) {
    this.active = active;
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
    ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties = (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties) o;
    return Objects.equals(this.jmxObjectname, comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.jmxObjectname) &&
        Objects.equals(this.active, comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jmxObjectname, active);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

