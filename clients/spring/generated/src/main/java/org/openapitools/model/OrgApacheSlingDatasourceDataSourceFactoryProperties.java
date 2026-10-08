package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingDatasourceDataSourceFactoryProperties
 */

@JsonTypeName("orgApacheSlingDatasourceDataSourceFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDatasourceDataSourceFactoryProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString datasourceName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString datasourceSvcPropName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString driverClassName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString url;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString username;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString password;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown defaultAutoCommit;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown defaultReadOnly;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown defaultTransactionIsolation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString defaultCatalog;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxActive;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxIdle;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger minIdle;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger initialSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxWait;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxAge;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean testOnBorrow;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean testOnReturn;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean testWhileIdle;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString validationQuery;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger validationQueryTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger timeBetweenEvictionRunsMillis;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger minEvictableIdleTimeMillis;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString connectionProperties;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString initSQL;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jdbcInterceptors;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger validationInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean logValidationErrors;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray datasourceSvcProperties;

  public OrgApacheSlingDatasourceDataSourceFactoryProperties datasourceName(@Nullable ConfigNodePropertyString datasourceName) {
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
  public @Nullable ConfigNodePropertyString getDatasourceName() {
    return datasourceName;
  }

  @JsonProperty("datasource.name")
  public void setDatasourceName(@Nullable ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties datasourceSvcPropName(@Nullable ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
    return this;
  }

  /**
   * Get datasourceSvcPropName
   * @return datasourceSvcPropName
   */
  @Valid 
  @Schema(name = "datasource.svc.prop.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datasource.svc.prop.name")
  public @Nullable ConfigNodePropertyString getDatasourceSvcPropName() {
    return datasourceSvcPropName;
  }

  @JsonProperty("datasource.svc.prop.name")
  public void setDatasourceSvcPropName(@Nullable ConfigNodePropertyString datasourceSvcPropName) {
    this.datasourceSvcPropName = datasourceSvcPropName;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties driverClassName(@Nullable ConfigNodePropertyString driverClassName) {
    this.driverClassName = driverClassName;
    return this;
  }

  /**
   * Get driverClassName
   * @return driverClassName
   */
  @Valid 
  @Schema(name = "driverClassName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("driverClassName")
  public @Nullable ConfigNodePropertyString getDriverClassName() {
    return driverClassName;
  }

  @JsonProperty("driverClassName")
  public void setDriverClassName(@Nullable ConfigNodePropertyString driverClassName) {
    this.driverClassName = driverClassName;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties url(@Nullable ConfigNodePropertyString url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @Valid 
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public @Nullable ConfigNodePropertyString getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(@Nullable ConfigNodePropertyString url) {
    this.url = url;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties username(@Nullable ConfigNodePropertyString username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @Valid 
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public @Nullable ConfigNodePropertyString getUsername() {
    return username;
  }

  @JsonProperty("username")
  public void setUsername(@Nullable ConfigNodePropertyString username) {
    this.username = username;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties password(@Nullable ConfigNodePropertyString password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @Valid 
  @Schema(name = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public @Nullable ConfigNodePropertyString getPassword() {
    return password;
  }

  @JsonProperty("password")
  public void setPassword(@Nullable ConfigNodePropertyString password) {
    this.password = password;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultAutoCommit(@Nullable ConfigNodePropertyDropDown defaultAutoCommit) {
    this.defaultAutoCommit = defaultAutoCommit;
    return this;
  }

  /**
   * Get defaultAutoCommit
   * @return defaultAutoCommit
   */
  @Valid 
  @Schema(name = "defaultAutoCommit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultAutoCommit")
  public @Nullable ConfigNodePropertyDropDown getDefaultAutoCommit() {
    return defaultAutoCommit;
  }

  @JsonProperty("defaultAutoCommit")
  public void setDefaultAutoCommit(@Nullable ConfigNodePropertyDropDown defaultAutoCommit) {
    this.defaultAutoCommit = defaultAutoCommit;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultReadOnly(@Nullable ConfigNodePropertyDropDown defaultReadOnly) {
    this.defaultReadOnly = defaultReadOnly;
    return this;
  }

  /**
   * Get defaultReadOnly
   * @return defaultReadOnly
   */
  @Valid 
  @Schema(name = "defaultReadOnly", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultReadOnly")
  public @Nullable ConfigNodePropertyDropDown getDefaultReadOnly() {
    return defaultReadOnly;
  }

  @JsonProperty("defaultReadOnly")
  public void setDefaultReadOnly(@Nullable ConfigNodePropertyDropDown defaultReadOnly) {
    this.defaultReadOnly = defaultReadOnly;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultTransactionIsolation(@Nullable ConfigNodePropertyDropDown defaultTransactionIsolation) {
    this.defaultTransactionIsolation = defaultTransactionIsolation;
    return this;
  }

  /**
   * Get defaultTransactionIsolation
   * @return defaultTransactionIsolation
   */
  @Valid 
  @Schema(name = "defaultTransactionIsolation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultTransactionIsolation")
  public @Nullable ConfigNodePropertyDropDown getDefaultTransactionIsolation() {
    return defaultTransactionIsolation;
  }

  @JsonProperty("defaultTransactionIsolation")
  public void setDefaultTransactionIsolation(@Nullable ConfigNodePropertyDropDown defaultTransactionIsolation) {
    this.defaultTransactionIsolation = defaultTransactionIsolation;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties defaultCatalog(@Nullable ConfigNodePropertyString defaultCatalog) {
    this.defaultCatalog = defaultCatalog;
    return this;
  }

  /**
   * Get defaultCatalog
   * @return defaultCatalog
   */
  @Valid 
  @Schema(name = "defaultCatalog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultCatalog")
  public @Nullable ConfigNodePropertyString getDefaultCatalog() {
    return defaultCatalog;
  }

  @JsonProperty("defaultCatalog")
  public void setDefaultCatalog(@Nullable ConfigNodePropertyString defaultCatalog) {
    this.defaultCatalog = defaultCatalog;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxActive(@Nullable ConfigNodePropertyInteger maxActive) {
    this.maxActive = maxActive;
    return this;
  }

  /**
   * Get maxActive
   * @return maxActive
   */
  @Valid 
  @Schema(name = "maxActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxActive")
  public @Nullable ConfigNodePropertyInteger getMaxActive() {
    return maxActive;
  }

  @JsonProperty("maxActive")
  public void setMaxActive(@Nullable ConfigNodePropertyInteger maxActive) {
    this.maxActive = maxActive;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxIdle(@Nullable ConfigNodePropertyInteger maxIdle) {
    this.maxIdle = maxIdle;
    return this;
  }

  /**
   * Get maxIdle
   * @return maxIdle
   */
  @Valid 
  @Schema(name = "maxIdle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxIdle")
  public @Nullable ConfigNodePropertyInteger getMaxIdle() {
    return maxIdle;
  }

  @JsonProperty("maxIdle")
  public void setMaxIdle(@Nullable ConfigNodePropertyInteger maxIdle) {
    this.maxIdle = maxIdle;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties minIdle(@Nullable ConfigNodePropertyInteger minIdle) {
    this.minIdle = minIdle;
    return this;
  }

  /**
   * Get minIdle
   * @return minIdle
   */
  @Valid 
  @Schema(name = "minIdle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minIdle")
  public @Nullable ConfigNodePropertyInteger getMinIdle() {
    return minIdle;
  }

  @JsonProperty("minIdle")
  public void setMinIdle(@Nullable ConfigNodePropertyInteger minIdle) {
    this.minIdle = minIdle;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties initialSize(@Nullable ConfigNodePropertyInteger initialSize) {
    this.initialSize = initialSize;
    return this;
  }

  /**
   * Get initialSize
   * @return initialSize
   */
  @Valid 
  @Schema(name = "initialSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("initialSize")
  public @Nullable ConfigNodePropertyInteger getInitialSize() {
    return initialSize;
  }

  @JsonProperty("initialSize")
  public void setInitialSize(@Nullable ConfigNodePropertyInteger initialSize) {
    this.initialSize = initialSize;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxWait(@Nullable ConfigNodePropertyInteger maxWait) {
    this.maxWait = maxWait;
    return this;
  }

  /**
   * Get maxWait
   * @return maxWait
   */
  @Valid 
  @Schema(name = "maxWait", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxWait")
  public @Nullable ConfigNodePropertyInteger getMaxWait() {
    return maxWait;
  }

  @JsonProperty("maxWait")
  public void setMaxWait(@Nullable ConfigNodePropertyInteger maxWait) {
    this.maxWait = maxWait;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties maxAge(@Nullable ConfigNodePropertyInteger maxAge) {
    this.maxAge = maxAge;
    return this;
  }

  /**
   * Get maxAge
   * @return maxAge
   */
  @Valid 
  @Schema(name = "maxAge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxAge")
  public @Nullable ConfigNodePropertyInteger getMaxAge() {
    return maxAge;
  }

  @JsonProperty("maxAge")
  public void setMaxAge(@Nullable ConfigNodePropertyInteger maxAge) {
    this.maxAge = maxAge;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties testOnBorrow(@Nullable ConfigNodePropertyBoolean testOnBorrow) {
    this.testOnBorrow = testOnBorrow;
    return this;
  }

  /**
   * Get testOnBorrow
   * @return testOnBorrow
   */
  @Valid 
  @Schema(name = "testOnBorrow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testOnBorrow")
  public @Nullable ConfigNodePropertyBoolean getTestOnBorrow() {
    return testOnBorrow;
  }

  @JsonProperty("testOnBorrow")
  public void setTestOnBorrow(@Nullable ConfigNodePropertyBoolean testOnBorrow) {
    this.testOnBorrow = testOnBorrow;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties testOnReturn(@Nullable ConfigNodePropertyBoolean testOnReturn) {
    this.testOnReturn = testOnReturn;
    return this;
  }

  /**
   * Get testOnReturn
   * @return testOnReturn
   */
  @Valid 
  @Schema(name = "testOnReturn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testOnReturn")
  public @Nullable ConfigNodePropertyBoolean getTestOnReturn() {
    return testOnReturn;
  }

  @JsonProperty("testOnReturn")
  public void setTestOnReturn(@Nullable ConfigNodePropertyBoolean testOnReturn) {
    this.testOnReturn = testOnReturn;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties testWhileIdle(@Nullable ConfigNodePropertyBoolean testWhileIdle) {
    this.testWhileIdle = testWhileIdle;
    return this;
  }

  /**
   * Get testWhileIdle
   * @return testWhileIdle
   */
  @Valid 
  @Schema(name = "testWhileIdle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testWhileIdle")
  public @Nullable ConfigNodePropertyBoolean getTestWhileIdle() {
    return testWhileIdle;
  }

  @JsonProperty("testWhileIdle")
  public void setTestWhileIdle(@Nullable ConfigNodePropertyBoolean testWhileIdle) {
    this.testWhileIdle = testWhileIdle;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties validationQuery(@Nullable ConfigNodePropertyString validationQuery) {
    this.validationQuery = validationQuery;
    return this;
  }

  /**
   * Get validationQuery
   * @return validationQuery
   */
  @Valid 
  @Schema(name = "validationQuery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validationQuery")
  public @Nullable ConfigNodePropertyString getValidationQuery() {
    return validationQuery;
  }

  @JsonProperty("validationQuery")
  public void setValidationQuery(@Nullable ConfigNodePropertyString validationQuery) {
    this.validationQuery = validationQuery;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties validationQueryTimeout(@Nullable ConfigNodePropertyInteger validationQueryTimeout) {
    this.validationQueryTimeout = validationQueryTimeout;
    return this;
  }

  /**
   * Get validationQueryTimeout
   * @return validationQueryTimeout
   */
  @Valid 
  @Schema(name = "validationQueryTimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validationQueryTimeout")
  public @Nullable ConfigNodePropertyInteger getValidationQueryTimeout() {
    return validationQueryTimeout;
  }

  @JsonProperty("validationQueryTimeout")
  public void setValidationQueryTimeout(@Nullable ConfigNodePropertyInteger validationQueryTimeout) {
    this.validationQueryTimeout = validationQueryTimeout;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties timeBetweenEvictionRunsMillis(@Nullable ConfigNodePropertyInteger timeBetweenEvictionRunsMillis) {
    this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    return this;
  }

  /**
   * Get timeBetweenEvictionRunsMillis
   * @return timeBetweenEvictionRunsMillis
   */
  @Valid 
  @Schema(name = "timeBetweenEvictionRunsMillis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeBetweenEvictionRunsMillis")
  public @Nullable ConfigNodePropertyInteger getTimeBetweenEvictionRunsMillis() {
    return timeBetweenEvictionRunsMillis;
  }

  @JsonProperty("timeBetweenEvictionRunsMillis")
  public void setTimeBetweenEvictionRunsMillis(@Nullable ConfigNodePropertyInteger timeBetweenEvictionRunsMillis) {
    this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties minEvictableIdleTimeMillis(@Nullable ConfigNodePropertyInteger minEvictableIdleTimeMillis) {
    this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    return this;
  }

  /**
   * Get minEvictableIdleTimeMillis
   * @return minEvictableIdleTimeMillis
   */
  @Valid 
  @Schema(name = "minEvictableIdleTimeMillis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minEvictableIdleTimeMillis")
  public @Nullable ConfigNodePropertyInteger getMinEvictableIdleTimeMillis() {
    return minEvictableIdleTimeMillis;
  }

  @JsonProperty("minEvictableIdleTimeMillis")
  public void setMinEvictableIdleTimeMillis(@Nullable ConfigNodePropertyInteger minEvictableIdleTimeMillis) {
    this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties connectionProperties(@Nullable ConfigNodePropertyString connectionProperties) {
    this.connectionProperties = connectionProperties;
    return this;
  }

  /**
   * Get connectionProperties
   * @return connectionProperties
   */
  @Valid 
  @Schema(name = "connectionProperties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionProperties")
  public @Nullable ConfigNodePropertyString getConnectionProperties() {
    return connectionProperties;
  }

  @JsonProperty("connectionProperties")
  public void setConnectionProperties(@Nullable ConfigNodePropertyString connectionProperties) {
    this.connectionProperties = connectionProperties;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties initSQL(@Nullable ConfigNodePropertyString initSQL) {
    this.initSQL = initSQL;
    return this;
  }

  /**
   * Get initSQL
   * @return initSQL
   */
  @Valid 
  @Schema(name = "initSQL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("initSQL")
  public @Nullable ConfigNodePropertyString getInitSQL() {
    return initSQL;
  }

  @JsonProperty("initSQL")
  public void setInitSQL(@Nullable ConfigNodePropertyString initSQL) {
    this.initSQL = initSQL;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties jdbcInterceptors(@Nullable ConfigNodePropertyString jdbcInterceptors) {
    this.jdbcInterceptors = jdbcInterceptors;
    return this;
  }

  /**
   * Get jdbcInterceptors
   * @return jdbcInterceptors
   */
  @Valid 
  @Schema(name = "jdbcInterceptors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jdbcInterceptors")
  public @Nullable ConfigNodePropertyString getJdbcInterceptors() {
    return jdbcInterceptors;
  }

  @JsonProperty("jdbcInterceptors")
  public void setJdbcInterceptors(@Nullable ConfigNodePropertyString jdbcInterceptors) {
    this.jdbcInterceptors = jdbcInterceptors;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties validationInterval(@Nullable ConfigNodePropertyInteger validationInterval) {
    this.validationInterval = validationInterval;
    return this;
  }

  /**
   * Get validationInterval
   * @return validationInterval
   */
  @Valid 
  @Schema(name = "validationInterval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validationInterval")
  public @Nullable ConfigNodePropertyInteger getValidationInterval() {
    return validationInterval;
  }

  @JsonProperty("validationInterval")
  public void setValidationInterval(@Nullable ConfigNodePropertyInteger validationInterval) {
    this.validationInterval = validationInterval;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties logValidationErrors(@Nullable ConfigNodePropertyBoolean logValidationErrors) {
    this.logValidationErrors = logValidationErrors;
    return this;
  }

  /**
   * Get logValidationErrors
   * @return logValidationErrors
   */
  @Valid 
  @Schema(name = "logValidationErrors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logValidationErrors")
  public @Nullable ConfigNodePropertyBoolean getLogValidationErrors() {
    return logValidationErrors;
  }

  @JsonProperty("logValidationErrors")
  public void setLogValidationErrors(@Nullable ConfigNodePropertyBoolean logValidationErrors) {
    this.logValidationErrors = logValidationErrors;
  }

  public OrgApacheSlingDatasourceDataSourceFactoryProperties datasourceSvcProperties(@Nullable ConfigNodePropertyArray datasourceSvcProperties) {
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
  public @Nullable ConfigNodePropertyArray getDatasourceSvcProperties() {
    return datasourceSvcProperties;
  }

  @JsonProperty("datasource.svc.properties")
  public void setDatasourceSvcProperties(@Nullable ConfigNodePropertyArray datasourceSvcProperties) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

