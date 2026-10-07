package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties   {
  
  private ConfigNodePropertyString filterOrder;

  private ConfigNodePropertyString filterScope;

  /**
   **/
  public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties filterOrder(ConfigNodePropertyString filterOrder) {
    this.filterOrder = filterOrder;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("filter.order")
  public ConfigNodePropertyString getFilterOrder() {
    return filterOrder;
  }
  public void setFilterOrder(ConfigNodePropertyString filterOrder) {
    this.filterOrder = filterOrder;
  }


  /**
   **/
  public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties filterScope(ConfigNodePropertyString filterScope) {
    this.filterScope = filterScope;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("filter.scope")
  public ConfigNodePropertyString getFilterScope() {
    return filterScope;
  }
  public void setFilterScope(ConfigNodePropertyString filterScope) {
    this.filterScope = filterScope;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplWarpTimeWarpFilterProperties comDayCqWcmCoreImplWarpTimeWarpFilterProperties = (ComDayCqWcmCoreImplWarpTimeWarpFilterProperties) o;
    return Objects.equals(this.filterOrder, comDayCqWcmCoreImplWarpTimeWarpFilterProperties.filterOrder) &&
        Objects.equals(this.filterScope, comDayCqWcmCoreImplWarpTimeWarpFilterProperties.filterScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterOrder, filterScope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {\n");
    
    sb.append("    filterOrder: ").append(toIndentedString(filterOrder)).append("\n");
    sb.append("    filterScope: ").append(toIndentedString(filterScope)).append("\n");
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

