package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties
 */

@JsonTypeName("comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqAnalyticsSitecatalystServiceDatacenterUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray devhostnamepatterns;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger connectionTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger socketTimeout;

  public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties cqAnalyticsSitecatalystServiceDatacenterUrl(@Nullable ConfigNodePropertyArray cqAnalyticsSitecatalystServiceDatacenterUrl) {
    this.cqAnalyticsSitecatalystServiceDatacenterUrl = cqAnalyticsSitecatalystServiceDatacenterUrl;
    return this;
  }

  /**
   * Get cqAnalyticsSitecatalystServiceDatacenterUrl
   * @return cqAnalyticsSitecatalystServiceDatacenterUrl
   */
  @Valid 
  @Schema(name = "cq.analytics.sitecatalyst.service.datacenter.url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.analytics.sitecatalyst.service.datacenter.url")
  public @Nullable ConfigNodePropertyArray getCqAnalyticsSitecatalystServiceDatacenterUrl() {
    return cqAnalyticsSitecatalystServiceDatacenterUrl;
  }

  @JsonProperty("cq.analytics.sitecatalyst.service.datacenter.url")
  public void setCqAnalyticsSitecatalystServiceDatacenterUrl(@Nullable ConfigNodePropertyArray cqAnalyticsSitecatalystServiceDatacenterUrl) {
    this.cqAnalyticsSitecatalystServiceDatacenterUrl = cqAnalyticsSitecatalystServiceDatacenterUrl;
  }

  public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties devhostnamepatterns(@Nullable ConfigNodePropertyArray devhostnamepatterns) {
    this.devhostnamepatterns = devhostnamepatterns;
    return this;
  }

  /**
   * Get devhostnamepatterns
   * @return devhostnamepatterns
   */
  @Valid 
  @Schema(name = "devhostnamepatterns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("devhostnamepatterns")
  public @Nullable ConfigNodePropertyArray getDevhostnamepatterns() {
    return devhostnamepatterns;
  }

  @JsonProperty("devhostnamepatterns")
  public void setDevhostnamepatterns(@Nullable ConfigNodePropertyArray devhostnamepatterns) {
    this.devhostnamepatterns = devhostnamepatterns;
  }

  public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties connectionTimeout(@Nullable ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

  /**
   * Get connectionTimeout
   * @return connectionTimeout
   */
  @Valid 
  @Schema(name = "connection.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connection.timeout")
  public @Nullable ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }

  @JsonProperty("connection.timeout")
  public void setConnectionTimeout(@Nullable ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties socketTimeout(@Nullable ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
    return this;
  }

  /**
   * Get socketTimeout
   * @return socketTimeout
   */
  @Valid 
  @Schema(name = "socket.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("socket.timeout")
  public @Nullable ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }

  @JsonProperty("socket.timeout")
  public void setSocketTimeout(@Nullable ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties = (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties) o;
    return Objects.equals(this.cqAnalyticsSitecatalystServiceDatacenterUrl, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.cqAnalyticsSitecatalystServiceDatacenterUrl) &&
        Objects.equals(this.devhostnamepatterns, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.devhostnamepatterns) &&
        Objects.equals(this.connectionTimeout, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.connectionTimeout) &&
        Objects.equals(this.socketTimeout, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.socketTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAnalyticsSitecatalystServiceDatacenterUrl, devhostnamepatterns, connectionTimeout, socketTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties {\n");
    sb.append("    cqAnalyticsSitecatalystServiceDatacenterUrl: ").append(toIndentedString(cqAnalyticsSitecatalystServiceDatacenterUrl)).append("\n");
    sb.append("    devhostnamepatterns: ").append(toIndentedString(devhostnamepatterns)).append("\n");
    sb.append("    connectionTimeout: ").append(toIndentedString(connectionTimeout)).append("\n");
    sb.append("    socketTimeout: ").append(toIndentedString(socketTimeout)).append("\n");
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

