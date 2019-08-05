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
  public class ComAdobeGraniteAcpPlatformPlatformServletProperties {
    /// <summary>
    /// Gets or Sets QueryLimit
    /// </summary>
    [DataMember(Name="query.limit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "query.limit")]
    public ConfigNodePropertyInteger QueryLimit { get; set; }

    /// <summary>
    /// Gets or Sets FileTypeExtensionMap
    /// </summary>
    [DataMember(Name="file.type.extension.map", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "file.type.extension.map")]
    public ConfigNodePropertyArray FileTypeExtensionMap { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteAcpPlatformPlatformServletProperties {\n");
      sb.Append("  QueryLimit: ").Append(QueryLimit).Append("\n");
      sb.Append("  FileTypeExtensionMap: ").Append(FileTypeExtensionMap).Append("\n");
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
