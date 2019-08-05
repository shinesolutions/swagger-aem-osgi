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
  public class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties {
    /// <summary>
    /// Gets or Sets NuiEnabled
    /// </summary>
    [DataMember(Name="nuiEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nuiEnabled")]
    public ConfigNodePropertyBoolean NuiEnabled { get; set; }

    /// <summary>
    /// Gets or Sets NuiServiceUrl
    /// </summary>
    [DataMember(Name="nuiServiceUrl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nuiServiceUrl")]
    public ConfigNodePropertyString NuiServiceUrl { get; set; }

    /// <summary>
    /// Gets or Sets NuiApiKey
    /// </summary>
    [DataMember(Name="nuiApiKey", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nuiApiKey")]
    public ConfigNodePropertyString NuiApiKey { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties {\n");
      sb.Append("  NuiEnabled: ").Append(NuiEnabled).Append("\n");
      sb.Append("  NuiServiceUrl: ").Append(NuiServiceUrl).Append("\n");
      sb.Append("  NuiApiKey: ").Append(NuiApiKey).Append("\n");
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
