package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * OrgApacheSlingEngineImplSlingMainServletProperties
 */

@JsonTypeName("orgApacheSlingEngineImplSlingMainServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEngineImplSlingMainServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger slingMaxCalls;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger slingMaxInclusions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean slingTraceAllow;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger slingMaxRecordRequests;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray slingStorePatternRequests;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingServerinfo;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray slingAdditionalResponseHeaders;

  public OrgApacheSlingEngineImplSlingMainServletProperties slingMaxCalls(@Nullable ConfigNodePropertyInteger slingMaxCalls) {
    this.slingMaxCalls = slingMaxCalls;
    return this;
  }

  /**
   * Get slingMaxCalls
   * @return slingMaxCalls
   */
  @Valid 
  @Schema(name = "sling.max.calls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.max.calls")
  public @Nullable ConfigNodePropertyInteger getSlingMaxCalls() {
    return slingMaxCalls;
  }

  @JsonProperty("sling.max.calls")
  public void setSlingMaxCalls(@Nullable ConfigNodePropertyInteger slingMaxCalls) {
    this.slingMaxCalls = slingMaxCalls;
  }

  public OrgApacheSlingEngineImplSlingMainServletProperties slingMaxInclusions(@Nullable ConfigNodePropertyInteger slingMaxInclusions) {
    this.slingMaxInclusions = slingMaxInclusions;
    return this;
  }

  /**
   * Get slingMaxInclusions
   * @return slingMaxInclusions
   */
  @Valid 
  @Schema(name = "sling.max.inclusions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.max.inclusions")
  public @Nullable ConfigNodePropertyInteger getSlingMaxInclusions() {
    return slingMaxInclusions;
  }

  @JsonProperty("sling.max.inclusions")
  public void setSlingMaxInclusions(@Nullable ConfigNodePropertyInteger slingMaxInclusions) {
    this.slingMaxInclusions = slingMaxInclusions;
  }

  public OrgApacheSlingEngineImplSlingMainServletProperties slingTraceAllow(@Nullable ConfigNodePropertyBoolean slingTraceAllow) {
    this.slingTraceAllow = slingTraceAllow;
    return this;
  }

  /**
   * Get slingTraceAllow
   * @return slingTraceAllow
   */
  @Valid 
  @Schema(name = "sling.trace.allow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.trace.allow")
  public @Nullable ConfigNodePropertyBoolean getSlingTraceAllow() {
    return slingTraceAllow;
  }

  @JsonProperty("sling.trace.allow")
  public void setSlingTraceAllow(@Nullable ConfigNodePropertyBoolean slingTraceAllow) {
    this.slingTraceAllow = slingTraceAllow;
  }

  public OrgApacheSlingEngineImplSlingMainServletProperties slingMaxRecordRequests(@Nullable ConfigNodePropertyInteger slingMaxRecordRequests) {
    this.slingMaxRecordRequests = slingMaxRecordRequests;
    return this;
  }

  /**
   * Get slingMaxRecordRequests
   * @return slingMaxRecordRequests
   */
  @Valid 
  @Schema(name = "sling.max.record.requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.max.record.requests")
  public @Nullable ConfigNodePropertyInteger getSlingMaxRecordRequests() {
    return slingMaxRecordRequests;
  }

  @JsonProperty("sling.max.record.requests")
  public void setSlingMaxRecordRequests(@Nullable ConfigNodePropertyInteger slingMaxRecordRequests) {
    this.slingMaxRecordRequests = slingMaxRecordRequests;
  }

  public OrgApacheSlingEngineImplSlingMainServletProperties slingStorePatternRequests(@Nullable ConfigNodePropertyArray slingStorePatternRequests) {
    this.slingStorePatternRequests = slingStorePatternRequests;
    return this;
  }

  /**
   * Get slingStorePatternRequests
   * @return slingStorePatternRequests
   */
  @Valid 
  @Schema(name = "sling.store.pattern.requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.store.pattern.requests")
  public @Nullable ConfigNodePropertyArray getSlingStorePatternRequests() {
    return slingStorePatternRequests;
  }

  @JsonProperty("sling.store.pattern.requests")
  public void setSlingStorePatternRequests(@Nullable ConfigNodePropertyArray slingStorePatternRequests) {
    this.slingStorePatternRequests = slingStorePatternRequests;
  }

  public OrgApacheSlingEngineImplSlingMainServletProperties slingServerinfo(@Nullable ConfigNodePropertyString slingServerinfo) {
    this.slingServerinfo = slingServerinfo;
    return this;
  }

  /**
   * Get slingServerinfo
   * @return slingServerinfo
   */
  @Valid 
  @Schema(name = "sling.serverinfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.serverinfo")
  public @Nullable ConfigNodePropertyString getSlingServerinfo() {
    return slingServerinfo;
  }

  @JsonProperty("sling.serverinfo")
  public void setSlingServerinfo(@Nullable ConfigNodePropertyString slingServerinfo) {
    this.slingServerinfo = slingServerinfo;
  }

  public OrgApacheSlingEngineImplSlingMainServletProperties slingAdditionalResponseHeaders(@Nullable ConfigNodePropertyArray slingAdditionalResponseHeaders) {
    this.slingAdditionalResponseHeaders = slingAdditionalResponseHeaders;
    return this;
  }

  /**
   * Get slingAdditionalResponseHeaders
   * @return slingAdditionalResponseHeaders
   */
  @Valid 
  @Schema(name = "sling.additional.response.headers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.additional.response.headers")
  public @Nullable ConfigNodePropertyArray getSlingAdditionalResponseHeaders() {
    return slingAdditionalResponseHeaders;
  }

  @JsonProperty("sling.additional.response.headers")
  public void setSlingAdditionalResponseHeaders(@Nullable ConfigNodePropertyArray slingAdditionalResponseHeaders) {
    this.slingAdditionalResponseHeaders = slingAdditionalResponseHeaders;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEngineImplSlingMainServletProperties orgApacheSlingEngineImplSlingMainServletProperties = (OrgApacheSlingEngineImplSlingMainServletProperties) o;
    return Objects.equals(this.slingMaxCalls, orgApacheSlingEngineImplSlingMainServletProperties.slingMaxCalls) &&
        Objects.equals(this.slingMaxInclusions, orgApacheSlingEngineImplSlingMainServletProperties.slingMaxInclusions) &&
        Objects.equals(this.slingTraceAllow, orgApacheSlingEngineImplSlingMainServletProperties.slingTraceAllow) &&
        Objects.equals(this.slingMaxRecordRequests, orgApacheSlingEngineImplSlingMainServletProperties.slingMaxRecordRequests) &&
        Objects.equals(this.slingStorePatternRequests, orgApacheSlingEngineImplSlingMainServletProperties.slingStorePatternRequests) &&
        Objects.equals(this.slingServerinfo, orgApacheSlingEngineImplSlingMainServletProperties.slingServerinfo) &&
        Objects.equals(this.slingAdditionalResponseHeaders, orgApacheSlingEngineImplSlingMainServletProperties.slingAdditionalResponseHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingMaxCalls, slingMaxInclusions, slingTraceAllow, slingMaxRecordRequests, slingStorePatternRequests, slingServerinfo, slingAdditionalResponseHeaders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingEngineImplSlingMainServletProperties {\n");
    sb.append("    slingMaxCalls: ").append(toIndentedString(slingMaxCalls)).append("\n");
    sb.append("    slingMaxInclusions: ").append(toIndentedString(slingMaxInclusions)).append("\n");
    sb.append("    slingTraceAllow: ").append(toIndentedString(slingTraceAllow)).append("\n");
    sb.append("    slingMaxRecordRequests: ").append(toIndentedString(slingMaxRecordRequests)).append("\n");
    sb.append("    slingStorePatternRequests: ").append(toIndentedString(slingStorePatternRequests)).append("\n");
    sb.append("    slingServerinfo: ").append(toIndentedString(slingServerinfo)).append("\n");
    sb.append("    slingAdditionalResponseHeaders: ").append(toIndentedString(slingAdditionalResponseHeaders)).append("\n");
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

