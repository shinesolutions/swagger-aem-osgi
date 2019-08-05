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
  public class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties {
    /// <summary>
    /// Gets or Sets HcTags
    /// </summary>
    [DataMember(Name="hc.tags", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hc.tags")]
    public ConfigNodePropertyArray HcTags { get; set; }

    /// <summary>
    /// Gets or Sets MaxQueuedJobs
    /// </summary>
    [DataMember(Name="max.queued.jobs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "max.queued.jobs")]
    public ConfigNodePropertyInteger MaxQueuedJobs { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties {\n");
      sb.Append("  HcTags: ").Append(HcTags).Append("\n");
      sb.Append("  MaxQueuedJobs: ").Append(MaxQueuedJobs).Append("\n");
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
