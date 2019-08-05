package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqImageInternalFontFontHelperProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqImageInternalFontFontHelperProperties   {
  @JsonProperty("fontpath")
  private ConfigNodePropertyArray fontpath = null;

  @JsonProperty("oversamplingFactor")
  private ConfigNodePropertyInteger oversamplingFactor = null;

  public ComDayCqImageInternalFontFontHelperProperties fontpath(ConfigNodePropertyArray fontpath) {
    this.fontpath = fontpath;
    return this;
  }

   /**
   * Get fontpath
   * @return fontpath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getFontpath() {
    return fontpath;
  }

  public void setFontpath(ConfigNodePropertyArray fontpath) {
    this.fontpath = fontpath;
  }

  public ComDayCqImageInternalFontFontHelperProperties oversamplingFactor(ConfigNodePropertyInteger oversamplingFactor) {
    this.oversamplingFactor = oversamplingFactor;
    return this;
  }

   /**
   * Get oversamplingFactor
   * @return oversamplingFactor
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getOversamplingFactor() {
    return oversamplingFactor;
  }

  public void setOversamplingFactor(ConfigNodePropertyInteger oversamplingFactor) {
    this.oversamplingFactor = oversamplingFactor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

