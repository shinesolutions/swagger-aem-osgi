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
  public class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties {
    /// <summary>
    /// Gets or Sets CqDamScene7DamchangeeventlistenerEnabled
    /// </summary>
    [DataMember(Name="cq.dam.scene7.damchangeeventlistener.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.scene7.damchangeeventlistener.enabled")]
    public ConfigNodePropertyBoolean CqDamScene7DamchangeeventlistenerEnabled { get; set; }

    /// <summary>
    /// Gets or Sets CqDamScene7DamchangeeventlistenerObservedPaths
    /// </summary>
    [DataMember(Name="cq.dam.scene7.damchangeeventlistener.observed.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.scene7.damchangeeventlistener.observed.paths")]
    public ConfigNodePropertyArray CqDamScene7DamchangeeventlistenerObservedPaths { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties {\n");
      sb.Append("  CqDamScene7DamchangeeventlistenerEnabled: ").Append(CqDamScene7DamchangeeventlistenerEnabled).Append("\n");
      sb.Append("  CqDamScene7DamchangeeventlistenerObservedPaths: ").Append(CqDamScene7DamchangeeventlistenerObservedPaths).Append("\n");
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
