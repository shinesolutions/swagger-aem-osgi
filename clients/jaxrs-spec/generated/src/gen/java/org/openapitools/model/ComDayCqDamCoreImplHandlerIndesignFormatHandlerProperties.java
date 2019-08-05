package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties   {
  
  private @Valid ConfigNodePropertyArray mimetype = null;

  /**
   **/
  public ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties mimetype(ConfigNodePropertyArray mimetype) {
    this.mimetype = mimetype;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mimetype")
  public ConfigNodePropertyArray getMimetype() {
    return mimetype;
  }
  public void setMimetype(ConfigNodePropertyArray mimetype) {
    this.mimetype = mimetype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties = (ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties) o;
    return Objects.equals(mimetype, comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.mimetype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimetype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties {\n");
    
    sb.append("    mimetype: ").append(toIndentedString(mimetype)).append("\n");
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

