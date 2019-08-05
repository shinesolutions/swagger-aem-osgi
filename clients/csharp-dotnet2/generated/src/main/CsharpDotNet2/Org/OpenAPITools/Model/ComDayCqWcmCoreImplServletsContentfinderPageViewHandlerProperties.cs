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
  public class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties {
    /// <summary>
    /// Gets or Sets GuessTotal
    /// </summary>
    [DataMember(Name="guessTotal", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "guessTotal")]
    public ConfigNodePropertyString GuessTotal { get; set; }

    /// <summary>
    /// Gets or Sets TagTitleSearch
    /// </summary>
    [DataMember(Name="tagTitleSearch", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tagTitleSearch")]
    public ConfigNodePropertyBoolean TagTitleSearch { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties {\n");
      sb.Append("  GuessTotal: ").Append(GuessTotal).Append("\n");
      sb.Append("  TagTitleSearch: ").Append(TagTitleSearch).Append("\n");
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
