package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyDropDown;
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
 * OrgApacheFelixJaasConfigurationSpiProperties
 */

@JsonTypeName("orgApacheFelixJaasConfigurationSpiProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixJaasConfigurationSpiProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jaasDefaultRealmName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jaasConfigProviderName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown jaasGlobalConfigPolicy;

  public OrgApacheFelixJaasConfigurationSpiProperties jaasDefaultRealmName(@Nullable ConfigNodePropertyString jaasDefaultRealmName) {
    this.jaasDefaultRealmName = jaasDefaultRealmName;
    return this;
  }

  /**
   * Get jaasDefaultRealmName
   * @return jaasDefaultRealmName
   */
  @Valid 
  @Schema(name = "jaas.defaultRealmName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jaas.defaultRealmName")
  public @Nullable ConfigNodePropertyString getJaasDefaultRealmName() {
    return jaasDefaultRealmName;
  }

  @JsonProperty("jaas.defaultRealmName")
  public void setJaasDefaultRealmName(@Nullable ConfigNodePropertyString jaasDefaultRealmName) {
    this.jaasDefaultRealmName = jaasDefaultRealmName;
  }

  public OrgApacheFelixJaasConfigurationSpiProperties jaasConfigProviderName(@Nullable ConfigNodePropertyString jaasConfigProviderName) {
    this.jaasConfigProviderName = jaasConfigProviderName;
    return this;
  }

  /**
   * Get jaasConfigProviderName
   * @return jaasConfigProviderName
   */
  @Valid 
  @Schema(name = "jaas.configProviderName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jaas.configProviderName")
  public @Nullable ConfigNodePropertyString getJaasConfigProviderName() {
    return jaasConfigProviderName;
  }

  @JsonProperty("jaas.configProviderName")
  public void setJaasConfigProviderName(@Nullable ConfigNodePropertyString jaasConfigProviderName) {
    this.jaasConfigProviderName = jaasConfigProviderName;
  }

  public OrgApacheFelixJaasConfigurationSpiProperties jaasGlobalConfigPolicy(@Nullable ConfigNodePropertyDropDown jaasGlobalConfigPolicy) {
    this.jaasGlobalConfigPolicy = jaasGlobalConfigPolicy;
    return this;
  }

  /**
   * Get jaasGlobalConfigPolicy
   * @return jaasGlobalConfigPolicy
   */
  @Valid 
  @Schema(name = "jaas.globalConfigPolicy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jaas.globalConfigPolicy")
  public @Nullable ConfigNodePropertyDropDown getJaasGlobalConfigPolicy() {
    return jaasGlobalConfigPolicy;
  }

  @JsonProperty("jaas.globalConfigPolicy")
  public void setJaasGlobalConfigPolicy(@Nullable ConfigNodePropertyDropDown jaasGlobalConfigPolicy) {
    this.jaasGlobalConfigPolicy = jaasGlobalConfigPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixJaasConfigurationSpiProperties orgApacheFelixJaasConfigurationSpiProperties = (OrgApacheFelixJaasConfigurationSpiProperties) o;
    return Objects.equals(this.jaasDefaultRealmName, orgApacheFelixJaasConfigurationSpiProperties.jaasDefaultRealmName) &&
        Objects.equals(this.jaasConfigProviderName, orgApacheFelixJaasConfigurationSpiProperties.jaasConfigProviderName) &&
        Objects.equals(this.jaasGlobalConfigPolicy, orgApacheFelixJaasConfigurationSpiProperties.jaasGlobalConfigPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jaasDefaultRealmName, jaasConfigProviderName, jaasGlobalConfigPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixJaasConfigurationSpiProperties {\n");
    sb.append("    jaasDefaultRealmName: ").append(toIndentedString(jaasDefaultRealmName)).append("\n");
    sb.append("    jaasConfigProviderName: ").append(toIndentedString(jaasConfigProviderName)).append("\n");
    sb.append("    jaasGlobalConfigPolicy: ").append(toIndentedString(jaasGlobalConfigPolicy)).append("\n");
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

