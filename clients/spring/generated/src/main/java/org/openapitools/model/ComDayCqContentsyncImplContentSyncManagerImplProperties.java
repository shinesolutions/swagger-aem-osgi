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
 * ComDayCqContentsyncImplContentSyncManagerImplProperties
 */

@JsonTypeName("comDayCqContentsyncImplContentSyncManagerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqContentsyncImplContentSyncManagerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString contentsyncFallbackAuthorizable;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString contentsyncFallbackUpdateuser;

  public ComDayCqContentsyncImplContentSyncManagerImplProperties contentsyncFallbackAuthorizable(@Nullable ConfigNodePropertyString contentsyncFallbackAuthorizable) {
    this.contentsyncFallbackAuthorizable = contentsyncFallbackAuthorizable;
    return this;
  }

  /**
   * Get contentsyncFallbackAuthorizable
   * @return contentsyncFallbackAuthorizable
   */
  @Valid 
  @Schema(name = "contentsync.fallback.authorizable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentsync.fallback.authorizable")
  public @Nullable ConfigNodePropertyString getContentsyncFallbackAuthorizable() {
    return contentsyncFallbackAuthorizable;
  }

  @JsonProperty("contentsync.fallback.authorizable")
  public void setContentsyncFallbackAuthorizable(@Nullable ConfigNodePropertyString contentsyncFallbackAuthorizable) {
    this.contentsyncFallbackAuthorizable = contentsyncFallbackAuthorizable;
  }

  public ComDayCqContentsyncImplContentSyncManagerImplProperties contentsyncFallbackUpdateuser(@Nullable ConfigNodePropertyString contentsyncFallbackUpdateuser) {
    this.contentsyncFallbackUpdateuser = contentsyncFallbackUpdateuser;
    return this;
  }

  /**
   * Get contentsyncFallbackUpdateuser
   * @return contentsyncFallbackUpdateuser
   */
  @Valid 
  @Schema(name = "contentsync.fallback.updateuser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentsync.fallback.updateuser")
  public @Nullable ConfigNodePropertyString getContentsyncFallbackUpdateuser() {
    return contentsyncFallbackUpdateuser;
  }

  @JsonProperty("contentsync.fallback.updateuser")
  public void setContentsyncFallbackUpdateuser(@Nullable ConfigNodePropertyString contentsyncFallbackUpdateuser) {
    this.contentsyncFallbackUpdateuser = contentsyncFallbackUpdateuser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqContentsyncImplContentSyncManagerImplProperties comDayCqContentsyncImplContentSyncManagerImplProperties = (ComDayCqContentsyncImplContentSyncManagerImplProperties) o;
    return Objects.equals(this.contentsyncFallbackAuthorizable, comDayCqContentsyncImplContentSyncManagerImplProperties.contentsyncFallbackAuthorizable) &&
        Objects.equals(this.contentsyncFallbackUpdateuser, comDayCqContentsyncImplContentSyncManagerImplProperties.contentsyncFallbackUpdateuser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentsyncFallbackAuthorizable, contentsyncFallbackUpdateuser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqContentsyncImplContentSyncManagerImplProperties {\n");
    sb.append("    contentsyncFallbackAuthorizable: ").append(toIndentedString(contentsyncFallbackAuthorizable)).append("\n");
    sb.append("    contentsyncFallbackUpdateuser: ").append(toIndentedString(contentsyncFallbackUpdateuser)).append("\n");
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

