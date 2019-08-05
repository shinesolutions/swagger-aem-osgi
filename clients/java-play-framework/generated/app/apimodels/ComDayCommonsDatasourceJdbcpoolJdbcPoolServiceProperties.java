package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties   {
  @JsonProperty("jdbc.driver.class")
  private ConfigNodePropertyString jdbcDriverClass = null;

  @JsonProperty("jdbc.connection.uri")
  private ConfigNodePropertyString jdbcConnectionUri = null;

  @JsonProperty("jdbc.username")
  private ConfigNodePropertyString jdbcUsername = null;

  @JsonProperty("jdbc.password")
  private ConfigNodePropertyString jdbcPassword = null;

  @JsonProperty("jdbc.validation.query")
  private ConfigNodePropertyString jdbcValidationQuery = null;

  @JsonProperty("default.readonly")
  private ConfigNodePropertyBoolean defaultReadonly = null;

  @JsonProperty("default.autocommit")
  private ConfigNodePropertyBoolean defaultAutocommit = null;

  @JsonProperty("pool.size")
  private ConfigNodePropertyInteger poolSize = null;

  @JsonProperty("pool.max.wait.msec")
  private ConfigNodePropertyInteger poolMaxWaitMsec = null;

  @JsonProperty("datasource.name")
  private ConfigNodePropertyString datasourceName = null;

  @JsonProperty("datasource.svc.properties")
  private ConfigNodePropertyArray datasourceSvcProperties = null;

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcDriverClass(ConfigNodePropertyString jdbcDriverClass) {
    this.jdbcDriverClass = jdbcDriverClass;
    return this;
  }

   /**
   * Get jdbcDriverClass
   * @return jdbcDriverClass
  **/
  @Valid
  public ConfigNodePropertyString getJdbcDriverClass() {
    return jdbcDriverClass;
  }

  public void setJdbcDriverClass(ConfigNodePropertyString jdbcDriverClass) {
    this.jdbcDriverClass = jdbcDriverClass;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcConnectionUri(ConfigNodePropertyString jdbcConnectionUri) {
    this.jdbcConnectionUri = jdbcConnectionUri;
    return this;
  }

   /**
   * Get jdbcConnectionUri
   * @return jdbcConnectionUri
  **/
  @Valid
  public ConfigNodePropertyString getJdbcConnectionUri() {
    return jdbcConnectionUri;
  }

  public void setJdbcConnectionUri(ConfigNodePropertyString jdbcConnectionUri) {
    this.jdbcConnectionUri = jdbcConnectionUri;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcUsername(ConfigNodePropertyString jdbcUsername) {
    this.jdbcUsername = jdbcUsername;
    return this;
  }

   /**
   * Get jdbcUsername
   * @return jdbcUsername
  **/
  @Valid
  public ConfigNodePropertyString getJdbcUsername() {
    return jdbcUsername;
  }

  public void setJdbcUsername(ConfigNodePropertyString jdbcUsername) {
    this.jdbcUsername = jdbcUsername;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcPassword(ConfigNodePropertyString jdbcPassword) {
    this.jdbcPassword = jdbcPassword;
    return this;
  }

   /**
   * Get jdbcPassword
   * @return jdbcPassword
  **/
  @Valid
  public ConfigNodePropertyString getJdbcPassword() {
    return jdbcPassword;
  }

  public void setJdbcPassword(ConfigNodePropertyString jdbcPassword) {
    this.jdbcPassword = jdbcPassword;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties jdbcValidationQuery(ConfigNodePropertyString jdbcValidationQuery) {
    this.jdbcValidationQuery = jdbcValidationQuery;
    return this;
  }

   /**
   * Get jdbcValidationQuery
   * @return jdbcValidationQuery
  **/
  @Valid
  public ConfigNodePropertyString getJdbcValidationQuery() {
    return jdbcValidationQuery;
  }

  public void setJdbcValidationQuery(ConfigNodePropertyString jdbcValidationQuery) {
    this.jdbcValidationQuery = jdbcValidationQuery;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties defaultReadonly(ConfigNodePropertyBoolean defaultReadonly) {
    this.defaultReadonly = defaultReadonly;
    return this;
  }

   /**
   * Get defaultReadonly
   * @return defaultReadonly
  **/
  @Valid
  public ConfigNodePropertyBoolean getDefaultReadonly() {
    return defaultReadonly;
  }

  public void setDefaultReadonly(ConfigNodePropertyBoolean defaultReadonly) {
    this.defaultReadonly = defaultReadonly;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties defaultAutocommit(ConfigNodePropertyBoolean defaultAutocommit) {
    this.defaultAutocommit = defaultAutocommit;
    return this;
  }

   /**
   * Get defaultAutocommit
   * @return defaultAutocommit
  **/
  @Valid
  public ConfigNodePropertyBoolean getDefaultAutocommit() {
    return defaultAutocommit;
  }

  public void setDefaultAutocommit(ConfigNodePropertyBoolean defaultAutocommit) {
    this.defaultAutocommit = defaultAutocommit;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties poolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
    return this;
  }

   /**
   * Get poolSize
   * @return poolSize
  **/
  @Valid
  public ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }

  public void setPoolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties poolMaxWaitMsec(ConfigNodePropertyInteger poolMaxWaitMsec) {
    this.poolMaxWaitMsec = poolMaxWaitMsec;
    return this;
  }

   /**
   * Get poolMaxWaitMsec
   * @return poolMaxWaitMsec
  **/
  @Valid
  public ConfigNodePropertyInteger getPoolMaxWaitMsec() {
    return poolMaxWaitMsec;
  }

  public void setPoolMaxWaitMsec(ConfigNodePropertyInteger poolMaxWaitMsec) {
    this.poolMaxWaitMsec = poolMaxWaitMsec;
  }

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties datasourceName(ConfigNodePropertyString datasourceName) {
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

  public ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties datasourceSvcProperties(ConfigNodePropertyArray datasourceSvcProperties) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

