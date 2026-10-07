package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComDayCqWcmCoreImplServletsFindReplaceServletProperties   {
  
  private ConfigNodePropertyArray scope;

  /**
   **/
  public ComDayCqWcmCoreImplServletsFindReplaceServletProperties scope(ConfigNodePropertyArray scope) {
    this.scope = scope;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scope")
  public ConfigNodePropertyArray getScope() {
    return scope;
  }
  public void setScope(ConfigNodePropertyArray scope) {
    this.scope = scope;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplServletsFindReplaceServletProperties comDayCqWcmCoreImplServletsFindReplaceServletProperties = (ComDayCqWcmCoreImplServletsFindReplaceServletProperties) o;
    return Objects.equals(this.scope, comDayCqWcmCoreImplServletsFindReplaceServletProperties.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplServletsFindReplaceServletProperties {\n");
    
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

