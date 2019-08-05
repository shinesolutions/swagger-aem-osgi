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
  public class ComDayCqDamCoreImplServletCollectionsServletProperties {
    /// <summary>
    /// Gets or Sets CqDamBatchCollectionsProperties
    /// </summary>
    [DataMember(Name="cq.dam.batch.collections.properties", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.batch.collections.properties")]
    public ConfigNodePropertyArray CqDamBatchCollectionsProperties { get; set; }

    /// <summary>
    /// Gets or Sets CqDamBatchCollectionsLimit
    /// </summary>
    [DataMember(Name="cq.dam.batch.collections.limit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.batch.collections.limit")]
    public ConfigNodePropertyInteger CqDamBatchCollectionsLimit { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplServletCollectionsServletProperties {\n");
      sb.Append("  CqDamBatchCollectionsProperties: ").Append(CqDamBatchCollectionsProperties).Append("\n");
      sb.Append("  CqDamBatchCollectionsLimit: ").Append(CqDamBatchCollectionsLimit).Append("\n");
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
