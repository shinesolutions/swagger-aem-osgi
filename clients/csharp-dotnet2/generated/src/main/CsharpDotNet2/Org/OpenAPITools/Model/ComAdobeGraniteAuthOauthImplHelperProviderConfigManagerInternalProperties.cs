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
  public class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties {
    /// <summary>
    /// Gets or Sets OauthCookieLoginTimeout
    /// </summary>
    [DataMember(Name="oauth.cookie.login.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.cookie.login.timeout")]
    public ConfigNodePropertyString OauthCookieLoginTimeout { get; set; }

    /// <summary>
    /// Gets or Sets OauthCookieMaxAge
    /// </summary>
    [DataMember(Name="oauth.cookie.max.age", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.cookie.max.age")]
    public ConfigNodePropertyString OauthCookieMaxAge { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties {\n");
      sb.Append("  OauthCookieLoginTimeout: ").Append(OauthCookieLoginTimeout).Append("\n");
      sb.Append("  OauthCookieMaxAge: ").Append(OauthCookieMaxAge).Append("\n");
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
