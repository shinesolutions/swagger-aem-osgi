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
  public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties {
    /// <summary>
    /// Gets or Sets WhitelistBypass
    /// </summary>
    [DataMember(Name="whitelist.bypass", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "whitelist.bypass")]
    public ConfigNodePropertyBoolean WhitelistBypass { get; set; }

    /// <summary>
    /// Gets or Sets WhitelistBundlesRegexp
    /// </summary>
    [DataMember(Name="whitelist.bundles.regexp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "whitelist.bundles.regexp")]
    public ConfigNodePropertyString WhitelistBundlesRegexp { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties {\n");
      sb.Append("  WhitelistBypass: ").Append(WhitelistBypass).Append("\n");
      sb.Append("  WhitelistBundlesRegexp: ").Append(WhitelistBundlesRegexp).Append("\n");
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
