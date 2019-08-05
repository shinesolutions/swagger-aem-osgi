package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString filterOrder = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString filterScope = null;
 /**
   * Get filterOrder
   * @return filterOrder
  **/
  @JsonProperty("filter.order")
  public ConfigNodePropertyString getFilterOrder() {
    return filterOrder;
  }

  public void setFilterOrder(ConfigNodePropertyString filterOrder) {
    this.filterOrder = filterOrder;
  }

  public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties filterOrder(ConfigNodePropertyString filterOrder) {
    this.filterOrder = filterOrder;
    return this;
  }

 /**
   * Get filterScope
   * @return filterScope
  **/
  @JsonProperty("filter.scope")
  public ConfigNodePropertyString getFilterScope() {
    return filterScope;
  }

  public void setFilterScope(ConfigNodePropertyString filterScope) {
    this.filterScope = filterScope;
  }

  public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties filterScope(ConfigNodePropertyString filterScope) {
    this.filterScope = filterScope;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

