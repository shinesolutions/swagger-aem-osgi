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
  public class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties {
    /// <summary>
    /// Gets or Sets CugSupportedPaths
    /// </summary>
    [DataMember(Name="cugSupportedPaths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cugSupportedPaths")]
    public ConfigNodePropertyArray CugSupportedPaths { get; set; }

    /// <summary>
    /// Gets or Sets CugEnabled
    /// </summary>
    [DataMember(Name="cugEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cugEnabled")]
    public ConfigNodePropertyBoolean CugEnabled { get; set; }

    /// <summary>
    /// Gets or Sets ConfigurationRanking
    /// </summary>
    [DataMember(Name="configurationRanking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "configurationRanking")]
    public ConfigNodePropertyInteger ConfigurationRanking { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties {\n");
      sb.Append("  CugSupportedPaths: ").Append(CugSupportedPaths).Append("\n");
      sb.Append("  CugEnabled: ").Append(CugEnabled).Append("\n");
      sb.Append("  ConfigurationRanking: ").Append(ConfigurationRanking).Append("\n");
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
