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
  public class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {
    /// <summary>
    /// Gets or Sets JobTopics
    /// </summary>
    [DataMember(Name="job.topics", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "job.topics")]
    public ConfigNodePropertyArray JobTopics { get; set; }

    /// <summary>
    /// Gets or Sets AllowSelfProcessTermination
    /// </summary>
    [DataMember(Name="allow.self.process.termination", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "allow.self.process.termination")]
    public ConfigNodePropertyBoolean AllowSelfProcessTermination { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {\n");
      sb.Append("  JobTopics: ").Append(JobTopics).Append("\n");
      sb.Append("  AllowSelfProcessTermination: ").Append(AllowSelfProcessTermination).Append("\n");
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
