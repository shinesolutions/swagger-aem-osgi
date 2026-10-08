package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqExtwidgetServletsImageSpriteServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxWidth;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxHeight;
 /**
  * Get maxWidth
  * @return maxWidth
  */
  @JsonProperty("maxWidth")
  public ConfigNodePropertyInteger getMaxWidth() {
    return maxWidth;
  }

  /**
   * Sets the <code>maxWidth</code> property.
   */
 public void setMaxWidth(ConfigNodePropertyInteger maxWidth) {
    this.maxWidth = maxWidth;
  }

  /**
   * Sets the <code>maxWidth</code> property.
   */
  public ComDayCqExtwidgetServletsImageSpriteServletProperties maxWidth(ConfigNodePropertyInteger maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

 /**
  * Get maxHeight
  * @return maxHeight
  */
  @JsonProperty("maxHeight")
  public ConfigNodePropertyInteger getMaxHeight() {
    return maxHeight;
  }

  /**
   * Sets the <code>maxHeight</code> property.
   */
 public void setMaxHeight(ConfigNodePropertyInteger maxHeight) {
    this.maxHeight = maxHeight;
  }

  /**
   * Sets the <code>maxHeight</code> property.
   */
  public ComDayCqExtwidgetServletsImageSpriteServletProperties maxHeight(ConfigNodePropertyInteger maxHeight) {
    this.maxHeight = maxHeight;
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
    ComDayCqExtwidgetServletsImageSpriteServletProperties comDayCqExtwidgetServletsImageSpriteServletProperties = (ComDayCqExtwidgetServletsImageSpriteServletProperties) o;
    return Objects.equals(this.maxWidth, comDayCqExtwidgetServletsImageSpriteServletProperties.maxWidth) &&
        Objects.equals(this.maxHeight, comDayCqExtwidgetServletsImageSpriteServletProperties.maxHeight);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

