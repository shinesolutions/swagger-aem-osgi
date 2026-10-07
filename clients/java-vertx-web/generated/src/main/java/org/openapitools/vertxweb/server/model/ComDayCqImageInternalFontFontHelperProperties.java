package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComDayCqImageInternalFontFontHelperProperties   {
  
  private ConfigNodePropertyArray fontpath;
  private ConfigNodePropertyInteger oversamplingFactor;

  public ComDayCqImageInternalFontFontHelperProperties () {

  }

  public ComDayCqImageInternalFontFontHelperProperties (ConfigNodePropertyArray fontpath, ConfigNodePropertyInteger oversamplingFactor) {
    this.fontpath = fontpath;
    this.oversamplingFactor = oversamplingFactor;
  }

    
  @JsonProperty("fontpath")
  public ConfigNodePropertyArray getFontpath() {
    return fontpath;
  }
  public void setFontpath(ConfigNodePropertyArray fontpath) {
    this.fontpath = fontpath;
  }

    
  @JsonProperty("oversamplingFactor")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
