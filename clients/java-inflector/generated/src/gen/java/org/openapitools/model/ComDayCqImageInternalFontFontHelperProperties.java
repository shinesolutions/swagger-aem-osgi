package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqImageInternalFontFontHelperProperties   {
  @JsonProperty("fontpath")
  private ConfigNodePropertyArray fontpath = null;

  @JsonProperty("oversamplingFactor")
  private ConfigNodePropertyInteger oversamplingFactor = null;

  /**
   **/
  public ComDayCqImageInternalFontFontHelperProperties fontpath(ConfigNodePropertyArray fontpath) {
    this.fontpath = fontpath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fontpath")
  public ConfigNodePropertyArray getFontpath() {
    return fontpath;
  }
  public void setFontpath(ConfigNodePropertyArray fontpath) {
    this.fontpath = fontpath;
  }

  /**
   **/
  public ComDayCqImageInternalFontFontHelperProperties oversamplingFactor(ConfigNodePropertyInteger oversamplingFactor) {
    this.oversamplingFactor = oversamplingFactor;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oversamplingFactor")
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
    return Objects.equals(fontpath, comDayCqImageInternalFontFontHelperProperties.fontpath) &&
        Objects.equals(oversamplingFactor, comDayCqImageInternalFontFontHelperProperties.oversamplingFactor);
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

