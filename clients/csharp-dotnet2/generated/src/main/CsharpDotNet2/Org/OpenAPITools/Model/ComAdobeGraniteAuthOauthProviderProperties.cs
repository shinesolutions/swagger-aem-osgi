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
  public class ComAdobeGraniteAuthOauthProviderProperties {
    /// <summary>
    /// Gets or Sets OauthConfigId
    /// </summary>
    [DataMember(Name="oauth.config.id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.config.id")]
    public ConfigNodePropertyString OauthConfigId { get; set; }

    /// <summary>
    /// Gets or Sets OauthClientId
    /// </summary>
    [DataMember(Name="oauth.client.id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.client.id")]
    public ConfigNodePropertyString OauthClientId { get; set; }

    /// <summary>
    /// Gets or Sets OauthClientSecret
    /// </summary>
    [DataMember(Name="oauth.client.secret", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.client.secret")]
    public ConfigNodePropertyString OauthClientSecret { get; set; }

    /// <summary>
    /// Gets or Sets OauthScope
    /// </summary>
    [DataMember(Name="oauth.scope", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.scope")]
    public ConfigNodePropertyArray OauthScope { get; set; }

    /// <summary>
    /// Gets or Sets OauthConfigProviderId
    /// </summary>
    [DataMember(Name="oauth.config.provider.id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.config.provider.id")]
    public ConfigNodePropertyString OauthConfigProviderId { get; set; }

    /// <summary>
    /// Gets or Sets OauthCreateUsers
    /// </summary>
    [DataMember(Name="oauth.create.users", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.create.users")]
    public ConfigNodePropertyBoolean OauthCreateUsers { get; set; }

    /// <summary>
    /// Gets or Sets OauthUseridProperty
    /// </summary>
    [DataMember(Name="oauth.userid.property", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.userid.property")]
    public ConfigNodePropertyString OauthUseridProperty { get; set; }

    /// <summary>
    /// Gets or Sets ForceStrictUsernameMatching
    /// </summary>
    [DataMember(Name="force.strict.username.matching", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "force.strict.username.matching")]
    public ConfigNodePropertyBoolean ForceStrictUsernameMatching { get; set; }

    /// <summary>
    /// Gets or Sets OauthEncodeUserids
    /// </summary>
    [DataMember(Name="oauth.encode.userids", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.encode.userids")]
    public ConfigNodePropertyBoolean OauthEncodeUserids { get; set; }

    /// <summary>
    /// Gets or Sets OauthHashUserids
    /// </summary>
    [DataMember(Name="oauth.hash.userids", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.hash.userids")]
    public ConfigNodePropertyBoolean OauthHashUserids { get; set; }

    /// <summary>
    /// Gets or Sets OauthCallBackUrl
    /// </summary>
    [DataMember(Name="oauth.callBackUrl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.callBackUrl")]
    public ConfigNodePropertyString OauthCallBackUrl { get; set; }

    /// <summary>
    /// Gets or Sets OauthAccessTokenPersist
    /// </summary>
    [DataMember(Name="oauth.access.token.persist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.access.token.persist")]
    public ConfigNodePropertyBoolean OauthAccessTokenPersist { get; set; }

    /// <summary>
    /// Gets or Sets OauthAccessTokenPersistCookie
    /// </summary>
    [DataMember(Name="oauth.access.token.persist.cookie", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.access.token.persist.cookie")]
    public ConfigNodePropertyBoolean OauthAccessTokenPersistCookie { get; set; }

    /// <summary>
    /// Gets or Sets OauthCsrfStateProtection
    /// </summary>
    [DataMember(Name="oauth.csrf.state.protection", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.csrf.state.protection")]
    public ConfigNodePropertyBoolean OauthCsrfStateProtection { get; set; }

    /// <summary>
    /// Gets or Sets OauthRedirectRequestParams
    /// </summary>
    [DataMember(Name="oauth.redirect.request.params", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.redirect.request.params")]
    public ConfigNodePropertyBoolean OauthRedirectRequestParams { get; set; }

    /// <summary>
    /// Gets or Sets OauthConfigSiblingsAllow
    /// </summary>
    [DataMember(Name="oauth.config.siblings.allow", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.config.siblings.allow")]
    public ConfigNodePropertyBoolean OauthConfigSiblingsAllow { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteAuthOauthProviderProperties {\n");
      sb.Append("  OauthConfigId: ").Append(OauthConfigId).Append("\n");
      sb.Append("  OauthClientId: ").Append(OauthClientId).Append("\n");
      sb.Append("  OauthClientSecret: ").Append(OauthClientSecret).Append("\n");
      sb.Append("  OauthScope: ").Append(OauthScope).Append("\n");
      sb.Append("  OauthConfigProviderId: ").Append(OauthConfigProviderId).Append("\n");
      sb.Append("  OauthCreateUsers: ").Append(OauthCreateUsers).Append("\n");
      sb.Append("  OauthUseridProperty: ").Append(OauthUseridProperty).Append("\n");
      sb.Append("  ForceStrictUsernameMatching: ").Append(ForceStrictUsernameMatching).Append("\n");
      sb.Append("  OauthEncodeUserids: ").Append(OauthEncodeUserids).Append("\n");
      sb.Append("  OauthHashUserids: ").Append(OauthHashUserids).Append("\n");
      sb.Append("  OauthCallBackUrl: ").Append(OauthCallBackUrl).Append("\n");
      sb.Append("  OauthAccessTokenPersist: ").Append(OauthAccessTokenPersist).Append("\n");
      sb.Append("  OauthAccessTokenPersistCookie: ").Append(OauthAccessTokenPersistCookie).Append("\n");
      sb.Append("  OauthCsrfStateProtection: ").Append(OauthCsrfStateProtection).Append("\n");
      sb.Append("  OauthRedirectRequestParams: ").Append(OauthRedirectRequestParams).Append("\n");
      sb.Append("  OauthConfigSiblingsAllow: ").Append(OauthConfigSiblingsAllow).Append("\n");
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
