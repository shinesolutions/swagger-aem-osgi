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
  public class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties {
    /// <summary>
    /// Gets or Sets CqDamImageCacheMaxMemory
    /// </summary>
    [DataMember(Name="cq.dam.image.cache.max.memory", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.image.cache.max.memory")]
    public ConfigNodePropertyInteger CqDamImageCacheMaxMemory { get; set; }

    /// <summary>
    /// Gets or Sets CqDamImageCacheMaxAge
    /// </summary>
    [DataMember(Name="cq.dam.image.cache.max.age", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.image.cache.max.age")]
    public ConfigNodePropertyInteger CqDamImageCacheMaxAge { get; set; }

    /// <summary>
    /// Gets or Sets CqDamImageCacheMaxDimension
    /// </summary>
    [DataMember(Name="cq.dam.image.cache.max.dimension", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.image.cache.max.dimension")]
    public ConfigNodePropertyString CqDamImageCacheMaxDimension { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties {\n");
      sb.Append("  CqDamImageCacheMaxMemory: ").Append(CqDamImageCacheMaxMemory).Append("\n");
      sb.Append("  CqDamImageCacheMaxAge: ").Append(CqDamImageCacheMaxAge).Append("\n");
      sb.Append("  CqDamImageCacheMaxDimension: ").Append(CqDamImageCacheMaxDimension).Append("\n");
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
