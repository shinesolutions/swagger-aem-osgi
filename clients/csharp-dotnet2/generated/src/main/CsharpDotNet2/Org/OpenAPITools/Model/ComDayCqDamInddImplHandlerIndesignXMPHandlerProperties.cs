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
  public class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties {
    /// <summary>
    /// Gets or Sets ProcessLabel
    /// </summary>
    [DataMember(Name="process.label", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "process.label")]
    public ConfigNodePropertyString ProcessLabel { get; set; }

    /// <summary>
    /// Gets or Sets ExtractPages
    /// </summary>
    [DataMember(Name="extract.pages", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "extract.pages")]
    public ConfigNodePropertyBoolean ExtractPages { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties {\n");
      sb.Append("  ProcessLabel: ").Append(ProcessLabel).Append("\n");
      sb.Append("  ExtractPages: ").Append(ExtractPages).Append("\n");
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
