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
 * ComDayCqMailerImplCqMailingServiceProperties
 */

@JsonTypeName("comDayCqMailerImplCqMailingServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqMailerImplCqMailingServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString maxRecipientCount;

  public ComDayCqMailerImplCqMailingServiceProperties maxRecipientCount(@Nullable ConfigNodePropertyString maxRecipientCount) {
    this.maxRecipientCount = maxRecipientCount;
    return this;
  }

  /**
   * Get maxRecipientCount
   * @return maxRecipientCount
   */
  @Valid 
  @Schema(name = "max.recipient.count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max.recipient.count")
  public @Nullable ConfigNodePropertyString getMaxRecipientCount() {
    return maxRecipientCount;
  }

  @JsonProperty("max.recipient.count")
  public void setMaxRecipientCount(@Nullable ConfigNodePropertyString maxRecipientCount) {
    this.maxRecipientCount = maxRecipientCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMailerImplCqMailingServiceProperties comDayCqMailerImplCqMailingServiceProperties = (ComDayCqMailerImplCqMailingServiceProperties) o;
    return Objects.equals(this.maxRecipientCount, comDayCqMailerImplCqMailingServiceProperties.maxRecipientCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRecipientCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMailerImplCqMailingServiceProperties {\n");
    sb.append("    maxRecipientCount: ").append(toIndentedString(maxRecipientCount)).append("\n");
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

