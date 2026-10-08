package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamHandlerStandardPsPostScriptHandlerProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean rasterAnnotation;
 /**
   * Get rasterAnnotation
   * @return rasterAnnotation
  **/
  @JsonProperty("raster.annotation")
  public ConfigNodePropertyBoolean getRasterAnnotation() {
    return rasterAnnotation;
  }

  public void setRasterAnnotation(ConfigNodePropertyBoolean rasterAnnotation) {
    this.rasterAnnotation = rasterAnnotation;
  }

  public ComDayCqDamHandlerStandardPsPostScriptHandlerProperties rasterAnnotation(ConfigNodePropertyBoolean rasterAnnotation) {
    this.rasterAnnotation = rasterAnnotation;
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
    ComDayCqDamHandlerStandardPsPostScriptHandlerProperties comDayCqDamHandlerStandardPsPostScriptHandlerProperties = (ComDayCqDamHandlerStandardPsPostScriptHandlerProperties) o;
    return Objects.equals(this.rasterAnnotation, comDayCqDamHandlerStandardPsPostScriptHandlerProperties.rasterAnnotation);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

