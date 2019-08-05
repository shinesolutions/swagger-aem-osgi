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
  public class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties {
    /// <summary>
    /// Gets or Sets ShowPlaceholder
    /// </summary>
    [DataMember(Name="showPlaceholder", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "showPlaceholder")]
    public ConfigNodePropertyBoolean ShowPlaceholder { get; set; }

    /// <summary>
    /// Gets or Sets MaximumCacheEntries
    /// </summary>
    [DataMember(Name="maximumCacheEntries", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maximumCacheEntries")]
    public ConfigNodePropertyInteger MaximumCacheEntries { get; set; }

    /// <summary>
    /// Gets or Sets AfScriptingCompatversion
    /// </summary>
    [DataMember(Name="af.scripting.compatversion", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "af.scripting.compatversion")]
    public ConfigNodePropertyDropDown AfScriptingCompatversion { get; set; }

    /// <summary>
    /// Gets or Sets MakeFileNameUnique
    /// </summary>
    [DataMember(Name="makeFileNameUnique", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "makeFileNameUnique")]
    public ConfigNodePropertyBoolean MakeFileNameUnique { get; set; }

    /// <summary>
    /// Gets or Sets GeneratingCompliantData
    /// </summary>
    [DataMember(Name="generatingCompliantData", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "generatingCompliantData")]
    public ConfigNodePropertyBoolean GeneratingCompliantData { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties {\n");
      sb.Append("  ShowPlaceholder: ").Append(ShowPlaceholder).Append("\n");
      sb.Append("  MaximumCacheEntries: ").Append(MaximumCacheEntries).Append("\n");
      sb.Append("  AfScriptingCompatversion: ").Append(AfScriptingCompatversion).Append("\n");
      sb.Append("  MakeFileNameUnique: ").Append(MakeFileNameUnique).Append("\n");
      sb.Append("  GeneratingCompliantData: ").Append(GeneratingCompliantData).Append("\n");
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
