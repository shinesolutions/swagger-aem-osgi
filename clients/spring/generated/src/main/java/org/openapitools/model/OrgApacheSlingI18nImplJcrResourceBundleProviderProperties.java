package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
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
 * OrgApacheSlingI18nImplJcrResourceBundleProviderProperties
 */

@JsonTypeName("orgApacheSlingI18nImplJcrResourceBundleProviderProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString localeDefault;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean preloadBundles;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger invalidationDelay;

  public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties localeDefault(@Nullable ConfigNodePropertyString localeDefault) {
    this.localeDefault = localeDefault;
    return this;
  }

  /**
   * Get localeDefault
   * @return localeDefault
   */
  @Valid 
  @Schema(name = "locale.default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale.default")
  public @Nullable ConfigNodePropertyString getLocaleDefault() {
    return localeDefault;
  }

  @JsonProperty("locale.default")
  public void setLocaleDefault(@Nullable ConfigNodePropertyString localeDefault) {
    this.localeDefault = localeDefault;
  }

  public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties preloadBundles(@Nullable ConfigNodePropertyBoolean preloadBundles) {
    this.preloadBundles = preloadBundles;
    return this;
  }

  /**
   * Get preloadBundles
   * @return preloadBundles
   */
  @Valid 
  @Schema(name = "preload.bundles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preload.bundles")
  public @Nullable ConfigNodePropertyBoolean getPreloadBundles() {
    return preloadBundles;
  }

  @JsonProperty("preload.bundles")
  public void setPreloadBundles(@Nullable ConfigNodePropertyBoolean preloadBundles) {
    this.preloadBundles = preloadBundles;
  }

  public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties invalidationDelay(@Nullable ConfigNodePropertyInteger invalidationDelay) {
    this.invalidationDelay = invalidationDelay;
    return this;
  }

  /**
   * Get invalidationDelay
   * @return invalidationDelay
   */
  @Valid 
  @Schema(name = "invalidation.delay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invalidation.delay")
  public @Nullable ConfigNodePropertyInteger getInvalidationDelay() {
    return invalidationDelay;
  }

  @JsonProperty("invalidation.delay")
  public void setInvalidationDelay(@Nullable ConfigNodePropertyInteger invalidationDelay) {
    this.invalidationDelay = invalidationDelay;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingI18nImplJcrResourceBundleProviderProperties orgApacheSlingI18nImplJcrResourceBundleProviderProperties = (OrgApacheSlingI18nImplJcrResourceBundleProviderProperties) o;
    return Objects.equals(this.localeDefault, orgApacheSlingI18nImplJcrResourceBundleProviderProperties.localeDefault) &&
        Objects.equals(this.preloadBundles, orgApacheSlingI18nImplJcrResourceBundleProviderProperties.preloadBundles) &&
        Objects.equals(this.invalidationDelay, orgApacheSlingI18nImplJcrResourceBundleProviderProperties.invalidationDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localeDefault, preloadBundles, invalidationDelay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties {\n");
    sb.append("    localeDefault: ").append(toIndentedString(localeDefault)).append("\n");
    sb.append("    preloadBundles: ").append(toIndentedString(preloadBundles)).append("\n");
    sb.append("    invalidationDelay: ").append(toIndentedString(invalidationDelay)).append("\n");
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

