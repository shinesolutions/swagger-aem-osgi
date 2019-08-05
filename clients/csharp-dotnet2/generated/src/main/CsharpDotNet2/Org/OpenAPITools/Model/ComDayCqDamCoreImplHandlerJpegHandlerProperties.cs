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
  public class ComDayCqDamCoreImplHandlerJpegHandlerProperties {
    /// <summary>
    /// Gets or Sets CqDamEnableExtMetaExtraction
    /// </summary>
    [DataMember(Name="cq.dam.enable.ext.meta.extraction", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.enable.ext.meta.extraction")]
    public ConfigNodePropertyBoolean CqDamEnableExtMetaExtraction { get; set; }

    /// <summary>
    /// Gets or Sets LargeFileThreshold
    /// </summary>
    [DataMember(Name="large_file_threshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "large_file_threshold")]
    public ConfigNodePropertyInteger LargeFileThreshold { get; set; }

    /// <summary>
    /// Gets or Sets LargeCommentThreshold
    /// </summary>
    [DataMember(Name="large_comment_threshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "large_comment_threshold")]
    public ConfigNodePropertyInteger LargeCommentThreshold { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplHandlerJpegHandlerProperties {\n");
      sb.Append("  CqDamEnableExtMetaExtraction: ").Append(CqDamEnableExtMetaExtraction).Append("\n");
      sb.Append("  LargeFileThreshold: ").Append(LargeFileThreshold).Append("\n");
      sb.Append("  LargeCommentThreshold: ").Append(LargeCommentThreshold).Append("\n");
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
