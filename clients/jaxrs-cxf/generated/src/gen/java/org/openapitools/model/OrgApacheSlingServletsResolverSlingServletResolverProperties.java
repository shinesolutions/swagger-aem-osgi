package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingServletsResolverSlingServletResolverProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString servletresolverServletRoot;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger servletresolverCacheSize;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray servletresolverPaths;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray servletresolverDefaultExtensions;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingServletsResolverSlingServletResolverProperties orgApacheSlingServletsResolverSlingServletResolverProperties = (OrgApacheSlingServletsResolverSlingServletResolverProperties) o;
    return Objects.equals(this.servletresolverServletRoot, orgApacheSlingServletsResolverSlingServletResolverProperties.servletresolverServletRoot) &&
        Objects.equals(this.servletresolverCacheSize, orgApacheSlingServletsResolverSlingServletResolverProperties.servletresolverCacheSize) &&
        Objects.equals(this.servletresolverPaths, orgApacheSlingServletsResolverSlingServletResolverProperties.servletresolverPaths) &&
        Objects.equals(this.servletresolverDefaultExtensions, orgApacheSlingServletsResolverSlingServletResolverProperties.servletresolverDefaultExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servletresolverServletRoot, servletresolverCacheSize, servletresolverPaths, servletresolverDefaultExtensions);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

