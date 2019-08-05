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
  public class ComDayCqDamCoreImplServletBatchMetadataServletProperties {
    /// <summary>
    /// Gets or Sets CqDamBatchMetadataAssetDefault
    /// </summary>
    [DataMember(Name="cq.dam.batch.metadata.asset.default", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.batch.metadata.asset.default")]
    public ConfigNodePropertyArray CqDamBatchMetadataAssetDefault { get; set; }

    /// <summary>
    /// Gets or Sets CqDamBatchMetadataCollectionDefault
    /// </summary>
    [DataMember(Name="cq.dam.batch.metadata.collection.default", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.batch.metadata.collection.default")]
    public ConfigNodePropertyArray CqDamBatchMetadataCollectionDefault { get; set; }

    /// <summary>
    /// Gets or Sets CqDamBatchMetadataMaxresources
    /// </summary>
    [DataMember(Name="cq.dam.batch.metadata.maxresources", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.batch.metadata.maxresources")]
    public ConfigNodePropertyInteger CqDamBatchMetadataMaxresources { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplServletBatchMetadataServletProperties {\n");
      sb.Append("  CqDamBatchMetadataAssetDefault: ").Append(CqDamBatchMetadataAssetDefault).Append("\n");
      sb.Append("  CqDamBatchMetadataCollectionDefault: ").Append(CqDamBatchMetadataCollectionDefault).Append("\n");
      sb.Append("  CqDamBatchMetadataMaxresources: ").Append(CqDamBatchMetadataMaxresources).Append("\n");
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
