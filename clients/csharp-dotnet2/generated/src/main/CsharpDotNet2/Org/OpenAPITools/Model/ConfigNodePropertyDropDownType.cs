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
  public class ConfigNodePropertyDropDownType {
    /// <summary>
    /// Drop Down label
    /// </summary>
    /// <value>Drop Down label</value>
    [DataMember(Name="labels", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "labels")]
    public Object Labels { get; set; }

    /// <summary>
    /// Drown Down value
    /// </summary>
    /// <value>Drown Down value</value>
    [DataMember(Name="values", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "values")]
    public Object Values { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ConfigNodePropertyDropDownType {\n");
      sb.Append("  Labels: ").Append(Labels).Append("\n");
      sb.Append("  Values: ").Append(Values).Append("\n");
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
