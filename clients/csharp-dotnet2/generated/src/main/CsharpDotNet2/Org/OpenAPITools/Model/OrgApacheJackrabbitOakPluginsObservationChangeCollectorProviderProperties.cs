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
  public class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties {
    /// <summary>
    /// Gets or Sets MaxItems
    /// </summary>
    [DataMember(Name="maxItems", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxItems")]
    public ConfigNodePropertyInteger MaxItems { get; set; }

    /// <summary>
    /// Gets or Sets MaxPathDepth
    /// </summary>
    [DataMember(Name="maxPathDepth", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxPathDepth")]
    public ConfigNodePropertyInteger MaxPathDepth { get; set; }

    /// <summary>
    /// Gets or Sets Enabled
    /// </summary>
    [DataMember(Name="enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enabled")]
    public ConfigNodePropertyBoolean Enabled { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties {\n");
      sb.Append("  MaxItems: ").Append(MaxItems).Append("\n");
      sb.Append("  MaxPathDepth: ").Append(MaxPathDepth).Append("\n");
      sb.Append("  Enabled: ").Append(Enabled).Append("\n");
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
