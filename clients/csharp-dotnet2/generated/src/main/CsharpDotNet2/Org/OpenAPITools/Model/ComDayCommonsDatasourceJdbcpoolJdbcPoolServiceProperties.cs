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
  public class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties {
    /// <summary>
    /// Gets or Sets JdbcDriverClass
    /// </summary>
    [DataMember(Name="jdbc.driver.class", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jdbc.driver.class")]
    public ConfigNodePropertyString JdbcDriverClass { get; set; }

    /// <summary>
    /// Gets or Sets JdbcConnectionUri
    /// </summary>
    [DataMember(Name="jdbc.connection.uri", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jdbc.connection.uri")]
    public ConfigNodePropertyString JdbcConnectionUri { get; set; }

    /// <summary>
    /// Gets or Sets JdbcUsername
    /// </summary>
    [DataMember(Name="jdbc.username", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jdbc.username")]
    public ConfigNodePropertyString JdbcUsername { get; set; }

    /// <summary>
    /// Gets or Sets JdbcPassword
    /// </summary>
    [DataMember(Name="jdbc.password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jdbc.password")]
    public ConfigNodePropertyString JdbcPassword { get; set; }

    /// <summary>
    /// Gets or Sets JdbcValidationQuery
    /// </summary>
    [DataMember(Name="jdbc.validation.query", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jdbc.validation.query")]
    public ConfigNodePropertyString JdbcValidationQuery { get; set; }

    /// <summary>
    /// Gets or Sets DefaultReadonly
    /// </summary>
    [DataMember(Name="default.readonly", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.readonly")]
    public ConfigNodePropertyBoolean DefaultReadonly { get; set; }

    /// <summary>
    /// Gets or Sets DefaultAutocommit
    /// </summary>
    [DataMember(Name="default.autocommit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.autocommit")]
    public ConfigNodePropertyBoolean DefaultAutocommit { get; set; }

    /// <summary>
    /// Gets or Sets PoolSize
    /// </summary>
    [DataMember(Name="pool.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pool.size")]
    public ConfigNodePropertyInteger PoolSize { get; set; }

    /// <summary>
    /// Gets or Sets PoolMaxWaitMsec
    /// </summary>
    [DataMember(Name="pool.max.wait.msec", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pool.max.wait.msec")]
    public ConfigNodePropertyInteger PoolMaxWaitMsec { get; set; }

    /// <summary>
    /// Gets or Sets DatasourceName
    /// </summary>
    [DataMember(Name="datasource.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "datasource.name")]
    public ConfigNodePropertyString DatasourceName { get; set; }

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
      sb.Append("class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties {\n");
      sb.Append("  JdbcDriverClass: ").Append(JdbcDriverClass).Append("\n");
      sb.Append("  JdbcConnectionUri: ").Append(JdbcConnectionUri).Append("\n");
      sb.Append("  JdbcUsername: ").Append(JdbcUsername).Append("\n");
      sb.Append("  JdbcPassword: ").Append(JdbcPassword).Append("\n");
      sb.Append("  JdbcValidationQuery: ").Append(JdbcValidationQuery).Append("\n");
      sb.Append("  DefaultReadonly: ").Append(DefaultReadonly).Append("\n");
      sb.Append("  DefaultAutocommit: ").Append(DefaultAutocommit).Append("\n");
      sb.Append("  PoolSize: ").Append(PoolSize).Append("\n");
      sb.Append("  PoolMaxWaitMsec: ").Append(PoolMaxWaitMsec).Append("\n");
      sb.Append("  DatasourceName: ").Append(DatasourceName).Append("\n");
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
