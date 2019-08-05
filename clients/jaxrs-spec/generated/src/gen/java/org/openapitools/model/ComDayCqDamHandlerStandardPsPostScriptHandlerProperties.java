package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamHandlerStandardPsPostScriptHandlerProperties   {
  
  private @Valid ConfigNodePropertyBoolean rasterAnnotation = null;

  /**
   **/
  public ComDayCqDamHandlerStandardPsPostScriptHandlerProperties rasterAnnotation(ConfigNodePropertyBoolean rasterAnnotation) {
    this.rasterAnnotation = rasterAnnotation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("raster.annotation")
  public ConfigNodePropertyBoolean getRasterAnnotation() {
    return rasterAnnotation;
  }
  public void setRasterAnnotation(ConfigNodePropertyBoolean rasterAnnotation) {
    this.rasterAnnotation = rasterAnnotation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamHandlerStandardPsPostScriptHandlerProperties comDayCqDamHandlerStandardPsPostScriptHandlerProperties = (ComDayCqDamHandlerStandardPsPostScriptHandlerProperties) o;
    return Objects.equals(rasterAnnotation, comDayCqDamHandlerStandardPsPostScriptHandlerProperties.rasterAnnotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rasterAnnotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamHandlerStandardPsPostScriptHandlerProperties {\n");
    
    sb.append("    rasterAnnotation: ").append(toIndentedString(rasterAnnotation)).append("\n");
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

