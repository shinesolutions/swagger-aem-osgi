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
  public class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties {
    /// <summary>
    /// Gets or Sets OauthTokenRevocationActive
    /// </summary>
    [DataMember(Name="oauth.token.revocation.active", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.token.revocation.active")]
    public ConfigNodePropertyBoolean OauthTokenRevocationActive { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties {\n");
      sb.Append("  OauthTokenRevocationActive: ").Append(OauthTokenRevocationActive).Append("\n");
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
