package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqExtwidgetServletsImageSpriteServletProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqExtwidgetServletsImageSpriteServletProperties   {
  private ConfigNodePropertyInteger maxWidth;
  private ConfigNodePropertyInteger maxHeight;

  public ComDayCqExtwidgetServletsImageSpriteServletProperties() {
  }

  /**
   **/
  public ComDayCqExtwidgetServletsImageSpriteServletProperties maxWidth(ConfigNodePropertyInteger maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxWidth")
  @Valid public ConfigNodePropertyInteger getMaxWidth() {
    return maxWidth;
  }

  @JsonProperty("maxWidth")
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
  @Valid public ConfigNodePropertyInteger getMaxHeight() {
    return maxHeight;
  }

  @JsonProperty("maxHeight")
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
