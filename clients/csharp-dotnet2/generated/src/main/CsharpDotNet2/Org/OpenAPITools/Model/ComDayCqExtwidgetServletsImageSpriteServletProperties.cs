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
  public class ComDayCqExtwidgetServletsImageSpriteServletProperties {
    /// <summary>
    /// Gets or Sets MaxWidth
    /// </summary>
    [DataMember(Name="maxWidth", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxWidth")]
    public ConfigNodePropertyInteger MaxWidth { get; set; }

    /// <summary>
    /// Gets or Sets MaxHeight
    /// </summary>
    [DataMember(Name="maxHeight", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxHeight")]
    public ConfigNodePropertyInteger MaxHeight { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqExtwidgetServletsImageSpriteServletProperties {\n");
      sb.Append("  MaxWidth: ").Append(MaxWidth).Append("\n");
      sb.Append("  MaxHeight: ").Append(MaxHeight).Append("\n");
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
