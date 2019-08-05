package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties   {
  
  private @Valid ConfigNodePropertyString jdbcDriverClass = null;
  private @Valid ConfigNodePropertyString jdbcConnectionUri = null;
  private @Valid ConfigNodePropertyString jdbcUsername = null;
  private @Valid ConfigNodePropertyString jdbcPassword = null;
  private @Valid ConfigNodePropertyString jdbcValidationQuery = null;
  private @Valid ConfigNodePropertyBoolean defaultReadonly = null;
  private @Valid ConfigNodePropertyBoolean defaultAutocommit = null;
  private @Valid ConfigNodePropertyInteger poolSize = null;
  private @Valid ConfigNodePropertyInteger poolMaxWaitMsec = null;
  private @Valid ConfigNodePropertyString datasourceName = null;
  private @Valid ConfigNodePropertyArray datasourceSvcProperties = null;

  /**
   **/
  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcDriverClass(ConfigNodePropertyString jdbcDriverClass) {
    this.jdbcDriverClass = jdbcDriverClass;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jdbc.driver.class")
  public ConfigNodePropertyString getJdbcDriverClass() {
    return jdbcDriverClass;
  }
  public void setJdbcDriverClass(ConfigNodePropertyString jdbcDriverClass) {
    this.jdbcDriverClass = jdbcDriverClass;
  }

  /**
   **/
  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcConnectionUri(ConfigNodePropertyString jdbcConnectionUri) {
    this.jdbcConnectionUri = jdbcConnectionUri;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jdbc.connection.uri")
  public ConfigNodePropertyString getJdbcConnectionUri() {
    return jdbcConnectionUri;
  }
  public void setJdbcConnectionUri(ConfigNodePropertyString jdbcConnectionUri) {
    this.jdbcConnectionUri = jdbcConnectionUri;
  }

  /**
   **/
  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcUsername(ConfigNodePropertyString jdbcUsername) {
    this.jdbcUsername = jdbcUsername;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jdbc.username")
  public ConfigNodePropertyString getJdbcUsername() {
    return jdbcUsername;
  }
  public void setJdbcUsername(ConfigNodePropertyString jdbcUsername) {
    this.jdbcUsername = jdbcUsername;
  }

  /**
   **/
  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcPassword(ConfigNodePropertyString jdbcPassword) {
    this.jdbcPassword = jdbcPassword;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jdbc.password")
  public ConfigNodePropertyString getJdbcPassword() {
    return jdbcPassword;
  }
  public void setJdbcPassword(ConfigNodePropertyString jdbcPassword) {
    this.jdbcPassword = jdbcPassword;
  }

  /**
   **/
  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcValidationQuery(ConfigNodePropertyString jdbcValidationQuery) {
    this.jdbcValidationQuery = jdbcValidationQuery;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jdbc.validation.query")
  public ConfigNodePropertyString getJdbcValidationQuery() {
    return jdbcValidationQuery;
  }
  public void setJdbcValidationQuery(ConfigNodePropertyString jdbcValidationQuery) {
    this.jdbcValidationQuery = jdbcValidationQuery;
  }

  /**
   **/
  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties defaultReadonly(ConfigNodePropertyBoolean defaultReadonly) {
    this.defaultReadonly = defaultReadonly;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default.readonly")
  public ConfigNodePropertyBoolean getDefaultReadonly() {
    return defaultReadonly;
  }
  public void setDefaultReadonly(ConfigNodePropertyBoolean defaultReadonly) {
    this.defaultReadonly = defaultReadonly;
  }

  /**
   **/
  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties defaultAutocommit(ConfigNodePropertyBoolean defaultAutocommit) {
    this.defaultAutocommit = defaultAutocommit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default.autocommit")
  public ConfigNodePropertyBoolean getDefaultAutocommit() {
    return defaultAutocommit;
  }
  public void setDefaultAutocommit(ConfigNodePropertyBoolean defaultAutocommit) {
    this.defaultAutocommit = defaultAutocommit;
  }

  /**
   **/
  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties poolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pool.size")
  public ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }
  public void setPoolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

  /**
   **/
  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties poolMaxWaitMsec(ConfigNodePropertyInteger poolMaxWaitMsec) {
    this.poolMaxWaitMsec = poolMaxWaitMsec;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pool.max.wait.msec")
  public ConfigNodePropertyInteger getPoolMaxWaitMsec() {
    return poolMaxWaitMsec;
  }
  public void setPoolMaxWaitMsec(ConfigNodePropertyInteger poolMaxWaitMsec) {
    this.poolMaxWaitMsec = poolMaxWaitMsec;
  }

  /**
   **/
  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties datasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("datasource.name")
  public ConfigNodePropertyString getDatasourceName() {
    return datasourceName;
  }
  public void setDatasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
  }

  /**
   **/
  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties datasourceSvcProperties(ConfigNodePropertyArray datasourceSvcProperties) {
    this.datasourceSvcProperties = datasourceSvcProperties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("datasource.svc.properties")
  public ConfigNodePropertyArray getDatasourceSvcProperties() {
    return datasourceSvcProperties;
  }
  public void setDatasourceSvcProperties(ConfigNodePropertyArray datasourceSvcProperties) {
    this.datasourceSvcProperties = datasourceSvcProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties = (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) o;
    return Objects.equals(jdbcDriverClass, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcDriverClass) &&
        Objects.equals(jdbcConnectionUri, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcConnectionUri) &&
        Objects.equals(jdbcUsername, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcUsername) &&
        Objects.equals(jdbcPassword, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcPassword) &&
        Objects.equals(jdbcValidationQuery, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcValidationQuery) &&
        Objects.equals(defaultReadonly, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.defaultReadonly) &&
        Objects.equals(defaultAutocommit, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.defaultAutocommit) &&
        Objects.equals(poolSize, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.poolSize) &&
        Objects.equals(poolMaxWaitMsec, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.poolMaxWaitMsec) &&
        Objects.equals(datasourceName, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.datasourceName) &&
        Objects.equals(datasourceSvcProperties, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.datasourceSvcProperties);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

