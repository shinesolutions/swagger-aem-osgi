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
  public class OrgApacheHttpProxyconfiguratorProperties {
    /// <summary>
    /// Gets or Sets ProxyEnabled
    /// </summary>
    [DataMember(Name="proxy.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "proxy.enabled")]
    public ConfigNodePropertyBoolean ProxyEnabled { get; set; }

    /// <summary>
    /// Gets or Sets ProxyHost
    /// </summary>
    [DataMember(Name="proxy.host", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "proxy.host")]
    public ConfigNodePropertyString ProxyHost { get; set; }

    /// <summary>
    /// Gets or Sets ProxyPort
    /// </summary>
    [DataMember(Name="proxy.port", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "proxy.port")]
    public ConfigNodePropertyInteger ProxyPort { get; set; }

    /// <summary>
    /// Gets or Sets ProxyUser
    /// </summary>
    [DataMember(Name="proxy.user", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "proxy.user")]
    public ConfigNodePropertyString ProxyUser { get; set; }

    /// <summary>
    /// Gets or Sets ProxyPassword
    /// </summary>
    [DataMember(Name="proxy.password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "proxy.password")]
    public ConfigNodePropertyString ProxyPassword { get; set; }

    /// <summary>
    /// Gets or Sets ProxyExceptions
    /// </summary>
    [DataMember(Name="proxy.exceptions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "proxy.exceptions")]
    public ConfigNodePropertyArray ProxyExceptions { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheHttpProxyconfiguratorProperties {\n");
      sb.Append("  ProxyEnabled: ").Append(ProxyEnabled).Append("\n");
      sb.Append("  ProxyHost: ").Append(ProxyHost).Append("\n");
      sb.Append("  ProxyPort: ").Append(ProxyPort).Append("\n");
      sb.Append("  ProxyUser: ").Append(ProxyUser).Append("\n");
      sb.Append("  ProxyPassword: ").Append(ProxyPassword).Append("\n");
      sb.Append("  ProxyExceptions: ").Append(ProxyExceptions).Append("\n");
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
