package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplWCMDebugFilterProperties   {
  
  private ConfigNodePropertyBoolean wcmdbgfilterEnabled;
  private ConfigNodePropertyBoolean wcmdbgfilterJspDebug;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("wcmdbgfilter.enabled")
  public ConfigNodePropertyBoolean getWcmdbgfilterEnabled() {
    return wcmdbgfilterEnabled;
  }
  public void setWcmdbgfilterEnabled(ConfigNodePropertyBoolean wcmdbgfilterEnabled) {
    this.wcmdbgfilterEnabled = wcmdbgfilterEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("wcmdbgfilter.jspDebug")
  public ConfigNodePropertyBoolean getWcmdbgfilterJspDebug() {
    return wcmdbgfilterJspDebug;
  }
  public void setWcmdbgfilterJspDebug(ConfigNodePropertyBoolean wcmdbgfilterJspDebug) {
    this.wcmdbgfilterJspDebug = wcmdbgfilterJspDebug;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplWCMDebugFilterProperties comDayCqWcmCoreImplWCMDebugFilterProperties = (ComDayCqWcmCoreImplWCMDebugFilterProperties) o;
    return Objects.equals(this.wcmdbgfilterEnabled, comDayCqWcmCoreImplWCMDebugFilterProperties.wcmdbgfilterEnabled) &&
        Objects.equals(this.wcmdbgfilterJspDebug, comDayCqWcmCoreImplWCMDebugFilterProperties.wcmdbgfilterJspDebug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wcmdbgfilterEnabled, wcmdbgfilterJspDebug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplWCMDebugFilterProperties {\n");
    
    sb.append("    wcmdbgfilterEnabled: ").append(toIndentedString(wcmdbgfilterEnabled)).append("\n");
    sb.append("    wcmdbgfilterJspDebug: ").append(toIndentedString(wcmdbgfilterJspDebug)).append("\n");
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

