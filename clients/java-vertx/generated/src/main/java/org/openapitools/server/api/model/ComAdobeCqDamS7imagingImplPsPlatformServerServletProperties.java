package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties   {
  
  private ConfigNodePropertyBoolean cacheEnable = null;
  private ConfigNodePropertyArray cacheRootPaths = null;
  private ConfigNodePropertyInteger cacheMaxSize = null;
  private ConfigNodePropertyInteger cacheMaxEntries = null;

  public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties () {

  }

  public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties (ConfigNodePropertyBoolean cacheEnable, ConfigNodePropertyArray cacheRootPaths, ConfigNodePropertyInteger cacheMaxSize, ConfigNodePropertyInteger cacheMaxEntries) {
    this.cacheEnable = cacheEnable;
    this.cacheRootPaths = cacheRootPaths;
    this.cacheMaxSize = cacheMaxSize;
    this.cacheMaxEntries = cacheMaxEntries;
  }

    
  @JsonProperty("cache.enable")
  public ConfigNodePropertyBoolean getCacheEnable() {
    return cacheEnable;
  }
  public void setCacheEnable(ConfigNodePropertyBoolean cacheEnable) {
    this.cacheEnable = cacheEnable;
  }

    
  @JsonProperty("cache.rootPaths")
  public ConfigNodePropertyArray getCacheRootPaths() {
    return cacheRootPaths;
  }
  public void setCacheRootPaths(ConfigNodePropertyArray cacheRootPaths) {
    this.cacheRootPaths = cacheRootPaths;
  }

    
  @JsonProperty("cache.maxSize")
  public ConfigNodePropertyInteger getCacheMaxSize() {
    return cacheMaxSize;
  }
  public void setCacheMaxSize(ConfigNodePropertyInteger cacheMaxSize) {
    this.cacheMaxSize = cacheMaxSize;
  }

    
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
