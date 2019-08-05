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
  public class ComAdobeCqProjectsPurgeSchedulerProperties {
    /// <summary>
    /// Gets or Sets ScheduledpurgeName
    /// </summary>
    [DataMember(Name="scheduledpurge.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduledpurge.name")]
    public ConfigNodePropertyString ScheduledpurgeName { get; set; }

    /// <summary>
    /// Gets or Sets ScheduledpurgePurgeActive
    /// </summary>
    [DataMember(Name="scheduledpurge.purgeActive", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduledpurge.purgeActive")]
    public ConfigNodePropertyBoolean ScheduledpurgePurgeActive { get; set; }

    /// <summary>
    /// Gets or Sets ScheduledpurgeTemplates
    /// </summary>
    [DataMember(Name="scheduledpurge.templates", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduledpurge.templates")]
    public ConfigNodePropertyArray ScheduledpurgeTemplates { get; set; }

    /// <summary>
    /// Gets or Sets ScheduledpurgePurgeGroups
    /// </summary>
    [DataMember(Name="scheduledpurge.purgeGroups", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduledpurge.purgeGroups")]
    public ConfigNodePropertyBoolean ScheduledpurgePurgeGroups { get; set; }

    /// <summary>
    /// Gets or Sets ScheduledpurgePurgeAssets
    /// </summary>
    [DataMember(Name="scheduledpurge.purgeAssets", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduledpurge.purgeAssets")]
    public ConfigNodePropertyBoolean ScheduledpurgePurgeAssets { get; set; }

    /// <summary>
    /// Gets or Sets ScheduledpurgeTerminateRunningWorkflows
    /// </summary>
    [DataMember(Name="scheduledpurge.terminateRunningWorkflows", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduledpurge.terminateRunningWorkflows")]
    public ConfigNodePropertyBoolean ScheduledpurgeTerminateRunningWorkflows { get; set; }

    /// <summary>
    /// Gets or Sets ScheduledpurgeDaysold
    /// </summary>
    [DataMember(Name="scheduledpurge.daysold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduledpurge.daysold")]
    public ConfigNodePropertyInteger ScheduledpurgeDaysold { get; set; }

    /// <summary>
    /// Gets or Sets ScheduledpurgeSaveThreshold
    /// </summary>
    [DataMember(Name="scheduledpurge.saveThreshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduledpurge.saveThreshold")]
    public ConfigNodePropertyInteger ScheduledpurgeSaveThreshold { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqProjectsPurgeSchedulerProperties {\n");
      sb.Append("  ScheduledpurgeName: ").Append(ScheduledpurgeName).Append("\n");
      sb.Append("  ScheduledpurgePurgeActive: ").Append(ScheduledpurgePurgeActive).Append("\n");
      sb.Append("  ScheduledpurgeTemplates: ").Append(ScheduledpurgeTemplates).Append("\n");
      sb.Append("  ScheduledpurgePurgeGroups: ").Append(ScheduledpurgePurgeGroups).Append("\n");
      sb.Append("  ScheduledpurgePurgeAssets: ").Append(ScheduledpurgePurgeAssets).Append("\n");
      sb.Append("  ScheduledpurgeTerminateRunningWorkflows: ").Append(ScheduledpurgeTerminateRunningWorkflows).Append("\n");
      sb.Append("  ScheduledpurgeDaysold: ").Append(ScheduledpurgeDaysold).Append("\n");
      sb.Append("  ScheduledpurgeSaveThreshold: ").Append(ScheduledpurgeSaveThreshold).Append("\n");
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
