package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties   {
  
  private ConfigNodePropertyString jdbcDriverClass = null;
  private ConfigNodePropertyString jdbcConnectionUri = null;
  private ConfigNodePropertyString jdbcUsername = null;
  private ConfigNodePropertyString jdbcPassword = null;
  private ConfigNodePropertyString jdbcValidationQuery = null;
  private ConfigNodePropertyBoolean defaultReadonly = null;
  private ConfigNodePropertyBoolean defaultAutocommit = null;
  private ConfigNodePropertyInteger poolSize = null;
  private ConfigNodePropertyInteger poolMaxWaitMsec = null;
  private ConfigNodePropertyString datasourceName = null;
  private ConfigNodePropertyArray datasourceSvcProperties = null;

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties () {

  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties (ConfigNodePropertyString jdbcDriverClass, ConfigNodePropertyString jdbcConnectionUri, ConfigNodePropertyString jdbcUsername, ConfigNodePropertyString jdbcPassword, ConfigNodePropertyString jdbcValidationQuery, ConfigNodePropertyBoolean defaultReadonly, ConfigNodePropertyBoolean defaultAutocommit, ConfigNodePropertyInteger poolSize, ConfigNodePropertyInteger poolMaxWaitMsec, ConfigNodePropertyString datasourceName, ConfigNodePropertyArray datasourceSvcProperties) {
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

    
  @JsonProperty("jdbc.driver.class")
  public ConfigNodePropertyString getJdbcDriverClass() {
    return jdbcDriverClass;
  }
  public void setJdbcDriverClass(ConfigNodePropertyString jdbcDriverClass) {
    this.jdbcDriverClass = jdbcDriverClass;
  }

    
  @JsonProperty("jdbc.connection.uri")
  public ConfigNodePropertyString getJdbcConnectionUri() {
    return jdbcConnectionUri;
  }
  public void setJdbcConnectionUri(ConfigNodePropertyString jdbcConnectionUri) {
    this.jdbcConnectionUri = jdbcConnectionUri;
  }

    
  @JsonProperty("jdbc.username")
  public ConfigNodePropertyString getJdbcUsername() {
    return jdbcUsername;
  }
  public void setJdbcUsername(ConfigNodePropertyString jdbcUsername) {
    this.jdbcUsername = jdbcUsername;
  }

    
  @JsonProperty("jdbc.password")
  public ConfigNodePropertyString getJdbcPassword() {
    return jdbcPassword;
  }
  public void setJdbcPassword(ConfigNodePropertyString jdbcPassword) {
    this.jdbcPassword = jdbcPassword;
  }

    
  @JsonProperty("jdbc.validation.query")
  public ConfigNodePropertyString getJdbcValidationQuery() {
    return jdbcValidationQuery;
  }
  public void setJdbcValidationQuery(ConfigNodePropertyString jdbcValidationQuery) {
    this.jdbcValidationQuery = jdbcValidationQuery;
  }

    
  @JsonProperty("default.readonly")
  public ConfigNodePropertyBoolean getDefaultReadonly() {
    return defaultReadonly;
  }
  public void setDefaultReadonly(ConfigNodePropertyBoolean defaultReadonly) {
    this.defaultReadonly = defaultReadonly;
  }

    
  @JsonProperty("default.autocommit")
  public ConfigNodePropertyBoolean getDefaultAutocommit() {
    return defaultAutocommit;
  }
  public void setDefaultAutocommit(ConfigNodePropertyBoolean defaultAutocommit) {
    this.defaultAutocommit = defaultAutocommit;
  }

    
  @JsonProperty("pool.size")
  public ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }
  public void setPoolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

    
  @JsonProperty("pool.max.wait.msec")
  public ConfigNodePropertyInteger getPoolMaxWaitMsec() {
    return poolMaxWaitMsec;
  }
  public void setPoolMaxWaitMsec(ConfigNodePropertyInteger poolMaxWaitMsec) {
    this.poolMaxWaitMsec = poolMaxWaitMsec;
  }

    
  @JsonProperty("datasource.name")
  public ConfigNodePropertyString getDatasourceName() {
    return datasourceName;
  }
  public void setDatasourceName(ConfigNodePropertyString datasourceName) {
    this.datasourceName = datasourceName;
  }

    
  @JsonProperty("datasource.svc.properties")
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
    ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties = (ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties) o;
    return Objects.equals(jdbcDriverClass, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcDriverClass) &&
        Objects.equals(jdbcConnectionUri, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcConnectionUri) &&
        Objects.equals(jdbcUsername, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcUsername) &&
        Objects.equals(jdbcPassword, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcPassword) &&
        Objects.equals(jdbcValidationQuery, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.jdbcValidationQuery) &&
        Objects.equals(defaultReadonly, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.defaultReadonly) &&
        Objects.equals(defaultAutocommit, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.defaultAutocommit) &&
        Objects.equals(poolSize, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.poolSize) &&
        Objects.equals(poolMaxWaitMsec, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.poolMaxWaitMsec) &&
        Objects.equals(datasourceName, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.datasourceName) &&
        Objects.equals(datasourceSvcProperties, comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.datasourceSvcProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jdbcDriverClass, jdbcConnectionUri, jdbcUsername, jdbcPassword, jdbcValidationQuery, defaultReadonly, defaultAutocommit, poolSize, poolMaxWaitMsec, datasourceName, datasourceSvcProperties);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
