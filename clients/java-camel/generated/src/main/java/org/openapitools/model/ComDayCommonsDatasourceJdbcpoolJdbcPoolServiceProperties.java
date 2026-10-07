package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties
 */

@JsonTypeName("comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties {

  private ConfigNodePropertyString jdbcDriverClass;

  private ConfigNodePropertyString jdbcConnectionUri;

  private ConfigNodePropertyString jdbcUsername;

  private ConfigNodePropertyString jdbcPassword;

  private ConfigNodePropertyString jdbcValidationQuery;

  private ConfigNodePropertyBoolean defaultReadonly;

  private ConfigNodePropertyBoolean defaultAutocommit;

  private ConfigNodePropertyInteger poolSize;

  private ConfigNodePropertyInteger poolMaxWaitMsec;

  private ConfigNodePropertyString datasourceName;

  private ConfigNodePropertyArray datasourceSvcProperties;

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcDriverClass(ConfigNodePropertyString jdbcDriverClass) {
    this.jdbcDriverClass = jdbcDriverClass;
    return this;
  }

  /**
   * Get jdbcDriverClass
   * @return jdbcDriverClass
   */
  @Valid 
  @Schema(name = "jdbc.driver.class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jdbc.driver.class")
  public ConfigNodePropertyString getJdbcDriverClass() {
    return jdbcDriverClass;
  }

  public void setJdbcDriverClass(ConfigNodePropertyString jdbcDriverClass) {
    this.jdbcDriverClass = jdbcDriverClass;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcConnectionUri(ConfigNodePropertyString jdbcConnectionUri) {
    this.jdbcConnectionUri = jdbcConnectionUri;
    return this;
  }

  /**
   * Get jdbcConnectionUri
   * @return jdbcConnectionUri
   */
  @Valid 
  @Schema(name = "jdbc.connection.uri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jdbc.connection.uri")
  public ConfigNodePropertyString getJdbcConnectionUri() {
    return jdbcConnectionUri;
  }

  public void setJdbcConnectionUri(ConfigNodePropertyString jdbcConnectionUri) {
    this.jdbcConnectionUri = jdbcConnectionUri;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcUsername(ConfigNodePropertyString jdbcUsername) {
    this.jdbcUsername = jdbcUsername;
    return this;
  }

  /**
   * Get jdbcUsername
   * @return jdbcUsername
   */
  @Valid 
  @Schema(name = "jdbc.username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jdbc.username")
  public ConfigNodePropertyString getJdbcUsername() {
    return jdbcUsername;
  }

  public void setJdbcUsername(ConfigNodePropertyString jdbcUsername) {
    this.jdbcUsername = jdbcUsername;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcPassword(ConfigNodePropertyString jdbcPassword) {
    this.jdbcPassword = jdbcPassword;
    return this;
  }

  /**
   * Get jdbcPassword
   * @return jdbcPassword
   */
  @Valid 
  @Schema(name = "jdbc.password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jdbc.password")
  public ConfigNodePropertyString getJdbcPassword() {
    return jdbcPassword;
  }

  public void setJdbcPassword(ConfigNodePropertyString jdbcPassword) {
    this.jdbcPassword = jdbcPassword;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcValidationQuery(ConfigNodePropertyString jdbcValidationQuery) {
    this.jdbcValidationQuery = jdbcValidationQuery;
    return this;
  }

  /**
   * Get jdbcValidationQuery
   * @return jdbcValidationQuery
   */
  @Valid 
  @Schema(name = "jdbc.validation.query", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jdbc.validation.query")
  public ConfigNodePropertyString getJdbcValidationQuery() {
    return jdbcValidationQuery;
  }

  public void setJdbcValidationQuery(ConfigNodePropertyString jdbcValidationQuery) {
    this.jdbcValidationQuery = jdbcValidationQuery;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties defaultReadonly(ConfigNodePropertyBoolean defaultReadonly) {
    this.defaultReadonly = defaultReadonly;
    return this;
  }

  /**
   * Get defaultReadonly
   * @return defaultReadonly
   */
  @Valid 
  @Schema(name = "default.readonly", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default.readonly")
  public ConfigNodePropertyBoolean getDefaultReadonly() {
    return defaultReadonly;
  }

  public void setDefaultReadonly(ConfigNodePropertyBoolean defaultReadonly) {
    this.defaultReadonly = defaultReadonly;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties defaultAutocommit(ConfigNodePropertyBoolean defaultAutocommit) {
    this.defaultAutocommit = defaultAutocommit;
    return this;
  }

  /**
   * Get defaultAutocommit
   * @return defaultAutocommit
   */
  @Valid 
  @Schema(name = "default.autocommit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default.autocommit")
  public ConfigNodePropertyBoolean getDefaultAutocommit() {
    return defaultAutocommit;
  }

  public void setDefaultAutocommit(ConfigNodePropertyBoolean defaultAutocommit) {
    this.defaultAutocommit = defaultAutocommit;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties poolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
    return this;
  }

  /**
   * Get poolSize
   * @return poolSize
   */
  @Valid 
  @Schema(name = "pool.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pool.size")
  public ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }

  public void setPoolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties poolMaxWaitMsec(ConfigNodePropertyInteger poolMaxWaitMsec) {
    this.poolMaxWaitMsec = poolMaxWaitMsec;
    return this;
  }

  /**
   * Get poolMaxWaitMsec
   * @return poolMaxWaitMsec
   */
  @Valid 
  @Schema(name = "pool.max.wait.msec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pool.max.wait.msec")
  public ConfigNodePropertyInteger getPoolMaxWaitMsec() {
    return poolMaxWaitMsec;
  }

  public void setPoolMaxWaitMsec(ConfigNodePropertyInteger poolMaxWaitMsec) {
    this.poolMaxWaitMsec = poolMaxWaitMsec;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties datasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
    return this;
  }

  /**
   * Get datasourceName
   * @return datasourceName
   */
  @Valid 
  @Schema(name = "datasource.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datasource.name")
  public ConfigNodePropertyString getDatasourceName() {
    return datasourceName;
  }

  public void setDatasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties datasourceSvcProperties(ConfigNodePropertyArray datasourceSvcProperties) {
    this.datasourceSvcProperties = datasourceSvcProperties;
    return this;
  }

  /**
   * Get datasourceSvcProperties
   * @return datasourceSvcProperties
   */
  @Valid 
  @Schema(name = "datasource.svc.properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datasource.svc.properties")
  public ConfigNodePropertyArray getDatasourceSvcProperties() {
    return datasourceSvcProperties;
  }

  public void setDatasourceSvcProperties(ConfigNodePropertyArray datasourceSvcProperties) {
    this.datasourceSvcProperties = datasourceSvcProperties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties = (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) o;
    return Objects.equals(this.jdbcDriverClass, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcDriverClass) &&
        Objects.equals(this.jdbcConnectionUri, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcConnectionUri) &&
        Objects.equals(this.jdbcUsername, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcUsername) &&
        Objects.equals(this.jdbcPassword, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcPassword) &&
        Objects.equals(this.jdbcValidationQuery, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcValidationQuery) &&
        Objects.equals(this.defaultReadonly, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.defaultReadonly) &&
        Objects.equals(this.defaultAutocommit, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.defaultAutocommit) &&
        Objects.equals(this.poolSize, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.poolSize) &&
        Objects.equals(this.poolMaxWaitMsec, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.poolMaxWaitMsec) &&
        Objects.equals(this.datasourceName, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.datasourceName) &&
        Objects.equals(this.datasourceSvcProperties, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.datasourceSvcProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jdbcDriverClass, jdbcConnectionUri, jdbcUsername, jdbcPassword, jdbcValidationQuery, defaultReadonly, defaultAutocommit, poolSize, poolMaxWaitMsec, datasourceName, datasourceSvcProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties {\n");
    sb.append("    jdbcDriverClass: ").append(toIndentedString(jdbcDriverClass)).append("\n");
    sb.append("    jdbcConnectionUri: ").append(toIndentedString(jdbcConnectionUri)).append("\n");
    sb.append("    jdbcUsername: ").append(toIndentedString(jdbcUsername)).append("\n");
    sb.append("    jdbcPassword: ").append(toIndentedString(jdbcPassword)).append("\n");
    sb.append("    jdbcValidationQuery: ").append(toIndentedString(jdbcValidationQuery)).append("\n");
    sb.append("    defaultReadonly: ").append(toIndentedString(defaultReadonly)).append("\n");
    sb.append("    defaultAutocommit: ").append(toIndentedString(defaultAutocommit)).append("\n");
    sb.append("    poolSize: ").append(toIndentedString(poolSize)).append("\n");
    sb.append("    poolMaxWaitMsec: ").append(toIndentedString(poolMaxWaitMsec)).append("\n");
    sb.append("    datasourceName: ").append(toIndentedString(datasourceName)).append("\n");
    sb.append("    datasourceSvcProperties: ").append(toIndentedString(datasourceSvcProperties)).append("\n");
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

