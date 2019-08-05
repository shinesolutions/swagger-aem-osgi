package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
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

public class OrgApacheSlingDatasourceDataSourceFactoryProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString datasourceName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString datasourceSvcPropName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString driverClassName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString url = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString username = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString password = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown defaultAutoCommit = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown defaultReadOnly = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown defaultTransactionIsolation = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString defaultCatalog = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxActive = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxIdle = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger minIdle = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger initialSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxWait = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxAge = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean testOnBorrow = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean testOnReturn = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean testWhileIdle = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString validationQuery = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger validationQueryTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger timeBetweenEvictionRunsMillis = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger minEvictableIdleTimeMillis = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString connectionProperties = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString initSQL = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jdbcInterceptors = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger validationInterval = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean logValidationErrors = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray datasourceSvcProperties = null;
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

  public OrgApacheSlingDatasourceDataSourceFactoryProperties datasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
    return this;
  }

 /**
   * Get datasourceSvcPropName
   * @return datasourceSvcPropName
  **/
  @JsonProperty("datasource.svc.prop.name")
  public ConfigNodePropertyString getDatasourceSvcPropName() {
    return datasourceSvcPropName;
  }

  public void setDatasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties datasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
    return this;
  }

 /**
   * Get driverClassName
   * @return driverClassName
  **/
  @JsonProperty("driverClassName")
  public ConfigNodePropertyString getDriverClassName() {
    return driverClassName;
  }

  public void setDriverClassName(ConfigNodePropertyString driverClassName) {
    this.driverClassName = driverClassName;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties driverClassName(ConfigNodePropertyString driverClassName) {
    this.driverClassName = driverClassName;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  public ConfigNodePropertyString getUrl() {
    return url;
  }

  public void setUrl(ConfigNodePropertyString url) {
    this.url = url;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties url(ConfigNodePropertyString url) {
    this.url = url;
    return this;
  }

 /**
   * Get username
   * @return username
  **/
  @JsonProperty("username")
  public ConfigNodePropertyString getUsername() {
    return username;
  }

  public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties username(ConfigNodePropertyString username) {
    this.username = username;
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

  public OrgApacheSlingDatasourceDataSourceFactoryProperties password(ConfigNodePropertyString password) {
    this.password = password;
    return this;
  }

 /**
   * Get defaultAutoCommit
   * @return defaultAutoCommit
  **/
  @JsonProperty("defaultAutoCommit")
  public ConfigNodePropertyDropDown getDefaultAutoCommit() {
    return defaultAutoCommit;
  }

  public void setDefaultAutoCommit(ConfigNodePropertyDropDown defaultAutoCommit) {
    this.defaultAutoCommit = defaultAutoCommit;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultAutoCommit(ConfigNodePropertyDropDown defaultAutoCommit) {
    this.defaultAutoCommit = defaultAutoCommit;
    return this;
  }

 /**
   * Get defaultReadOnly
   * @return defaultReadOnly
  **/
  @JsonProperty("defaultReadOnly")
  public ConfigNodePropertyDropDown getDefaultReadOnly() {
    return defaultReadOnly;
  }

  public void setDefaultReadOnly(ConfigNodePropertyDropDown defaultReadOnly) {
    this.defaultReadOnly = defaultReadOnly;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultReadOnly(ConfigNodePropertyDropDown defaultReadOnly) {
    this.defaultReadOnly = defaultReadOnly;
    return this;
  }

 /**
   * Get defaultTransactionIsolation
   * @return defaultTransactionIsolation
  **/
  @JsonProperty("defaultTransactionIsolation")
  public ConfigNodePropertyDropDown getDefaultTransactionIsolation() {
    return defaultTransactionIsolation;
  }

  public void setDefaultTransactionIsolation(ConfigNodePropertyDropDown defaultTransactionIsolation) {
    this.defaultTransactionIsolation = defaultTransactionIsolation;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultTransactionIsolation(ConfigNodePropertyDropDown defaultTransactionIsolation) {
    this.defaultTransactionIsolation = defaultTransactionIsolation;
    return this;
  }

 /**
   * Get defaultCatalog
   * @return defaultCatalog
  **/
  @JsonProperty("defaultCatalog")
  public ConfigNodePropertyString getDefaultCatalog() {
    return defaultCatalog;
  }

  public void setDefaultCatalog(ConfigNodePropertyString defaultCatalog) {
    this.defaultCatalog = defaultCatalog;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultCatalog(ConfigNodePropertyString defaultCatalog) {
    this.defaultCatalog = defaultCatalog;
    return this;
  }

 /**
   * Get maxActive
   * @return maxActive
  **/
  @JsonProperty("maxActive")
  public ConfigNodePropertyInteger getMaxActive() {
    return maxActive;
  }

  public void setMaxActive(ConfigNodePropertyInteger maxActive) {
    this.maxActive = maxActive;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxActive(ConfigNodePropertyInteger maxActive) {
    this.maxActive = maxActive;
    return this;
  }

 /**
   * Get maxIdle
   * @return maxIdle
  **/
  @JsonProperty("maxIdle")
  public ConfigNodePropertyInteger getMaxIdle() {
    return maxIdle;
  }

  public void setMaxIdle(ConfigNodePropertyInteger maxIdle) {
    this.maxIdle = maxIdle;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxIdle(ConfigNodePropertyInteger maxIdle) {
    this.maxIdle = maxIdle;
    return this;
  }

 /**
   * Get minIdle
   * @return minIdle
  **/
  @JsonProperty("minIdle")
  public ConfigNodePropertyInteger getMinIdle() {
    return minIdle;
  }

  public void setMinIdle(ConfigNodePropertyInteger minIdle) {
    this.minIdle = minIdle;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties minIdle(ConfigNodePropertyInteger minIdle) {
    this.minIdle = minIdle;
    return this;
  }

 /**
   * Get initialSize
   * @return initialSize
  **/
  @JsonProperty("initialSize")
  public ConfigNodePropertyInteger getInitialSize() {
    return initialSize;
  }

  public void setInitialSize(ConfigNodePropertyInteger initialSize) {
    this.initialSize = initialSize;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties initialSize(ConfigNodePropertyInteger initialSize) {
    this.initialSize = initialSize;
    return this;
  }

 /**
   * Get maxWait
   * @return maxWait
  **/
  @JsonProperty("maxWait")
  public ConfigNodePropertyInteger getMaxWait() {
    return maxWait;
  }

  public void setMaxWait(ConfigNodePropertyInteger maxWait) {
    this.maxWait = maxWait;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxWait(ConfigNodePropertyInteger maxWait) {
    this.maxWait = maxWait;
    return this;
  }

 /**
   * Get maxAge
   * @return maxAge
  **/
  @JsonProperty("maxAge")
  public ConfigNodePropertyInteger getMaxAge() {
    return maxAge;
  }

  public void setMaxAge(ConfigNodePropertyInteger maxAge) {
    this.maxAge = maxAge;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxAge(ConfigNodePropertyInteger maxAge) {
    this.maxAge = maxAge;
    return this;
  }

 /**
   * Get testOnBorrow
   * @return testOnBorrow
  **/
  @JsonProperty("testOnBorrow")
  public ConfigNodePropertyBoolean getTestOnBorrow() {
    return testOnBorrow;
  }

  public void setTestOnBorrow(ConfigNodePropertyBoolean testOnBorrow) {
    this.testOnBorrow = testOnBorrow;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties testOnBorrow(ConfigNodePropertyBoolean testOnBorrow) {
    this.testOnBorrow = testOnBorrow;
    return this;
  }

 /**
   * Get testOnReturn
   * @return testOnReturn
  **/
  @JsonProperty("testOnReturn")
  public ConfigNodePropertyBoolean getTestOnReturn() {
    return testOnReturn;
  }

  public void setTestOnReturn(ConfigNodePropertyBoolean testOnReturn) {
    this.testOnReturn = testOnReturn;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties testOnReturn(ConfigNodePropertyBoolean testOnReturn) {
    this.testOnReturn = testOnReturn;
    return this;
  }

 /**
   * Get testWhileIdle
   * @return testWhileIdle
  **/
  @JsonProperty("testWhileIdle")
  public ConfigNodePropertyBoolean getTestWhileIdle() {
    return testWhileIdle;
  }

  public void setTestWhileIdle(ConfigNodePropertyBoolean testWhileIdle) {
    this.testWhileIdle = testWhileIdle;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties testWhileIdle(ConfigNodePropertyBoolean testWhileIdle) {
    this.testWhileIdle = testWhileIdle;
    return this;
  }

 /**
   * Get validationQuery
   * @return validationQuery
  **/
  @JsonProperty("validationQuery")
  public ConfigNodePropertyString getValidationQuery() {
    return validationQuery;
  }

  public void setValidationQuery(ConfigNodePropertyString validationQuery) {
    this.validationQuery = validationQuery;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties validationQuery(ConfigNodePropertyString validationQuery) {
    this.validationQuery = validationQuery;
    return this;
  }

 /**
   * Get validationQueryTimeout
   * @return validationQueryTimeout
  **/
  @JsonProperty("validationQueryTimeout")
  public ConfigNodePropertyInteger getValidationQueryTimeout() {
    return validationQueryTimeout;
  }

  public void setValidationQueryTimeout(ConfigNodePropertyInteger validationQueryTimeout) {
    this.validationQueryTimeout = validationQueryTimeout;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties validationQueryTimeout(ConfigNodePropertyInteger validationQueryTimeout) {
    this.validationQueryTimeout = validationQueryTimeout;
    return this;
  }

 /**
   * Get timeBetweenEvictionRunsMillis
   * @return timeBetweenEvictionRunsMillis
  **/
  @JsonProperty("timeBetweenEvictionRunsMillis")
  public ConfigNodePropertyInteger getTimeBetweenEvictionRunsMillis() {
    return timeBetweenEvictionRunsMillis;
  }

  public void setTimeBetweenEvictionRunsMillis(ConfigNodePropertyInteger timeBetweenEvictionRunsMillis) {
    this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties timeBetweenEvictionRunsMillis(ConfigNodePropertyInteger timeBetweenEvictionRunsMillis) {
    this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    return this;
  }

 /**
   * Get minEvictableIdleTimeMillis
   * @return minEvictableIdleTimeMillis
  **/
  @JsonProperty("minEvictableIdleTimeMillis")
  public ConfigNodePropertyInteger getMinEvictableIdleTimeMillis() {
    return minEvictableIdleTimeMillis;
  }

  public void setMinEvictableIdleTimeMillis(ConfigNodePropertyInteger minEvictableIdleTimeMillis) {
    this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties minEvictableIdleTimeMillis(ConfigNodePropertyInteger minEvictableIdleTimeMillis) {
    this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    return this;
  }

 /**
   * Get connectionProperties
   * @return connectionProperties
  **/
  @JsonProperty("connectionProperties")
  public ConfigNodePropertyString getConnectionProperties() {
    return connectionProperties;
  }

  public void setConnectionProperties(ConfigNodePropertyString connectionProperties) {
    this.connectionProperties = connectionProperties;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties connectionProperties(ConfigNodePropertyString connectionProperties) {
    this.connectionProperties = connectionProperties;
    return this;
  }

 /**
   * Get initSQL
   * @return initSQL
  **/
  @JsonProperty("initSQL")
  public ConfigNodePropertyString getInitSQL() {
    return initSQL;
  }

  public void setInitSQL(ConfigNodePropertyString initSQL) {
    this.initSQL = initSQL;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties initSQL(ConfigNodePropertyString initSQL) {
    this.initSQL = initSQL;
    return this;
  }

 /**
   * Get jdbcInterceptors
   * @return jdbcInterceptors
  **/
  @JsonProperty("jdbcInterceptors")
  public ConfigNodePropertyString getJdbcInterceptors() {
    return jdbcInterceptors;
  }

  public void setJdbcInterceptors(ConfigNodePropertyString jdbcInterceptors) {
    this.jdbcInterceptors = jdbcInterceptors;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties jdbcInterceptors(ConfigNodePropertyString jdbcInterceptors) {
    this.jdbcInterceptors = jdbcInterceptors;
    return this;
  }

 /**
   * Get validationInterval
   * @return validationInterval
  **/
  @JsonProperty("validationInterval")
  public ConfigNodePropertyInteger getValidationInterval() {
    return validationInterval;
  }

  public void setValidationInterval(ConfigNodePropertyInteger validationInterval) {
    this.validationInterval = validationInterval;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties validationInterval(ConfigNodePropertyInteger validationInterval) {
    this.validationInterval = validationInterval;
    return this;
  }

 /**
   * Get logValidationErrors
   * @return logValidationErrors
  **/
  @JsonProperty("logValidationErrors")
  public ConfigNodePropertyBoolean getLogValidationErrors() {
    return logValidationErrors;
  }

  public void setLogValidationErrors(ConfigNodePropertyBoolean logValidationErrors) {
    this.logValidationErrors = logValidationErrors;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties logValidationErrors(ConfigNodePropertyBoolean logValidationErrors) {
    this.logValidationErrors = logValidationErrors;
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

  public OrgApacheSlingDatasourceDataSourceFactoryProperties datasourceSvcProperties(ConfigNodePropertyArray datasourceSvcProperties) {
    this.datasourceSvcProperties = datasourceSvcProperties;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

