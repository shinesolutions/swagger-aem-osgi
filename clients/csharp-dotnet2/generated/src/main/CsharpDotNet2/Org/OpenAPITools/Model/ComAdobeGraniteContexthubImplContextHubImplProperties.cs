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
  public class ComAdobeGraniteContexthubImplContextHubImplProperties {
    /// <summary>
    /// Gets or Sets ComAdobeGraniteContexthubSilentMode
    /// </summary>
    [DataMember(Name="com.adobe.granite.contexthub.silent_mode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.granite.contexthub.silent_mode")]
    public ConfigNodePropertyBoolean ComAdobeGraniteContexthubSilentMode { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeGraniteContexthubShowUi
    /// </summary>
    [DataMember(Name="com.adobe.granite.contexthub.show_ui", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.granite.contexthub.show_ui")]
    public ConfigNodePropertyBoolean ComAdobeGraniteContexthubShowUi { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteContexthubImplContextHubImplProperties {\n");
      sb.Append("  ComAdobeGraniteContexthubSilentMode: ").Append(ComAdobeGraniteContexthubSilentMode).Append("\n");
      sb.Append("  ComAdobeGraniteContexthubShowUi: ").Append(ComAdobeGraniteContexthubShowUi).Append("\n");
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
