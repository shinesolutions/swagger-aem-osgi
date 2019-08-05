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
  public class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {
    /// <summary>
    /// Gets or Sets TotalWidth
    /// </summary>
    [DataMember(Name="totalWidth", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "totalWidth")]
    public ConfigNodePropertyInteger TotalWidth { get; set; }

    /// <summary>
    /// Gets or Sets ColWidthName
    /// </summary>
    [DataMember(Name="colWidthName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "colWidthName")]
    public ConfigNodePropertyInteger ColWidthName { get; set; }

    /// <summary>
    /// Gets or Sets ColWidthResult
    /// </summary>
    [DataMember(Name="colWidthResult", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "colWidthResult")]
    public ConfigNodePropertyInteger ColWidthResult { get; set; }

    /// <summary>
    /// Gets or Sets ColWidthTiming
    /// </summary>
    [DataMember(Name="colWidthTiming", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "colWidthTiming")]
    public ConfigNodePropertyInteger ColWidthTiming { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {\n");
      sb.Append("  TotalWidth: ").Append(TotalWidth).Append("\n");
      sb.Append("  ColWidthName: ").Append(ColWidthName).Append("\n");
      sb.Append("  ColWidthResult: ").Append(ColWidthResult).Append("\n");
      sb.Append("  ColWidthTiming: ").Append(ColWidthTiming).Append("\n");
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
