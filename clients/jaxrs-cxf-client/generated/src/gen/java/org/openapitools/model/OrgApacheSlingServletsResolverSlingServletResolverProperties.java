package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
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

public class OrgApacheSlingServletsResolverSlingServletResolverProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString servletresolverServletRoot = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger servletresolverCacheSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray servletresolverPaths = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray servletresolverDefaultExtensions = null;
 /**
   * Get servletresolverServletRoot
   * @return servletresolverServletRoot
  **/
  @JsonProperty("servletresolver.servletRoot")
  public ConfigNodePropertyString getServletresolverServletRoot() {
    return servletresolverServletRoot;
  }

  public void setServletresolverServletRoot(ConfigNodePropertyString servletresolverServletRoot) {
    this.servletresolverServletRoot = servletresolverServletRoot;
  }

  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverServletRoot(ConfigNodePropertyString servletresolverServletRoot) {
    this.servletresolverServletRoot = servletresolverServletRoot;
    return this;
  }

 /**
   * Get servletresolverCacheSize
   * @return servletresolverCacheSize
  **/
  @JsonProperty("servletresolver.cacheSize")
  public ConfigNodePropertyInteger getServletresolverCacheSize() {
    return servletresolverCacheSize;
  }

  public void setServletresolverCacheSize(ConfigNodePropertyInteger servletresolverCacheSize) {
    this.servletresolverCacheSize = servletresolverCacheSize;
  }

  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverCacheSize(ConfigNodePropertyInteger servletresolverCacheSize) {
    this.servletresolverCacheSize = servletresolverCacheSize;
    return this;
  }

 /**
   * Get servletresolverPaths
   * @return servletresolverPaths
  **/
  @JsonProperty("servletresolver.paths")
  public ConfigNodePropertyArray getServletresolverPaths() {
    return servletresolverPaths;
  }

  public void setServletresolverPaths(ConfigNodePropertyArray servletresolverPaths) {
    this.servletresolverPaths = servletresolverPaths;
  }

  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverPaths(ConfigNodePropertyArray servletresolverPaths) {
    this.servletresolverPaths = servletresolverPaths;
    return this;
  }

 /**
   * Get servletresolverDefaultExtensions
   * @return servletresolverDefaultExtensions
  **/
  @JsonProperty("servletresolver.defaultExtensions")
  public ConfigNodePropertyArray getServletresolverDefaultExtensions() {
    return servletresolverDefaultExtensions;
  }

  public void setServletresolverDefaultExtensions(ConfigNodePropertyArray servletresolverDefaultExtensions) {
    this.servletresolverDefaultExtensions = servletresolverDefaultExtensions;
  }

  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverDefaultExtensions(ConfigNodePropertyArray servletresolverDefaultExtensions) {
    this.servletresolverDefaultExtensions = servletresolverDefaultExtensions;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingServletsResolverSlingServletResolverProperties {\n");
    
    sb.append("    servletresolverServletRoot: ").append(toIndentedString(servletresolverServletRoot)).append("\n");
    sb.append("    servletresolverCacheSize: ").append(toIndentedString(servletresolverCacheSize)).append("\n");
    sb.append("    servletresolverPaths: ").append(toIndentedString(servletresolverPaths)).append("\n");
    sb.append("    servletresolverDefaultExtensions: ").append(toIndentedString(servletresolverDefaultExtensions)).append("\n");
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

