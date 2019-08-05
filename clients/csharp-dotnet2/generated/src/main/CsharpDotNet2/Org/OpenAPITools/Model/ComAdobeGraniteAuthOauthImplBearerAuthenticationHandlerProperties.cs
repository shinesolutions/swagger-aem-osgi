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
  public class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties {
    /// <summary>
    /// Gets or Sets Path
    /// </summary>
    [DataMember(Name="path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path")]
    public ConfigNodePropertyString Path { get; set; }

    /// <summary>
    /// Gets or Sets OauthClientIdsAllowed
    /// </summary>
    [DataMember(Name="oauth.clientIds.allowed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.clientIds.allowed")]
    public ConfigNodePropertyArray OauthClientIdsAllowed { get; set; }

    /// <summary>
    /// Gets or Sets AuthBearerSyncIms
    /// </summary>
    [DataMember(Name="auth.bearer.sync.ims", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.bearer.sync.ims")]
    public ConfigNodePropertyBoolean AuthBearerSyncIms { get; set; }

    /// <summary>
    /// Gets or Sets AuthTokenRequestParameter
    /// </summary>
    [DataMember(Name="auth.tokenRequestParameter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.tokenRequestParameter")]
    public ConfigNodePropertyString AuthTokenRequestParameter { get; set; }

    /// <summary>
    /// Gets or Sets OauthBearerConfigid
    /// </summary>
    [DataMember(Name="oauth.bearer.configid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.bearer.configid")]
    public ConfigNodePropertyString OauthBearerConfigid { get; set; }

    /// <summary>
    /// Gets or Sets OauthJwtSupport
    /// </summary>
    [DataMember(Name="oauth.jwt.support", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.jwt.support")]
    public ConfigNodePropertyBoolean OauthJwtSupport { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties {\n");
      sb.Append("  Path: ").Append(Path).Append("\n");
      sb.Append("  OauthClientIdsAllowed: ").Append(OauthClientIdsAllowed).Append("\n");
      sb.Append("  AuthBearerSyncIms: ").Append(AuthBearerSyncIms).Append("\n");
      sb.Append("  AuthTokenRequestParameter: ").Append(AuthTokenRequestParameter).Append("\n");
      sb.Append("  OauthBearerConfigid: ").Append(OauthBearerConfigid).Append("\n");
      sb.Append("  OauthJwtSupport: ").Append(OauthJwtSupport).Append("\n");
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
