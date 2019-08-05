package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties   {
  

  private ConfigNodePropertyString jdbcDriverClass = null;

  private ConfigNodePropertyString jdbcConnectionUri = null;

  private ConfigNodePropertyString jdbcUsername = null;

  private ConfigNodePropertyString jdbcPassword = null;

  private ConfigNodePropertyString jdbcValidationQuery = null;

  private ConfigNodePropertyBoolean defaultReadonly = null;

  private ConfigNodePropertyBoolean defaultAutocommit = null;

  private ConfigNodePropertyInteger poolSize = null;

  private ConfigNodePropertyInteger poolMaxWaitMsec = null;

  private ConfigNodePropertyString datasourceName = null;

  private ConfigNodePropertyArray datasourceSvcProperties = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

