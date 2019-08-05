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
  public class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties {
    /// <summary>
    /// Gets or Sets RedirectEnabled
    /// </summary>
    [DataMember(Name="redirect.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "redirect.enabled")]
    public ConfigNodePropertyBoolean RedirectEnabled { get; set; }

    /// <summary>
    /// Gets or Sets RedirectStatsEnabled
    /// </summary>
    [DataMember(Name="redirect.stats.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "redirect.stats.enabled")]
    public ConfigNodePropertyBoolean RedirectStatsEnabled { get; set; }

    /// <summary>
    /// Gets or Sets RedirectExtensions
    /// </summary>
    [DataMember(Name="redirect.extensions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "redirect.extensions")]
    public ConfigNodePropertyArray RedirectExtensions { get; set; }

    /// <summary>
    /// Gets or Sets RedirectPaths
    /// </summary>
    [DataMember(Name="redirect.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "redirect.paths")]
    public ConfigNodePropertyArray RedirectPaths { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties {\n");
      sb.Append("  RedirectEnabled: ").Append(RedirectEnabled).Append("\n");
      sb.Append("  RedirectStatsEnabled: ").Append(RedirectStatsEnabled).Append("\n");
      sb.Append("  RedirectExtensions: ").Append(RedirectExtensions).Append("\n");
      sb.Append("  RedirectPaths: ").Append(RedirectPaths).Append("\n");
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
