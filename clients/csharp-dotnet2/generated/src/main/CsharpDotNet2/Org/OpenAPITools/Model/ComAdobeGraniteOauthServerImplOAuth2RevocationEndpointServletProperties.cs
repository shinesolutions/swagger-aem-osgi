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
  public class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties {
    /// <summary>
    /// Gets or Sets SlingServletPaths
    /// </summary>
    [DataMember(Name="sling.servlet.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.servlet.paths")]
    public ConfigNodePropertyString SlingServletPaths { get; set; }

    /// <summary>
    /// Gets or Sets OauthRevocationActive
    /// </summary>
    [DataMember(Name="oauth.revocation.active", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.revocation.active")]
    public ConfigNodePropertyBoolean OauthRevocationActive { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties {\n");
      sb.Append("  SlingServletPaths: ").Append(SlingServletPaths).Append("\n");
      sb.Append("  OauthRevocationActive: ").Append(OauthRevocationActive).Append("\n");
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
