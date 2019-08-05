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
  public class ComDayCqReplicationImplAgentManagerImplProperties {
    /// <summary>
    /// Gets or Sets JobTopics
    /// </summary>
    [DataMember(Name="job.topics", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "job.topics")]
    public ConfigNodePropertyString JobTopics { get; set; }

    /// <summary>
    /// Gets or Sets ServiceUserTarget
    /// </summary>
    [DataMember(Name="serviceUser.target", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serviceUser.target")]
    public ConfigNodePropertyString ServiceUserTarget { get; set; }

    /// <summary>
    /// Gets or Sets AgentProviderTarget
    /// </summary>
    [DataMember(Name="agentProvider.target", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "agentProvider.target")]
    public ConfigNodePropertyString AgentProviderTarget { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqReplicationImplAgentManagerImplProperties {\n");
      sb.Append("  JobTopics: ").Append(JobTopics).Append("\n");
      sb.Append("  ServiceUserTarget: ").Append(ServiceUserTarget).Append("\n");
      sb.Append("  AgentProviderTarget: ").Append(AgentProviderTarget).Append("\n");
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
