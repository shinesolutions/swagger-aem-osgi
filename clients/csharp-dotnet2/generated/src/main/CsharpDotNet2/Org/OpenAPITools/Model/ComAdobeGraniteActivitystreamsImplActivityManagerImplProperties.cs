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
  public class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties {
    /// <summary>
    /// Gets or Sets AggregateRelationships
    /// </summary>
    [DataMember(Name="aggregate.relationships", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "aggregate.relationships")]
    public ConfigNodePropertyArray AggregateRelationships { get; set; }

    /// <summary>
    /// Gets or Sets AggregateDescendVirtual
    /// </summary>
    [DataMember(Name="aggregate.descend.virtual", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "aggregate.descend.virtual")]
    public ConfigNodePropertyBoolean AggregateDescendVirtual { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties {\n");
      sb.Append("  AggregateRelationships: ").Append(AggregateRelationships).Append("\n");
      sb.Append("  AggregateDescendVirtual: ").Append(AggregateDescendVirtual).Append("\n");
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
