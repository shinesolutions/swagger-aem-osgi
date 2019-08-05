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
  public class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties {
    /// <summary>
    /// Gets or Sets CacheEnable
    /// </summary>
    [DataMember(Name="cache.enable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cache.enable")]
    public ConfigNodePropertyBoolean CacheEnable { get; set; }

    /// <summary>
    /// Gets or Sets CacheRootPaths
    /// </summary>
    [DataMember(Name="cache.rootPaths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cache.rootPaths")]
    public ConfigNodePropertyArray CacheRootPaths { get; set; }

    /// <summary>
    /// Gets or Sets CacheMaxSize
    /// </summary>
    [DataMember(Name="cache.maxSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cache.maxSize")]
    public ConfigNodePropertyInteger CacheMaxSize { get; set; }

    /// <summary>
    /// Gets or Sets CacheMaxEntries
    /// </summary>
    [DataMember(Name="cache.maxEntries", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cache.maxEntries")]
    public ConfigNodePropertyInteger CacheMaxEntries { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties {\n");
      sb.Append("  CacheEnable: ").Append(CacheEnable).Append("\n");
      sb.Append("  CacheRootPaths: ").Append(CacheRootPaths).Append("\n");
      sb.Append("  CacheMaxSize: ").Append(CacheMaxSize).Append("\n");
      sb.Append("  CacheMaxEntries: ").Append(CacheMaxEntries).Append("\n");
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
