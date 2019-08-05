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
  public class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties {
    /// <summary>
    /// Gets or Sets DeviceInfoTransformerEnabled
    /// </summary>
    [DataMember(Name="device.info.transformer.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "device.info.transformer.enabled")]
    public ConfigNodePropertyBoolean DeviceInfoTransformerEnabled { get; set; }

    /// <summary>
    /// Gets or Sets DeviceInfoTransformerCssStyle
    /// </summary>
    [DataMember(Name="device.info.transformer.css.style", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "device.info.transformer.css.style")]
    public ConfigNodePropertyString DeviceInfoTransformerCssStyle { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties {\n");
      sb.Append("  DeviceInfoTransformerEnabled: ").Append(DeviceInfoTransformerEnabled).Append("\n");
      sb.Append("  DeviceInfoTransformerCssStyle: ").Append(DeviceInfoTransformerCssStyle).Append("\n");
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
