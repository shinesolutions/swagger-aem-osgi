package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties   {
  
  private ConfigNodePropertyBoolean enabled = null;
  private ConfigNodePropertyString configPath = null;
  private ConfigNodePropertyArray fallbackPaths = null;
  private ConfigNodePropertyArray configCollectionInheritancePropertyNames = null;

  public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties () {

  }

  public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties (ConfigNodePropertyBoolean enabled, ConfigNodePropertyString configPath, ConfigNodePropertyArray fallbackPaths, ConfigNodePropertyArray configCollectionInheritancePropertyNames) {
    this.enabled = enabled;
    this.configPath = configPath;
    this.fallbackPaths = fallbackPaths;
    this.configCollectionInheritancePropertyNames = configCollectionInheritancePropertyNames;
  }

    
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

    
  @JsonProperty("configPath")
  public ConfigNodePropertyString getConfigPath() {
    return configPath;
  }
  public void setConfigPath(ConfigNodePropertyString configPath) {
    this.configPath = configPath;
  }

    
  @JsonProperty("fallbackPaths")
  public ConfigNodePropertyArray getFallbackPaths() {
    return fallbackPaths;
  }
  public void setFallbackPaths(ConfigNodePropertyArray fallbackPaths) {
    this.fallbackPaths = fallbackPaths;
  }

    
  @JsonProperty("configCollectionInheritancePropertyNames")
  public ConfigNodePropertyArray getConfigCollectionInheritancePropertyNames() {
    return configCollectionInheritancePropertyNames;
  }
  public void setConfigCollectionInheritancePropertyNames(ConfigNodePropertyArray configCollectionInheritancePropertyNames) {
    this.configCollectionInheritancePropertyNames = configCollectionInheritancePropertyNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties = (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties) o;
    return Objects.equals(enabled, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.enabled) &&
        Objects.equals(configPath, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.configPath) &&
        Objects.equals(fallbackPaths, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.fallbackPaths) &&
        Objects.equals(configCollectionInheritancePropertyNames, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.configCollectionInheritancePropertyNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, configPath, fallbackPaths, configCollectionInheritancePropertyNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    configPath: ").append(toIndentedString(configPath)).append("\n");
    sb.append("    fallbackPaths: ").append(toIndentedString(fallbackPaths)).append("\n");
    sb.append("    configCollectionInheritancePropertyNames: ").append(toIndentedString(configCollectionInheritancePropertyNames)).append("\n");
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
