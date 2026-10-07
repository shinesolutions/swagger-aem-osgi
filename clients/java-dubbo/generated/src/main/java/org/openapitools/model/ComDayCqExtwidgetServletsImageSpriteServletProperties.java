package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqExtwidgetServletsImageSpriteServletProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("maxWidth")
  private ConfigNodePropertyInteger maxWidth;

  @JsonProperty("maxHeight")
  private ConfigNodePropertyInteger maxHeight;

  /**
   * 
   * @return maxWidth
   */
  public ConfigNodePropertyInteger getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(ConfigNodePropertyInteger maxWidth) {
    this.maxWidth = maxWidth;
  }

  /**
   * 
   * @return maxHeight
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
