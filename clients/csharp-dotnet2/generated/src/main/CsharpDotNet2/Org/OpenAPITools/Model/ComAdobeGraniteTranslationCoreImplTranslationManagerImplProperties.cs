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
  public class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties {
    /// <summary>
    /// Gets or Sets DefaultConnectorName
    /// </summary>
    [DataMember(Name="defaultConnectorName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defaultConnectorName")]
    public ConfigNodePropertyString DefaultConnectorName { get; set; }

    /// <summary>
    /// Gets or Sets DefaultCategory
    /// </summary>
    [DataMember(Name="defaultCategory", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defaultCategory")]
    public ConfigNodePropertyString DefaultCategory { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties {\n");
      sb.Append("  DefaultConnectorName: ").Append(DefaultConnectorName).Append("\n");
      sb.Append("  DefaultCategory: ").Append(DefaultCategory).Append("\n");
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
