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
  public class OrgApacheSlingEventImplJobsDefaultJobManagerProperties {
    /// <summary>
    /// Gets or Sets QueuePriority
    /// </summary>
    [DataMember(Name="queue.priority", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queue.priority")]
    public ConfigNodePropertyDropDown QueuePriority { get; set; }

    /// <summary>
    /// Gets or Sets QueueRetries
    /// </summary>
    [DataMember(Name="queue.retries", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queue.retries")]
    public ConfigNodePropertyInteger QueueRetries { get; set; }

    /// <summary>
    /// Gets or Sets QueueRetrydelay
    /// </summary>
    [DataMember(Name="queue.retrydelay", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queue.retrydelay")]
    public ConfigNodePropertyInteger QueueRetrydelay { get; set; }

    /// <summary>
    /// Gets or Sets QueueMaxparallel
    /// </summary>
    [DataMember(Name="queue.maxparallel", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queue.maxparallel")]
    public ConfigNodePropertyInteger QueueMaxparallel { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingEventImplJobsDefaultJobManagerProperties {\n");
      sb.Append("  QueuePriority: ").Append(QueuePriority).Append("\n");
      sb.Append("  QueueRetries: ").Append(QueueRetries).Append("\n");
      sb.Append("  QueueRetrydelay: ").Append(QueueRetrydelay).Append("\n");
      sb.Append("  QueueMaxparallel: ").Append(QueueMaxparallel).Append("\n");
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
