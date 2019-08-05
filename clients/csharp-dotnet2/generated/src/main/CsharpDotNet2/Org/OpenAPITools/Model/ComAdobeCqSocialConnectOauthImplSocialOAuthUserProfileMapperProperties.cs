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
  public class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties {
    /// <summary>
    /// Gets or Sets Facebook
    /// </summary>
    [DataMember(Name="facebook", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "facebook")]
    public ConfigNodePropertyArray Facebook { get; set; }

    /// <summary>
    /// Gets or Sets Twitter
    /// </summary>
    [DataMember(Name="twitter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "twitter")]
    public ConfigNodePropertyArray Twitter { get; set; }

    /// <summary>
    /// Gets or Sets ProviderConfigUserFolder
    /// </summary>
    [DataMember(Name="provider.config.user.folder", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "provider.config.user.folder")]
    public ConfigNodePropertyString ProviderConfigUserFolder { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties {\n");
      sb.Append("  Facebook: ").Append(Facebook).Append("\n");
      sb.Append("  Twitter: ").Append(Twitter).Append("\n");
      sb.Append("  ProviderConfigUserFolder: ").Append(ProviderConfigUserFolder).Append("\n");
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
