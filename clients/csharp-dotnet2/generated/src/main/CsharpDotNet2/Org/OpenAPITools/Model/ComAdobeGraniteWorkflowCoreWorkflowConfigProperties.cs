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
  public class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties {
    /// <summary>
    /// Gets or Sets CqWorkflowConfigWorkflowPackagesRootPath
    /// </summary>
    [DataMember(Name="cq.workflow.config.workflow.packages.root.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.workflow.config.workflow.packages.root.path")]
    public ConfigNodePropertyArray CqWorkflowConfigWorkflowPackagesRootPath { get; set; }

    /// <summary>
    /// Gets or Sets CqWorkflowConfigWorkflowProcessLegacyMode
    /// </summary>
    [DataMember(Name="cq.workflow.config.workflow.process.legacy.mode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.workflow.config.workflow.process.legacy.mode")]
    public ConfigNodePropertyBoolean CqWorkflowConfigWorkflowProcessLegacyMode { get; set; }

    /// <summary>
    /// Gets or Sets CqWorkflowConfigAllowLocking
    /// </summary>
    [DataMember(Name="cq.workflow.config.allow.locking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.workflow.config.allow.locking")]
    public ConfigNodePropertyBoolean CqWorkflowConfigAllowLocking { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties {\n");
      sb.Append("  CqWorkflowConfigWorkflowPackagesRootPath: ").Append(CqWorkflowConfigWorkflowPackagesRootPath).Append("\n");
      sb.Append("  CqWorkflowConfigWorkflowProcessLegacyMode: ").Append(CqWorkflowConfigWorkflowProcessLegacyMode).Append("\n");
      sb.Append("  CqWorkflowConfigAllowLocking: ").Append(CqWorkflowConfigAllowLocking).Append("\n");
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
