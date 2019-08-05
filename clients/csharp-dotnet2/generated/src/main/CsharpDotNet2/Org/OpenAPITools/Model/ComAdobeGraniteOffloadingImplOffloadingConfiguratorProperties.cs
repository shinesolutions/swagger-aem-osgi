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
  public class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties {
    /// <summary>
    /// Gets or Sets OffloadingTransporter
    /// </summary>
    [DataMember(Name="offloading.transporter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "offloading.transporter")]
    public ConfigNodePropertyString OffloadingTransporter { get; set; }

    /// <summary>
    /// Gets or Sets OffloadingCleanupPayload
    /// </summary>
    [DataMember(Name="offloading.cleanup.payload", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "offloading.cleanup.payload")]
    public ConfigNodePropertyBoolean OffloadingCleanupPayload { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties {\n");
      sb.Append("  OffloadingTransporter: ").Append(OffloadingTransporter).Append("\n");
      sb.Append("  OffloadingCleanupPayload: ").Append(OffloadingCleanupPayload).Append("\n");
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
