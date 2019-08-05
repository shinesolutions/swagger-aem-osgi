package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqExtwidgetServletsImageSpriteServletProperties   {
  
  private @Valid ConfigNodePropertyInteger maxWidth = null;
  private @Valid ConfigNodePropertyInteger maxHeight = null;

  /**
   **/
  public ComDayCqExtwidgetServletsImageSpriteServletProperties maxWidth(ConfigNodePropertyInteger maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxWidth")
  public ConfigNodePropertyInteger getMaxWidth() {
    return maxWidth;
  }
  public void setMaxWidth(ConfigNodePropertyInteger maxWidth) {
    this.maxWidth = maxWidth;
  }

  /**
   **/
  public ComDayCqExtwidgetServletsImageSpriteServletProperties maxHeight(ConfigNodePropertyInteger maxHeight) {
    this.maxHeight = maxHeight;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxHeight")
  public ConfigNodePropertyInteger getMaxHeight() {
    return maxHeight;
  }
  public void setMaxHeight(ConfigNodePropertyInteger maxHeight) {
    this.maxHeight = maxHeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqExtwidgetServletsImageSpriteServletProperties comDayCqExtwidgetServletsImageSpriteServletProperties = (ComDayCqExtwidgetServletsImageSpriteServletProperties) o;
    return Objects.equals(maxWidth, comDayCqExtwidgetServletsImageSpriteServletProperties.maxWidth) &&
        Objects.equals(maxHeight, comDayCqExtwidgetServletsImageSpriteServletProperties.maxHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxWidth, maxHeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqExtwidgetServletsImageSpriteServletProperties {\n");
    
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
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

