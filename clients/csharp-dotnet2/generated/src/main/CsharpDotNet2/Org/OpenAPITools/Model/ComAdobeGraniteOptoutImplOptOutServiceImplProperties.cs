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
  public class ComAdobeGraniteOptoutImplOptOutServiceImplProperties {
    /// <summary>
    /// Gets or Sets OptoutCookies
    /// </summary>
    [DataMember(Name="optout.cookies", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "optout.cookies")]
    public ConfigNodePropertyArray OptoutCookies { get; set; }

    /// <summary>
    /// Gets or Sets OptoutHeaders
    /// </summary>
    [DataMember(Name="optout.headers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "optout.headers")]
    public ConfigNodePropertyArray OptoutHeaders { get; set; }

    /// <summary>
    /// Gets or Sets OptoutWhitelistCookies
    /// </summary>
    [DataMember(Name="optout.whitelist.cookies", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "optout.whitelist.cookies")]
    public ConfigNodePropertyArray OptoutWhitelistCookies { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteOptoutImplOptOutServiceImplProperties {\n");
      sb.Append("  OptoutCookies: ").Append(OptoutCookies).Append("\n");
      sb.Append("  OptoutHeaders: ").Append(OptoutHeaders).Append("\n");
      sb.Append("  OptoutWhitelistCookies: ").Append(OptoutWhitelistCookies).Append("\n");
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
