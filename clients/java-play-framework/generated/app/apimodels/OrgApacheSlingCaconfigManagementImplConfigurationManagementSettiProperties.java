package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties   {
  @JsonProperty("ignorePropertyNameRegex")
  @Valid

  private ConfigNodePropertyArray ignorePropertyNameRegex;

  @JsonProperty("configCollectionPropertiesResourceNames")
  @Valid

  private ConfigNodePropertyArray configCollectionPropertiesResourceNames;

  public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties ignorePropertyNameRegex(ConfigNodePropertyArray ignorePropertyNameRegex) {
    this.ignorePropertyNameRegex = ignorePropertyNameRegex;
    return this;
  }

   /**
   * Get ignorePropertyNameRegex
   * @return ignorePropertyNameRegex
  **/
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

