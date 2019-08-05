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
  public class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties {
    /// <summary>
    /// Gets or Sets OauthProviderId
    /// </summary>
    [DataMember(Name="oauth.provider.id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.id")]
    public ConfigNodePropertyString OauthProviderId { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderGithubAuthorizationUrl
    /// </summary>
    [DataMember(Name="oauth.provider.github.authorization.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.github.authorization.url")]
    public ConfigNodePropertyString OauthProviderGithubAuthorizationUrl { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderGithubTokenUrl
    /// </summary>
    [DataMember(Name="oauth.provider.github.token.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.github.token.url")]
    public ConfigNodePropertyString OauthProviderGithubTokenUrl { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderGithubProfileUrl
    /// </summary>
    [DataMember(Name="oauth.provider.github.profile.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.github.profile.url")]
    public ConfigNodePropertyString OauthProviderGithubProfileUrl { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties {\n");
      sb.Append("  OauthProviderId: ").Append(OauthProviderId).Append("\n");
      sb.Append("  OauthProviderGithubAuthorizationUrl: ").Append(OauthProviderGithubAuthorizationUrl).Append("\n");
      sb.Append("  OauthProviderGithubTokenUrl: ").Append(OauthProviderGithubTokenUrl).Append("\n");
      sb.Append("  OauthProviderGithubProfileUrl: ").Append(OauthProviderGithubProfileUrl).Append("\n");
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
