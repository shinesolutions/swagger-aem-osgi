package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties
 */

@JsonTypeName("comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString locale;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString imsConfig;

  public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties name(@Nullable ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable ConfigNodePropertyString getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable ConfigNodePropertyString name) {
    this.name = name;
  }

  public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties locale(@Nullable ConfigNodePropertyString locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
   */
  @Valid 
  @Schema(name = "locale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale")
  public @Nullable ConfigNodePropertyString getLocale() {
    return locale;
  }

  @JsonProperty("locale")
  public void setLocale(@Nullable ConfigNodePropertyString locale) {
    this.locale = locale;
  }

  public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties imsConfig(@Nullable ConfigNodePropertyString imsConfig) {
    this.imsConfig = imsConfig;
    return this;
  }

  /**
   * Get imsConfig
   * @return imsConfig
   */
  @Valid 
  @Schema(name = "imsConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imsConfig")
  public @Nullable ConfigNodePropertyString getImsConfig() {
    return imsConfig;
  }

  @JsonProperty("imsConfig")
  public void setImsConfig(@Nullable ConfigNodePropertyString imsConfig) {
    this.imsConfig = imsConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties = (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties) o;
    return Objects.equals(this.name, comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.name) &&
        Objects.equals(this.locale, comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.locale) &&
        Objects.equals(this.imsConfig, comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.imsConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, locale, imsConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    imsConfig: ").append(toIndentedString(imsConfig)).append("\n");
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

