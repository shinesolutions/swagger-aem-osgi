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
  public class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties {
    /// <summary>
    /// Gets or Sets DamCfmComponentResourceType
    /// </summary>
    [DataMember(Name="dam.cfm.component.resourceType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dam.cfm.component.resourceType")]
    public ConfigNodePropertyString DamCfmComponentResourceType { get; set; }

    /// <summary>
    /// Gets or Sets DamCfmComponentFileReferenceProp
    /// </summary>
    [DataMember(Name="dam.cfm.component.fileReferenceProp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dam.cfm.component.fileReferenceProp")]
    public ConfigNodePropertyString DamCfmComponentFileReferenceProp { get; set; }

    /// <summary>
    /// Gets or Sets DamCfmComponentElementsProp
    /// </summary>
    [DataMember(Name="dam.cfm.component.elementsProp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dam.cfm.component.elementsProp")]
    public ConfigNodePropertyString DamCfmComponentElementsProp { get; set; }

    /// <summary>
    /// Gets or Sets DamCfmComponentVariationProp
    /// </summary>
    [DataMember(Name="dam.cfm.component.variationProp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dam.cfm.component.variationProp")]
    public ConfigNodePropertyString DamCfmComponentVariationProp { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties {\n");
      sb.Append("  DamCfmComponentResourceType: ").Append(DamCfmComponentResourceType).Append("\n");
      sb.Append("  DamCfmComponentFileReferenceProp: ").Append(DamCfmComponentFileReferenceProp).Append("\n");
      sb.Append("  DamCfmComponentElementsProp: ").Append(DamCfmComponentElementsProp).Append("\n");
      sb.Append("  DamCfmComponentVariationProp: ").Append(DamCfmComponentVariationProp).Append("\n");
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
