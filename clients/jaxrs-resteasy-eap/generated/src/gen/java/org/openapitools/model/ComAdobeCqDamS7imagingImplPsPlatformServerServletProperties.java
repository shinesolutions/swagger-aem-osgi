package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties   {
  

  private ConfigNodePropertyBoolean cacheEnable = null;

  private ConfigNodePropertyArray cacheRootPaths = null;

  private ConfigNodePropertyInteger cacheMaxSize = null;

  private ConfigNodePropertyInteger cacheMaxEntries = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cache.enable")
  public ConfigNodePropertyBoolean getCacheEnable() {
    return cacheEnable;
  }
  public void setCacheEnable(ConfigNodePropertyBoolean cacheEnable) {
    this.cacheEnable = cacheEnable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cache.rootPaths")
  public ConfigNodePropertyArray getCacheRootPaths() {
    return cacheRootPaths;
  }
  public void setCacheRootPaths(ConfigNodePropertyArray cacheRootPaths) {
    this.cacheRootPaths = cacheRootPaths;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cache.maxSize")
  public ConfigNodePropertyInteger getCacheMaxSize() {
    return cacheMaxSize;
  }
  public void setCacheMaxSize(ConfigNodePropertyInteger cacheMaxSize) {
    this.cacheMaxSize = cacheMaxSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cache.maxEntries")
  public ConfigNodePropertyInteger getCacheMaxEntries() {
    return cacheMaxEntries;
  }
  public void setCacheMaxEntries(ConfigNodePropertyInteger cacheMaxEntries) {
    this.cacheMaxEntries = cacheMaxEntries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties comAdobeCqDamS7imagingImplPsPlatformServerServletProperties = (ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties) o;
    return Objects.equals(cacheEnable, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties.cacheEnable) &&
        Objects.equals(cacheRootPaths, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties.cacheRootPaths) &&
        Objects.equals(cacheMaxSize, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties.cacheMaxSize) &&
        Objects.equals(cacheMaxEntries, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties.cacheMaxEntries);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

