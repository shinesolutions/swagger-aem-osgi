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
  public class ComDayCqReplicationImplReplicationReceiverImplProperties {
    /// <summary>
    /// Gets or Sets ReceiverTmpfileThreshold
    /// </summary>
    [DataMember(Name="receiver.tmpfile.threshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "receiver.tmpfile.threshold")]
    public ConfigNodePropertyInteger ReceiverTmpfileThreshold { get; set; }

    /// <summary>
    /// Gets or Sets ReceiverPackagesUseInstall
    /// </summary>
    [DataMember(Name="receiver.packages.use.install", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "receiver.packages.use.install")]
    public ConfigNodePropertyBoolean ReceiverPackagesUseInstall { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqReplicationImplReplicationReceiverImplProperties {\n");
      sb.Append("  ReceiverTmpfileThreshold: ").Append(ReceiverTmpfileThreshold).Append("\n");
      sb.Append("  ReceiverPackagesUseInstall: ").Append(ReceiverPackagesUseInstall).Append("\n");
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
