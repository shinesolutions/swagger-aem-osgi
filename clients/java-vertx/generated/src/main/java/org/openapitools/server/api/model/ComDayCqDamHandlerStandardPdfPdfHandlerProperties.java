package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamHandlerStandardPdfPdfHandlerProperties   {
  
  private ConfigNodePropertyBoolean rasterAnnotation = null;

  public ComDayCqDamHandlerStandardPdfPdfHandlerProperties () {

  }

  public ComDayCqDamHandlerStandardPdfPdfHandlerProperties (ConfigNodePropertyBoolean rasterAnnotation) {
    this.rasterAnnotation = rasterAnnotation;
  }

    
  @JsonProperty("raster.annotation")
  public ConfigNodePropertyBoolean getRasterAnnotation() {
    return rasterAnnotation;
  }
  public void setRasterAnnotation(ConfigNodePropertyBoolean rasterAnnotation) {
    this.rasterAnnotation = rasterAnnotation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamHandlerStandardPdfPdfHandlerProperties comDayCqDamHandlerStandardPdfPdfHandlerProperties = (ComDayCqDamHandlerStandardPdfPdfHandlerProperties) o;
    return Objects.equals(rasterAnnotation, comDayCqDamHandlerStandardPdfPdfHandlerProperties.rasterAnnotation);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
