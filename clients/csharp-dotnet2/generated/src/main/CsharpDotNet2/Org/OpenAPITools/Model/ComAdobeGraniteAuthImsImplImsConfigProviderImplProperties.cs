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
  public class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties {
    /// <summary>
    /// Gets or Sets OauthConfigmanagerImsConfigid
    /// </summary>
    [DataMember(Name="oauth.configmanager.ims.configid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "oauth.configmanager.ims.configid")]
    public ConfigNodePropertyString OauthConfigmanagerImsConfigid { get; set; }

    /// <summary>
    /// Gets or Sets ImsOwningEntity
    /// </summary>
    [DataMember(Name="ims.owningEntity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ims.owningEntity")]
    public ConfigNodePropertyString ImsOwningEntity { get; set; }

    /// <summary>
    /// Gets or Sets AemInstanceId
    /// </summary>
    [DataMember(Name="aem.instanceId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "aem.instanceId")]
    public ConfigNodePropertyString AemInstanceId { get; set; }

    /// <summary>
    /// Gets or Sets ImsServiceCode
    /// </summary>
    [DataMember(Name="ims.serviceCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ims.serviceCode")]
    public ConfigNodePropertyString ImsServiceCode { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties {\n");
      sb.Append("  OauthConfigmanagerImsConfigid: ").Append(OauthConfigmanagerImsConfigid).Append("\n");
      sb.Append("  ImsOwningEntity: ").Append(ImsOwningEntity).Append("\n");
      sb.Append("  AemInstanceId: ").Append(AemInstanceId).Append("\n");
      sb.Append("  ImsServiceCode: ").Append(ImsServiceCode).Append("\n");
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
