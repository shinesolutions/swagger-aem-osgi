package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqPollingImporterImplManagedPollConfigImplProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString id;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean enabled;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean reference;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger interval;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString expression;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString source;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString target;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString login;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString password;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public ConfigNodePropertyString getId() {
    return id;
  }

  public void setId(ConfigNodePropertyString id) {
    this.id = id;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties id(ConfigNodePropertyString id) {
    this.id = id;
    return this;
  }

 /**
   * Get enabled
   * @return enabled
  **/
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

 /**
   * Get reference
   * @return reference
  **/
  @JsonProperty("reference")
  public ConfigNodePropertyBoolean getReference() {
    return reference;
  }

  public void setReference(ConfigNodePropertyBoolean reference) {
    this.reference = reference;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties reference(ConfigNodePropertyBoolean reference) {
    this.reference = reference;
    return this;
  }

 /**
   * Get interval
   * @return interval
  **/
  @JsonProperty("interval")
  public ConfigNodePropertyInteger getInterval() {
    return interval;
  }

  public void setInterval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties interval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
    return this;
  }

 /**
   * Get expression
   * @return expression
  **/
  @JsonProperty("expression")
  public ConfigNodePropertyString getExpression() {
    return expression;
  }

  public void setExpression(ConfigNodePropertyString expression) {
    this.expression = expression;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties expression(ConfigNodePropertyString expression) {
    this.expression = expression;
    return this;
  }

 /**
   * Get source
   * @return source
  **/
  @JsonProperty("source")
  public ConfigNodePropertyString getSource() {
    return source;
  }

  public void setSource(ConfigNodePropertyString source) {
    this.source = source;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties source(ConfigNodePropertyString source) {
    this.source = source;
    return this;
  }

 /**
   * Get target
   * @return target
  **/
  @JsonProperty("target")
  public ConfigNodePropertyString getTarget() {
    return target;
  }

  public void setTarget(ConfigNodePropertyString target) {
    this.target = target;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties target(ConfigNodePropertyString target) {
    this.target = target;
    return this;
  }

 /**
   * Get login
   * @return login
  **/
  @JsonProperty("login")
  public ConfigNodePropertyString getLogin() {
    return login;
  }

  public void setLogin(ConfigNodePropertyString login) {
    this.login = login;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties login(ConfigNodePropertyString login) {
    this.login = login;
    return this;
  }

 /**
   * Get password
   * @return password
  **/
  @JsonProperty("password")
  public ConfigNodePropertyString getPassword() {
    return password;
  }

  public void setPassword(ConfigNodePropertyString password) {
    this.password = password;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties password(ConfigNodePropertyString password) {
    this.password = password;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

