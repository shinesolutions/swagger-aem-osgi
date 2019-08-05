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
  public class OrgApacheFelixJaasConfigurationSpiProperties {
    /// <summary>
    /// Gets or Sets JaasDefaultRealmName
    /// </summary>
    [DataMember(Name="jaas.defaultRealmName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jaas.defaultRealmName")]
    public ConfigNodePropertyString JaasDefaultRealmName { get; set; }

    /// <summary>
    /// Gets or Sets JaasConfigProviderName
    /// </summary>
    [DataMember(Name="jaas.configProviderName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jaas.configProviderName")]
    public ConfigNodePropertyString JaasConfigProviderName { get; set; }

    /// <summary>
    /// Gets or Sets JaasGlobalConfigPolicy
    /// </summary>
    [DataMember(Name="jaas.globalConfigPolicy", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jaas.globalConfigPolicy")]
    public ConfigNodePropertyDropDown JaasGlobalConfigPolicy { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheFelixJaasConfigurationSpiProperties {\n");
      sb.Append("  JaasDefaultRealmName: ").Append(JaasDefaultRealmName).Append("\n");
      sb.Append("  JaasConfigProviderName: ").Append(JaasConfigProviderName).Append("\n");
      sb.Append("  JaasGlobalConfigPolicy: ").Append(JaasGlobalConfigPolicy).Append("\n");
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
