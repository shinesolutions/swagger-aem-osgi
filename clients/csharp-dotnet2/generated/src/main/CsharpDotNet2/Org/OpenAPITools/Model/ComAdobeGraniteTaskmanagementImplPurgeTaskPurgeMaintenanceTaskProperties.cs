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
  public class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties {
    /// <summary>
    /// Gets or Sets PurgeCompleted
    /// </summary>
    [DataMember(Name="purgeCompleted", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "purgeCompleted")]
    public ConfigNodePropertyBoolean PurgeCompleted { get; set; }

    /// <summary>
    /// Gets or Sets CompletedAge
    /// </summary>
    [DataMember(Name="completedAge", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "completedAge")]
    public ConfigNodePropertyInteger CompletedAge { get; set; }

    /// <summary>
    /// Gets or Sets PurgeActive
    /// </summary>
    [DataMember(Name="purgeActive", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "purgeActive")]
    public ConfigNodePropertyBoolean PurgeActive { get; set; }

    /// <summary>
    /// Gets or Sets ActiveAge
    /// </summary>
    [DataMember(Name="activeAge", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "activeAge")]
    public ConfigNodePropertyInteger ActiveAge { get; set; }

    /// <summary>
    /// Gets or Sets SaveThreshold
    /// </summary>
    [DataMember(Name="saveThreshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "saveThreshold")]
    public ConfigNodePropertyInteger SaveThreshold { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties {\n");
      sb.Append("  PurgeCompleted: ").Append(PurgeCompleted).Append("\n");
      sb.Append("  CompletedAge: ").Append(CompletedAge).Append("\n");
      sb.Append("  PurgeActive: ").Append(PurgeActive).Append("\n");
      sb.Append("  ActiveAge: ").Append(ActiveAge).Append("\n");
      sb.Append("  SaveThreshold: ").Append(SaveThreshold).Append("\n");
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
