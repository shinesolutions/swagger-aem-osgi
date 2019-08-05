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
  public class ComAdobeCqSocialSyncImplDiffChangesObserverProperties {
    /// <summary>
    /// Gets or Sets Enabled
    /// </summary>
    [DataMember(Name="enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enabled")]
    public ConfigNodePropertyBoolean Enabled { get; set; }

    /// <summary>
    /// Gets or Sets AgentName
    /// </summary>
    [DataMember(Name="agentName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "agentName")]
    public ConfigNodePropertyString AgentName { get; set; }

    /// <summary>
    /// Gets or Sets DiffPath
    /// </summary>
    [DataMember(Name="diffPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "diffPath")]
    public ConfigNodePropertyString DiffPath { get; set; }

    /// <summary>
    /// Gets or Sets PropertyNames
    /// </summary>
    [DataMember(Name="propertyNames", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "propertyNames")]
    public ConfigNodePropertyString PropertyNames { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialSyncImplDiffChangesObserverProperties {\n");
      sb.Append("  Enabled: ").Append(Enabled).Append("\n");
      sb.Append("  AgentName: ").Append(AgentName).Append("\n");
      sb.Append("  DiffPath: ").Append(DiffPath).Append("\n");
      sb.Append("  PropertyNames: ").Append(PropertyNames).Append("\n");
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
