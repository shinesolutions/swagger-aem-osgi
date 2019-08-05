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
  public class ComAdobeGraniteRestImplServletDefaultGETServletProperties {
    /// <summary>
    /// Gets or Sets DefaultLimit
    /// </summary>
    [DataMember(Name="default.limit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.limit")]
    public ConfigNodePropertyInteger DefaultLimit { get; set; }

    /// <summary>
    /// Gets or Sets UseAbsoluteUri
    /// </summary>
    [DataMember(Name="use.absolute.uri", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "use.absolute.uri")]
    public ConfigNodePropertyBoolean UseAbsoluteUri { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteRestImplServletDefaultGETServletProperties {\n");
      sb.Append("  DefaultLimit: ").Append(DefaultLimit).Append("\n");
      sb.Append("  UseAbsoluteUri: ").Append(UseAbsoluteUri).Append("\n");
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
