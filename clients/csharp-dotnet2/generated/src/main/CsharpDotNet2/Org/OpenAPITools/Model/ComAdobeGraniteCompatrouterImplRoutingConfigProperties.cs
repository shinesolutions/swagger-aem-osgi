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
  public class ComAdobeGraniteCompatrouterImplRoutingConfigProperties {
    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public ConfigNodePropertyString Id { get; set; }

    /// <summary>
    /// Gets or Sets CompatPath
    /// </summary>
    [DataMember(Name="compatPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "compatPath")]
    public ConfigNodePropertyString CompatPath { get; set; }

    /// <summary>
    /// Gets or Sets NewPath
    /// </summary>
    [DataMember(Name="newPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "newPath")]
    public ConfigNodePropertyString NewPath { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteCompatrouterImplRoutingConfigProperties {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  CompatPath: ").Append(CompatPath).Append("\n");
      sb.Append("  NewPath: ").Append(NewPath).Append("\n");
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
