package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheSlingServletsResolverSlingServletResolverProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheSlingServletsResolverSlingServletResolverProperties   {
  @JsonProperty("servletresolver.servletRoot")
  private ConfigNodePropertyString servletresolverServletRoot = null;

  @JsonProperty("servletresolver.cacheSize")
  private ConfigNodePropertyInteger servletresolverCacheSize = null;

  @JsonProperty("servletresolver.paths")
  private ConfigNodePropertyArray servletresolverPaths = null;

  @JsonProperty("servletresolver.defaultExtensions")
  private ConfigNodePropertyArray servletresolverDefaultExtensions = null;

  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverServletRoot(ConfigNodePropertyString servletresolverServletRoot) {
    this.servletresolverServletRoot = servletresolverServletRoot;
    return this;
  }

  /**
   * Get servletresolverServletRoot
   * @return servletresolverServletRoot
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getServletresolverServletRoot() {
    return servletresolverServletRoot;
  }

  public void setServletresolverServletRoot(ConfigNodePropertyString servletresolverServletRoot) {
    this.servletresolverServletRoot = servletresolverServletRoot;
  }

  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverCacheSize(ConfigNodePropertyInteger servletresolverCacheSize) {
    this.servletresolverCacheSize = servletresolverCacheSize;
    return this;
  }

  /**
   * Get servletresolverCacheSize
   * @return servletresolverCacheSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getServletresolverCacheSize() {
    return servletresolverCacheSize;
  }

  public void setServletresolverCacheSize(ConfigNodePropertyInteger servletresolverCacheSize) {
    this.servletresolverCacheSize = servletresolverCacheSize;
  }

  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverPaths(ConfigNodePropertyArray servletresolverPaths) {
    this.servletresolverPaths = servletresolverPaths;
    return this;
  }

  /**
   * Get servletresolverPaths
   * @return servletresolverPaths
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getServletresolverPaths() {
    return servletresolverPaths;
  }

  public void setServletresolverPaths(ConfigNodePropertyArray servletresolverPaths) {
    this.servletresolverPaths = servletresolverPaths;
  }

  public OrgApacheSlingServletsResolverSlingServletResolverProperties servletresolverDefaultExtensions(ConfigNodePropertyArray servletresolverDefaultExtensions) {
    this.servletresolverDefaultExtensions = servletresolverDefaultExtensions;
    return this;
  }

  /**
   * Get servletresolverDefaultExtensions
   * @return servletresolverDefaultExtensions
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

