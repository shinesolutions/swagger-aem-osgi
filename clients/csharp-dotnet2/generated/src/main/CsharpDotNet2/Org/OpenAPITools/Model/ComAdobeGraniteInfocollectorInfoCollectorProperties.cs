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
  public class ComAdobeGraniteInfocollectorInfoCollectorProperties {
    /// <summary>
    /// Gets or Sets GraniteInfocollectorIncludeThreadDumps
    /// </summary>
    [DataMember(Name="granite.infocollector.includeThreadDumps", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.infocollector.includeThreadDumps")]
    public ConfigNodePropertyBoolean GraniteInfocollectorIncludeThreadDumps { get; set; }

    /// <summary>
    /// Gets or Sets GraniteInfocollectorIncludeHeapDump
    /// </summary>
    [DataMember(Name="granite.infocollector.includeHeapDump", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.infocollector.includeHeapDump")]
    public ConfigNodePropertyBoolean GraniteInfocollectorIncludeHeapDump { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteInfocollectorInfoCollectorProperties {\n");
      sb.Append("  GraniteInfocollectorIncludeThreadDumps: ").Append(GraniteInfocollectorIncludeThreadDumps).Append("\n");
      sb.Append("  GraniteInfocollectorIncludeHeapDump: ").Append(GraniteInfocollectorIncludeHeapDump).Append("\n");
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
