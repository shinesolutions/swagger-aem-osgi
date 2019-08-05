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
  public class ComAdobeGraniteCsrfImplCSRFServletProperties {
    /// <summary>
    /// Gets or Sets CsrfTokenExpiresIn
    /// </summary>
    [DataMember(Name="csrf.token.expires.in", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "csrf.token.expires.in")]
    public ConfigNodePropertyInteger CsrfTokenExpiresIn { get; set; }

    /// <summary>
    /// Gets or Sets SlingAuthRequirements
    /// </summary>
    [DataMember(Name="sling.auth.requirements", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.auth.requirements")]
    public ConfigNodePropertyString SlingAuthRequirements { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteCsrfImplCSRFServletProperties {\n");
      sb.Append("  CsrfTokenExpiresIn: ").Append(CsrfTokenExpiresIn).Append("\n");
      sb.Append("  SlingAuthRequirements: ").Append(SlingAuthRequirements).Append("\n");
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
