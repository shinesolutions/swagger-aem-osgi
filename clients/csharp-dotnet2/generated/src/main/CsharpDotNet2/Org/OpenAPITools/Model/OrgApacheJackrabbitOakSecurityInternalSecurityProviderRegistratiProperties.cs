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
  public class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties {
    /// <summary>
    /// Gets or Sets RequiredServicePids
    /// </summary>
    [DataMember(Name="requiredServicePids", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "requiredServicePids")]
    public ConfigNodePropertyArray RequiredServicePids { get; set; }

    /// <summary>
    /// Gets or Sets AuthorizationCompositionType
    /// </summary>
    [DataMember(Name="authorizationCompositionType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "authorizationCompositionType")]
    public ConfigNodePropertyDropDown AuthorizationCompositionType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties {\n");
      sb.Append("  RequiredServicePids: ").Append(RequiredServicePids).Append("\n");
      sb.Append("  AuthorizationCompositionType: ").Append(AuthorizationCompositionType).Append("\n");
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
