package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqDamHandlerStandardPdfPdfHandlerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqDamHandlerStandardPdfPdfHandlerProperties   {
  @JsonProperty("raster.annotation")
  private ConfigNodePropertyBoolean rasterAnnotation = null;

  public ComDayCqDamHandlerStandardPdfPdfHandlerProperties rasterAnnotation(ConfigNodePropertyBoolean rasterAnnotation) {
    this.rasterAnnotation = rasterAnnotation;
    return this;
  }

   /**
   * Get rasterAnnotation
   * @return rasterAnnotation
  **/
  @ApiModelProperty(value = "")
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
    ComDayCqDamHandlerStandardPdfPdfHandlerProperties comDayCqDamHandlerStandardPdfPdfHandlerProperties = (ComDayCqDamHandlerStandardPdfPdfHandlerProperties) o;
    return Objects.equals(this.rasterAnnotation, comDayCqDamHandlerStandardPdfPdfHandlerProperties.rasterAnnotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rasterAnnotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamHandlerStandardPdfPdfHandlerProperties {\n");
    
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

