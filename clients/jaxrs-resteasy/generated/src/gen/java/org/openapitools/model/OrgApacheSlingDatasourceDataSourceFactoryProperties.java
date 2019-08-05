package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingDatasourceDataSourceFactoryProperties   {
  
  private ConfigNodePropertyString datasourceName = null;
  private ConfigNodePropertyString datasourceSvcPropName = null;
  private ConfigNodePropertyString driverClassName = null;
  private ConfigNodePropertyString url = null;
  private ConfigNodePropertyString username = null;
  private ConfigNodePropertyString password = null;
  private ConfigNodePropertyDropDown defaultAutoCommit = null;
  private ConfigNodePropertyDropDown defaultReadOnly = null;
  private ConfigNodePropertyDropDown defaultTransactionIsolation = null;
  private ConfigNodePropertyString defaultCatalog = null;
  private ConfigNodePropertyInteger maxActive = null;
  private ConfigNodePropertyInteger maxIdle = null;
  private ConfigNodePropertyInteger minIdle = null;
  private ConfigNodePropertyInteger initialSize = null;
  private ConfigNodePropertyInteger maxWait = null;
  private ConfigNodePropertyInteger maxAge = null;
  private ConfigNodePropertyBoolean testOnBorrow = null;
  private ConfigNodePropertyBoolean testOnReturn = null;
  private ConfigNodePropertyBoolean testWhileIdle = null;
  private ConfigNodePropertyString validationQuery = null;
  private ConfigNodePropertyInteger validationQueryTimeout = null;
  private ConfigNodePropertyInteger timeBetweenEvictionRunsMillis = null;
  private ConfigNodePropertyInteger minEvictableIdleTimeMillis = null;
  private ConfigNodePropertyString connectionProperties = null;
  private ConfigNodePropertyString initSQL = null;
  private ConfigNodePropertyString jdbcInterceptors = null;
  private ConfigNodePropertyInteger validationInterval = null;
  private ConfigNodePropertyBoolean logValidationErrors = null;
  private ConfigNodePropertyArray datasourceSvcProperties = null;

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
  @JsonProperty("datasource.svc.prop.name")
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
    OrgApacheSlingDatasourceDataSourceFactoryProperties orgApacheSlingDatasourceDataSourceFactoryProperties = (OrgApacheSlingDatasourceDataSourceFactoryProperties) o;
    return Objects.equals(datasourceName, orgApacheSlingDatasourceDataSourceFactoryProperties.datasourceName) &&
        Objects.equals(datasourceSvcPropName, orgApacheSlingDatasourceDataSourceFactoryProperties.datasourceSvcPropName) &&
        Objects.equals(driverClassName, orgApacheSlingDatasourceDataSourceFactoryProperties.driverClassName) &&
        Objects.equals(url, orgApacheSlingDatasourceDataSourceFactoryProperties.url) &&
        Objects.equals(username, orgApacheSlingDatasourceDataSourceFactoryProperties.username) &&
        Objects.equals(password, orgApacheSlingDatasourceDataSourceFactoryProperties.password) &&
        Objects.equals(defaultAutoCommit, orgApacheSlingDatasourceDataSourceFactoryProperties.defaultAutoCommit) &&
        Objects.equals(defaultReadOnly, orgApacheSlingDatasourceDataSourceFactoryProperties.defaultReadOnly) &&
        Objects.equals(defaultTransactionIsolation, orgApacheSlingDatasourceDataSourceFactoryProperties.defaultTransactionIsolation) &&
        Objects.equals(defaultCatalog, orgApacheSlingDatasourceDataSourceFactoryProperties.defaultCatalog) &&
        Objects.equals(maxActive, orgApacheSlingDatasourceDataSourceFactoryProperties.maxActive) &&
        Objects.equals(maxIdle, orgApacheSlingDatasourceDataSourceFactoryProperties.maxIdle) &&
        Objects.equals(minIdle, orgApacheSlingDatasourceDataSourceFactoryProperties.minIdle) &&
        Objects.equals(initialSize, orgApacheSlingDatasourceDataSourceFactoryProperties.initialSize) &&
        Objects.equals(maxWait, orgApacheSlingDatasourceDataSourceFactoryProperties.maxWait) &&
        Objects.equals(maxAge, orgApacheSlingDatasourceDataSourceFactoryProperties.maxAge) &&
        Objects.equals(testOnBorrow, orgApacheSlingDatasourceDataSourceFactoryProperties.testOnBorrow) &&
        Objects.equals(testOnReturn, orgApacheSlingDatasourceDataSourceFactoryProperties.testOnReturn) &&
        Objects.equals(testWhileIdle, orgApacheSlingDatasourceDataSourceFactoryProperties.testWhileIdle) &&
        Objects.equals(validationQuery, orgApacheSlingDatasourceDataSourceFactoryProperties.validationQuery) &&
        Objects.equals(validationQueryTimeout, orgApacheSlingDatasourceDataSourceFactoryProperties.validationQueryTimeout) &&
        Objects.equals(timeBetweenEvictionRunsMillis, orgApacheSlingDatasourceDataSourceFactoryProperties.timeBetweenEvictionRunsMillis) &&
        Objects.equals(minEvictableIdleTimeMillis, orgApacheSlingDatasourceDataSourceFactoryProperties.minEvictableIdleTimeMillis) &&
        Objects.equals(connectionProperties, orgApacheSlingDatasourceDataSourceFactoryProperties.connectionProperties) &&
        Objects.equals(initSQL, orgApacheSlingDatasourceDataSourceFactoryProperties.initSQL) &&
        Objects.equals(jdbcInterceptors, orgApacheSlingDatasourceDataSourceFactoryProperties.jdbcInterceptors) &&
        Objects.equals(validationInterval, orgApacheSlingDatasourceDataSourceFactoryProperties.validationInterval) &&
        Objects.equals(logValidationErrors, orgApacheSlingDatasourceDataSourceFactoryProperties.logValidationErrors) &&
        Objects.equals(datasourceSvcProperties, orgApacheSlingDatasourceDataSourceFactoryProperties.datasourceSvcProperties);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

