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
  public class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties {
    /// <summary>
    /// Gets or Sets XmpFilterApplyWhitelist
    /// </summary>
    [DataMember(Name="xmp.filter.apply_whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "xmp.filter.apply_whitelist")]
    public ConfigNodePropertyBoolean XmpFilterApplyWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets XmpFilterWhitelist
    /// </summary>
    [DataMember(Name="xmp.filter.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "xmp.filter.whitelist")]
    public ConfigNodePropertyArray XmpFilterWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets XmpFilterApplyBlacklist
    /// </summary>
    [DataMember(Name="xmp.filter.apply_blacklist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "xmp.filter.apply_blacklist")]
    public ConfigNodePropertyBoolean XmpFilterApplyBlacklist { get; set; }

    /// <summary>
    /// Gets or Sets XmpFilterBlacklist
    /// </summary>
    [DataMember(Name="xmp.filter.blacklist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "xmp.filter.blacklist")]
    public ConfigNodePropertyArray XmpFilterBlacklist { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties {\n");
      sb.Append("  XmpFilterApplyWhitelist: ").Append(XmpFilterApplyWhitelist).Append("\n");
      sb.Append("  XmpFilterWhitelist: ").Append(XmpFilterWhitelist).Append("\n");
      sb.Append("  XmpFilterApplyBlacklist: ").Append(XmpFilterApplyBlacklist).Append("\n");
      sb.Append("  XmpFilterBlacklist: ").Append(XmpFilterBlacklist).Append("\n");
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
