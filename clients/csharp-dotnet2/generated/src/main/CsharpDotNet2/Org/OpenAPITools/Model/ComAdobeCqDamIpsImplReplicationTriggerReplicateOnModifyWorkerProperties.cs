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
  public class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties {
    /// <summary>
    /// Gets or Sets DmreplicateonmodifyEnabled
    /// </summary>
    [DataMember(Name="dmreplicateonmodify.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dmreplicateonmodify.enabled")]
    public ConfigNodePropertyBoolean DmreplicateonmodifyEnabled { get; set; }

    /// <summary>
    /// Gets or Sets DmreplicateonmodifyForcesyncdeletes
    /// </summary>
    [DataMember(Name="dmreplicateonmodify.forcesyncdeletes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dmreplicateonmodify.forcesyncdeletes")]
    public ConfigNodePropertyBoolean DmreplicateonmodifyForcesyncdeletes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties {\n");
      sb.Append("  DmreplicateonmodifyEnabled: ").Append(DmreplicateonmodifyEnabled).Append("\n");
      sb.Append("  DmreplicateonmodifyForcesyncdeletes: ").Append(DmreplicateonmodifyForcesyncdeletes).Append("\n");
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
