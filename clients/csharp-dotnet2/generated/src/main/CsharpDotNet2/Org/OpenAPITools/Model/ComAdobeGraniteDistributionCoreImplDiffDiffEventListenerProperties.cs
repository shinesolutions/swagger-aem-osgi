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
  public class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties {
    /// <summary>
    /// Gets or Sets DiffPath
    /// </summary>
    [DataMember(Name="diffPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "diffPath")]
    public ConfigNodePropertyString DiffPath { get; set; }

    /// <summary>
    /// Gets or Sets ServiceName
    /// </summary>
    [DataMember(Name="serviceName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serviceName")]
    public ConfigNodePropertyString ServiceName { get; set; }

    /// <summary>
    /// Gets or Sets ServiceUserTarget
    /// </summary>
    [DataMember(Name="serviceUser.target", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serviceUser.target")]
    public ConfigNodePropertyString ServiceUserTarget { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties {\n");
      sb.Append("  DiffPath: ").Append(DiffPath).Append("\n");
      sb.Append("  ServiceName: ").Append(ServiceName).Append("\n");
      sb.Append("  ServiceUserTarget: ").Append(ServiceUserTarget).Append("\n");
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
