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
  public class ComDayCqDamCoreImplProcessTextExtractionProcessProperties {
    /// <summary>
    /// Gets or Sets MimeTypes
    /// </summary>
    [DataMember(Name="mimeTypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mimeTypes")]
    public ConfigNodePropertyArray MimeTypes { get; set; }

    /// <summary>
    /// Gets or Sets MaxExtract
    /// </summary>
    [DataMember(Name="maxExtract", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxExtract")]
    public ConfigNodePropertyInteger MaxExtract { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplProcessTextExtractionProcessProperties {\n");
      sb.Append("  MimeTypes: ").Append(MimeTypes).Append("\n");
      sb.Append("  MaxExtract: ").Append(MaxExtract).Append("\n");
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
