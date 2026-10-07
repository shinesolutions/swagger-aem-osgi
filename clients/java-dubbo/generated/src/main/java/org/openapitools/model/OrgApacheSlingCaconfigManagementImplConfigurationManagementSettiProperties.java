package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ignorePropertyNameRegex")
  private ConfigNodePropertyArray ignorePropertyNameRegex;

  @JsonProperty("configCollectionPropertiesResourceNames")
  private ConfigNodePropertyArray configCollectionPropertiesResourceNames;

  /**
   * 
   * @return ignorePropertyNameRegex
   */
  public ConfigNodePropertyArray getIgnorePropertyNameRegex() {
    return ignorePropertyNameRegex;
  }

  public void setIgnorePropertyNameRegex(ConfigNodePropertyArray ignorePropertyNameRegex) {
    this.ignorePropertyNameRegex = ignorePropertyNameRegex;
  }

  /**
   * 
   * @return configCollectionPropertiesResourceNames
   */
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
    return Objects.equals(this.ignorePropertyNameRegex, orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.ignorePropertyNameRegex) &&
        Objects.equals(this.configCollectionPropertiesResourceNames, orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.configCollectionPropertiesResourceNames);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
