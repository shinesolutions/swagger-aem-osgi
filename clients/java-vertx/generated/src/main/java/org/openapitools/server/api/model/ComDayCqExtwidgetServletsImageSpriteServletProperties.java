package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqExtwidgetServletsImageSpriteServletProperties   {
  
  private ConfigNodePropertyInteger maxWidth = null;
  private ConfigNodePropertyInteger maxHeight = null;

  public ComDayCqExtwidgetServletsImageSpriteServletProperties () {

  }

  public ComDayCqExtwidgetServletsImageSpriteServletProperties (ConfigNodePropertyInteger maxWidth, ConfigNodePropertyInteger maxHeight) {
    this.maxWidth = maxWidth;
    this.maxHeight = maxHeight;
  }

    
  @JsonProperty("maxWidth")
  public ConfigNodePropertyInteger getMaxWidth() {
    return maxWidth;
  }
  public void setMaxWidth(ConfigNodePropertyInteger maxWidth) {
    this.maxWidth = maxWidth;
  }

    
  @JsonProperty("maxHeight")
  public ConfigNodePropertyInteger getMaxHeight() {
    return maxHeight;
  }
  public void setMaxHeight(ConfigNodePropertyInteger maxHeight) {
    this.maxHeight = maxHeight;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
