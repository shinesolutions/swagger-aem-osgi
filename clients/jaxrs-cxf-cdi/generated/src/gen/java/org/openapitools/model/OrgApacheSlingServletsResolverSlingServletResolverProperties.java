package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheSlingServletsResolverSlingServletResolverProperties   {
  
  private ConfigNodePropertyString servletresolverServletRoot = null;

  private ConfigNodePropertyInteger servletresolverCacheSize = null;

  private ConfigNodePropertyArray servletresolverPaths = null;

  private ConfigNodePropertyArray servletresolverDefaultExtensions = null;


  /**
   **/
  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverServletRoot(ConfigNodePropertyString servletresolverServletRoot) {
    this.servletresolverServletRoot = servletresolverServletRoot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("servletresolver.servletRoot")
  public ConfigNodePropertyString getServletresolverServletRoot() {
    return servletresolverServletRoot;
  }
  public void setServletresolverServletRoot(ConfigNodePropertyString servletresolverServletRoot) {
    this.servletresolverServletRoot = servletresolverServletRoot;
  }


  /**
   **/
  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverCacheSize(ConfigNodePropertyInteger servletresolverCacheSize) {
    this.servletresolverCacheSize = servletresolverCacheSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("servletresolver.cacheSize")
  public ConfigNodePropertyInteger getServletresolverCacheSize() {
    return servletresolverCacheSize;
  }
  public void setServletresolverCacheSize(ConfigNodePropertyInteger servletresolverCacheSize) {
    this.servletresolverCacheSize = servletresolverCacheSize;
  }


  /**
   **/
  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverPaths(ConfigNodePropertyArray servletresolverPaths) {
    this.servletresolverPaths = servletresolverPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("servletresolver.paths")
  public ConfigNodePropertyArray getServletresolverPaths() {
    return servletresolverPaths;
  }
  public void setServletresolverPaths(ConfigNodePropertyArray servletresolverPaths) {
    this.servletresolverPaths = servletresolverPaths;
  }


  /**
   **/
  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverDefaultExtensions(ConfigNodePropertyArray servletresolverDefaultExtensions) {
    this.servletresolverDefaultExtensions = servletresolverDefaultExtensions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("servletresolver.defaultExtensions")
  public ConfigNodePropertyArray getServletresolverDefaultExtensions() {
    return servletresolverDefaultExtensions;
  }
  public void setServletresolverDefaultExtensions(ConfigNodePropertyArray servletresolverDefaultExtensions) {
    this.servletresolverDefaultExtensions = servletresolverDefaultExtensions;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingServletsResolverSlingServletResolverProperties orgApacheSlingServletsResolverSlingServletResolverProperties = (OrgApacheSlingServletsResolverSlingServletResolverProperties) o;
    return Objects.equals(servletresolverServletRoot, orgApacheSlingServletsResolverSlingServletResolverProperties.servletresolverServletRoot) &&
        Objects.equals(servletresolverCacheSize, orgApacheSlingServletsResolverSlingServletResolverProperties.servletresolverCacheSize) &&
        Objects.equals(servletresolverPaths, orgApacheSlingServletsResolverSlingServletResolverProperties.servletresolverPaths) &&
        Objects.equals(servletresolverDefaultExtensions, orgApacheSlingServletsResolverSlingServletResolverProperties.servletresolverDefaultExtensions);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

