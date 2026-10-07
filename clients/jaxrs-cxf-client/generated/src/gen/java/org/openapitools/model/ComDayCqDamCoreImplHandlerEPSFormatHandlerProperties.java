package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString mimetype;
 /**
   * Get mimetype
   * @return mimetype
  **/
  @JsonProperty("mimetype")
  public ConfigNodePropertyString getMimetype() {
    return mimetype;
  }

  public void setMimetype(ConfigNodePropertyString mimetype) {
    this.mimetype = mimetype;
  }

  public ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties mimetype(ConfigNodePropertyString mimetype) {
    this.mimetype = mimetype;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

