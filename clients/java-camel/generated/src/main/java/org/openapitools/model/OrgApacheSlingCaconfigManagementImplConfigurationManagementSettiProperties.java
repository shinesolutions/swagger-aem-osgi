package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties
 */

@JsonTypeName("orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties {

  private ConfigNodePropertyArray ignorePropertyNameRegex;

  private ConfigNodePropertyArray configCollectionPropertiesResourceNames;

  public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties ignorePropertyNameRegex(ConfigNodePropertyArray ignorePropertyNameRegex) {
    this.ignorePropertyNameRegex = ignorePropertyNameRegex;
    return this;
  }

  /**
   * Get ignorePropertyNameRegex
   * @return ignorePropertyNameRegex
   */
  @Valid 
  @Schema(name = "ignorePropertyNameRegex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ignorePropertyNameRegex")
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
   */
  @Valid 
  @Schema(name = "configCollectionPropertiesResourceNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

