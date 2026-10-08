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
 * ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties
 */

@JsonTypeName("comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString defaultExternalizerDomain;

  public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties defaultExternalizerDomain(@Nullable ConfigNodePropertyString defaultExternalizerDomain) {
    this.defaultExternalizerDomain = defaultExternalizerDomain;
    return this;
  }

  /**
   * Get defaultExternalizerDomain
   * @return defaultExternalizerDomain
   */
  @Valid 
  @Schema(name = "default.externalizer.domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default.externalizer.domain")
  public @Nullable ConfigNodePropertyString getDefaultExternalizerDomain() {
    return defaultExternalizerDomain;
  }

  @JsonProperty("default.externalizer.domain")
  public void setDefaultExternalizerDomain(@Nullable ConfigNodePropertyString defaultExternalizerDomain) {
    this.defaultExternalizerDomain = defaultExternalizerDomain;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties = (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties) o;
    return Objects.equals(this.defaultExternalizerDomain, comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.defaultExternalizerDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultExternalizerDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties {\n");
    sb.append("    defaultExternalizerDomain: ").append(toIndentedString(defaultExternalizerDomain)).append("\n");
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

