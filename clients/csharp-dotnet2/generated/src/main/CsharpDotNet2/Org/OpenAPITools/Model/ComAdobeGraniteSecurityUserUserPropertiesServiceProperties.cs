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
  public class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties {
    /// <summary>
    /// Gets or Sets AdapterCondition
    /// </summary>
    [DataMember(Name="adapter.condition", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "adapter.condition")]
    public ConfigNodePropertyString AdapterCondition { get; set; }

    /// <summary>
    /// Gets or Sets GraniteUserpropertiesNodetypes
    /// </summary>
    [DataMember(Name="granite.userproperties.nodetypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.userproperties.nodetypes")]
    public ConfigNodePropertyArray GraniteUserpropertiesNodetypes { get; set; }

    /// <summary>
    /// Gets or Sets GraniteUserpropertiesResourcetypes
    /// </summary>
    [DataMember(Name="granite.userproperties.resourcetypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.userproperties.resourcetypes")]
    public ConfigNodePropertyArray GraniteUserpropertiesResourcetypes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties {\n");
      sb.Append("  AdapterCondition: ").Append(AdapterCondition).Append("\n");
      sb.Append("  GraniteUserpropertiesNodetypes: ").Append(GraniteUserpropertiesNodetypes).Append("\n");
      sb.Append("  GraniteUserpropertiesResourcetypes: ").Append(GraniteUserpropertiesResourcetypes).Append("\n");
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
