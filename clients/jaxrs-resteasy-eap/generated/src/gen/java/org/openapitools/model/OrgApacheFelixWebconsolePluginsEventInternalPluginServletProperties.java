package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties   {
  
  private ConfigNodePropertyInteger maxSize;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("max.size")
  public ConfigNodePropertyInteger getMaxSize() {
    return maxSize;
  }
  public void setMaxSize(ConfigNodePropertyInteger maxSize) {
    this.maxSize = maxSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties = (OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties) o;
    return Objects.equals(this.maxSize, orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.maxSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties {\n");
    
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
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

