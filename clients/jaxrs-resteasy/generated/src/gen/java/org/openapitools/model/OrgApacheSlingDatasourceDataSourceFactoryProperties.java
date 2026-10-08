package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDatasourceDataSourceFactoryProperties   {
  
  private ConfigNodePropertyString datasourceName;
  private ConfigNodePropertyString datasourceSvcPropName;
  private ConfigNodePropertyString driverClassName;
  private ConfigNodePropertyString url;
  private ConfigNodePropertyString username;
  private ConfigNodePropertyString password;
  private ConfigNodePropertyDropDown defaultAutoCommit;
  private ConfigNodePropertyDropDown defaultReadOnly;
  private ConfigNodePropertyDropDown defaultTransactionIsolation;
  private ConfigNodePropertyString defaultCatalog;
  private ConfigNodePropertyInteger maxActive;
  private ConfigNodePropertyInteger maxIdle;
  private ConfigNodePropertyInteger minIdle;
  private ConfigNodePropertyInteger initialSize;
  private ConfigNodePropertyInteger maxWait;
  private ConfigNodePropertyInteger maxAge;
  private ConfigNodePropertyBoolean testOnBorrow;
  private ConfigNodePropertyBoolean testOnReturn;
  private ConfigNodePropertyBoolean testWhileIdle;
  private ConfigNodePropertyString validationQuery;
  private ConfigNodePropertyInteger validationQueryTimeout;
  private ConfigNodePropertyInteger timeBetweenEvictionRunsMillis;
  private ConfigNodePropertyInteger minEvictableIdleTimeMillis;
  private ConfigNodePropertyString connectionProperties;
  private ConfigNodePropertyString initSQL;
  private ConfigNodePropertyString jdbcInterceptors;
  private ConfigNodePropertyInteger validationInterval;
  private ConfigNodePropertyBoolean logValidationErrors;
  private ConfigNodePropertyArray datasourceSvcProperties;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("datasource.name")
  @Valid
  public ConfigNodePropertyString getDatasourceName() {
    return datasourceName;
  }
  public void setDatasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("datasource.svc.prop.name")
  @Valid
  public ConfigNodePropertyString getDatasourceSvcPropName() {
    return datasourceSvcPropName;
  }
  public void setDatasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("driverClassName")
  @Valid
  public ConfigNodePropertyString getDriverClassName() {
    return driverClassName;
  }
  public void setDriverClassName(ConfigNodePropertyString driverClassName) {
    this.driverClassName = driverClassName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("url")
  @Valid
  public ConfigNodePropertyString getUrl() {
    return url;
  }
  public void setUrl(ConfigNodePropertyString url) {
    this.url = url;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("username")
  @Valid
  public ConfigNodePropertyString getUsername() {
    return username;
  }
  public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  @Valid
  public ConfigNodePropertyString getPassword() {
    return password;
  }
  public void setPassword(ConfigNodePropertyString password) {
    this.password = password;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultAutoCommit")
  @Valid
  public ConfigNodePropertyDropDown getDefaultAutoCommit() {
    return defaultAutoCommit;
  }
  public void setDefaultAutoCommit(ConfigNodePropertyDropDown defaultAutoCommit) {
    this.defaultAutoCommit = defaultAutoCommit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultReadOnly")
  @Valid
  public ConfigNodePropertyDropDown getDefaultReadOnly() {
    return defaultReadOnly;
  }
  public void setDefaultReadOnly(ConfigNodePropertyDropDown defaultReadOnly) {
    this.defaultReadOnly = defaultReadOnly;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultTransactionIsolation")
  @Valid
  public ConfigNodePropertyDropDown getDefaultTransactionIsolation() {
    return defaultTransactionIsolation;
  }
  public void setDefaultTransactionIsolation(ConfigNodePropertyDropDown defaultTransactionIsolation) {
    this.defaultTransactionIsolation = defaultTransactionIsolation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultCatalog")
  @Valid
  public ConfigNodePropertyString getDefaultCatalog() {
    return defaultCatalog;
  }
  public void setDefaultCatalog(ConfigNodePropertyString defaultCatalog) {
    this.defaultCatalog = defaultCatalog;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxActive")
  @Valid
  public ConfigNodePropertyInteger getMaxActive() {
    return maxActive;
  }
  public void setMaxActive(ConfigNodePropertyInteger maxActive) {
    this.maxActive = maxActive;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxIdle")
  @Valid
  public ConfigNodePropertyInteger getMaxIdle() {
    return maxIdle;
  }
  public void setMaxIdle(ConfigNodePropertyInteger maxIdle) {
    this.maxIdle = maxIdle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minIdle")
  @Valid
  public ConfigNodePropertyInteger getMinIdle() {
    return minIdle;
  }
  public void setMinIdle(ConfigNodePropertyInteger minIdle) {
    this.minIdle = minIdle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("initialSize")
  @Valid
  public ConfigNodePropertyInteger getInitialSize() {
    return initialSize;
  }
  public void setInitialSize(ConfigNodePropertyInteger initialSize) {
    this.initialSize = initialSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxWait")
  @Valid
  public ConfigNodePropertyInteger getMaxWait() {
    return maxWait;
  }
  public void setMaxWait(ConfigNodePropertyInteger maxWait) {
    this.maxWait = maxWait;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxAge")
  @Valid
  public ConfigNodePropertyInteger getMaxAge() {
    return maxAge;
  }
  public void setMaxAge(ConfigNodePropertyInteger maxAge) {
    this.maxAge = maxAge;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("testOnBorrow")
  @Valid
  public ConfigNodePropertyBoolean getTestOnBorrow() {
    return testOnBorrow;
  }
  public void setTestOnBorrow(ConfigNodePropertyBoolean testOnBorrow) {
    this.testOnBorrow = testOnBorrow;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("testOnReturn")
  @Valid
  public ConfigNodePropertyBoolean getTestOnReturn() {
    return testOnReturn;
  }
  public void setTestOnReturn(ConfigNodePropertyBoolean testOnReturn) {
    this.testOnReturn = testOnReturn;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("testWhileIdle")
  @Valid
  public ConfigNodePropertyBoolean getTestWhileIdle() {
    return testWhileIdle;
  }
  public void setTestWhileIdle(ConfigNodePropertyBoolean testWhileIdle) {
    this.testWhileIdle = testWhileIdle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("validationQuery")
  @Valid
  public ConfigNodePropertyString getValidationQuery() {
    return validationQuery;
  }
  public void setValidationQuery(ConfigNodePropertyString validationQuery) {
    this.validationQuery = validationQuery;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("validationQueryTimeout")
  @Valid
  public ConfigNodePropertyInteger getValidationQueryTimeout() {
    return validationQueryTimeout;
  }
  public void setValidationQueryTimeout(ConfigNodePropertyInteger validationQueryTimeout) {
    this.validationQueryTimeout = validationQueryTimeout;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timeBetweenEvictionRunsMillis")
  @Valid
  public ConfigNodePropertyInteger getTimeBetweenEvictionRunsMillis() {
    return timeBetweenEvictionRunsMillis;
  }
  public void setTimeBetweenEvictionRunsMillis(ConfigNodePropertyInteger timeBetweenEvictionRunsMillis) {
    this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minEvictableIdleTimeMillis")
  @Valid
  public ConfigNodePropertyInteger getMinEvictableIdleTimeMillis() {
    return minEvictableIdleTimeMillis;
  }
  public void setMinEvictableIdleTimeMillis(ConfigNodePropertyInteger minEvictableIdleTimeMillis) {
    this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectionProperties")
  @Valid
  public ConfigNodePropertyString getConnectionProperties() {
    return connectionProperties;
  }
  public void setConnectionProperties(ConfigNodePropertyString connectionProperties) {
    this.connectionProperties = connectionProperties;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("initSQL")
  @Valid
  public ConfigNodePropertyString getInitSQL() {
    return initSQL;
  }
  public void setInitSQL(ConfigNodePropertyString initSQL) {
    this.initSQL = initSQL;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jdbcInterceptors")
  @Valid
  public ConfigNodePropertyString getJdbcInterceptors() {
    return jdbcInterceptors;
  }
  public void setJdbcInterceptors(ConfigNodePropertyString jdbcInterceptors) {
    this.jdbcInterceptors = jdbcInterceptors;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("validationInterval")
  @Valid
  public ConfigNodePropertyInteger getValidationInterval() {
    return validationInterval;
  }
  public void setValidationInterval(ConfigNodePropertyInteger validationInterval) {
    this.validationInterval = validationInterval;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("logValidationErrors")
  @Valid
  public ConfigNodePropertyBoolean getLogValidationErrors() {
    return logValidationErrors;
  }
  public void setLogValidationErrors(ConfigNodePropertyBoolean logValidationErrors) {
    this.logValidationErrors = logValidationErrors;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("datasource.svc.properties")
  @Valid
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
    OrgApacheSlingDatasourceDataSourceFactoryProperties orgApacheSlingDatasourceDataSourceFactoryProperties = (OrgApacheSlingDatasourceDataSourceFactoryProperties) o;
    return Objects.equals(this.datasourceName, orgApacheSlingDatasourceDataSourceFactoryProperties.datasourceName) &&
        Objects.equals(this.datasourceSvcPropName, orgApacheSlingDatasourceDataSourceFactoryProperties.datasourceSvcPropName) &&
        Objects.equals(this.driverClassName, orgApacheSlingDatasourceDataSourceFactoryProperties.driverClassName) &&
        Objects.equals(this.url, orgApacheSlingDatasourceDataSourceFactoryProperties.url) &&
        Objects.equals(this.username, orgApacheSlingDatasourceDataSourceFactoryProperties.username) &&
        Objects.equals(this.password, orgApacheSlingDatasourceDataSourceFactoryProperties.password) &&
        Objects.equals(this.defaultAutoCommit, orgApacheSlingDatasourceDataSourceFactoryProperties.defaultAutoCommit) &&
        Objects.equals(this.defaultReadOnly, orgApacheSlingDatasourceDataSourceFactoryProperties.defaultReadOnly) &&
        Objects.equals(this.defaultTransactionIsolation, orgApacheSlingDatasourceDataSourceFactoryProperties.defaultTransactionIsolation) &&
        Objects.equals(this.defaultCatalog, orgApacheSlingDatasourceDataSourceFactoryProperties.defaultCatalog) &&
        Objects.equals(this.maxActive, orgApacheSlingDatasourceDataSourceFactoryProperties.maxActive) &&
        Objects.equals(this.maxIdle, orgApacheSlingDatasourceDataSourceFactoryProperties.maxIdle) &&
        Objects.equals(this.minIdle, orgApacheSlingDatasourceDataSourceFactoryProperties.minIdle) &&
        Objects.equals(this.initialSize, orgApacheSlingDatasourceDataSourceFactoryProperties.initialSize) &&
        Objects.equals(this.maxWait, orgApacheSlingDatasourceDataSourceFactoryProperties.maxWait) &&
        Objects.equals(this.maxAge, orgApacheSlingDatasourceDataSourceFactoryProperties.maxAge) &&
        Objects.equals(this.testOnBorrow, orgApacheSlingDatasourceDataSourceFactoryProperties.testOnBorrow) &&
        Objects.equals(this.testOnReturn, orgApacheSlingDatasourceDataSourceFactoryProperties.testOnReturn) &&
        Objects.equals(this.testWhileIdle, orgApacheSlingDatasourceDataSourceFactoryProperties.testWhileIdle) &&
        Objects.equals(this.validationQuery, orgApacheSlingDatasourceDataSourceFactoryProperties.validationQuery) &&
        Objects.equals(this.validationQueryTimeout, orgApacheSlingDatasourceDataSourceFactoryProperties.validationQueryTimeout) &&
        Objects.equals(this.timeBetweenEvictionRunsMillis, orgApacheSlingDatasourceDataSourceFactoryProperties.timeBetweenEvictionRunsMillis) &&
        Objects.equals(this.minEvictableIdleTimeMillis, orgApacheSlingDatasourceDataSourceFactoryProperties.minEvictableIdleTimeMillis) &&
        Objects.equals(this.connectionProperties, orgApacheSlingDatasourceDataSourceFactoryProperties.connectionProperties) &&
        Objects.equals(this.initSQL, orgApacheSlingDatasourceDataSourceFactoryProperties.initSQL) &&
        Objects.equals(this.jdbcInterceptors, orgApacheSlingDatasourceDataSourceFactoryProperties.jdbcInterceptors) &&
        Objects.equals(this.validationInterval, orgApacheSlingDatasourceDataSourceFactoryProperties.validationInterval) &&
        Objects.equals(this.logValidationErrors, orgApacheSlingDatasourceDataSourceFactoryProperties.logValidationErrors) &&
        Objects.equals(this.datasourceSvcProperties, orgApacheSlingDatasourceDataSourceFactoryProperties.datasourceSvcProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasourceName, datasourceSvcPropName, driverClassName, url, username, password, defaultAutoCommit, defaultReadOnly, defaultTransactionIsolation, defaultCatalog, maxActive, maxIdle, minIdle, initialSize, maxWait, maxAge, testOnBorrow, testOnReturn, testWhileIdle, validationQuery, validationQueryTimeout, timeBetweenEvictionRunsMillis, minEvictableIdleTimeMillis, connectionProperties, initSQL, jdbcInterceptors, validationInterval, logValidationErrors, datasourceSvcProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDatasourceDataSourceFactoryProperties {\n");
    
    sb.append("    datasourceName: ").append(toIndentedString(datasourceName)).append("\n");
    sb.append("    datasourceSvcPropName: ").append(toIndentedString(datasourceSvcPropName)).append("\n");
    sb.append("    driverClassName: ").append(toIndentedString(driverClassName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    defaultAutoCommit: ").append(toIndentedString(defaultAutoCommit)).append("\n");
    sb.append("    defaultReadOnly: ").append(toIndentedString(defaultReadOnly)).append("\n");
    sb.append("    defaultTransactionIsolation: ").append(toIndentedString(defaultTransactionIsolation)).append("\n");
    sb.append("    defaultCatalog: ").append(toIndentedString(defaultCatalog)).append("\n");
    sb.append("    maxActive: ").append(toIndentedString(maxActive)).append("\n");
    sb.append("    maxIdle: ").append(toIndentedString(maxIdle)).append("\n");
    sb.append("    minIdle: ").append(toIndentedString(minIdle)).append("\n");
    sb.append("    initialSize: ").append(toIndentedString(initialSize)).append("\n");
    sb.append("    maxWait: ").append(toIndentedString(maxWait)).append("\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
    sb.append("    testOnBorrow: ").append(toIndentedString(testOnBorrow)).append("\n");
    sb.append("    testOnReturn: ").append(toIndentedString(testOnReturn)).append("\n");
    sb.append("    testWhileIdle: ").append(toIndentedString(testWhileIdle)).append("\n");
    sb.append("    validationQuery: ").append(toIndentedString(validationQuery)).append("\n");
    sb.append("    validationQueryTimeout: ").append(toIndentedString(validationQueryTimeout)).append("\n");
    sb.append("    timeBetweenEvictionRunsMillis: ").append(toIndentedString(timeBetweenEvictionRunsMillis)).append("\n");
    sb.append("    minEvictableIdleTimeMillis: ").append(toIndentedString(minEvictableIdleTimeMillis)).append("\n");
    sb.append("    connectionProperties: ").append(toIndentedString(connectionProperties)).append("\n");
    sb.append("    initSQL: ").append(toIndentedString(initSQL)).append("\n");
    sb.append("    jdbcInterceptors: ").append(toIndentedString(jdbcInterceptors)).append("\n");
    sb.append("    validationInterval: ").append(toIndentedString(validationInterval)).append("\n");
    sb.append("    logValidationErrors: ").append(toIndentedString(logValidationErrors)).append("\n");
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

