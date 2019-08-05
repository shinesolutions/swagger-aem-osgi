package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingDatasourceDataSourceFactoryProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheSlingDatasourceDataSourceFactoryProperties   {
  @JsonProperty("datasource.name")
  private ConfigNodePropertyString datasourceName = null;

  @JsonProperty("datasource.svc.prop.name")
  private ConfigNodePropertyString datasourceSvcPropName = null;

  @JsonProperty("driverClassName")
  private ConfigNodePropertyString driverClassName = null;

  @JsonProperty("url")
  private ConfigNodePropertyString url = null;

  @JsonProperty("username")
  private ConfigNodePropertyString username = null;

  @JsonProperty("password")
  private ConfigNodePropertyString password = null;

  @JsonProperty("defaultAutoCommit")
  private ConfigNodePropertyDropDown defaultAutoCommit = null;

  @JsonProperty("defaultReadOnly")
  private ConfigNodePropertyDropDown defaultReadOnly = null;

  @JsonProperty("defaultTransactionIsolation")
  private ConfigNodePropertyDropDown defaultTransactionIsolation = null;

  @JsonProperty("defaultCatalog")
  private ConfigNodePropertyString defaultCatalog = null;

  @JsonProperty("maxActive")
  private ConfigNodePropertyInteger maxActive = null;

  @JsonProperty("maxIdle")
  private ConfigNodePropertyInteger maxIdle = null;

  @JsonProperty("minIdle")
  private ConfigNodePropertyInteger minIdle = null;

  @JsonProperty("initialSize")
  private ConfigNodePropertyInteger initialSize = null;

  @JsonProperty("maxWait")
  private ConfigNodePropertyInteger maxWait = null;

  @JsonProperty("maxAge")
  private ConfigNodePropertyInteger maxAge = null;

  @JsonProperty("testOnBorrow")
  private ConfigNodePropertyBoolean testOnBorrow = null;

  @JsonProperty("testOnReturn")
  private ConfigNodePropertyBoolean testOnReturn = null;

  @JsonProperty("testWhileIdle")
  private ConfigNodePropertyBoolean testWhileIdle = null;

  @JsonProperty("validationQuery")
  private ConfigNodePropertyString validationQuery = null;

  @JsonProperty("validationQueryTimeout")
  private ConfigNodePropertyInteger validationQueryTimeout = null;

  @JsonProperty("timeBetweenEvictionRunsMillis")
  private ConfigNodePropertyInteger timeBetweenEvictionRunsMillis = null;

  @JsonProperty("minEvictableIdleTimeMillis")
  private ConfigNodePropertyInteger minEvictableIdleTimeMillis = null;

  @JsonProperty("connectionProperties")
  private ConfigNodePropertyString connectionProperties = null;

  @JsonProperty("initSQL")
  private ConfigNodePropertyString initSQL = null;

  @JsonProperty("jdbcInterceptors")
  private ConfigNodePropertyString jdbcInterceptors = null;

  @JsonProperty("validationInterval")
  private ConfigNodePropertyInteger validationInterval = null;

  @JsonProperty("logValidationErrors")
  private ConfigNodePropertyBoolean logValidationErrors = null;

  @JsonProperty("datasource.svc.properties")
  private ConfigNodePropertyArray datasourceSvcProperties = null;

  public OrgApacheSlingDatasourceDataSourceFactoryProperties datasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
    return this;
  }

   /**
   * Get datasourceName
   * @return datasourceName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDatasourceName() {
    return datasourceName;
  }

  public void setDatasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties datasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
    return this;
  }

   /**
   * Get datasourceSvcPropName
   * @return datasourceSvcPropName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDatasourceSvcPropName() {
    return datasourceSvcPropName;
  }

  public void setDatasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties driverClassName(ConfigNodePropertyString driverClassName) {
    this.driverClassName = driverClassName;
    return this;
  }

   /**
   * Get driverClassName
   * @return driverClassName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDriverClassName() {
    return driverClassName;
  }

  public void setDriverClassName(ConfigNodePropertyString driverClassName) {
    this.driverClassName = driverClassName;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties url(ConfigNodePropertyString url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getUrl() {
    return url;
  }

  public void setUrl(ConfigNodePropertyString url) {
    this.url = url;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties username(ConfigNodePropertyString username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getUsername() {
    return username;
  }

  public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties password(ConfigNodePropertyString password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPassword() {
    return password;
  }

  public void setPassword(ConfigNodePropertyString password) {
    this.password = password;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultAutoCommit(ConfigNodePropertyDropDown defaultAutoCommit) {
    this.defaultAutoCommit = defaultAutoCommit;
    return this;
  }

   /**
   * Get defaultAutoCommit
   * @return defaultAutoCommit
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getDefaultAutoCommit() {
    return defaultAutoCommit;
  }

  public void setDefaultAutoCommit(ConfigNodePropertyDropDown defaultAutoCommit) {
    this.defaultAutoCommit = defaultAutoCommit;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultReadOnly(ConfigNodePropertyDropDown defaultReadOnly) {
    this.defaultReadOnly = defaultReadOnly;
    return this;
  }

   /**
   * Get defaultReadOnly
   * @return defaultReadOnly
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getDefaultReadOnly() {
    return defaultReadOnly;
  }

  public void setDefaultReadOnly(ConfigNodePropertyDropDown defaultReadOnly) {
    this.defaultReadOnly = defaultReadOnly;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultTransactionIsolation(ConfigNodePropertyDropDown defaultTransactionIsolation) {
    this.defaultTransactionIsolation = defaultTransactionIsolation;
    return this;
  }

   /**
   * Get defaultTransactionIsolation
   * @return defaultTransactionIsolation
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getDefaultTransactionIsolation() {
    return defaultTransactionIsolation;
  }

  public void setDefaultTransactionIsolation(ConfigNodePropertyDropDown defaultTransactionIsolation) {
    this.defaultTransactionIsolation = defaultTransactionIsolation;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultCatalog(ConfigNodePropertyString defaultCatalog) {
    this.defaultCatalog = defaultCatalog;
    return this;
  }

   /**
   * Get defaultCatalog
   * @return defaultCatalog
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDefaultCatalog() {
    return defaultCatalog;
  }

  public void setDefaultCatalog(ConfigNodePropertyString defaultCatalog) {
    this.defaultCatalog = defaultCatalog;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxActive(ConfigNodePropertyInteger maxActive) {
    this.maxActive = maxActive;
    return this;
  }

   /**
   * Get maxActive
   * @return maxActive
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxActive() {
    return maxActive;
  }

  public void setMaxActive(ConfigNodePropertyInteger maxActive) {
    this.maxActive = maxActive;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxIdle(ConfigNodePropertyInteger maxIdle) {
    this.maxIdle = maxIdle;
    return this;
  }

   /**
   * Get maxIdle
   * @return maxIdle
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxIdle() {
    return maxIdle;
  }

  public void setMaxIdle(ConfigNodePropertyInteger maxIdle) {
    this.maxIdle = maxIdle;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties minIdle(ConfigNodePropertyInteger minIdle) {
    this.minIdle = minIdle;
    return this;
  }

   /**
   * Get minIdle
   * @return minIdle
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMinIdle() {
    return minIdle;
  }

  public void setMinIdle(ConfigNodePropertyInteger minIdle) {
    this.minIdle = minIdle;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties initialSize(ConfigNodePropertyInteger initialSize) {
    this.initialSize = initialSize;
    return this;
  }

   /**
   * Get initialSize
   * @return initialSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getInitialSize() {
    return initialSize;
  }

  public void setInitialSize(ConfigNodePropertyInteger initialSize) {
    this.initialSize = initialSize;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxWait(ConfigNodePropertyInteger maxWait) {
    this.maxWait = maxWait;
    return this;
  }

   /**
   * Get maxWait
   * @return maxWait
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxWait() {
    return maxWait;
  }

  public void setMaxWait(ConfigNodePropertyInteger maxWait) {
    this.maxWait = maxWait;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxAge(ConfigNodePropertyInteger maxAge) {
    this.maxAge = maxAge;
    return this;
  }

   /**
   * Get maxAge
   * @return maxAge
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxAge() {
    return maxAge;
  }

  public void setMaxAge(ConfigNodePropertyInteger maxAge) {
    this.maxAge = maxAge;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties testOnBorrow(ConfigNodePropertyBoolean testOnBorrow) {
    this.testOnBorrow = testOnBorrow;
    return this;
  }

   /**
   * Get testOnBorrow
   * @return testOnBorrow
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getTestOnBorrow() {
    return testOnBorrow;
  }

  public void setTestOnBorrow(ConfigNodePropertyBoolean testOnBorrow) {
    this.testOnBorrow = testOnBorrow;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties testOnReturn(ConfigNodePropertyBoolean testOnReturn) {
    this.testOnReturn = testOnReturn;
    return this;
  }

   /**
   * Get testOnReturn
   * @return testOnReturn
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getTestOnReturn() {
    return testOnReturn;
  }

  public void setTestOnReturn(ConfigNodePropertyBoolean testOnReturn) {
    this.testOnReturn = testOnReturn;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties testWhileIdle(ConfigNodePropertyBoolean testWhileIdle) {
    this.testWhileIdle = testWhileIdle;
    return this;
  }

   /**
   * Get testWhileIdle
   * @return testWhileIdle
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getTestWhileIdle() {
    return testWhileIdle;
  }

  public void setTestWhileIdle(ConfigNodePropertyBoolean testWhileIdle) {
    this.testWhileIdle = testWhileIdle;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties validationQuery(ConfigNodePropertyString validationQuery) {
    this.validationQuery = validationQuery;
    return this;
  }

   /**
   * Get validationQuery
   * @return validationQuery
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getValidationQuery() {
    return validationQuery;
  }

  public void setValidationQuery(ConfigNodePropertyString validationQuery) {
    this.validationQuery = validationQuery;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties validationQueryTimeout(ConfigNodePropertyInteger validationQueryTimeout) {
    this.validationQueryTimeout = validationQueryTimeout;
    return this;
  }

   /**
   * Get validationQueryTimeout
   * @return validationQueryTimeout
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getValidationQueryTimeout() {
    return validationQueryTimeout;
  }

  public void setValidationQueryTimeout(ConfigNodePropertyInteger validationQueryTimeout) {
    this.validationQueryTimeout = validationQueryTimeout;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties timeBetweenEvictionRunsMillis(ConfigNodePropertyInteger timeBetweenEvictionRunsMillis) {
    this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    return this;
  }

   /**
   * Get timeBetweenEvictionRunsMillis
   * @return timeBetweenEvictionRunsMillis
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getTimeBetweenEvictionRunsMillis() {
    return timeBetweenEvictionRunsMillis;
  }

  public void setTimeBetweenEvictionRunsMillis(ConfigNodePropertyInteger timeBetweenEvictionRunsMillis) {
    this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties minEvictableIdleTimeMillis(ConfigNodePropertyInteger minEvictableIdleTimeMillis) {
    this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    return this;
  }

   /**
   * Get minEvictableIdleTimeMillis
   * @return minEvictableIdleTimeMillis
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMinEvictableIdleTimeMillis() {
    return minEvictableIdleTimeMillis;
  }

  public void setMinEvictableIdleTimeMillis(ConfigNodePropertyInteger minEvictableIdleTimeMillis) {
    this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties connectionProperties(ConfigNodePropertyString connectionProperties) {
    this.connectionProperties = connectionProperties;
    return this;
  }

   /**
   * Get connectionProperties
   * @return connectionProperties
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getConnectionProperties() {
    return connectionProperties;
  }

  public void setConnectionProperties(ConfigNodePropertyString connectionProperties) {
    this.connectionProperties = connectionProperties;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties initSQL(ConfigNodePropertyString initSQL) {
    this.initSQL = initSQL;
    return this;
  }

   /**
   * Get initSQL
   * @return initSQL
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getInitSQL() {
    return initSQL;
  }

  public void setInitSQL(ConfigNodePropertyString initSQL) {
    this.initSQL = initSQL;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties jdbcInterceptors(ConfigNodePropertyString jdbcInterceptors) {
    this.jdbcInterceptors = jdbcInterceptors;
    return this;
  }

   /**
   * Get jdbcInterceptors
   * @return jdbcInterceptors
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getJdbcInterceptors() {
    return jdbcInterceptors;
  }

  public void setJdbcInterceptors(ConfigNodePropertyString jdbcInterceptors) {
    this.jdbcInterceptors = jdbcInterceptors;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties validationInterval(ConfigNodePropertyInteger validationInterval) {
    this.validationInterval = validationInterval;
    return this;
  }

   /**
   * Get validationInterval
   * @return validationInterval
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getValidationInterval() {
    return validationInterval;
  }

  public void setValidationInterval(ConfigNodePropertyInteger validationInterval) {
    this.validationInterval = validationInterval;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties logValidationErrors(ConfigNodePropertyBoolean logValidationErrors) {
    this.logValidationErrors = logValidationErrors;
    return this;
  }

   /**
   * Get logValidationErrors
   * @return logValidationErrors
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getLogValidationErrors() {
    return logValidationErrors;
  }

  public void setLogValidationErrors(ConfigNodePropertyBoolean logValidationErrors) {
    this.logValidationErrors = logValidationErrors;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties datasourceSvcProperties(ConfigNodePropertyArray datasourceSvcProperties) {
    this.datasourceSvcProperties = datasourceSvcProperties;
    return this;
  }

   /**
   * Get datasourceSvcProperties
   * @return datasourceSvcProperties
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

