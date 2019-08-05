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
  public class ComAdobeGraniteAuthImsImplIMSProviderImplProperties {
    /// <summary>
    /// Gets or Sets OauthProviderId
    /// </summary>
    [DataMember(Name="oauth.provider.id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.id")]
    public ConfigNodePropertyString OauthProviderId { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderImsAuthorizationUrl
    /// </summary>
    [DataMember(Name="oauth.provider.ims.authorization.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.ims.authorization.url")]
    public ConfigNodePropertyString OauthProviderImsAuthorizationUrl { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderImsTokenUrl
    /// </summary>
    [DataMember(Name="oauth.provider.ims.token.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.ims.token.url")]
    public ConfigNodePropertyString OauthProviderImsTokenUrl { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderImsProfileUrl
    /// </summary>
    [DataMember(Name="oauth.provider.ims.profile.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.ims.profile.url")]
    public ConfigNodePropertyString OauthProviderImsProfileUrl { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderImsExtendedDetailsUrls
    /// </summary>
    [DataMember(Name="oauth.provider.ims.extended.details.urls", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.ims.extended.details.urls")]
    public ConfigNodePropertyArray OauthProviderImsExtendedDetailsUrls { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderImsValidateTokenUrl
    /// </summary>
    [DataMember(Name="oauth.provider.ims.validate.token.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.ims.validate.token.url")]
    public ConfigNodePropertyString OauthProviderImsValidateTokenUrl { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderImsSessionProperty
    /// </summary>
    [DataMember(Name="oauth.provider.ims.session.property", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.ims.session.property")]
    public ConfigNodePropertyString OauthProviderImsSessionProperty { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderImsServiceTokenClientId
    /// </summary>
    [DataMember(Name="oauth.provider.ims.service.token.client.id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.ims.service.token.client.id")]
    public ConfigNodePropertyString OauthProviderImsServiceTokenClientId { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderImsServiceTokenClientSecret
    /// </summary>
    [DataMember(Name="oauth.provider.ims.service.token.client.secret", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.ims.service.token.client.secret")]
    public ConfigNodePropertyString OauthProviderImsServiceTokenClientSecret { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderImsServiceToken
    /// </summary>
    [DataMember(Name="oauth.provider.ims.service.token", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.ims.service.token")]
    public ConfigNodePropertyString OauthProviderImsServiceToken { get; set; }

    /// <summary>
    /// Gets or Sets ImsOrgRef
    /// </summary>
    [DataMember(Name="ims.org.ref", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ims.org.ref")]
    public ConfigNodePropertyString ImsOrgRef { get; set; }

    /// <summary>
    /// Gets or Sets ImsGroupMapping
    /// </summary>
    [DataMember(Name="ims.group.mapping", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ims.group.mapping")]
    public ConfigNodePropertyArray ImsGroupMapping { get; set; }

    /// <summary>
    /// Gets or Sets OauthProviderImsOnlyLicenseGroup
    /// </summary>
    [DataMember(Name="oauth.provider.ims.only.license.group", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.ims.only.license.group")]
    public ConfigNodePropertyBoolean OauthProviderImsOnlyLicenseGroup { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteAuthImsImplIMSProviderImplProperties {\n");
      sb.Append("  OauthProviderId: ").Append(OauthProviderId).Append("\n");
      sb.Append("  OauthProviderImsAuthorizationUrl: ").Append(OauthProviderImsAuthorizationUrl).Append("\n");
      sb.Append("  OauthProviderImsTokenUrl: ").Append(OauthProviderImsTokenUrl).Append("\n");
      sb.Append("  OauthProviderImsProfileUrl: ").Append(OauthProviderImsProfileUrl).Append("\n");
      sb.Append("  OauthProviderImsExtendedDetailsUrls: ").Append(OauthProviderImsExtendedDetailsUrls).Append("\n");
      sb.Append("  OauthProviderImsValidateTokenUrl: ").Append(OauthProviderImsValidateTokenUrl).Append("\n");
      sb.Append("  OauthProviderImsSessionProperty: ").Append(OauthProviderImsSessionProperty).Append("\n");
      sb.Append("  OauthProviderImsServiceTokenClientId: ").Append(OauthProviderImsServiceTokenClientId).Append("\n");
      sb.Append("  OauthProviderImsServiceTokenClientSecret: ").Append(OauthProviderImsServiceTokenClientSecret).Append("\n");
      sb.Append("  OauthProviderImsServiceToken: ").Append(OauthProviderImsServiceToken).Append("\n");
      sb.Append("  ImsOrgRef: ").Append(ImsOrgRef).Append("\n");
      sb.Append("  ImsGroupMapping: ").Append(ImsGroupMapping).Append("\n");
      sb.Append("  OauthProviderImsOnlyLicenseGroup: ").Append(OauthProviderImsOnlyLicenseGroup).Append("\n");
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
