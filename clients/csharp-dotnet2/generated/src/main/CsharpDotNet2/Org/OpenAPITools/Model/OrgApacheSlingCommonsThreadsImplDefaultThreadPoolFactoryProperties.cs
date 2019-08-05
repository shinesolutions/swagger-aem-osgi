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
  public class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties {
    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public ConfigNodePropertyString Name { get; set; }

    /// <summary>
    /// Gets or Sets MinPoolSize
    /// </summary>
    [DataMember(Name="minPoolSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "minPoolSize")]
    public ConfigNodePropertyInteger MinPoolSize { get; set; }

    /// <summary>
    /// Gets or Sets MaxPoolSize
    /// </summary>
    [DataMember(Name="maxPoolSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxPoolSize")]
    public ConfigNodePropertyInteger MaxPoolSize { get; set; }

    /// <summary>
    /// Gets or Sets QueueSize
    /// </summary>
    [DataMember(Name="queueSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queueSize")]
    public ConfigNodePropertyInteger QueueSize { get; set; }

    /// <summary>
    /// Gets or Sets MaxThreadAge
    /// </summary>
    [DataMember(Name="maxThreadAge", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxThreadAge")]
    public ConfigNodePropertyInteger MaxThreadAge { get; set; }

    /// <summary>
    /// Gets or Sets KeepAliveTime
    /// </summary>
    [DataMember(Name="keepAliveTime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "keepAliveTime")]
    public ConfigNodePropertyInteger KeepAliveTime { get; set; }

    /// <summary>
    /// Gets or Sets BlockPolicy
    /// </summary>
    [DataMember(Name="blockPolicy", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "blockPolicy")]
    public ConfigNodePropertyDropDown BlockPolicy { get; set; }

    /// <summary>
    /// Gets or Sets ShutdownGraceful
    /// </summary>
    [DataMember(Name="shutdownGraceful", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "shutdownGraceful")]
    public ConfigNodePropertyBoolean ShutdownGraceful { get; set; }

    /// <summary>
    /// Gets or Sets Daemon
    /// </summary>
    [DataMember(Name="daemon", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "daemon")]
    public ConfigNodePropertyBoolean Daemon { get; set; }

    /// <summary>
    /// Gets or Sets ShutdownWaitTime
    /// </summary>
    [DataMember(Name="shutdownWaitTime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "shutdownWaitTime")]
    public ConfigNodePropertyInteger ShutdownWaitTime { get; set; }

    /// <summary>
    /// Gets or Sets Priority
    /// </summary>
    [DataMember(Name="priority", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "priority")]
    public ConfigNodePropertyDropDown Priority { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  MinPoolSize: ").Append(MinPoolSize).Append("\n");
      sb.Append("  MaxPoolSize: ").Append(MaxPoolSize).Append("\n");
      sb.Append("  QueueSize: ").Append(QueueSize).Append("\n");
      sb.Append("  MaxThreadAge: ").Append(MaxThreadAge).Append("\n");
      sb.Append("  KeepAliveTime: ").Append(KeepAliveTime).Append("\n");
      sb.Append("  BlockPolicy: ").Append(BlockPolicy).Append("\n");
      sb.Append("  ShutdownGraceful: ").Append(ShutdownGraceful).Append("\n");
      sb.Append("  Daemon: ").Append(Daemon).Append("\n");
      sb.Append("  ShutdownWaitTime: ").Append(ShutdownWaitTime).Append("\n");
      sb.Append("  Priority: ").Append(Priority).Append("\n");
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
