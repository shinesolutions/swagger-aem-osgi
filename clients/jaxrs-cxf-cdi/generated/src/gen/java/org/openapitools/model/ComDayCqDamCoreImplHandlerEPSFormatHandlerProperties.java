package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties   {
  
  private ConfigNodePropertyString mimetype;

  /**
   **/
  public ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties mimetype(ConfigNodePropertyString mimetype) {
    this.mimetype = mimetype;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mimetype")
  public ConfigNodePropertyString getMimetype() {
    return mimetype;
  }
  public void setMimetype(ConfigNodePropertyString mimetype) {
    this.mimetype = mimetype;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties comDayCqDamCoreImplHandlerEPSFormatHandlerProperties = (ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties) o;
    return Objects.equals(this.mimetype, comDayCqDamCoreImplHandlerEPSFormatHandlerProperties.mimetype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimetype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties {\n");
    
    sb.append("    mimetype: ").append(toIndentedString(mimetype)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

