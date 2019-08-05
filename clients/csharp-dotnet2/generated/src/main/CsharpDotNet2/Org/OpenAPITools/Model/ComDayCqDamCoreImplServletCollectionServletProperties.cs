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
  public class ComDayCqDamCoreImplServletCollectionServletProperties {
    /// <summary>
    /// Gets or Sets CqDamBatchCollectionProperties
    /// </summary>
    [DataMember(Name="cq.dam.batch.collection.properties", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.batch.collection.properties")]
    public ConfigNodePropertyArray CqDamBatchCollectionProperties { get; set; }

    /// <summary>
    /// Gets or Sets CqDamBatchCollectionMaxcollections
    /// </summary>
    [DataMember(Name="cq.dam.batch.collection.maxcollections", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.batch.collection.maxcollections")]
    public ConfigNodePropertyInteger CqDamBatchCollectionMaxcollections { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplServletCollectionServletProperties {\n");
      sb.Append("  CqDamBatchCollectionProperties: ").Append(CqDamBatchCollectionProperties).Append("\n");
      sb.Append("  CqDamBatchCollectionMaxcollections: ").Append(CqDamBatchCollectionMaxcollections).Append("\n");
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
