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
 * ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties
 */

@JsonTypeName("comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties {

  private ConfigNodePropertyString fromAddress;

  private ConfigNodePropertyString senderHost;

  private ConfigNodePropertyString maxBounceCount;

  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties fromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

  /**
   * Get fromAddress
   * @return fromAddress
   */
  @Valid 
  @Schema(name = "from.address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("from.address")
  public ConfigNodePropertyString getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
  }

  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties senderHost(ConfigNodePropertyString senderHost) {
    this.senderHost = senderHost;
    return this;
  }

  /**
   * Get senderHost
   * @return senderHost
   */
  @Valid 
  @Schema(name = "sender.host", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sender.host")
  public ConfigNodePropertyString getSenderHost() {
    return senderHost;
  }

  public void setSenderHost(ConfigNodePropertyString senderHost) {
    this.senderHost = senderHost;
  }

  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties maxBounceCount(ConfigNodePropertyString maxBounceCount) {
    this.maxBounceCount = maxBounceCount;
    return this;
  }

  /**
   * Get maxBounceCount
   * @return maxBounceCount
   */
  @Valid 
  @Schema(name = "max.bounce.count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max.bounce.count")
  public ConfigNodePropertyString getMaxBounceCount() {
    return maxBounceCount;
  }

  public void setMaxBounceCount(ConfigNodePropertyString maxBounceCount) {
    this.maxBounceCount = maxBounceCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties = (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties) o;
    return Objects.equals(this.fromAddress, comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.fromAddress) &&
        Objects.equals(this.senderHost, comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.senderHost) &&
        Objects.equals(this.maxBounceCount, comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.maxBounceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAddress, senderHost, maxBounceCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties {\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    senderHost: ").append(toIndentedString(senderHost)).append("\n");
    sb.append("    maxBounceCount: ").append(toIndentedString(maxBounceCount)).append("\n");
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

