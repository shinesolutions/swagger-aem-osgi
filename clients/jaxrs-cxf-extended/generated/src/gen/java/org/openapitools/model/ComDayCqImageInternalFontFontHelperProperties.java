package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqImageInternalFontFontHelperProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray fontpath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger oversamplingFactor;
 /**
  * Get fontpath
  * @return fontpath
  */
  @JsonProperty("fontpath")
  public ConfigNodePropertyArray getFontpath() {
    return fontpath;
  }

  /**
   * Sets the <code>fontpath</code> property.
   */
 public void setFontpath(ConfigNodePropertyArray fontpath) {
    this.fontpath = fontpath;
  }

  /**
   * Sets the <code>fontpath</code> property.
   */
  public ComDayCqImageInternalFontFontHelperProperties fontpath(ConfigNodePropertyArray fontpath) {
    this.fontpath = fontpath;
    return this;
  }

 /**
  * Get oversamplingFactor
  * @return oversamplingFactor
  */
  @JsonProperty("oversamplingFactor")
  public ConfigNodePropertyInteger getOversamplingFactor() {
    return oversamplingFactor;
  }

  /**
   * Sets the <code>oversamplingFactor</code> property.
   */
 public void setOversamplingFactor(ConfigNodePropertyInteger oversamplingFactor) {
    this.oversamplingFactor = oversamplingFactor;
  }

  /**
   * Sets the <code>oversamplingFactor</code> property.
   */
  public ComDayCqImageInternalFontFontHelperProperties oversamplingFactor(ConfigNodePropertyInteger oversamplingFactor) {
    this.oversamplingFactor = oversamplingFactor;
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
    ComDayCqImageInternalFontFontHelperProperties comDayCqImageInternalFontFontHelperProperties = (ComDayCqImageInternalFontFontHelperProperties) o;
    return Objects.equals(this.fontpath, comDayCqImageInternalFontFontHelperProperties.fontpath) &&
        Objects.equals(this.oversamplingFactor, comDayCqImageInternalFontFontHelperProperties.oversamplingFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontpath, oversamplingFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqImageInternalFontFontHelperProperties {\n");
    
    sb.append("    fontpath: ").append(toIndentedString(fontpath)).append("\n");
    sb.append("    oversamplingFactor: ").append(toIndentedString(oversamplingFactor)).append("\n");
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

