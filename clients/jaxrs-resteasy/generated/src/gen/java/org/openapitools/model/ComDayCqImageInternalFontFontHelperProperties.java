package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqImageInternalFontFontHelperProperties   {
  
  private ConfigNodePropertyArray fontpath;
  private ConfigNodePropertyInteger oversamplingFactor;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fontpath")
  @Valid
  public ConfigNodePropertyArray getFontpath() {
    return fontpath;
  }
  public void setFontpath(ConfigNodePropertyArray fontpath) {
    this.fontpath = fontpath;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oversamplingFactor")
  @Valid
  public ConfigNodePropertyInteger getOversamplingFactor() {
    return oversamplingFactor;
  }
  public void setOversamplingFactor(ConfigNodePropertyInteger oversamplingFactor) {
    this.oversamplingFactor = oversamplingFactor;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

