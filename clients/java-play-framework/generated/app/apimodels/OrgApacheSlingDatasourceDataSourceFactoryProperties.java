package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingDatasourceDataSourceFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

