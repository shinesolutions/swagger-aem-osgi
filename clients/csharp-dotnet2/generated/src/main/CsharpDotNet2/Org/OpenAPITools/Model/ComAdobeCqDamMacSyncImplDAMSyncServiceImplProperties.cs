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
  public class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties {
    /// <summary>
    /// Gets or Sets ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths
    /// </summary>
    [DataMember(Name="com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths")]
    public ConfigNodePropertyArray ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions
    /// </summary>
    [DataMember(Name="com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions")]
    public ConfigNodePropertyBoolean ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs
    /// </summary>
    [DataMember(Name="com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms")]
    public ConfigNodePropertyInteger ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeCqDamMacSyncDamsyncservicePlatform
    /// </summary>
    [DataMember(Name="com.adobe.cq.dam.mac.sync.damsyncservice.platform", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.cq.dam.mac.sync.damsyncservice.platform")]
    public ConfigNodePropertyDropDown ComAdobeCqDamMacSyncDamsyncservicePlatform { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties {\n");
      sb.Append("  ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths: ").Append(ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths).Append("\n");
      sb.Append("  ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions: ").Append(ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions).Append("\n");
      sb.Append("  ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs: ").Append(ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs).Append("\n");
      sb.Append("  ComAdobeCqDamMacSyncDamsyncservicePlatform: ").Append(ComAdobeCqDamMacSyncDamsyncservicePlatform).Append("\n");
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
