package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComDayCqPollingImporterImplManagedPollConfigImplProperties
 */

@JsonTypeName("comDayCqPollingImporterImplManagedPollConfigImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqPollingImporterImplManagedPollConfigImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean reference;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger interval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString expression;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString source;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString target;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString login;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString password;

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties id(@Nullable ConfigNodePropertyString id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable ConfigNodePropertyString getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable ConfigNodePropertyString id) {
    this.id = id;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties enabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @Valid 
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public @Nullable ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
  public void setEnabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties reference(@Nullable ConfigNodePropertyBoolean reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
   */
  @Valid 
  @Schema(name = "reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference")
  public @Nullable ConfigNodePropertyBoolean getReference() {
    return reference;
  }

  @JsonProperty("reference")
  public void setReference(@Nullable ConfigNodePropertyBoolean reference) {
    this.reference = reference;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties interval(@Nullable ConfigNodePropertyInteger interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   * @return interval
   */
  @Valid 
  @Schema(name = "interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interval")
  public @Nullable ConfigNodePropertyInteger getInterval() {
    return interval;
  }

  @JsonProperty("interval")
  public void setInterval(@Nullable ConfigNodePropertyInteger interval) {
    this.interval = interval;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties expression(@Nullable ConfigNodePropertyString expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Get expression
   * @return expression
   */
  @Valid 
  @Schema(name = "expression", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expression")
  public @Nullable ConfigNodePropertyString getExpression() {
    return expression;
  }

  @JsonProperty("expression")
  public void setExpression(@Nullable ConfigNodePropertyString expression) {
    this.expression = expression;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties source(@Nullable ConfigNodePropertyString source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @Valid 
  @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public @Nullable ConfigNodePropertyString getSource() {
    return source;
  }

  @JsonProperty("source")
  public void setSource(@Nullable ConfigNodePropertyString source) {
    this.source = source;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties target(@Nullable ConfigNodePropertyString target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
   */
  @Valid 
  @Schema(name = "target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target")
  public @Nullable ConfigNodePropertyString getTarget() {
    return target;
  }

  @JsonProperty("target")
  public void setTarget(@Nullable ConfigNodePropertyString target) {
    this.target = target;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties login(@Nullable ConfigNodePropertyString login) {
    this.login = login;
    return this;
  }

  /**
   * Get login
   * @return login
   */
  @Valid 
  @Schema(name = "login", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("login")
  public @Nullable ConfigNodePropertyString getLogin() {
    return login;
  }

  @JsonProperty("login")
  public void setLogin(@Nullable ConfigNodePropertyString login) {
    this.login = login;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties password(@Nullable ConfigNodePropertyString password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @Valid 
  @Schema(name = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public @Nullable ConfigNodePropertyString getPassword() {
    return password;
  }

  @JsonProperty("password")
  public void setPassword(@Nullable ConfigNodePropertyString password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqPollingImporterImplManagedPollConfigImplProperties comDayCqPollingImporterImplManagedPollConfigImplProperties = (ComDayCqPollingImporterImplManagedPollConfigImplProperties) o;
    return Objects.equals(this.id, comDayCqPollingImporterImplManagedPollConfigImplProperties.id) &&
        Objects.equals(this.enabled, comDayCqPollingImporterImplManagedPollConfigImplProperties.enabled) &&
        Objects.equals(this.reference, comDayCqPollingImporterImplManagedPollConfigImplProperties.reference) &&
        Objects.equals(this.interval, comDayCqPollingImporterImplManagedPollConfigImplProperties.interval) &&
        Objects.equals(this.expression, comDayCqPollingImporterImplManagedPollConfigImplProperties.expression) &&
        Objects.equals(this.source, comDayCqPollingImporterImplManagedPollConfigImplProperties.source) &&
        Objects.equals(this.target, comDayCqPollingImporterImplManagedPollConfigImplProperties.target) &&
        Objects.equals(this.login, comDayCqPollingImporterImplManagedPollConfigImplProperties.login) &&
        Objects.equals(this.password, comDayCqPollingImporterImplManagedPollConfigImplProperties.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, enabled, reference, interval, expression, source, target, login, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqPollingImporterImplManagedPollConfigImplProperties {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

