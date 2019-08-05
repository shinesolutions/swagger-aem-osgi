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
  public class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties {
    /// <summary>
    /// Gets or Sets ProviderName
    /// </summary>
    [DataMember(Name="providerName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "providerName")]
    public ConfigNodePropertyString ProviderName { get; set; }

    /// <summary>
    /// Gets or Sets ForwardRequests
    /// </summary>
    [DataMember(Name="forward.requests", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "forward.requests")]
    public ConfigNodePropertyBoolean ForwardRequests { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties {\n");
      sb.Append("  ProviderName: ").Append(ProviderName).Append("\n");
      sb.Append("  ForwardRequests: ").Append(ForwardRequests).Append("\n");
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
