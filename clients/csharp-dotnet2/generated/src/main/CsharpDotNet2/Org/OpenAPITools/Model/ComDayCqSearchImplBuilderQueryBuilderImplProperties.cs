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
  public class ComDayCqSearchImplBuilderQueryBuilderImplProperties {
    /// <summary>
    /// Gets or Sets ExcerptProperties
    /// </summary>
    [DataMember(Name="excerpt.properties", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "excerpt.properties")]
    public ConfigNodePropertyArray ExcerptProperties { get; set; }

    /// <summary>
    /// Gets or Sets CacheMaxEntries
    /// </summary>
    [DataMember(Name="cache.max.entries", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cache.max.entries")]
    public ConfigNodePropertyInteger CacheMaxEntries { get; set; }

    /// <summary>
    /// Gets or Sets CacheEntryLifetime
    /// </summary>
    [DataMember(Name="cache.entry.lifetime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cache.entry.lifetime")]
    public ConfigNodePropertyInteger CacheEntryLifetime { get; set; }

    /// <summary>
    /// Gets or Sets XpathUnion
    /// </summary>
    [DataMember(Name="xpath.union", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "xpath.union")]
    public ConfigNodePropertyBoolean XpathUnion { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqSearchImplBuilderQueryBuilderImplProperties {\n");
      sb.Append("  ExcerptProperties: ").Append(ExcerptProperties).Append("\n");
      sb.Append("  CacheMaxEntries: ").Append(CacheMaxEntries).Append("\n");
      sb.Append("  CacheEntryLifetime: ").Append(CacheEntryLifetime).Append("\n");
      sb.Append("  XpathUnion: ").Append(XpathUnion).Append("\n");
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
