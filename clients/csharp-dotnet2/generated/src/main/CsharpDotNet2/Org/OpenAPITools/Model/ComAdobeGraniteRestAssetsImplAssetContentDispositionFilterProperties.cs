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
  public class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties {
    /// <summary>
    /// Gets or Sets MimeAllowEmpty
    /// </summary>
    [DataMember(Name="mime.allowEmpty", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mime.allowEmpty")]
    public ConfigNodePropertyBoolean MimeAllowEmpty { get; set; }

    /// <summary>
    /// Gets or Sets MimeAllowed
    /// </summary>
    [DataMember(Name="mime.allowed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mime.allowed")]
    public ConfigNodePropertyArray MimeAllowed { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties {\n");
      sb.Append("  MimeAllowEmpty: ").Append(MimeAllowEmpty).Append("\n");
      sb.Append("  MimeAllowed: ").Append(MimeAllowed).Append("\n");
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
