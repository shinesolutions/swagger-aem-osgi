package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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
     * Default constructor.
     */
    public OrgApacheSlingDatasourceDataSourceFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDatasourceDataSourceFactoryProperties.
     *
     * @param datasourceName datasourceName
     * @param datasourceSvcPropName datasourceSvcPropName
     * @param driverClassName driverClassName
     * @param url url
     * @param username username
     * @param password password
     * @param defaultAutoCommit defaultAutoCommit
     * @param defaultReadOnly defaultReadOnly
     * @param defaultTransactionIsolation defaultTransactionIsolation
     * @param defaultCatalog defaultCatalog
     * @param maxActive maxActive
     * @param maxIdle maxIdle
     * @param minIdle minIdle
     * @param initialSize initialSize
     * @param maxWait maxWait
     * @param maxAge maxAge
     * @param testOnBorrow testOnBorrow
     * @param testOnReturn testOnReturn
     * @param testWhileIdle testWhileIdle
     * @param validationQuery validationQuery
     * @param validationQueryTimeout validationQueryTimeout
     * @param timeBetweenEvictionRunsMillis timeBetweenEvictionRunsMillis
     * @param minEvictableIdleTimeMillis minEvictableIdleTimeMillis
     * @param connectionProperties connectionProperties
     * @param initSQL initSQL
     * @param jdbcInterceptors jdbcInterceptors
     * @param validationInterval validationInterval
     * @param logValidationErrors logValidationErrors
     * @param datasourceSvcProperties datasourceSvcProperties
     */
    public OrgApacheSlingDatasourceDataSourceFactoryProperties(
        ConfigNodePropertyString datasourceName, 
        ConfigNodePropertyString datasourceSvcPropName, 
        ConfigNodePropertyString driverClassName, 
        ConfigNodePropertyString url, 
        ConfigNodePropertyString username, 
        ConfigNodePropertyString password, 
        ConfigNodePropertyDropDown defaultAutoCommit, 
        ConfigNodePropertyDropDown defaultReadOnly, 
        ConfigNodePropertyDropDown defaultTransactionIsolation, 
        ConfigNodePropertyString defaultCatalog, 
        ConfigNodePropertyInteger maxActive, 
        ConfigNodePropertyInteger maxIdle, 
        ConfigNodePropertyInteger minIdle, 
        ConfigNodePropertyInteger initialSize, 
        ConfigNodePropertyInteger maxWait, 
        ConfigNodePropertyInteger maxAge, 
        ConfigNodePropertyBoolean testOnBorrow, 
        ConfigNodePropertyBoolean testOnReturn, 
        ConfigNodePropertyBoolean testWhileIdle, 
        ConfigNodePropertyString validationQuery, 
        ConfigNodePropertyInteger validationQueryTimeout, 
        ConfigNodePropertyInteger timeBetweenEvictionRunsMillis, 
        ConfigNodePropertyInteger minEvictableIdleTimeMillis, 
        ConfigNodePropertyString connectionProperties, 
        ConfigNodePropertyString initSQL, 
        ConfigNodePropertyString jdbcInterceptors, 
        ConfigNodePropertyInteger validationInterval, 
        ConfigNodePropertyBoolean logValidationErrors, 
        ConfigNodePropertyArray datasourceSvcProperties
    ) {
        this.datasourceName = datasourceName;
        this.datasourceSvcPropName = datasourceSvcPropName;
        this.driverClassName = driverClassName;
        this.url = url;
        this.username = username;
        this.password = password;
        this.defaultAutoCommit = defaultAutoCommit;
        this.defaultReadOnly = defaultReadOnly;
        this.defaultTransactionIsolation = defaultTransactionIsolation;
        this.defaultCatalog = defaultCatalog;
        this.maxActive = maxActive;
        this.maxIdle = maxIdle;
        this.minIdle = minIdle;
        this.initialSize = initialSize;
        this.maxWait = maxWait;
        this.maxAge = maxAge;
        this.testOnBorrow = testOnBorrow;
        this.testOnReturn = testOnReturn;
        this.testWhileIdle = testWhileIdle;
        this.validationQuery = validationQuery;
        this.validationQueryTimeout = validationQueryTimeout;
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
        this.connectionProperties = connectionProperties;
        this.initSQL = initSQL;
        this.jdbcInterceptors = jdbcInterceptors;
        this.validationInterval = validationInterval;
        this.logValidationErrors = logValidationErrors;
        this.datasourceSvcProperties = datasourceSvcProperties;
    }



    /**
     * Get datasourceName
     * @return datasourceName
     */
    public ConfigNodePropertyString getDatasourceName() {
        return datasourceName;
    }

    public void setDatasourceName(ConfigNodePropertyString datasourceName) {
        this.datasourceName = datasourceName;
    }

    /**
     * Get datasourceSvcPropName
     * @return datasourceSvcPropName
     */
    public ConfigNodePropertyString getDatasourceSvcPropName() {
        return datasourceSvcPropName;
    }

    public void setDatasourceSvcPropName(ConfigNodePropertyString datasourceSvcPropName) {
        this.datasourceSvcPropName = datasourceSvcPropName;
    }

    /**
     * Get driverClassName
     * @return driverClassName
     */
    public ConfigNodePropertyString getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(ConfigNodePropertyString driverClassName) {
        this.driverClassName = driverClassName;
    }

    /**
     * Get url
     * @return url
     */
    public ConfigNodePropertyString getUrl() {
        return url;
    }

    public void setUrl(ConfigNodePropertyString url) {
        this.url = url;
    }

    /**
     * Get username
     * @return username
     */
    public ConfigNodePropertyString getUsername() {
        return username;
    }

    public void setUsername(ConfigNodePropertyString username) {
        this.username = username;
    }

    /**
     * Get password
     * @return password
     */
    public ConfigNodePropertyString getPassword() {
        return password;
    }

    public void setPassword(ConfigNodePropertyString password) {
        this.password = password;
    }

    /**
     * Get defaultAutoCommit
     * @return defaultAutoCommit
     */
    public ConfigNodePropertyDropDown getDefaultAutoCommit() {
        return defaultAutoCommit;
    }

    public void setDefaultAutoCommit(ConfigNodePropertyDropDown defaultAutoCommit) {
        this.defaultAutoCommit = defaultAutoCommit;
    }

    /**
     * Get defaultReadOnly
     * @return defaultReadOnly
     */
    public ConfigNodePropertyDropDown getDefaultReadOnly() {
        return defaultReadOnly;
    }

    public void setDefaultReadOnly(ConfigNodePropertyDropDown defaultReadOnly) {
        this.defaultReadOnly = defaultReadOnly;
    }

    /**
     * Get defaultTransactionIsolation
     * @return defaultTransactionIsolation
     */
    public ConfigNodePropertyDropDown getDefaultTransactionIsolation() {
        return defaultTransactionIsolation;
    }

    public void setDefaultTransactionIsolation(ConfigNodePropertyDropDown defaultTransactionIsolation) {
        this.defaultTransactionIsolation = defaultTransactionIsolation;
    }

    /**
     * Get defaultCatalog
     * @return defaultCatalog
     */
    public ConfigNodePropertyString getDefaultCatalog() {
        return defaultCatalog;
    }

    public void setDefaultCatalog(ConfigNodePropertyString defaultCatalog) {
        this.defaultCatalog = defaultCatalog;
    }

    /**
     * Get maxActive
     * @return maxActive
     */
    public ConfigNodePropertyInteger getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(ConfigNodePropertyInteger maxActive) {
        this.maxActive = maxActive;
    }

    /**
     * Get maxIdle
     * @return maxIdle
     */
    public ConfigNodePropertyInteger getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(ConfigNodePropertyInteger maxIdle) {
        this.maxIdle = maxIdle;
    }

    /**
     * Get minIdle
     * @return minIdle
     */
    public ConfigNodePropertyInteger getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(ConfigNodePropertyInteger minIdle) {
        this.minIdle = minIdle;
    }

    /**
     * Get initialSize
     * @return initialSize
     */
    public ConfigNodePropertyInteger getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(ConfigNodePropertyInteger initialSize) {
        this.initialSize = initialSize;
    }

    /**
     * Get maxWait
     * @return maxWait
     */
    public ConfigNodePropertyInteger getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(ConfigNodePropertyInteger maxWait) {
        this.maxWait = maxWait;
    }

    /**
     * Get maxAge
     * @return maxAge
     */
    public ConfigNodePropertyInteger getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(ConfigNodePropertyInteger maxAge) {
        this.maxAge = maxAge;
    }

    /**
     * Get testOnBorrow
     * @return testOnBorrow
     */
    public ConfigNodePropertyBoolean getTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(ConfigNodePropertyBoolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    /**
     * Get testOnReturn
     * @return testOnReturn
     */
    public ConfigNodePropertyBoolean getTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(ConfigNodePropertyBoolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    /**
     * Get testWhileIdle
     * @return testWhileIdle
     */
    public ConfigNodePropertyBoolean getTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(ConfigNodePropertyBoolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    /**
     * Get validationQuery
     * @return validationQuery
     */
    public ConfigNodePropertyString getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(ConfigNodePropertyString validationQuery) {
        this.validationQuery = validationQuery;
    }

    /**
     * Get validationQueryTimeout
     * @return validationQueryTimeout
     */
    public ConfigNodePropertyInteger getValidationQueryTimeout() {
        return validationQueryTimeout;
    }

    public void setValidationQueryTimeout(ConfigNodePropertyInteger validationQueryTimeout) {
        this.validationQueryTimeout = validationQueryTimeout;
    }

    /**
     * Get timeBetweenEvictionRunsMillis
     * @return timeBetweenEvictionRunsMillis
     */
    public ConfigNodePropertyInteger getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public void setTimeBetweenEvictionRunsMillis(ConfigNodePropertyInteger timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    /**
     * Get minEvictableIdleTimeMillis
     * @return minEvictableIdleTimeMillis
     */
    public ConfigNodePropertyInteger getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    public void setMinEvictableIdleTimeMillis(ConfigNodePropertyInteger minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    /**
     * Get connectionProperties
     * @return connectionProperties
     */
    public ConfigNodePropertyString getConnectionProperties() {
        return connectionProperties;
    }

    public void setConnectionProperties(ConfigNodePropertyString connectionProperties) {
        this.connectionProperties = connectionProperties;
    }

    /**
     * Get initSQL
     * @return initSQL
     */
    public ConfigNodePropertyString getInitSQL() {
        return initSQL;
    }

    public void setInitSQL(ConfigNodePropertyString initSQL) {
        this.initSQL = initSQL;
    }

    /**
     * Get jdbcInterceptors
     * @return jdbcInterceptors
     */
    public ConfigNodePropertyString getJdbcInterceptors() {
        return jdbcInterceptors;
    }

    public void setJdbcInterceptors(ConfigNodePropertyString jdbcInterceptors) {
        this.jdbcInterceptors = jdbcInterceptors;
    }

    /**
     * Get validationInterval
     * @return validationInterval
     */
    public ConfigNodePropertyInteger getValidationInterval() {
        return validationInterval;
    }

    public void setValidationInterval(ConfigNodePropertyInteger validationInterval) {
        this.validationInterval = validationInterval;
    }

    /**
     * Get logValidationErrors
     * @return logValidationErrors
     */
    public ConfigNodePropertyBoolean getLogValidationErrors() {
        return logValidationErrors;
    }

    public void setLogValidationErrors(ConfigNodePropertyBoolean logValidationErrors) {
        this.logValidationErrors = logValidationErrors;
    }

    /**
     * Get datasourceSvcProperties
     * @return datasourceSvcProperties
     */
    public ConfigNodePropertyArray getDatasourceSvcProperties() {
        return datasourceSvcProperties;
    }

    public void setDatasourceSvcProperties(ConfigNodePropertyArray datasourceSvcProperties) {
        this.datasourceSvcProperties = datasourceSvcProperties;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

