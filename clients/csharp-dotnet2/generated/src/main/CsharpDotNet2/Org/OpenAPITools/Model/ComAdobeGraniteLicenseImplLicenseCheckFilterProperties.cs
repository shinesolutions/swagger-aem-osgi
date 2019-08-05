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
  public class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties {
    /// <summary>
    /// Gets or Sets CheckInternval
    /// </summary>
    [DataMember(Name="checkInternval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "checkInternval")]
    public ConfigNodePropertyInteger CheckInternval { get; set; }

    /// <summary>
    /// Gets or Sets ExcludeIds
    /// </summary>
    [DataMember(Name="excludeIds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "excludeIds")]
    public ConfigNodePropertyArray ExcludeIds { get; set; }

    /// <summary>
    /// Gets or Sets EncryptPing
    /// </summary>
    [DataMember(Name="encryptPing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "encryptPing")]
    public ConfigNodePropertyBoolean EncryptPing { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties {\n");
      sb.Append("  CheckInternval: ").Append(CheckInternval).Append("\n");
      sb.Append("  ExcludeIds: ").Append(ExcludeIds).Append("\n");
      sb.Append("  EncryptPing: ").Append(EncryptPing).Append("\n");
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
