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
  public class ComDayCqDamCommonsUtilImplAssetCacheImplProperties {
    /// <summary>
    /// Gets or Sets LargeFileMin
    /// </summary>
    [DataMember(Name="large.file.min", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "large.file.min")]
    public ConfigNodePropertyInteger LargeFileMin { get; set; }

    /// <summary>
    /// Gets or Sets CacheApply
    /// </summary>
    [DataMember(Name="cache.apply", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cache.apply")]
    public ConfigNodePropertyBoolean CacheApply { get; set; }

    /// <summary>
    /// Gets or Sets MimeTypes
    /// </summary>
    [DataMember(Name="mime.types", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mime.types")]
    public ConfigNodePropertyArray MimeTypes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCommonsUtilImplAssetCacheImplProperties {\n");
      sb.Append("  LargeFileMin: ").Append(LargeFileMin).Append("\n");
      sb.Append("  CacheApply: ").Append(CacheApply).Append("\n");
      sb.Append("  MimeTypes: ").Append(MimeTypes).Append("\n");
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
