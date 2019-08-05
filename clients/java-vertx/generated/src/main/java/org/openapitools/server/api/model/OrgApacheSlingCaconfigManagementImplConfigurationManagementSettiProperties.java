package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties   {
  
  private ConfigNodePropertyArray ignorePropertyNameRegex = null;
  private ConfigNodePropertyArray configCollectionPropertiesResourceNames = null;

  public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties () {

  }

  public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties (ConfigNodePropertyArray ignorePropertyNameRegex, ConfigNodePropertyArray configCollectionPropertiesResourceNames) {
    this.ignorePropertyNameRegex = ignorePropertyNameRegex;
    this.configCollectionPropertiesResourceNames = configCollectionPropertiesResourceNames;
  }

    
  @JsonProperty("ignorePropertyNameRegex")
  public ConfigNodePropertyArray getIgnorePropertyNameRegex() {
    return ignorePropertyNameRegex;
  }
  public void setIgnorePropertyNameRegex(ConfigNodePropertyArray ignorePropertyNameRegex) {
    this.ignorePropertyNameRegex = ignorePropertyNameRegex;
  }

    
  @JsonProperty("configCollectionPropertiesResourceNames")
  public ConfigNodePropertyArray getConfigCollectionPropertiesResourceNames() {
    return configCollectionPropertiesResourceNames;
  }
  public void setConfigCollectionPropertiesResourceNames(ConfigNodePropertyArray configCollectionPropertiesResourceNames) {
    this.configCollectionPropertiesResourceNames = configCollectionPropertiesResourceNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties = (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties) o;
    return Objects.equals(ignorePropertyNameRegex, orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.ignorePropertyNameRegex) &&
        Objects.equals(configCollectionPropertiesResourceNames, orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.configCollectionPropertiesResourceNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignorePropertyNameRegex, configCollectionPropertiesResourceNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties {\n");
    
    sb.append("    ignorePropertyNameRegex: ").append(toIndentedString(ignorePropertyNameRegex)).append("\n");
    sb.append("    configCollectionPropertiesResourceNames: ").append(toIndentedString(configCollectionPropertiesResourceNames)).append("\n");
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
