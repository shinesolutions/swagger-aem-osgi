package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqWcmCoreImplWCMDebugFilterProperties   {
  
  private ConfigNodePropertyBoolean wcmdbgfilterEnabled = null;
  private ConfigNodePropertyBoolean wcmdbgfilterJspDebug = null;

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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplWCMDebugFilterProperties comDayCqWcmCoreImplWCMDebugFilterProperties = (ComDayCqWcmCoreImplWCMDebugFilterProperties) o;
    return Objects.equals(wcmdbgfilterEnabled, comDayCqWcmCoreImplWCMDebugFilterProperties.wcmdbgfilterEnabled) &&
        Objects.equals(wcmdbgfilterJspDebug, comDayCqWcmCoreImplWCMDebugFilterProperties.wcmdbgfilterJspDebug);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

