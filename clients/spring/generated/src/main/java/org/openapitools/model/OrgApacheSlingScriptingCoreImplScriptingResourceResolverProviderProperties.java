package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties
 */

@JsonTypeName("orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean logStacktraceOnclose;

  public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties logStacktraceOnclose(@Nullable ConfigNodePropertyBoolean logStacktraceOnclose) {
    this.logStacktraceOnclose = logStacktraceOnclose;
    return this;
  }

  /**
   * Get logStacktraceOnclose
   * @return logStacktraceOnclose
   */
  @Valid 
  @Schema(name = "log.stacktrace.onclose", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("log.stacktrace.onclose")
  public @Nullable ConfigNodePropertyBoolean getLogStacktraceOnclose() {
    return logStacktraceOnclose;
  }

  @JsonProperty("log.stacktrace.onclose")
  public void setLogStacktraceOnclose(@Nullable ConfigNodePropertyBoolean logStacktraceOnclose) {
    this.logStacktraceOnclose = logStacktraceOnclose;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties = (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties) o;
    return Objects.equals(this.logStacktraceOnclose, orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.logStacktraceOnclose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logStacktraceOnclose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties {\n");
    sb.append("    logStacktraceOnclose: ").append(toIndentedString(logStacktraceOnclose)).append("\n");
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

