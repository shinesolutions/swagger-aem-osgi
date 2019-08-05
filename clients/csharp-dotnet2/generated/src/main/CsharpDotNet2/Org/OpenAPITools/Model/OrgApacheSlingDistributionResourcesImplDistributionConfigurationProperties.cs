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
  public class OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties {
    /// <summary>
    /// Gets or Sets ProviderRoots
    /// </summary>
    [DataMember(Name="provider.roots", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "provider.roots")]
    public ConfigNodePropertyString ProviderRoots { get; set; }

    /// <summary>
    /// Gets or Sets Kind
    /// </summary>
    [DataMember(Name="kind", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "kind")]
    public ConfigNodePropertyString Kind { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties {\n");
      sb.Append("  ProviderRoots: ").Append(ProviderRoots).Append("\n");
      sb.Append("  Kind: ").Append(Kind).Append("\n");
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
