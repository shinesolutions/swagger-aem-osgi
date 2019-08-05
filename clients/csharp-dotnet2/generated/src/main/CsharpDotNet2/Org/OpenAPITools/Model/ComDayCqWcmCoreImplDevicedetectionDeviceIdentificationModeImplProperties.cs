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
  public class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties {
    /// <summary>
    /// Gets or Sets DimDefaultMode
    /// </summary>
    [DataMember(Name="dim.default.mode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dim.default.mode")]
    public ConfigNodePropertyDropDown DimDefaultMode { get; set; }

    /// <summary>
    /// Gets or Sets DimAppcacheEnabled
    /// </summary>
    [DataMember(Name="dim.appcache.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dim.appcache.enabled")]
    public ConfigNodePropertyBoolean DimAppcacheEnabled { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties {\n");
      sb.Append("  DimDefaultMode: ").Append(DimDefaultMode).Append("\n");
      sb.Append("  DimAppcacheEnabled: ").Append(DimAppcacheEnabled).Append("\n");
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
