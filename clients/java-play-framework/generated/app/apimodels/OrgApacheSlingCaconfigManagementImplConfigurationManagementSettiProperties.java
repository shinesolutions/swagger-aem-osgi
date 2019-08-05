package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties   {
  @JsonProperty("ignorePropertyNameRegex")
  private ConfigNodePropertyArray ignorePropertyNameRegex = null;

  @JsonProperty("configCollectionPropertiesResourceNames")
  private ConfigNodePropertyArray configCollectionPropertiesResourceNames = null;

  public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties ignorePropertyNameRegex(ConfigNodePropertyArray ignorePropertyNameRegex) {
    this.ignorePropertyNameRegex = ignorePropertyNameRegex;
    return this;
  }

   /**
   * Get ignorePropertyNameRegex
   * @return ignorePropertyNameRegex
  **/
  @Valid
  public ConfigNodePropertyArray getIgnorePropertyNameRegex() {
    return ignorePropertyNameRegex;
  }

  public void setIgnorePropertyNameRegex(ConfigNodePropertyArray ignorePropertyNameRegex) {
    this.ignorePropertyNameRegex = ignorePropertyNameRegex;
  }

  public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties configCollectionPropertiesResourceNames(ConfigNodePropertyArray configCollectionPropertiesResourceNames) {
    this.configCollectionPropertiesResourceNames = configCollectionPropertiesResourceNames;
    return this;
  }

   /**
   * Get configCollectionPropertiesResourceNames
   * @return configCollectionPropertiesResourceNames
  **/
  @Valid
  public ConfigNodePropertyArray getConfigCollectionPropertiesResourceNames() {
    return configCollectionPropertiesResourceNames;
  }

  public void setConfigCollectionPropertiesResourceNames(ConfigNodePropertyArray configCollectionPropertiesResourceNames) {
    this.configCollectionPropertiesResourceNames = configCollectionPropertiesResourceNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

