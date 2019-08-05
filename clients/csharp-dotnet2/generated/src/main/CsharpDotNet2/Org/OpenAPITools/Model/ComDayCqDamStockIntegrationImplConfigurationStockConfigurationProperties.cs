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
  public class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties {
    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public ConfigNodePropertyString Name { get; set; }

    /// <summary>
    /// Gets or Sets Locale
    /// </summary>
    [DataMember(Name="locale", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "locale")]
    public ConfigNodePropertyString Locale { get; set; }

    /// <summary>
    /// Gets or Sets ImsConfig
    /// </summary>
    [DataMember(Name="imsConfig", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "imsConfig")]
    public ConfigNodePropertyString ImsConfig { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Locale: ").Append(Locale).Append("\n");
      sb.Append("  ImsConfig: ").Append(ImsConfig).Append("\n");
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
