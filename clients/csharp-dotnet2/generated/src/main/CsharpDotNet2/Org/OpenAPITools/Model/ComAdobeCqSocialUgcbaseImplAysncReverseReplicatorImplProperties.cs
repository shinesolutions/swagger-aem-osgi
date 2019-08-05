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
  public class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties {
    /// <summary>
    /// Gets or Sets PoolSize
    /// </summary>
    [DataMember(Name="poolSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "poolSize")]
    public ConfigNodePropertyInteger PoolSize { get; set; }

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
    /// Gets or Sets KeepAliveTime
    /// </summary>
    [DataMember(Name="keepAliveTime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "keepAliveTime")]
    public ConfigNodePropertyInteger KeepAliveTime { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties {\n");
      sb.Append("  PoolSize: ").Append(PoolSize).Append("\n");
      sb.Append("  MaxPoolSize: ").Append(MaxPoolSize).Append("\n");
      sb.Append("  QueueSize: ").Append(QueueSize).Append("\n");
      sb.Append("  KeepAliveTime: ").Append(KeepAliveTime).Append("\n");
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
