package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqExtwidgetServletsImageSpriteServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxWidth = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxHeight = null;
 /**
   * Get maxWidth
   * @return maxWidth
  **/
  @JsonProperty("maxWidth")
  public ConfigNodePropertyInteger getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(ConfigNodePropertyInteger maxWidth) {
    this.maxWidth = maxWidth;
  }

  public ComDayCqExtwidgetServletsImageSpriteServletProperties maxWidth(ConfigNodePropertyInteger maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

 /**
   * Get maxHeight
   * @return maxHeight
  **/
  @JsonProperty("maxHeight")
  public ConfigNodePropertyInteger getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(ConfigNodePropertyInteger maxHeight) {
    this.maxHeight = maxHeight;
  }

  public ComDayCqExtwidgetServletsImageSpriteServletProperties maxHeight(ConfigNodePropertyInteger maxHeight) {
    this.maxHeight = maxHeight;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

