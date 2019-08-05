using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class OrgApacheSlingDatasourceDataSourceFactoryProperties {
    /// <summary>
    /// Gets or Sets DatasourceName
    /// </summary>
    [DataMember(Name="datasource.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "datasource.name")]
    public ConfigNodePropertyString DatasourceName { get; set; }

    /// <summary>
    /// Gets or Sets DatasourceSvcPropName
    /// </summary>
    [DataMember(Name="datasource.svc.prop.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "datasource.svc.prop.name")]
    public ConfigNodePropertyString DatasourceSvcPropName { get; set; }

    /// <summary>
    /// Gets or Sets DriverClassName
    /// </summary>
    [DataMember(Name="driverClassName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driverClassName")]
    public ConfigNodePropertyString DriverClassName { get; set; }

    /// <summary>
    /// Gets or Sets Url
    /// </summary>
    [DataMember(Name="url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "url")]
    public ConfigNodePropertyString Url { get; set; }

    /// <summary>
    /// Gets or Sets Username
    /// </summary>
    [DataMember(Name="username", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "username")]
    public ConfigNodePropertyString Username { get; set; }

    /// <summary>
    /// Gets or Sets Password
    /// </summary>
    [DataMember(Name="password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "password")]
    public ConfigNodePropertyString Password { get; set; }

    /// <summary>
    /// Gets or Sets DefaultAutoCommit
    /// </summary>
    [DataMember(Name="defaultAutoCommit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defaultAutoCommit")]
    public ConfigNodePropertyDropDown DefaultAutoCommit { get; set; }

    /// <summary>
    /// Gets or Sets DefaultReadOnly
    /// </summary>
    [DataMember(Name="defaultReadOnly", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defaultReadOnly")]
    public ConfigNodePropertyDropDown DefaultReadOnly { get; set; }

    /// <summary>
    /// Gets or Sets DefaultTransactionIsolation
    /// </summary>
    [DataMember(Name="defaultTransactionIsolation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defaultTransactionIsolation")]
    public ConfigNodePropertyDropDown DefaultTransactionIsolation { get; set; }

    /// <summary>
    /// Gets or Sets DefaultCatalog
    /// </summary>
    [DataMember(Name="defaultCatalog", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defaultCatalog")]
    public ConfigNodePropertyString DefaultCatalog { get; set; }

    /// <summary>
    /// Gets or Sets MaxActive
    /// </summary>
    [DataMember(Name="maxActive", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxActive")]
    public ConfigNodePropertyInteger MaxActive { get; set; }

    /// <summary>
    /// Gets or Sets MaxIdle
    /// </summary>
    [DataMember(Name="maxIdle", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxIdle")]
    public ConfigNodePropertyInteger MaxIdle { get; set; }

    /// <summary>
    /// Gets or Sets MinIdle
    /// </summary>
    [DataMember(Name="minIdle", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "minIdle")]
    public ConfigNodePropertyInteger MinIdle { get; set; }

    /// <summary>
    /// Gets or Sets InitialSize
    /// </summary>
    [DataMember(Name="initialSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "initialSize")]
    public ConfigNodePropertyInteger InitialSize { get; set; }

    /// <summary>
    /// Gets or Sets MaxWait
    /// </summary>
    [DataMember(Name="maxWait", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxWait")]
    public ConfigNodePropertyInteger MaxWait { get; set; }

    /// <summary>
    /// Gets or Sets MaxAge
    /// </summary>
    [DataMember(Name="maxAge", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxAge")]
    public ConfigNodePropertyInteger MaxAge { get; set; }

    /// <summary>
    /// Gets or Sets TestOnBorrow
    /// </summary>
    [DataMember(Name="testOnBorrow", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "testOnBorrow")]
    public ConfigNodePropertyBoolean TestOnBorrow { get; set; }

    /// <summary>
    /// Gets or Sets TestOnReturn
    /// </summary>
    [DataMember(Name="testOnReturn", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "testOnReturn")]
    public ConfigNodePropertyBoolean TestOnReturn { get; set; }

    /// <summary>
    /// Gets or Sets TestWhileIdle
    /// </summary>
    [DataMember(Name="testWhileIdle", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "testWhileIdle")]
    public ConfigNodePropertyBoolean TestWhileIdle { get; set; }

    /// <summary>
    /// Gets or Sets ValidationQuery
    /// </summary>
    [DataMember(Name="validationQuery", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "validationQuery")]
    public ConfigNodePropertyString ValidationQuery { get; set; }

    /// <summary>
    /// Gets or Sets ValidationQueryTimeout
    /// </summary>
    [DataMember(Name="validationQueryTimeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "validationQueryTimeout")]
    public ConfigNodePropertyInteger ValidationQueryTimeout { get; set; }

    /// <summary>
    /// Gets or Sets TimeBetweenEvictionRunsMillis
    /// </summary>
    [DataMember(Name="timeBetweenEvictionRunsMillis", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timeBetweenEvictionRunsMillis")]
    public ConfigNodePropertyInteger TimeBetweenEvictionRunsMillis { get; set; }

    /// <summary>
    /// Gets or Sets MinEvictableIdleTimeMillis
    /// </summary>
    [DataMember(Name="minEvictableIdleTimeMillis", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "minEvictableIdleTimeMillis")]
    public ConfigNodePropertyInteger MinEvictableIdleTimeMillis { get; set; }

    /// <summary>
    /// Gets or Sets ConnectionProperties
    /// </summary>
    [DataMember(Name="connectionProperties", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "connectionProperties")]
    public ConfigNodePropertyString ConnectionProperties { get; set; }

    /// <summary>
    /// Gets or Sets InitSQL
    /// </summary>
    [DataMember(Name="initSQL", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "initSQL")]
    public ConfigNodePropertyString InitSQL { get; set; }

    /// <summary>
    /// Gets or Sets JdbcInterceptors
    /// </summary>
    [DataMember(Name="jdbcInterceptors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jdbcInterceptors")]
    public ConfigNodePropertyString JdbcInterceptors { get; set; }

    /// <summary>
    /// Gets or Sets ValidationInterval
    /// </summary>
    [DataMember(Name="validationInterval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "validationInterval")]
    public ConfigNodePropertyInteger ValidationInterval { get; set; }

    /// <summary>
    /// Gets or Sets LogValidationErrors
    /// </summary>
    [DataMember(Name="logValidationErrors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "logValidationErrors")]
    public ConfigNodePropertyBoolean LogValidationErrors { get; set; }

    /// <summary>
    /// Gets or Sets DatasourceSvcProperties
    /// </summary>
    [DataMember(Name="datasource.svc.properties", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "datasource.svc.properties")]
    public ConfigNodePropertyArray DatasourceSvcProperties { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingDatasourceDataSourceFactoryProperties {\n");
      sb.Append("  DatasourceName: ").Append(DatasourceName).Append("\n");
      sb.Append("  DatasourceSvcPropName: ").Append(DatasourceSvcPropName).Append("\n");
      sb.Append("  DriverClassName: ").Append(DriverClassName).Append("\n");
      sb.Append("  Url: ").Append(Url).Append("\n");
      sb.Append("  Username: ").Append(Username).Append("\n");
      sb.Append("  Password: ").Append(Password).Append("\n");
      sb.Append("  DefaultAutoCommit: ").Append(DefaultAutoCommit).Append("\n");
      sb.Append("  DefaultReadOnly: ").Append(DefaultReadOnly).Append("\n");
      sb.Append("  DefaultTransactionIsolation: ").Append(DefaultTransactionIsolation).Append("\n");
      sb.Append("  DefaultCatalog: ").Append(DefaultCatalog).Append("\n");
      sb.Append("  MaxActive: ").Append(MaxActive).Append("\n");
      sb.Append("  MaxIdle: ").Append(MaxIdle).Append("\n");
      sb.Append("  MinIdle: ").Append(MinIdle).Append("\n");
      sb.Append("  InitialSize: ").Append(InitialSize).Append("\n");
      sb.Append("  MaxWait: ").Append(MaxWait).Append("\n");
      sb.Append("  MaxAge: ").Append(MaxAge).Append("\n");
      sb.Append("  TestOnBorrow: ").Append(TestOnBorrow).Append("\n");
      sb.Append("  TestOnReturn: ").Append(TestOnReturn).Append("\n");
      sb.Append("  TestWhileIdle: ").Append(TestWhileIdle).Append("\n");
      sb.Append("  ValidationQuery: ").Append(ValidationQuery).Append("\n");
      sb.Append("  ValidationQueryTimeout: ").Append(ValidationQueryTimeout).Append("\n");
      sb.Append("  TimeBetweenEvictionRunsMillis: ").Append(TimeBetweenEvictionRunsMillis).Append("\n");
      sb.Append("  MinEvictableIdleTimeMillis: ").Append(MinEvictableIdleTimeMillis).Append("\n");
      sb.Append("  ConnectionProperties: ").Append(ConnectionProperties).Append("\n");
      sb.Append("  InitSQL: ").Append(InitSQL).Append("\n");
      sb.Append("  JdbcInterceptors: ").Append(JdbcInterceptors).Append("\n");
      sb.Append("  ValidationInterval: ").Append(ValidationInterval).Append("\n");
      sb.Append("  LogValidationErrors: ").Append(LogValidationErrors).Append("\n");
      sb.Append("  DatasourceSvcProperties: ").Append(DatasourceSvcProperties).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
