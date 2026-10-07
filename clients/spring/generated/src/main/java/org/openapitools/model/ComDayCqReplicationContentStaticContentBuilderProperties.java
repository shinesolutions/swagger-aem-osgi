package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqReplicationContentStaticContentBuilderProperties
 */

@JsonTypeName("comDayCqReplicationContentStaticContentBuilderProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqReplicationContentStaticContentBuilderProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString host;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger port;

  public ComDayCqReplicationContentStaticContentBuilderProperties host(@Nullable ConfigNodePropertyString host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
   */
  @Valid 
  @Schema(name = "host", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("host")
  public @Nullable ConfigNodePropertyString getHost() {
    return host;
  }

  @JsonProperty("host")
  public void setHost(@Nullable ConfigNodePropertyString host) {
    this.host = host;
  }

  public ComDayCqReplicationContentStaticContentBuilderProperties port(@Nullable ConfigNodePropertyInteger port) {
    this.port = port;
    return this;
  }

  /**
   * Get port
   * @return port
   */
  @Valid 
  @Schema(name = "port", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("port")
  public @Nullable ConfigNodePropertyInteger getPort() {
    return port;
  }

  @JsonProperty("port")
  public void setPort(@Nullable ConfigNodePropertyInteger port) {
    this.port = port;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationContentStaticContentBuilderProperties comDayCqReplicationContentStaticContentBuilderProperties = (ComDayCqReplicationContentStaticContentBuilderProperties) o;
    return Objects.equals(this.host, comDayCqReplicationContentStaticContentBuilderProperties.host) &&
        Objects.equals(this.port, comDayCqReplicationContentStaticContentBuilderProperties.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationContentStaticContentBuilderProperties {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

