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
  public class ComDayCqImageInternalFontFontHelperProperties {
    /// <summary>
    /// Gets or Sets Fontpath
    /// </summary>
    [DataMember(Name="fontpath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fontpath")]
    public ConfigNodePropertyArray Fontpath { get; set; }

    /// <summary>
    /// Gets or Sets OversamplingFactor
    /// </summary>
    [DataMember(Name="oversamplingFactor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oversamplingFactor")]
    public ConfigNodePropertyInteger OversamplingFactor { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqImageInternalFontFontHelperProperties {\n");
      sb.Append("  Fontpath: ").Append(Fontpath).Append("\n");
      sb.Append("  OversamplingFactor: ").Append(OversamplingFactor).Append("\n");
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
