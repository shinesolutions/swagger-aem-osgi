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
 * ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties
 */

@JsonTypeName("comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled;

  public ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties cqSearchpromoteConfighandlerEnabled(@Nullable ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled) {
    this.cqSearchpromoteConfighandlerEnabled = cqSearchpromoteConfighandlerEnabled;
    return this;
  }

  /**
   * Get cqSearchpromoteConfighandlerEnabled
   * @return cqSearchpromoteConfighandlerEnabled
   */
  @Valid 
  @Schema(name = "cq.searchpromote.confighandler.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.searchpromote.confighandler.enabled")
  public @Nullable ConfigNodePropertyBoolean getCqSearchpromoteConfighandlerEnabled() {
    return cqSearchpromoteConfighandlerEnabled;
  }

  @JsonProperty("cq.searchpromote.confighandler.enabled")
  public void setCqSearchpromoteConfighandlerEnabled(@Nullable ConfigNodePropertyBoolean cqSearchpromoteConfighandlerEnabled) {
    this.cqSearchpromoteConfighandlerEnabled = cqSearchpromoteConfighandlerEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties = (ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties) o;
    return Objects.equals(this.cqSearchpromoteConfighandlerEnabled, comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.cqSearchpromoteConfighandlerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqSearchpromoteConfighandlerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties {\n");
    sb.append("    cqSearchpromoteConfighandlerEnabled: ").append(toIndentedString(cqSearchpromoteConfighandlerEnabled)).append("\n");
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

