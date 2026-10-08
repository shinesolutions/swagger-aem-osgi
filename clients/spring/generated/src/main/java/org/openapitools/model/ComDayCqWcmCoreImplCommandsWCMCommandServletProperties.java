package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmCoreImplCommandsWCMCommandServletProperties
 */

@JsonTypeName("comDayCqWcmCoreImplCommandsWCMCommandServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray wcmcommandservletDeleteWhitelist;

  public ComDayCqWcmCoreImplCommandsWCMCommandServletProperties wcmcommandservletDeleteWhitelist(@Nullable ConfigNodePropertyArray wcmcommandservletDeleteWhitelist) {
    this.wcmcommandservletDeleteWhitelist = wcmcommandservletDeleteWhitelist;
    return this;
  }

  /**
   * Get wcmcommandservletDeleteWhitelist
   * @return wcmcommandservletDeleteWhitelist
   */
  @Valid 
  @Schema(name = "wcmcommandservlet.delete_whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wcmcommandservlet.delete_whitelist")
  public @Nullable ConfigNodePropertyArray getWcmcommandservletDeleteWhitelist() {
    return wcmcommandservletDeleteWhitelist;
  }

  @JsonProperty("wcmcommandservlet.delete_whitelist")
  public void setWcmcommandservletDeleteWhitelist(@Nullable ConfigNodePropertyArray wcmcommandservletDeleteWhitelist) {
    this.wcmcommandservletDeleteWhitelist = wcmcommandservletDeleteWhitelist;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplCommandsWCMCommandServletProperties comDayCqWcmCoreImplCommandsWCMCommandServletProperties = (ComDayCqWcmCoreImplCommandsWCMCommandServletProperties) o;
    return Objects.equals(this.wcmcommandservletDeleteWhitelist, comDayCqWcmCoreImplCommandsWCMCommandServletProperties.wcmcommandservletDeleteWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wcmcommandservletDeleteWhitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties {\n");
    sb.append("    wcmcommandservletDeleteWhitelist: ").append(toIndentedString(wcmcommandservletDeleteWhitelist)).append("\n");
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

