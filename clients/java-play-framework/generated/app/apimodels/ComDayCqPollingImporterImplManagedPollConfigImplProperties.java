package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqPollingImporterImplManagedPollConfigImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqPollingImporterImplManagedPollConfigImplProperties   {
  @JsonProperty("id")
  @Valid

  private ConfigNodePropertyString id;

  @JsonProperty("enabled")
  @Valid

  private ConfigNodePropertyBoolean enabled;

  @JsonProperty("reference")
  @Valid

  private ConfigNodePropertyBoolean reference;

  @JsonProperty("interval")
  @Valid

  private ConfigNodePropertyInteger interval;

  @JsonProperty("expression")
  @Valid

  private ConfigNodePropertyString expression;

  @JsonProperty("source")
  @Valid

  private ConfigNodePropertyString source;

  @JsonProperty("target")
  @Valid

  private ConfigNodePropertyString target;

  @JsonProperty("login")
  @Valid

  private ConfigNodePropertyString login;

  @JsonProperty("password")
  @Valid

  private ConfigNodePropertyString password;

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties id(ConfigNodePropertyString id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public ConfigNodePropertyString getId() {
    return id;
  }

  public void setId(ConfigNodePropertyString id) {
    this.id = id;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties reference(ConfigNodePropertyBoolean reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  public ConfigNodePropertyBoolean getReference() {
    return reference;
  }

  public void setReference(ConfigNodePropertyBoolean reference) {
    this.reference = reference;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties interval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  public ConfigNodePropertyInteger getInterval() {
    return interval;
  }

  public void setInterval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties expression(ConfigNodePropertyString expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  public ConfigNodePropertyString getExpression() {
    return expression;
  }

  public void setExpression(ConfigNodePropertyString expression) {
    this.expression = expression;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties source(ConfigNodePropertyString source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  public ConfigNodePropertyString getSource() {
    return source;
  }

  public void setSource(ConfigNodePropertyString source) {
    this.source = source;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties target(ConfigNodePropertyString target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  public ConfigNodePropertyString getTarget() {
    return target;
  }

  public void setTarget(ConfigNodePropertyString target) {
    this.target = target;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties login(ConfigNodePropertyString login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  public ConfigNodePropertyString getLogin() {
    return login;
  }

  public void setLogin(ConfigNodePropertyString login) {
    this.login = login;
  }

  public ComDayCqPollingImporterImplManagedPollConfigImplProperties password(ConfigNodePropertyString password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  public ConfigNodePropertyString getPassword() {
    return password;
  }

  public void setPassword(ConfigNodePropertyString password) {
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
    return Objects.equals(id, comDayCqPollingImporterImplManagedPollConfigImplProperties.id) &&
        Objects.equals(enabled, comDayCqPollingImporterImplManagedPollConfigImplProperties.enabled) &&
        Objects.equals(reference, comDayCqPollingImporterImplManagedPollConfigImplProperties.reference) &&
        Objects.equals(interval, comDayCqPollingImporterImplManagedPollConfigImplProperties.interval) &&
        Objects.equals(expression, comDayCqPollingImporterImplManagedPollConfigImplProperties.expression) &&
        Objects.equals(source, comDayCqPollingImporterImplManagedPollConfigImplProperties.source) &&
        Objects.equals(target, comDayCqPollingImporterImplManagedPollConfigImplProperties.target) &&
        Objects.equals(login, comDayCqPollingImporterImplManagedPollConfigImplProperties.login) &&
        Objects.equals(password, comDayCqPollingImporterImplManagedPollConfigImplProperties.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, enabled, reference, interval, expression, source, target, login, password);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

