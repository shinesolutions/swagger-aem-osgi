package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties   {
  
  private ConfigNodePropertyArray xmphandlerCqFormats = null;


  /**
   **/
  public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties xmphandlerCqFormats(ConfigNodePropertyArray xmphandlerCqFormats) {
    this.xmphandlerCqFormats = xmphandlerCqFormats;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("xmphandler.cq.formats")
  public ConfigNodePropertyArray getXmphandlerCqFormats() {
    return xmphandlerCqFormats;
  }
  public void setXmphandlerCqFormats(ConfigNodePropertyArray xmphandlerCqFormats) {
    this.xmphandlerCqFormats = xmphandlerCqFormats;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties = (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties) o;
    return Objects.equals(xmphandlerCqFormats, comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.xmphandlerCqFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xmphandlerCqFormats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties {\n");
    
    sb.append("    xmphandlerCqFormats: ").append(toIndentedString(xmphandlerCqFormats)).append("\n");
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

