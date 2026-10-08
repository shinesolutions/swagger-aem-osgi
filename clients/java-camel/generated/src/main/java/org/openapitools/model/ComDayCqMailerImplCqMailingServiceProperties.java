package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqMailerImplCqMailingServiceProperties {

  private ConfigNodePropertyString maxRecipientCount;

  public ComDayCqMailerImplCqMailingServiceProperties maxRecipientCount(ConfigNodePropertyString maxRecipientCount) {
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
  public ConfigNodePropertyString getMaxRecipientCount() {
    return maxRecipientCount;
  }

  public void setMaxRecipientCount(ConfigNodePropertyString maxRecipientCount) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

