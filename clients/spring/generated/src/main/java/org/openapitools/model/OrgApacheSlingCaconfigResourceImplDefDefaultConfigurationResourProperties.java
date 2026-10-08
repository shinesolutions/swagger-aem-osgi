package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties
 */

@JsonTypeName("orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString configPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray fallbackPaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray configCollectionInheritancePropertyNames;

  public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties enabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @Valid 
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public @Nullable ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
  public void setEnabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties configPath(@Nullable ConfigNodePropertyString configPath) {
    this.configPath = configPath;
    return this;
  }

  /**
   * Get configPath
   * @return configPath
   */
  @Valid 
  @Schema(name = "configPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configPath")
  public @Nullable ConfigNodePropertyString getConfigPath() {
    return configPath;
  }

  @JsonProperty("configPath")
  public void setConfigPath(@Nullable ConfigNodePropertyString configPath) {
    this.configPath = configPath;
  }

  public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties fallbackPaths(@Nullable ConfigNodePropertyArray fallbackPaths) {
    this.fallbackPaths = fallbackPaths;
    return this;
  }

  /**
   * Get fallbackPaths
   * @return fallbackPaths
   */
  @Valid 
  @Schema(name = "fallbackPaths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fallbackPaths")
  public @Nullable ConfigNodePropertyArray getFallbackPaths() {
    return fallbackPaths;
  }

  @JsonProperty("fallbackPaths")
  public void setFallbackPaths(@Nullable ConfigNodePropertyArray fallbackPaths) {
    this.fallbackPaths = fallbackPaths;
  }

  public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties configCollectionInheritancePropertyNames(@Nullable ConfigNodePropertyArray configCollectionInheritancePropertyNames) {
    this.configCollectionInheritancePropertyNames = configCollectionInheritancePropertyNames;
    return this;
  }

  /**
   * Get configCollectionInheritancePropertyNames
   * @return configCollectionInheritancePropertyNames
   */
  @Valid 
  @Schema(name = "configCollectionInheritancePropertyNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configCollectionInheritancePropertyNames")
  public @Nullable ConfigNodePropertyArray getConfigCollectionInheritancePropertyNames() {
    return configCollectionInheritancePropertyNames;
  }

  @JsonProperty("configCollectionInheritancePropertyNames")
  public void setConfigCollectionInheritancePropertyNames(@Nullable ConfigNodePropertyArray configCollectionInheritancePropertyNames) {
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
    return Objects.equals(this.enabled, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.enabled) &&
        Objects.equals(this.configPath, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.configPath) &&
        Objects.equals(this.fallbackPaths, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.fallbackPaths) &&
        Objects.equals(this.configCollectionInheritancePropertyNames, orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.configCollectionInheritancePropertyNames);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

