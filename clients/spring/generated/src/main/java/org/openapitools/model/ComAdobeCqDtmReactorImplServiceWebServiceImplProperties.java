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
 * ComAdobeCqDtmReactorImplServiceWebServiceImplProperties
 */

@JsonTypeName("comAdobeCqDtmReactorImplServiceWebServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString endpointUri;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger connectionTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger socketTimeout;

  public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties endpointUri(@Nullable ConfigNodePropertyString endpointUri) {
    this.endpointUri = endpointUri;
    return this;
  }

  /**
   * Get endpointUri
   * @return endpointUri
   */
  @Valid 
  @Schema(name = "endpointUri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endpointUri")
  public @Nullable ConfigNodePropertyString getEndpointUri() {
    return endpointUri;
  }

  @JsonProperty("endpointUri")
  public void setEndpointUri(@Nullable ConfigNodePropertyString endpointUri) {
    this.endpointUri = endpointUri;
  }

  public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties connectionTimeout(@Nullable ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

  /**
   * Get connectionTimeout
   * @return connectionTimeout
   */
  @Valid 
  @Schema(name = "connectionTimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionTimeout")
  public @Nullable ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }

  @JsonProperty("connectionTimeout")
  public void setConnectionTimeout(@Nullable ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties socketTimeout(@Nullable ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
    return this;
  }

  /**
   * Get socketTimeout
   * @return socketTimeout
   */
  @Valid 
  @Schema(name = "socketTimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("socketTimeout")
  public @Nullable ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }

  @JsonProperty("socketTimeout")
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
    ComAdobeCqDtmReactorImplServiceWebServiceImplProperties comAdobeCqDtmReactorImplServiceWebServiceImplProperties = (ComAdobeCqDtmReactorImplServiceWebServiceImplProperties) o;
    return Objects.equals(this.endpointUri, comAdobeCqDtmReactorImplServiceWebServiceImplProperties.endpointUri) &&
        Objects.equals(this.connectionTimeout, comAdobeCqDtmReactorImplServiceWebServiceImplProperties.connectionTimeout) &&
        Objects.equals(this.socketTimeout, comAdobeCqDtmReactorImplServiceWebServiceImplProperties.socketTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointUri, connectionTimeout, socketTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties {\n");
    sb.append("    endpointUri: ").append(toIndentedString(endpointUri)).append("\n");
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

