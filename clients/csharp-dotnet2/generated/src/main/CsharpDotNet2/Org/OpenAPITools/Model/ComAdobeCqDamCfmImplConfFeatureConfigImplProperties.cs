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
  public class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties {
    /// <summary>
    /// Gets or Sets DamCfmResourceTypes
    /// </summary>
    [DataMember(Name="dam.cfm.resourceTypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dam.cfm.resourceTypes")]
    public ConfigNodePropertyArray DamCfmResourceTypes { get; set; }

    /// <summary>
    /// Gets or Sets DamCfmReferenceProperties
    /// </summary>
    [DataMember(Name="dam.cfm.referenceProperties", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dam.cfm.referenceProperties")]
    public ConfigNodePropertyArray DamCfmReferenceProperties { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties {\n");
      sb.Append("  DamCfmResourceTypes: ").Append(DamCfmResourceTypes).Append("\n");
      sb.Append("  DamCfmReferenceProperties: ").Append(DamCfmReferenceProperties).Append("\n");
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
