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
  public class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties {
    /// <summary>
    /// Gets or Sets SchedulerExpression
    /// </summary>
    [DataMember(Name="scheduler.expression", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduler.expression")]
    public ConfigNodePropertyString SchedulerExpression { get; set; }

    /// <summary>
    /// Gets or Sets JobPurgeThreshold
    /// </summary>
    [DataMember(Name="job.purge.threshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "job.purge.threshold")]
    public ConfigNodePropertyInteger JobPurgeThreshold { get; set; }

    /// <summary>
    /// Gets or Sets JobPurgeMaxJobs
    /// </summary>
    [DataMember(Name="job.purge.max.jobs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "job.purge.max.jobs")]
    public ConfigNodePropertyInteger JobPurgeMaxJobs { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties {\n");
      sb.Append("  SchedulerExpression: ").Append(SchedulerExpression).Append("\n");
      sb.Append("  JobPurgeThreshold: ").Append(JobPurgeThreshold).Append("\n");
      sb.Append("  JobPurgeMaxJobs: ").Append(JobPurgeMaxJobs).Append("\n");
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
