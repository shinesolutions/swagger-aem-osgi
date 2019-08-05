package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties   {
  
  private ConfigNodePropertyString filterOrder = null;
  private ConfigNodePropertyString filterScope = null;

  public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties () {

  }

  public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties (ConfigNodePropertyString filterOrder, ConfigNodePropertyString filterScope) {
    this.filterOrder = filterOrder;
    this.filterScope = filterScope;
  }

    
  @JsonProperty("filter.order")
  public ConfigNodePropertyString getFilterOrder() {
    return filterOrder;
  }
  public void setFilterOrder(ConfigNodePropertyString filterOrder) {
    this.filterOrder = filterOrder;
  }

    
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
    return Objects.equals(filterOrder, comDayCqWcmCoreImplWarpTimeWarpFilterProperties.filterOrder) &&
        Objects.equals(filterScope, comDayCqWcmCoreImplWarpTimeWarpFilterProperties.filterScope);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
