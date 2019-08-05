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
  public class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties {
    /// <summary>
    /// Gets or Sets CorsEnabling
    /// </summary>
    [DataMember(Name="cors.enabling", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cors.enabling")]
    public ConfigNodePropertyBoolean CorsEnabling { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties {\n");
      sb.Append("  CorsEnabling: ").Append(CorsEnabling).Append("\n");
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
