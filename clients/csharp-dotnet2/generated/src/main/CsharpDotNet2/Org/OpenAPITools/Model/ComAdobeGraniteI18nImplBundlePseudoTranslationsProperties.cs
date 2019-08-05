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
  public class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties {
    /// <summary>
    /// Gets or Sets PseudoPatterns
    /// </summary>
    [DataMember(Name="pseudo.patterns", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pseudo.patterns")]
    public ConfigNodePropertyArray PseudoPatterns { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties {\n");
      sb.Append("  PseudoPatterns: ").Append(PseudoPatterns).Append("\n");
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
