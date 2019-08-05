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
  public class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties {
    /// <summary>
    /// Gets or Sets DamShowexpired
    /// </summary>
    [DataMember(Name="dam.showexpired", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dam.showexpired")]
    public ConfigNodePropertyBoolean DamShowexpired { get; set; }

    /// <summary>
    /// Gets or Sets DamShowhidden
    /// </summary>
    [DataMember(Name="dam.showhidden", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dam.showhidden")]
    public ConfigNodePropertyBoolean DamShowhidden { get; set; }

    /// <summary>
    /// Gets or Sets TagTitleSearch
    /// </summary>
    [DataMember(Name="tagTitleSearch", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tagTitleSearch")]
    public ConfigNodePropertyBoolean TagTitleSearch { get; set; }

    /// <summary>
    /// Gets or Sets GuessTotal
    /// </summary>
    [DataMember(Name="guessTotal", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "guessTotal")]
    public ConfigNodePropertyString GuessTotal { get; set; }

    /// <summary>
    /// Gets or Sets DamExpiryProperty
    /// </summary>
    [DataMember(Name="dam.expiryProperty", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dam.expiryProperty")]
    public ConfigNodePropertyString DamExpiryProperty { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties {\n");
      sb.Append("  DamShowexpired: ").Append(DamShowexpired).Append("\n");
      sb.Append("  DamShowhidden: ").Append(DamShowhidden).Append("\n");
      sb.Append("  TagTitleSearch: ").Append(TagTitleSearch).Append("\n");
      sb.Append("  GuessTotal: ").Append(GuessTotal).Append("\n");
      sb.Append("  DamExpiryProperty: ").Append(DamExpiryProperty).Append("\n");
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
