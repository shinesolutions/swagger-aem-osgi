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
  public class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties {
    /// <summary>
    /// Gets or Sets OrgApacheSlingScriptingCacheSize
    /// </summary>
    [DataMember(Name="org.apache.sling.scripting.cache.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.scripting.cache.size")]
    public ConfigNodePropertyInteger OrgApacheSlingScriptingCacheSize { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingScriptingCacheAdditionalExtensions
    /// </summary>
    [DataMember(Name="org.apache.sling.scripting.cache.additional_extensions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.scripting.cache.additional_extensions")]
    public ConfigNodePropertyArray OrgApacheSlingScriptingCacheAdditionalExtensions { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties {\n");
      sb.Append("  OrgApacheSlingScriptingCacheSize: ").Append(OrgApacheSlingScriptingCacheSize).Append("\n");
      sb.Append("  OrgApacheSlingScriptingCacheAdditionalExtensions: ").Append(OrgApacheSlingScriptingCacheAdditionalExtensions).Append("\n");
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
