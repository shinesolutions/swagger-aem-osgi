package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties   {

    private ConfigNodePropertyString jdbcDriverClass;
    private ConfigNodePropertyString jdbcConnectionUri;
    private ConfigNodePropertyString jdbcUsername;
    private ConfigNodePropertyString jdbcPassword;
    private ConfigNodePropertyString jdbcValidationQuery;
    private ConfigNodePropertyBoolean defaultReadonly;
    private ConfigNodePropertyBoolean defaultAutocommit;
    private ConfigNodePropertyInteger poolSize;
    private ConfigNodePropertyInteger poolMaxWaitMsec;
    private ConfigNodePropertyString datasourceName;
    private ConfigNodePropertyArray datasourceSvcProperties;

    /**
     * Default constructor.
     */
    public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.
     *
     * @param jdbcDriverClass jdbcDriverClass
     * @param jdbcConnectionUri jdbcConnectionUri
     * @param jdbcUsername jdbcUsername
     * @param jdbcPassword jdbcPassword
     * @param jdbcValidationQuery jdbcValidationQuery
     * @param defaultReadonly defaultReadonly
     * @param defaultAutocommit defaultAutocommit
     * @param poolSize poolSize
     * @param poolMaxWaitMsec poolMaxWaitMsec
     * @param datasourceName datasourceName
     * @param datasourceSvcProperties datasourceSvcProperties
     */
    public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties(
        ConfigNodePropertyString jdbcDriverClass, 
        ConfigNodePropertyString jdbcConnectionUri, 
        ConfigNodePropertyString jdbcUsername, 
        ConfigNodePropertyString jdbcPassword, 
        ConfigNodePropertyString jdbcValidationQuery, 
        ConfigNodePropertyBoolean defaultReadonly, 
        ConfigNodePropertyBoolean defaultAutocommit, 
        ConfigNodePropertyInteger poolSize, 
        ConfigNodePropertyInteger poolMaxWaitMsec, 
        ConfigNodePropertyString datasourceName, 
        ConfigNodePropertyArray datasourceSvcProperties
    ) {
        this.jdbcDriverClass = jdbcDriverClass;
        this.jdbcConnectionUri = jdbcConnectionUri;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
        this.jdbcValidationQuery = jdbcValidationQuery;
        this.defaultReadonly = defaultReadonly;
        this.defaultAutocommit = defaultAutocommit;
        this.poolSize = poolSize;
        this.poolMaxWaitMsec = poolMaxWaitMsec;
        this.datasourceName = datasourceName;
        this.datasourceSvcProperties = datasourceSvcProperties;
    }



    /**
     * Get jdbcDriverClass
     * @return jdbcDriverClass
     */
    public ConfigNodePropertyString getJdbcDriverClass() {
        return jdbcDriverClass;
    }

    public void setJdbcDriverClass(ConfigNodePropertyString jdbcDriverClass) {
        this.jdbcDriverClass = jdbcDriverClass;
    }

    /**
     * Get jdbcConnectionUri
     * @return jdbcConnectionUri
     */
    public ConfigNodePropertyString getJdbcConnectionUri() {
        return jdbcConnectionUri;
    }

    public void setJdbcConnectionUri(ConfigNodePropertyString jdbcConnectionUri) {
        this.jdbcConnectionUri = jdbcConnectionUri;
    }

    /**
     * Get jdbcUsername
     * @return jdbcUsername
     */
    public ConfigNodePropertyString getJdbcUsername() {
        return jdbcUsername;
    }

    public void setJdbcUsername(ConfigNodePropertyString jdbcUsername) {
        this.jdbcUsername = jdbcUsername;
    }

    /**
     * Get jdbcPassword
     * @return jdbcPassword
     */
    public ConfigNodePropertyString getJdbcPassword() {
        return jdbcPassword;
    }

    public void setJdbcPassword(ConfigNodePropertyString jdbcPassword) {
        this.jdbcPassword = jdbcPassword;
    }

    /**
     * Get jdbcValidationQuery
     * @return jdbcValidationQuery
     */
    public ConfigNodePropertyString getJdbcValidationQuery() {
        return jdbcValidationQuery;
    }

    public void setJdbcValidationQuery(ConfigNodePropertyString jdbcValidationQuery) {
        this.jdbcValidationQuery = jdbcValidationQuery;
    }

    /**
     * Get defaultReadonly
     * @return defaultReadonly
     */
    public ConfigNodePropertyBoolean getDefaultReadonly() {
        return defaultReadonly;
    }

    public void setDefaultReadonly(ConfigNodePropertyBoolean defaultReadonly) {
        this.defaultReadonly = defaultReadonly;
    }

    /**
     * Get defaultAutocommit
     * @return defaultAutocommit
     */
    public ConfigNodePropertyBoolean getDefaultAutocommit() {
        return defaultAutocommit;
    }

    public void setDefaultAutocommit(ConfigNodePropertyBoolean defaultAutocommit) {
        this.defaultAutocommit = defaultAutocommit;
    }

    /**
     * Get poolSize
     * @return poolSize
     */
    public ConfigNodePropertyInteger getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(ConfigNodePropertyInteger poolSize) {
        this.poolSize = poolSize;
    }

    /**
     * Get poolMaxWaitMsec
     * @return poolMaxWaitMsec
     */
    public ConfigNodePropertyInteger getPoolMaxWaitMsec() {
        return poolMaxWaitMsec;
    }

    public void setPoolMaxWaitMsec(ConfigNodePropertyInteger poolMaxWaitMsec) {
        this.poolMaxWaitMsec = poolMaxWaitMsec;
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

