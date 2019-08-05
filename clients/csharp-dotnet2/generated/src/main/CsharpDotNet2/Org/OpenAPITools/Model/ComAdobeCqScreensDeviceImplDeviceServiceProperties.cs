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
  public class ComAdobeCqScreensDeviceImplDeviceServiceProperties {
    /// <summary>
    /// Gets or Sets ComAdobeAemScreensPlayerPingfrequency
    /// </summary>
    [DataMember(Name="com.adobe.aem.screens.player.pingfrequency", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.aem.screens.player.pingfrequency")]
    public ConfigNodePropertyInteger ComAdobeAemScreensPlayerPingfrequency { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeAemScreensDevicePaswordSpecialchars
    /// </summary>
    [DataMember(Name="com.adobe.aem.screens.device.pasword.specialchars", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.aem.screens.device.pasword.specialchars")]
    public ConfigNodePropertyString ComAdobeAemScreensDevicePaswordSpecialchars { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeAemScreensDevicePaswordMinlowercasechars
    /// </summary>
    [DataMember(Name="com.adobe.aem.screens.device.pasword.minlowercasechars", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.aem.screens.device.pasword.minlowercasechars")]
    public ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinlowercasechars { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeAemScreensDevicePaswordMinuppercasechars
    /// </summary>
    [DataMember(Name="com.adobe.aem.screens.device.pasword.minuppercasechars", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.aem.screens.device.pasword.minuppercasechars")]
    public ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinuppercasechars { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeAemScreensDevicePaswordMinnumberchars
    /// </summary>
    [DataMember(Name="com.adobe.aem.screens.device.pasword.minnumberchars", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.aem.screens.device.pasword.minnumberchars")]
    public ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinnumberchars { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeAemScreensDevicePaswordMinspecialchars
    /// </summary>
    [DataMember(Name="com.adobe.aem.screens.device.pasword.minspecialchars", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.aem.screens.device.pasword.minspecialchars")]
    public ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinspecialchars { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeAemScreensDevicePaswordMinlength
    /// </summary>
    [DataMember(Name="com.adobe.aem.screens.device.pasword.minlength", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.aem.screens.device.pasword.minlength")]
    public ConfigNodePropertyInteger ComAdobeAemScreensDevicePaswordMinlength { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqScreensDeviceImplDeviceServiceProperties {\n");
      sb.Append("  ComAdobeAemScreensPlayerPingfrequency: ").Append(ComAdobeAemScreensPlayerPingfrequency).Append("\n");
      sb.Append("  ComAdobeAemScreensDevicePaswordSpecialchars: ").Append(ComAdobeAemScreensDevicePaswordSpecialchars).Append("\n");
      sb.Append("  ComAdobeAemScreensDevicePaswordMinlowercasechars: ").Append(ComAdobeAemScreensDevicePaswordMinlowercasechars).Append("\n");
      sb.Append("  ComAdobeAemScreensDevicePaswordMinuppercasechars: ").Append(ComAdobeAemScreensDevicePaswordMinuppercasechars).Append("\n");
      sb.Append("  ComAdobeAemScreensDevicePaswordMinnumberchars: ").Append(ComAdobeAemScreensDevicePaswordMinnumberchars).Append("\n");
      sb.Append("  ComAdobeAemScreensDevicePaswordMinspecialchars: ").Append(ComAdobeAemScreensDevicePaswordMinspecialchars).Append("\n");
      sb.Append("  ComAdobeAemScreensDevicePaswordMinlength: ").Append(ComAdobeAemScreensDevicePaswordMinlength).Append("\n");
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
