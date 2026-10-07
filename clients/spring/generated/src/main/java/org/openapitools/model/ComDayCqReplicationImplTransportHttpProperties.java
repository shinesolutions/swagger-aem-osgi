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
 * ComDayCqReplicationImplTransportHttpProperties
 */

@JsonTypeName("comDayCqReplicationImplTransportHttpProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqReplicationImplTransportHttpProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray disabledCipherSuites;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray enabledCipherSuites;

  public ComDayCqReplicationImplTransportHttpProperties disabledCipherSuites(@Nullable ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
    return this;
  }

  /**
   * Get disabledCipherSuites
   * @return disabledCipherSuites
   */
  @Valid 
  @Schema(name = "disabled.cipher.suites", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disabled.cipher.suites")
  public @Nullable ConfigNodePropertyArray getDisabledCipherSuites() {
    return disabledCipherSuites;
  }

  @JsonProperty("disabled.cipher.suites")
  public void setDisabledCipherSuites(@Nullable ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
  }

  public ComDayCqReplicationImplTransportHttpProperties enabledCipherSuites(@Nullable ConfigNodePropertyArray enabledCipherSuites) {
    this.enabledCipherSuites = enabledCipherSuites;
    return this;
  }

  /**
   * Get enabledCipherSuites
   * @return enabledCipherSuites
   */
  @Valid 
  @Schema(name = "enabled.cipher.suites", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled.cipher.suites")
  public @Nullable ConfigNodePropertyArray getEnabledCipherSuites() {
    return enabledCipherSuites;
  }

  @JsonProperty("enabled.cipher.suites")
  public void setEnabledCipherSuites(@Nullable ConfigNodePropertyArray enabledCipherSuites) {
    this.enabledCipherSuites = enabledCipherSuites;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationImplTransportHttpProperties comDayCqReplicationImplTransportHttpProperties = (ComDayCqReplicationImplTransportHttpProperties) o;
    return Objects.equals(this.disabledCipherSuites, comDayCqReplicationImplTransportHttpProperties.disabledCipherSuites) &&
        Objects.equals(this.enabledCipherSuites, comDayCqReplicationImplTransportHttpProperties.enabledCipherSuites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabledCipherSuites, enabledCipherSuites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplTransportHttpProperties {\n");
    sb.append("    disabledCipherSuites: ").append(toIndentedString(disabledCipherSuites)).append("\n");
    sb.append("    enabledCipherSuites: ").append(toIndentedString(enabledCipherSuites)).append("\n");
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

