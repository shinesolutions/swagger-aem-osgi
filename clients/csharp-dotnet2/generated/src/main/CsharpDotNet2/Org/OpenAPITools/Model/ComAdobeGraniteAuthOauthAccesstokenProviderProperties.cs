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
  public class ComAdobeGraniteAuthOauthAccesstokenProviderProperties {
    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public ConfigNodePropertyString Name { get; set; }

    /// <summary>
    /// Gets or Sets AuthTokenProviderTitle
    /// </summary>
    [DataMember(Name="auth.token.provider.title", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.token.provider.title")]
    public ConfigNodePropertyString AuthTokenProviderTitle { get; set; }

    /// <summary>
    /// Gets or Sets AuthTokenProviderDefaultClaims
    /// </summary>
    [DataMember(Name="auth.token.provider.default.claims", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.token.provider.default.claims")]
    public ConfigNodePropertyArray AuthTokenProviderDefaultClaims { get; set; }

    /// <summary>
    /// Gets or Sets AuthTokenProviderEndpoint
    /// </summary>
    [DataMember(Name="auth.token.provider.endpoint", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.token.provider.endpoint")]
    public ConfigNodePropertyString AuthTokenProviderEndpoint { get; set; }

    /// <summary>
    /// Gets or Sets AuthAccessTokenRequest
    /// </summary>
    [DataMember(Name="auth.access.token.request", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.access.token.request")]
    public ConfigNodePropertyString AuthAccessTokenRequest { get; set; }

    /// <summary>
    /// Gets or Sets AuthTokenProviderKeypairAlias
    /// </summary>
    [DataMember(Name="auth.token.provider.keypair.alias", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.token.provider.keypair.alias")]
    public ConfigNodePropertyString AuthTokenProviderKeypairAlias { get; set; }

    /// <summary>
    /// Gets or Sets AuthTokenProviderConnTimeout
    /// </summary>
    [DataMember(Name="auth.token.provider.conn.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.token.provider.conn.timeout")]
    public ConfigNodePropertyInteger AuthTokenProviderConnTimeout { get; set; }

    /// <summary>
    /// Gets or Sets AuthTokenProviderSoTimeout
    /// </summary>
    [DataMember(Name="auth.token.provider.so.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.token.provider.so.timeout")]
    public ConfigNodePropertyInteger AuthTokenProviderSoTimeout { get; set; }

    /// <summary>
    /// Gets or Sets AuthTokenProviderClientId
    /// </summary>
    [DataMember(Name="auth.token.provider.client.id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.token.provider.client.id")]
    public ConfigNodePropertyString AuthTokenProviderClientId { get; set; }

    /// <summary>
    /// Gets or Sets AuthTokenProviderScope
    /// </summary>
    [DataMember(Name="auth.token.provider.scope", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.token.provider.scope")]
    public ConfigNodePropertyString AuthTokenProviderScope { get; set; }

    /// <summary>
    /// Gets or Sets AuthTokenProviderReuseAccessToken
    /// </summary>
    [DataMember(Name="auth.token.provider.reuse.access.token", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.token.provider.reuse.access.token")]
    public ConfigNodePropertyBoolean AuthTokenProviderReuseAccessToken { get; set; }

    /// <summary>
    /// Gets or Sets AuthTokenProviderRelaxedSsl
    /// </summary>
    [DataMember(Name="auth.token.provider.relaxed.ssl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.token.provider.relaxed.ssl")]
    public ConfigNodePropertyBoolean AuthTokenProviderRelaxedSsl { get; set; }

    /// <summary>
    /// Gets or Sets TokenRequestCustomizerType
    /// </summary>
    [DataMember(Name="token.request.customizer.type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "token.request.customizer.type")]
    public ConfigNodePropertyString TokenRequestCustomizerType { get; set; }

    /// <summary>
    /// Gets or Sets AuthTokenValidatorType
    /// </summary>
    [DataMember(Name="auth.token.validator.type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.token.validator.type")]
    public ConfigNodePropertyString AuthTokenValidatorType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteAuthOauthAccesstokenProviderProperties {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  AuthTokenProviderTitle: ").Append(AuthTokenProviderTitle).Append("\n");
      sb.Append("  AuthTokenProviderDefaultClaims: ").Append(AuthTokenProviderDefaultClaims).Append("\n");
      sb.Append("  AuthTokenProviderEndpoint: ").Append(AuthTokenProviderEndpoint).Append("\n");
      sb.Append("  AuthAccessTokenRequest: ").Append(AuthAccessTokenRequest).Append("\n");
      sb.Append("  AuthTokenProviderKeypairAlias: ").Append(AuthTokenProviderKeypairAlias).Append("\n");
      sb.Append("  AuthTokenProviderConnTimeout: ").Append(AuthTokenProviderConnTimeout).Append("\n");
      sb.Append("  AuthTokenProviderSoTimeout: ").Append(AuthTokenProviderSoTimeout).Append("\n");
      sb.Append("  AuthTokenProviderClientId: ").Append(AuthTokenProviderClientId).Append("\n");
      sb.Append("  AuthTokenProviderScope: ").Append(AuthTokenProviderScope).Append("\n");
      sb.Append("  AuthTokenProviderReuseAccessToken: ").Append(AuthTokenProviderReuseAccessToken).Append("\n");
      sb.Append("  AuthTokenProviderRelaxedSsl: ").Append(AuthTokenProviderRelaxedSsl).Append("\n");
      sb.Append("  TokenRequestCustomizerType: ").Append(TokenRequestCustomizerType).Append("\n");
      sb.Append("  AuthTokenValidatorType: ").Append(AuthTokenValidatorType).Append("\n");
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
