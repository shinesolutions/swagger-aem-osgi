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
  public class ComDayCqDamCoreImplUnzipUnzipConfigProperties {
    /// <summary>
    /// Gets or Sets CqDamConfigUnzipMaxuncompressedsize
    /// </summary>
    [DataMember(Name="cq.dam.config.unzip.maxuncompressedsize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.unzip.maxuncompressedsize")]
    public ConfigNodePropertyInteger CqDamConfigUnzipMaxuncompressedsize { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigUnzipEncoding
    /// </summary>
    [DataMember(Name="cq.dam.config.unzip.encoding", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.unzip.encoding")]
    public ConfigNodePropertyString CqDamConfigUnzipEncoding { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplUnzipUnzipConfigProperties {\n");
      sb.Append("  CqDamConfigUnzipMaxuncompressedsize: ").Append(CqDamConfigUnzipMaxuncompressedsize).Append("\n");
      sb.Append("  CqDamConfigUnzipEncoding: ").Append(CqDamConfigUnzipEncoding).Append("\n");
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
