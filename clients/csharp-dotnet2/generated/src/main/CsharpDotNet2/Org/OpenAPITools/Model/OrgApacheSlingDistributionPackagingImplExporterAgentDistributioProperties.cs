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
  public class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties {
    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public ConfigNodePropertyString Name { get; set; }

    /// <summary>
    /// Gets or Sets Queue
    /// </summary>
    [DataMember(Name="queue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queue")]
    public ConfigNodePropertyString Queue { get; set; }

    /// <summary>
    /// Gets or Sets DropInvalidItems
    /// </summary>
    [DataMember(Name="drop.invalid.items", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "drop.invalid.items")]
    public ConfigNodePropertyBoolean DropInvalidItems { get; set; }

    /// <summary>
    /// Gets or Sets AgentTarget
    /// </summary>
    [DataMember(Name="agent.target", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "agent.target")]
    public ConfigNodePropertyString AgentTarget { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Queue: ").Append(Queue).Append("\n");
      sb.Append("  DropInvalidItems: ").Append(DropInvalidItems).Append("\n");
      sb.Append("  AgentTarget: ").Append(AgentTarget).Append("\n");
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
