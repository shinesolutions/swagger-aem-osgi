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
  public class ComAdobeGraniteAuthOauthImplGraniteProviderProperties {
    /// <summary>
    /// Gets or Sets OauthProviderId
    /// </summary>
    [DataMember(Name="oauth.provider.id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.id")]
    public ConfigNodePropertyString OauthProviderId { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderGraniteAuthorizationUrl
    /// </summary>
    [DataMember(Name="oauth.provider.granite.authorization.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.granite.authorization.url")]
    public ConfigNodePropertyString OauthProviderGraniteAuthorizationUrl { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderGraniteTokenUrl
    /// </summary>
    [DataMember(Name="oauth.provider.granite.token.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.granite.token.url")]
    public ConfigNodePropertyString OauthProviderGraniteTokenUrl { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderGraniteProfileUrl
    /// </summary>
    [DataMember(Name="oauth.provider.granite.profile.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.granite.profile.url")]
    public ConfigNodePropertyString OauthProviderGraniteProfileUrl { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderGraniteExtendedDetailsUrls
    /// </summary>
    [DataMember(Name="oauth.provider.granite.extended.details.urls", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.granite.extended.details.urls")]
    public ConfigNodePropertyString OauthProviderGraniteExtendedDetailsUrls { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteAuthOauthImplGraniteProviderProperties {\n");
      sb.Append("  OauthProviderId: ").Append(OauthProviderId).Append("\n");
      sb.Append("  OauthProviderGraniteAuthorizationUrl: ").Append(OauthProviderGraniteAuthorizationUrl).Append("\n");
      sb.Append("  OauthProviderGraniteTokenUrl: ").Append(OauthProviderGraniteTokenUrl).Append("\n");
      sb.Append("  OauthProviderGraniteProfileUrl: ").Append(OauthProviderGraniteProfileUrl).Append("\n");
      sb.Append("  OauthProviderGraniteExtendedDetailsUrls: ").Append(OauthProviderGraniteExtendedDetailsUrls).Append("\n");
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
