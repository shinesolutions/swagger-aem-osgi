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
  public class ComDayCqDamIdsImplIDSPoolManagerImplProperties {
    /// <summary>
    /// Gets or Sets MaxErrorsToBlacklist
    /// </summary>
    [DataMember(Name="max.errors.to.blacklist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "max.errors.to.blacklist")]
    public ConfigNodePropertyInteger MaxErrorsToBlacklist { get; set; }

    /// <summary>
    /// Gets or Sets RetryIntervalToWhitelist
    /// </summary>
    [DataMember(Name="retry.interval.to.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "retry.interval.to.whitelist")]
    public ConfigNodePropertyInteger RetryIntervalToWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets ConnectTimeout
    /// </summary>
    [DataMember(Name="connect.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "connect.timeout")]
    public ConfigNodePropertyInteger ConnectTimeout { get; set; }

    /// <summary>
    /// Gets or Sets SocketTimeout
    /// </summary>
    [DataMember(Name="socket.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "socket.timeout")]
    public ConfigNodePropertyInteger SocketTimeout { get; set; }

    /// <summary>
    /// Gets or Sets ProcessLabel
    /// </summary>
    [DataMember(Name="process.label", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "process.label")]
    public ConfigNodePropertyString ProcessLabel { get; set; }

    /// <summary>
    /// Gets or Sets ConnectionUseMax
    /// </summary>
    [DataMember(Name="connection.use.max", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "connection.use.max")]
    public ConfigNodePropertyInteger ConnectionUseMax { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamIdsImplIDSPoolManagerImplProperties {\n");
      sb.Append("  MaxErrorsToBlacklist: ").Append(MaxErrorsToBlacklist).Append("\n");
      sb.Append("  RetryIntervalToWhitelist: ").Append(RetryIntervalToWhitelist).Append("\n");
      sb.Append("  ConnectTimeout: ").Append(ConnectTimeout).Append("\n");
      sb.Append("  SocketTimeout: ").Append(SocketTimeout).Append("\n");
      sb.Append("  ProcessLabel: ").Append(ProcessLabel).Append("\n");
      sb.Append("  ConnectionUseMax: ").Append(ConnectionUseMax).Append("\n");
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
