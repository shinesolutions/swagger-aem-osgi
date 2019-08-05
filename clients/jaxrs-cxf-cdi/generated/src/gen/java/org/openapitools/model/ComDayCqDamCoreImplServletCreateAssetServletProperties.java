package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqDamCoreImplServletCreateAssetServletProperties   {
  
  private ConfigNodePropertyBoolean detectDuplicate = null;


  /**
   **/
  public ComDayCqDamCoreImplServletCreateAssetServletProperties detectDuplicate(ConfigNodePropertyBoolean detectDuplicate) {
    this.detectDuplicate = detectDuplicate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("detect_duplicate")
  public ConfigNodePropertyBoolean getDetectDuplicate() {
    return detectDuplicate;
  }
  public void setDetectDuplicate(ConfigNodePropertyBoolean detectDuplicate) {
    this.detectDuplicate = detectDuplicate;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletCreateAssetServletProperties comDayCqDamCoreImplServletCreateAssetServletProperties = (ComDayCqDamCoreImplServletCreateAssetServletProperties) o;
    return Objects.equals(detectDuplicate, comDayCqDamCoreImplServletCreateAssetServletProperties.detectDuplicate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectDuplicate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletCreateAssetServletProperties {\n");
    
    sb.append("    detectDuplicate: ").append(toIndentedString(detectDuplicate)).append("\n");
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

