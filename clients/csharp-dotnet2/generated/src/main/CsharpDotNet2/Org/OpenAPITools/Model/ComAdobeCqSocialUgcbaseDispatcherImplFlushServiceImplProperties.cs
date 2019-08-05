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
  public class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties {
    /// <summary>
    /// Gets or Sets ThreadPoolSize
    /// </summary>
    [DataMember(Name="threadPoolSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "threadPoolSize")]
    public ConfigNodePropertyInteger ThreadPoolSize { get; set; }

    /// <summary>
    /// Gets or Sets DelayTime
    /// </summary>
    [DataMember(Name="delayTime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "delayTime")]
    public ConfigNodePropertyInteger DelayTime { get; set; }

    /// <summary>
    /// Gets or Sets WorkerSleepTime
    /// </summary>
    [DataMember(Name="workerSleepTime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "workerSleepTime")]
    public ConfigNodePropertyInteger WorkerSleepTime { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties {\n");
      sb.Append("  ThreadPoolSize: ").Append(ThreadPoolSize).Append("\n");
      sb.Append("  DelayTime: ").Append(DelayTime).Append("\n");
      sb.Append("  WorkerSleepTime: ").Append(WorkerSleepTime).Append("\n");
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
