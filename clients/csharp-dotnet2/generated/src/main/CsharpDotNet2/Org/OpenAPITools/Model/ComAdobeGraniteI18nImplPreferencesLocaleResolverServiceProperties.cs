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
  public class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties {
    /// <summary>
    /// Gets or Sets SecurityPreferencesName
    /// </summary>
    [DataMember(Name="security.preferences.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "security.preferences.name")]
    public ConfigNodePropertyString SecurityPreferencesName { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties {\n");
      sb.Append("  SecurityPreferencesName: ").Append(SecurityPreferencesName).Append("\n");
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
