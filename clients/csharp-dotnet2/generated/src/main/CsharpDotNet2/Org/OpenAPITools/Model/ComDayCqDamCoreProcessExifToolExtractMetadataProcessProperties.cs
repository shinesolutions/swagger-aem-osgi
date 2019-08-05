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
  public class ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties {
    /// <summary>
    /// Gets or Sets ProcessLabel
    /// </summary>
    [DataMember(Name="process.label", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "process.label")]
    public ConfigNodePropertyString ProcessLabel { get; set; }

    /// <summary>
    /// Gets or Sets CqDamEnableSha1
    /// </summary>
    [DataMember(Name="cq.dam.enable.sha1", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.enable.sha1")]
    public ConfigNodePropertyBoolean CqDamEnableSha1 { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties {\n");
      sb.Append("  ProcessLabel: ").Append(ProcessLabel).Append("\n");
      sb.Append("  CqDamEnableSha1: ").Append(CqDamEnableSha1).Append("\n");
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
