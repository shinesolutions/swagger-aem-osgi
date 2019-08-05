package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties   {
  @JsonProperty("cache.enable")
  private ConfigNodePropertyBoolean cacheEnable = null;

  @JsonProperty("cache.rootPaths")
  private ConfigNodePropertyArray cacheRootPaths = null;

  @JsonProperty("cache.maxSize")
  private ConfigNodePropertyInteger cacheMaxSize = null;

  @JsonProperty("cache.maxEntries")
  private ConfigNodePropertyInteger cacheMaxEntries = null;

  public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties cacheEnable(ConfigNodePropertyBoolean cacheEnable) {
    this.cacheEnable = cacheEnable;
    return this;
  }

   /**
   * Get cacheEnable
   * @return cacheEnable
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCacheEnable() {
    return cacheEnable;
  }

  public void setCacheEnable(ConfigNodePropertyBoolean cacheEnable) {
    this.cacheEnable = cacheEnable;
  }

  public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties cacheRootPaths(ConfigNodePropertyArray cacheRootPaths) {
    this.cacheRootPaths = cacheRootPaths;
    return this;
  }

   /**
   * Get cacheRootPaths
   * @return cacheRootPaths
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCacheRootPaths() {
    return cacheRootPaths;
  }

  public void setCacheRootPaths(ConfigNodePropertyArray cacheRootPaths) {
    this.cacheRootPaths = cacheRootPaths;
  }

  public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties cacheMaxSize(ConfigNodePropertyInteger cacheMaxSize) {
    this.cacheMaxSize = cacheMaxSize;
    return this;
  }

   /**
   * Get cacheMaxSize
   * @return cacheMaxSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCacheMaxSize() {
    return cacheMaxSize;
  }

  public void setCacheMaxSize(ConfigNodePropertyInteger cacheMaxSize) {
    this.cacheMaxSize = cacheMaxSize;
  }

  public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties cacheMaxEntries(ConfigNodePropertyInteger cacheMaxEntries) {
    this.cacheMaxEntries = cacheMaxEntries;
    return this;
  }

   /**
   * Get cacheMaxEntries
   * @return cacheMaxEntries
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCacheMaxEntries() {
    return cacheMaxEntries;
  }

  public void setCacheMaxEntries(ConfigNodePropertyInteger cacheMaxEntries) {
    this.cacheMaxEntries = cacheMaxEntries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties comAdobeCqDamS7imagingImplPsPlatformServerServletProperties = (ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties) o;
    return Objects.equals(this.cacheEnable, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties.cacheEnable) &&
        Objects.equals(this.cacheRootPaths, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties.cacheRootPaths) &&
        Objects.equals(this.cacheMaxSize, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties.cacheMaxSize) &&
        Objects.equals(this.cacheMaxEntries, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties.cacheMaxEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheEnable, cacheRootPaths, cacheMaxSize, cacheMaxEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties {\n");
    
    sb.append("    cacheEnable: ").append(toIndentedString(cacheEnable)).append("\n");
    sb.append("    cacheRootPaths: ").append(toIndentedString(cacheRootPaths)).append("\n");
    sb.append("    cacheMaxSize: ").append(toIndentedString(cacheMaxSize)).append("\n");
    sb.append("    cacheMaxEntries: ").append(toIndentedString(cacheMaxEntries)).append("\n");
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

