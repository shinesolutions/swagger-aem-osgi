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
  public class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties {
    /// <summary>
    /// Gets or Sets Group
    /// </summary>
    [DataMember(Name="group", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group")]
    public ConfigNodePropertyString Group { get; set; }

    /// <summary>
    /// Gets or Sets Ids
    /// </summary>
    [DataMember(Name="ids", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ids")]
    public ConfigNodePropertyArray Ids { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties {\n");
      sb.Append("  Group: ").Append(Group).Append("\n");
      sb.Append("  Ids: ").Append(Ids).Append("\n");
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
