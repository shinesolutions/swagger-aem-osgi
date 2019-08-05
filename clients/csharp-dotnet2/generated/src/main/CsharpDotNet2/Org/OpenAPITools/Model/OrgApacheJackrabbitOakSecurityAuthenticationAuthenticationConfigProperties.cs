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
  public class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties {
    /// <summary>
    /// Gets or Sets OrgApacheJackrabbitOakAuthenticationAppName
    /// </summary>
    [DataMember(Name="org.apache.jackrabbit.oak.authentication.appName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.jackrabbit.oak.authentication.appName")]
    public ConfigNodePropertyString OrgApacheJackrabbitOakAuthenticationAppName { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheJackrabbitOakAuthenticationConfigSpiName
    /// </summary>
    [DataMember(Name="org.apache.jackrabbit.oak.authentication.configSpiName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.jackrabbit.oak.authentication.configSpiName")]
    public ConfigNodePropertyString OrgApacheJackrabbitOakAuthenticationConfigSpiName { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties {\n");
      sb.Append("  OrgApacheJackrabbitOakAuthenticationAppName: ").Append(OrgApacheJackrabbitOakAuthenticationAppName).Append("\n");
      sb.Append("  OrgApacheJackrabbitOakAuthenticationConfigSpiName: ").Append(OrgApacheJackrabbitOakAuthenticationConfigSpiName).Append("\n");
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
