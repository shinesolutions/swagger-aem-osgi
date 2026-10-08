package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDatasourceDataSourceFactoryProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString datasourceName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString datasourceSvcPropName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString driverClassName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString url;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString username;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString password;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown defaultAutoCommit;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown defaultReadOnly;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown defaultTransactionIsolation;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString defaultCatalog;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxActive;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxIdle;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger minIdle;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger initialSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxWait;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxAge;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean testOnBorrow;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean testOnReturn;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean testWhileIdle;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString validationQuery;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger validationQueryTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger timeBetweenEvictionRunsMillis;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger minEvictableIdleTimeMillis;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString connectionProperties;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString initSQL;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jdbcInterceptors;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger validationInterval;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean logValidationErrors;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray datasourceSvcProperties;
 /**
  * Get datasourceName
  * @return datasourceName
  */
  @JsonProperty("datasource.name")
  public ConfigNodePropertyString getDatasourceName() {
    return datasourceName;
  }

  /**
   * Sets the <code>datasourceName</code> property.
   */
 public void setDatasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
  }

  /**
   * Sets the <code>datasourceName</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties datasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
    return this;
  }

 /**
  * Get datasourceSvcPropName
  * @return datasourceSvcPropName
  */
  @JsonProperty("datasource.svc.prop.name")
  public ConfigNodePropertyString getDatasourceSvcPropName() {
    return datasourceSvcPropName;
  }

  /**
   * Sets the <code>datasourceSvcPropName</code> property.
   */
 public void setDatasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
  }

  /**
   * Sets the <code>datasourceSvcPropName</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties datasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
    return this;
  }

 /**
  * Get driverClassName
  * @return driverClassName
  */
  @JsonProperty("driverClassName")
  public ConfigNodePropertyString getDriverClassName() {
    return driverClassName;
  }

  /**
   * Sets the <code>driverClassName</code> property.
   */
 public void setDriverClassName(ConfigNodePropertyString driverClassName) {
    this.driverClassName = driverClassName;
  }

  /**
   * Sets the <code>driverClassName</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties driverClassName(ConfigNodePropertyString driverClassName) {
    this.driverClassName = driverClassName;
    return this;
  }

 /**
  * Get url
  * @return url
  */
  @JsonProperty("url")
  public ConfigNodePropertyString getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(ConfigNodePropertyString url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties url(ConfigNodePropertyString url) {
    this.url = url;
    return this;
  }

 /**
  * Get username
  * @return username
  */
  @JsonProperty("username")
  public ConfigNodePropertyString getUsername() {
    return username;
  }

  /**
   * Sets the <code>username</code> property.
   */
 public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

  /**
   * Sets the <code>username</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties username(ConfigNodePropertyString username) {
    this.username = username;
    return this;
  }

 /**
  * Get password
  * @return password
  */
  @JsonProperty("password")
  public ConfigNodePropertyString getPassword() {
    return password;
  }

  /**
   * Sets the <code>password</code> property.
   */
 public void setPassword(ConfigNodePropertyString password) {
    this.password = password;
  }

  /**
   * Sets the <code>password</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties password(ConfigNodePropertyString password) {
    this.password = password;
    return this;
  }

 /**
  * Get defaultAutoCommit
  * @return defaultAutoCommit
  */
  @JsonProperty("defaultAutoCommit")
  public ConfigNodePropertyDropDown getDefaultAutoCommit() {
    return defaultAutoCommit;
  }

  /**
   * Sets the <code>defaultAutoCommit</code> property.
   */
 public void setDefaultAutoCommit(ConfigNodePropertyDropDown defaultAutoCommit) {
    this.defaultAutoCommit = defaultAutoCommit;
  }

  /**
   * Sets the <code>defaultAutoCommit</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultAutoCommit(ConfigNodePropertyDropDown defaultAutoCommit) {
    this.defaultAutoCommit = defaultAutoCommit;
    return this;
  }

 /**
  * Get defaultReadOnly
  * @return defaultReadOnly
  */
  @JsonProperty("defaultReadOnly")
  public ConfigNodePropertyDropDown getDefaultReadOnly() {
    return defaultReadOnly;
  }

  /**
   * Sets the <code>defaultReadOnly</code> property.
   */
 public void setDefaultReadOnly(ConfigNodePropertyDropDown defaultReadOnly) {
    this.defaultReadOnly = defaultReadOnly;
  }

  /**
   * Sets the <code>defaultReadOnly</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultReadOnly(ConfigNodePropertyDropDown defaultReadOnly) {
    this.defaultReadOnly = defaultReadOnly;
    return this;
  }

 /**
  * Get defaultTransactionIsolation
  * @return defaultTransactionIsolation
  */
  @JsonProperty("defaultTransactionIsolation")
  public ConfigNodePropertyDropDown getDefaultTransactionIsolation() {
    return defaultTransactionIsolation;
  }

  /**
   * Sets the <code>defaultTransactionIsolation</code> property.
   */
 public void setDefaultTransactionIsolation(ConfigNodePropertyDropDown defaultTransactionIsolation) {
    this.defaultTransactionIsolation = defaultTransactionIsolation;
  }

  /**
   * Sets the <code>defaultTransactionIsolation</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultTransactionIsolation(ConfigNodePropertyDropDown defaultTransactionIsolation) {
    this.defaultTransactionIsolation = defaultTransactionIsolation;
    return this;
  }

 /**
  * Get defaultCatalog
  * @return defaultCatalog
  */
  @JsonProperty("defaultCatalog")
  public ConfigNodePropertyString getDefaultCatalog() {
    return defaultCatalog;
  }

  /**
   * Sets the <code>defaultCatalog</code> property.
   */
 public void setDefaultCatalog(ConfigNodePropertyString defaultCatalog) {
    this.defaultCatalog = defaultCatalog;
  }

  /**
   * Sets the <code>defaultCatalog</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultCatalog(ConfigNodePropertyString defaultCatalog) {
    this.defaultCatalog = defaultCatalog;
    return this;
  }

 /**
  * Get maxActive
  * @return maxActive
  */
  @JsonProperty("maxActive")
  public ConfigNodePropertyInteger getMaxActive() {
    return maxActive;
  }

  /**
   * Sets the <code>maxActive</code> property.
   */
 public void setMaxActive(ConfigNodePropertyInteger maxActive) {
    this.maxActive = maxActive;
  }

  /**
   * Sets the <code>maxActive</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxActive(ConfigNodePropertyInteger maxActive) {
    this.maxActive = maxActive;
    return this;
  }

 /**
  * Get maxIdle
  * @return maxIdle
  */
  @JsonProperty("maxIdle")
  public ConfigNodePropertyInteger getMaxIdle() {
    return maxIdle;
  }

  /**
   * Sets the <code>maxIdle</code> property.
   */
 public void setMaxIdle(ConfigNodePropertyInteger maxIdle) {
    this.maxIdle = maxIdle;
  }

  /**
   * Sets the <code>maxIdle</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxIdle(ConfigNodePropertyInteger maxIdle) {
    this.maxIdle = maxIdle;
    return this;
  }

 /**
  * Get minIdle
  * @return minIdle
  */
  @JsonProperty("minIdle")
  public ConfigNodePropertyInteger getMinIdle() {
    return minIdle;
  }

  /**
   * Sets the <code>minIdle</code> property.
   */
 public void setMinIdle(ConfigNodePropertyInteger minIdle) {
    this.minIdle = minIdle;
  }

  /**
   * Sets the <code>minIdle</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties minIdle(ConfigNodePropertyInteger minIdle) {
    this.minIdle = minIdle;
    return this;
  }

 /**
  * Get initialSize
  * @return initialSize
  */
  @JsonProperty("initialSize")
  public ConfigNodePropertyInteger getInitialSize() {
    return initialSize;
  }

  /**
   * Sets the <code>initialSize</code> property.
   */
 public void setInitialSize(ConfigNodePropertyInteger initialSize) {
    this.initialSize = initialSize;
  }

  /**
   * Sets the <code>initialSize</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties initialSize(ConfigNodePropertyInteger initialSize) {
    this.initialSize = initialSize;
    return this;
  }

 /**
  * Get maxWait
  * @return maxWait
  */
  @JsonProperty("maxWait")
  public ConfigNodePropertyInteger getMaxWait() {
    return maxWait;
  }

  /**
   * Sets the <code>maxWait</code> property.
   */
 public void setMaxWait(ConfigNodePropertyInteger maxWait) {
    this.maxWait = maxWait;
  }

  /**
   * Sets the <code>maxWait</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxWait(ConfigNodePropertyInteger maxWait) {
    this.maxWait = maxWait;
    return this;
  }

 /**
  * Get maxAge
  * @return maxAge
  */
  @JsonProperty("maxAge")
  public ConfigNodePropertyInteger getMaxAge() {
    return maxAge;
  }

  /**
   * Sets the <code>maxAge</code> property.
   */
 public void setMaxAge(ConfigNodePropertyInteger maxAge) {
    this.maxAge = maxAge;
  }

  /**
   * Sets the <code>maxAge</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxAge(ConfigNodePropertyInteger maxAge) {
    this.maxAge = maxAge;
    return this;
  }

 /**
  * Get testOnBorrow
  * @return testOnBorrow
  */
  @JsonProperty("testOnBorrow")
  public ConfigNodePropertyBoolean getTestOnBorrow() {
    return testOnBorrow;
  }

  /**
   * Sets the <code>testOnBorrow</code> property.
   */
 public void setTestOnBorrow(ConfigNodePropertyBoolean testOnBorrow) {
    this.testOnBorrow = testOnBorrow;
  }

  /**
   * Sets the <code>testOnBorrow</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties testOnBorrow(ConfigNodePropertyBoolean testOnBorrow) {
    this.testOnBorrow = testOnBorrow;
    return this;
  }

 /**
  * Get testOnReturn
  * @return testOnReturn
  */
  @JsonProperty("testOnReturn")
  public ConfigNodePropertyBoolean getTestOnReturn() {
    return testOnReturn;
  }

  /**
   * Sets the <code>testOnReturn</code> property.
   */
 public void setTestOnReturn(ConfigNodePropertyBoolean testOnReturn) {
    this.testOnReturn = testOnReturn;
  }

  /**
   * Sets the <code>testOnReturn</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties testOnReturn(ConfigNodePropertyBoolean testOnReturn) {
    this.testOnReturn = testOnReturn;
    return this;
  }

 /**
  * Get testWhileIdle
  * @return testWhileIdle
  */
  @JsonProperty("testWhileIdle")
  public ConfigNodePropertyBoolean getTestWhileIdle() {
    return testWhileIdle;
  }

  /**
   * Sets the <code>testWhileIdle</code> property.
   */
 public void setTestWhileIdle(ConfigNodePropertyBoolean testWhileIdle) {
    this.testWhileIdle = testWhileIdle;
  }

  /**
   * Sets the <code>testWhileIdle</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties testWhileIdle(ConfigNodePropertyBoolean testWhileIdle) {
    this.testWhileIdle = testWhileIdle;
    return this;
  }

 /**
  * Get validationQuery
  * @return validationQuery
  */
  @JsonProperty("validationQuery")
  public ConfigNodePropertyString getValidationQuery() {
    return validationQuery;
  }

  /**
   * Sets the <code>validationQuery</code> property.
   */
 public void setValidationQuery(ConfigNodePropertyString validationQuery) {
    this.validationQuery = validationQuery;
  }

  /**
   * Sets the <code>validationQuery</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties validationQuery(ConfigNodePropertyString validationQuery) {
    this.validationQuery = validationQuery;
    return this;
  }

 /**
  * Get validationQueryTimeout
  * @return validationQueryTimeout
  */
  @JsonProperty("validationQueryTimeout")
  public ConfigNodePropertyInteger getValidationQueryTimeout() {
    return validationQueryTimeout;
  }

  /**
   * Sets the <code>validationQueryTimeout</code> property.
   */
 public void setValidationQueryTimeout(ConfigNodePropertyInteger validationQueryTimeout) {
    this.validationQueryTimeout = validationQueryTimeout;
  }

  /**
   * Sets the <code>validationQueryTimeout</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties validationQueryTimeout(ConfigNodePropertyInteger validationQueryTimeout) {
    this.validationQueryTimeout = validationQueryTimeout;
    return this;
  }

 /**
  * Get timeBetweenEvictionRunsMillis
  * @return timeBetweenEvictionRunsMillis
  */
  @JsonProperty("timeBetweenEvictionRunsMillis")
  public ConfigNodePropertyInteger getTimeBetweenEvictionRunsMillis() {
    return timeBetweenEvictionRunsMillis;
  }

  /**
   * Sets the <code>timeBetweenEvictionRunsMillis</code> property.
   */
 public void setTimeBetweenEvictionRunsMillis(ConfigNodePropertyInteger timeBetweenEvictionRunsMillis) {
    this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
  }

  /**
   * Sets the <code>timeBetweenEvictionRunsMillis</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties timeBetweenEvictionRunsMillis(ConfigNodePropertyInteger timeBetweenEvictionRunsMillis) {
    this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    return this;
  }

 /**
  * Get minEvictableIdleTimeMillis
  * @return minEvictableIdleTimeMillis
  */
  @JsonProperty("minEvictableIdleTimeMillis")
  public ConfigNodePropertyInteger getMinEvictableIdleTimeMillis() {
    return minEvictableIdleTimeMillis;
  }

  /**
   * Sets the <code>minEvictableIdleTimeMillis</code> property.
   */
 public void setMinEvictableIdleTimeMillis(ConfigNodePropertyInteger minEvictableIdleTimeMillis) {
    this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
  }

  /**
   * Sets the <code>minEvictableIdleTimeMillis</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties minEvictableIdleTimeMillis(ConfigNodePropertyInteger minEvictableIdleTimeMillis) {
    this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    return this;
  }

 /**
  * Get connectionProperties
  * @return connectionProperties
  */
  @JsonProperty("connectionProperties")
  public ConfigNodePropertyString getConnectionProperties() {
    return connectionProperties;
  }

  /**
   * Sets the <code>connectionProperties</code> property.
   */
 public void setConnectionProperties(ConfigNodePropertyString connectionProperties) {
    this.connectionProperties = connectionProperties;
  }

  /**
   * Sets the <code>connectionProperties</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties connectionProperties(ConfigNodePropertyString connectionProperties) {
    this.connectionProperties = connectionProperties;
    return this;
  }

 /**
  * Get initSQL
  * @return initSQL
  */
  @JsonProperty("initSQL")
  public ConfigNodePropertyString getInitSQL() {
    return initSQL;
  }

  /**
   * Sets the <code>initSQL</code> property.
   */
 public void setInitSQL(ConfigNodePropertyString initSQL) {
    this.initSQL = initSQL;
  }

  /**
   * Sets the <code>initSQL</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties initSQL(ConfigNodePropertyString initSQL) {
    this.initSQL = initSQL;
    return this;
  }

 /**
  * Get jdbcInterceptors
  * @return jdbcInterceptors
  */
  @JsonProperty("jdbcInterceptors")
  public ConfigNodePropertyString getJdbcInterceptors() {
    return jdbcInterceptors;
  }

  /**
   * Sets the <code>jdbcInterceptors</code> property.
   */
 public void setJdbcInterceptors(ConfigNodePropertyString jdbcInterceptors) {
    this.jdbcInterceptors = jdbcInterceptors;
  }

  /**
   * Sets the <code>jdbcInterceptors</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties jdbcInterceptors(ConfigNodePropertyString jdbcInterceptors) {
    this.jdbcInterceptors = jdbcInterceptors;
    return this;
  }

 /**
  * Get validationInterval
  * @return validationInterval
  */
  @JsonProperty("validationInterval")
  public ConfigNodePropertyInteger getValidationInterval() {
    return validationInterval;
  }

  /**
   * Sets the <code>validationInterval</code> property.
   */
 public void setValidationInterval(ConfigNodePropertyInteger validationInterval) {
    this.validationInterval = validationInterval;
  }

  /**
   * Sets the <code>validationInterval</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties validationInterval(ConfigNodePropertyInteger validationInterval) {
    this.validationInterval = validationInterval;
    return this;
  }

 /**
  * Get logValidationErrors
  * @return logValidationErrors
  */
  @JsonProperty("logValidationErrors")
  public ConfigNodePropertyBoolean getLogValidationErrors() {
    return logValidationErrors;
  }

  /**
   * Sets the <code>logValidationErrors</code> property.
   */
 public void setLogValidationErrors(ConfigNodePropertyBoolean logValidationErrors) {
    this.logValidationErrors = logValidationErrors;
  }

  /**
   * Sets the <code>logValidationErrors</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties logValidationErrors(ConfigNodePropertyBoolean logValidationErrors) {
    this.logValidationErrors = logValidationErrors;
    return this;
  }

 /**
  * Get datasourceSvcProperties
  * @return datasourceSvcProperties
  */
  @JsonProperty("datasource.svc.properties")
  public ConfigNodePropertyArray getDatasourceSvcProperties() {
    return datasourceSvcProperties;
  }

  /**
   * Sets the <code>datasourceSvcProperties</code> property.
   */
 public void setDatasourceSvcProperties(ConfigNodePropertyArray datasourceSvcProperties) {
    this.datasourceSvcProperties = datasourceSvcProperties;
  }

  /**
   * Sets the <code>datasourceSvcProperties</code> property.
   */
  public OrgApacheSlingDatasourceDataSourceFactoryProperties datasourceSvcProperties(ConfigNodePropertyArray datasourceSvcProperties) {
    this.datasourceSvcProperties = datasourceSvcProperties;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

