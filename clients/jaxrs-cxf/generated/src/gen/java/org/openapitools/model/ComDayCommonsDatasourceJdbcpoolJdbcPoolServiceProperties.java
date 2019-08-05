package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jdbcDriverClass = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jdbcConnectionUri = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jdbcUsername = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jdbcPassword = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jdbcValidationQuery = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean defaultReadonly = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean defaultAutocommit = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger poolSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger poolMaxWaitMsec = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString datasourceName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray datasourceSvcProperties = null;
 /**
   * Get jdbcDriverClass
   * @return jdbcDriverClass
  **/
  @JsonProperty("jdbc.driver.class")
  public ConfigNodePropertyString getJdbcDriverClass() {
    return jdbcDriverClass;
  }

  public void setJdbcDriverClass(ConfigNodePropertyString jdbcDriverClass) {
    this.jdbcDriverClass = jdbcDriverClass;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcDriverClass(ConfigNodePropertyString jdbcDriverClass) {
    this.jdbcDriverClass = jdbcDriverClass;
    return this;
  }

 /**
   * Get jdbcConnectionUri
   * @return jdbcConnectionUri
  **/
  @JsonProperty("jdbc.connection.uri")
  public ConfigNodePropertyString getJdbcConnectionUri() {
    return jdbcConnectionUri;
  }

  public void setJdbcConnectionUri(ConfigNodePropertyString jdbcConnectionUri) {
    this.jdbcConnectionUri = jdbcConnectionUri;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcConnectionUri(ConfigNodePropertyString jdbcConnectionUri) {
    this.jdbcConnectionUri = jdbcConnectionUri;
    return this;
  }

 /**
   * Get jdbcUsername
   * @return jdbcUsername
  **/
  @JsonProperty("jdbc.username")
  public ConfigNodePropertyString getJdbcUsername() {
    return jdbcUsername;
  }

  public void setJdbcUsername(ConfigNodePropertyString jdbcUsername) {
    this.jdbcUsername = jdbcUsername;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcUsername(ConfigNodePropertyString jdbcUsername) {
    this.jdbcUsername = jdbcUsername;
    return this;
  }

 /**
   * Get jdbcPassword
   * @return jdbcPassword
  **/
  @JsonProperty("jdbc.password")
  public ConfigNodePropertyString getJdbcPassword() {
    return jdbcPassword;
  }

  public void setJdbcPassword(ConfigNodePropertyString jdbcPassword) {
    this.jdbcPassword = jdbcPassword;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcPassword(ConfigNodePropertyString jdbcPassword) {
    this.jdbcPassword = jdbcPassword;
    return this;
  }

 /**
   * Get jdbcValidationQuery
   * @return jdbcValidationQuery
  **/
  @JsonProperty("jdbc.validation.query")
  public ConfigNodePropertyString getJdbcValidationQuery() {
    return jdbcValidationQuery;
  }

  public void setJdbcValidationQuery(ConfigNodePropertyString jdbcValidationQuery) {
    this.jdbcValidationQuery = jdbcValidationQuery;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcValidationQuery(ConfigNodePropertyString jdbcValidationQuery) {
    this.jdbcValidationQuery = jdbcValidationQuery;
    return this;
  }

 /**
   * Get defaultReadonly
   * @return defaultReadonly
  **/
  @JsonProperty("default.readonly")
  public ConfigNodePropertyBoolean getDefaultReadonly() {
    return defaultReadonly;
  }

  public void setDefaultReadonly(ConfigNodePropertyBoolean defaultReadonly) {
    this.defaultReadonly = defaultReadonly;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties defaultReadonly(ConfigNodePropertyBoolean defaultReadonly) {
    this.defaultReadonly = defaultReadonly;
    return this;
  }

 /**
   * Get defaultAutocommit
   * @return defaultAutocommit
  **/
  @JsonProperty("default.autocommit")
  public ConfigNodePropertyBoolean getDefaultAutocommit() {
    return defaultAutocommit;
  }

  public void setDefaultAutocommit(ConfigNodePropertyBoolean defaultAutocommit) {
    this.defaultAutocommit = defaultAutocommit;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties defaultAutocommit(ConfigNodePropertyBoolean defaultAutocommit) {
    this.defaultAutocommit = defaultAutocommit;
    return this;
  }

 /**
   * Get poolSize
   * @return poolSize
  **/
  @JsonProperty("pool.size")
  public ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }

  public void setPoolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties poolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
    return this;
  }

 /**
   * Get poolMaxWaitMsec
   * @return poolMaxWaitMsec
  **/
  @JsonProperty("pool.max.wait.msec")
  public ConfigNodePropertyInteger getPoolMaxWaitMsec() {
    return poolMaxWaitMsec;
  }

  public void setPoolMaxWaitMsec(ConfigNodePropertyInteger poolMaxWaitMsec) {
    this.poolMaxWaitMsec = poolMaxWaitMsec;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties poolMaxWaitMsec(ConfigNodePropertyInteger poolMaxWaitMsec) {
    this.poolMaxWaitMsec = poolMaxWaitMsec;
    return this;
  }

 /**
   * Get datasourceName
   * @return datasourceName
  **/
  @JsonProperty("datasource.name")
  public ConfigNodePropertyString getDatasourceName() {
    return datasourceName;
  }

  public void setDatasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties datasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
    return this;
  }

 /**
   * Get datasourceSvcProperties
   * @return datasourceSvcProperties
  **/
  @JsonProperty("datasource.svc.properties")
  public ConfigNodePropertyArray getDatasourceSvcProperties() {
    return datasourceSvcProperties;
  }

  public void setDatasourceSvcProperties(ConfigNodePropertyArray datasourceSvcProperties) {
    this.datasourceSvcProperties = datasourceSvcProperties;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties datasourceSvcProperties(ConfigNodePropertyArray datasourceSvcProperties) {
    this.datasourceSvcProperties = datasourceSvcProperties;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

