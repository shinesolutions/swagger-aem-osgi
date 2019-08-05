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
  public class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties {
    /// <summary>
    /// Gets or Sets AdapterCondition
    /// </summary>
    [DataMember(Name="adapter.condition", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "adapter.condition")]
    public ConfigNodePropertyString AdapterCondition { get; set; }

    /// <summary>
    /// Gets or Sets TaskmanagerAdmingroups
    /// </summary>
    [DataMember(Name="taskmanager.admingroups", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taskmanager.admingroups")]
    public ConfigNodePropertyArray TaskmanagerAdmingroups { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties {\n");
      sb.Append("  AdapterCondition: ").Append(AdapterCondition).Append("\n");
      sb.Append("  TaskmanagerAdmingroups: ").Append(TaskmanagerAdmingroups).Append("\n");
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
