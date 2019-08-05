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
  public class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties {
    /// <summary>
    /// Gets or Sets OauthProviderId
    /// </summary>
    [DataMember(Name="oauth.provider.id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.provider.id")]
    public ConfigNodePropertyString OauthProviderId { get; set; }

    /// <summary>
    /// Gets or Sets OauthCloudConfigRoot
    /// </summary>
    [DataMember(Name="oauth.cloud.config.root", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.cloud.config.root")]
    public ConfigNodePropertyString OauthCloudConfigRoot { get; set; }

    /// <summary>
    /// Gets or Sets ProviderConfigRoot
    /// </summary>
    [DataMember(Name="provider.config.root", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "provider.config.root")]
    public ConfigNodePropertyString ProviderConfigRoot { get; set; }

    /// <summary>
    /// Gets or Sets ProviderConfigUserFolder
    /// </summary>
    [DataMember(Name="provider.config.user.folder", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "provider.config.user.folder")]
    public ConfigNodePropertyDropDown ProviderConfigUserFolder { get; set; }

    /// <summary>
    /// Gets or Sets ProviderConfigTwitterEnableParams
    /// </summary>
    [DataMember(Name="provider.config.twitter.enable.params", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "provider.config.twitter.enable.params")]
    public ConfigNodePropertyBoolean ProviderConfigTwitterEnableParams { get; set; }

    /// <summary>
    /// Gets or Sets ProviderConfigTwitterParams
    /// </summary>
    [DataMember(Name="provider.config.twitter.params", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "provider.config.twitter.params")]
    public ConfigNodePropertyArray ProviderConfigTwitterParams { get; set; }

    /// <summary>
    /// Gets or Sets ProviderConfigRefreshUserdataEnabled
    /// </summary>
    [DataMember(Name="provider.config.refresh.userdata.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "provider.config.refresh.userdata.enabled")]
    public ConfigNodePropertyBoolean ProviderConfigRefreshUserdataEnabled { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties {\n");
      sb.Append("  OauthProviderId: ").Append(OauthProviderId).Append("\n");
      sb.Append("  OauthCloudConfigRoot: ").Append(OauthCloudConfigRoot).Append("\n");
      sb.Append("  ProviderConfigRoot: ").Append(ProviderConfigRoot).Append("\n");
      sb.Append("  ProviderConfigUserFolder: ").Append(ProviderConfigUserFolder).Append("\n");
      sb.Append("  ProviderConfigTwitterEnableParams: ").Append(ProviderConfigTwitterEnableParams).Append("\n");
      sb.Append("  ProviderConfigTwitterParams: ").Append(ProviderConfigTwitterParams).Append("\n");
      sb.Append("  ProviderConfigRefreshUserdataEnabled: ").Append(ProviderConfigRefreshUserdataEnabled).Append("\n");
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
