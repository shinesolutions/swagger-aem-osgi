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
  public class ComAdobeGraniteWorkflowPurgeSchedulerProperties {
    /// <summary>
    /// Gets or Sets ScheduledpurgeName
    /// </summary>
    [DataMember(Name="scheduledpurge.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduledpurge.name")]
    public ConfigNodePropertyString ScheduledpurgeName { get; set; }

    /// <summary>
    /// Gets or Sets ScheduledpurgeWorkflowStatus
    /// </summary>
    [DataMember(Name="scheduledpurge.workflowStatus", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduledpurge.workflowStatus")]
    public ConfigNodePropertyDropDown ScheduledpurgeWorkflowStatus { get; set; }

    /// <summary>
    /// Gets or Sets ScheduledpurgeModelIds
    /// </summary>
    [DataMember(Name="scheduledpurge.modelIds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduledpurge.modelIds")]
    public ConfigNodePropertyArray ScheduledpurgeModelIds { get; set; }

    /// <summary>
    /// Gets or Sets ScheduledpurgeDaysold
    /// </summary>
    [DataMember(Name="scheduledpurge.daysold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduledpurge.daysold")]
    public ConfigNodePropertyInteger ScheduledpurgeDaysold { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteWorkflowPurgeSchedulerProperties {\n");
      sb.Append("  ScheduledpurgeName: ").Append(ScheduledpurgeName).Append("\n");
      sb.Append("  ScheduledpurgeWorkflowStatus: ").Append(ScheduledpurgeWorkflowStatus).Append("\n");
      sb.Append("  ScheduledpurgeModelIds: ").Append(ScheduledpurgeModelIds).Append("\n");
      sb.Append("  ScheduledpurgeDaysold: ").Append(ScheduledpurgeDaysold).Append("\n");
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
