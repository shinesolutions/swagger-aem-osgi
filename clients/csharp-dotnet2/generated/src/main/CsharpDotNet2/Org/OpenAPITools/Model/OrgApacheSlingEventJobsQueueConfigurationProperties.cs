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
  public class OrgApacheSlingEventJobsQueueConfigurationProperties {
    /// <summary>
    /// Gets or Sets QueueName
    /// </summary>
    [DataMember(Name="queue.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queue.name")]
    public ConfigNodePropertyString QueueName { get; set; }

    /// <summary>
    /// Gets or Sets QueueTopics
    /// </summary>
    [DataMember(Name="queue.topics", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queue.topics")]
    public ConfigNodePropertyArray QueueTopics { get; set; }

    /// <summary>
    /// Gets or Sets QueueType
    /// </summary>
    [DataMember(Name="queue.type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queue.type")]
    public ConfigNodePropertyDropDown QueueType { get; set; }

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
    public ConfigNodePropertyFloat QueueMaxparallel { get; set; }

    /// <summary>
    /// Gets or Sets QueueKeepJobs
    /// </summary>
    [DataMember(Name="queue.keepJobs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queue.keepJobs")]
    public ConfigNodePropertyBoolean QueueKeepJobs { get; set; }

    /// <summary>
    /// Gets or Sets QueuePreferRunOnCreationInstance
    /// </summary>
    [DataMember(Name="queue.preferRunOnCreationInstance", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queue.preferRunOnCreationInstance")]
    public ConfigNodePropertyBoolean QueuePreferRunOnCreationInstance { get; set; }

    /// <summary>
    /// Gets or Sets QueueThreadPoolSize
    /// </summary>
    [DataMember(Name="queue.threadPoolSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queue.threadPoolSize")]
    public ConfigNodePropertyInteger QueueThreadPoolSize { get; set; }

    /// <summary>
    /// Gets or Sets ServiceRanking
    /// </summary>
    [DataMember(Name="service.ranking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.ranking")]
    public ConfigNodePropertyInteger ServiceRanking { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingEventJobsQueueConfigurationProperties {\n");
      sb.Append("  QueueName: ").Append(QueueName).Append("\n");
      sb.Append("  QueueTopics: ").Append(QueueTopics).Append("\n");
      sb.Append("  QueueType: ").Append(QueueType).Append("\n");
      sb.Append("  QueuePriority: ").Append(QueuePriority).Append("\n");
      sb.Append("  QueueRetries: ").Append(QueueRetries).Append("\n");
      sb.Append("  QueueRetrydelay: ").Append(QueueRetrydelay).Append("\n");
      sb.Append("  QueueMaxparallel: ").Append(QueueMaxparallel).Append("\n");
      sb.Append("  QueueKeepJobs: ").Append(QueueKeepJobs).Append("\n");
      sb.Append("  QueuePreferRunOnCreationInstance: ").Append(QueuePreferRunOnCreationInstance).Append("\n");
      sb.Append("  QueueThreadPoolSize: ").Append(QueueThreadPoolSize).Append("\n");
      sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
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
