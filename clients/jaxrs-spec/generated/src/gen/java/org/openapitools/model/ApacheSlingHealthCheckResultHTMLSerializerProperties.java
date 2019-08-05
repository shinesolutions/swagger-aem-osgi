package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApacheSlingHealthCheckResultHTMLSerializerProperties   {
  
  private @Valid ConfigNodePropertyString styleString = null;

  /**
   **/
  public ApacheSlingHealthCheckResultHTMLSerializerProperties styleString(ConfigNodePropertyString styleString) {
    this.styleString = styleString;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("styleString")
  public ConfigNodePropertyString getStyleString() {
    return styleString;
  }
  public void setStyleString(ConfigNodePropertyString styleString) {
    this.styleString = styleString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApacheSlingHealthCheckResultHTMLSerializerProperties apacheSlingHealthCheckResultHTMLSerializerProperties = (ApacheSlingHealthCheckResultHTMLSerializerProperties) o;
    return Objects.equals(styleString, apacheSlingHealthCheckResultHTMLSerializerProperties.styleString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(styleString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApacheSlingHealthCheckResultHTMLSerializerProperties {\n");
    
    sb.append("    styleString: ").append(toIndentedString(styleString)).append("\n");
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

