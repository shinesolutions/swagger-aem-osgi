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
  public class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties {
    /// <summary>
    /// Gets or Sets PersistentCacheIncludes
    /// </summary>
    [DataMember(Name="persistentCacheIncludes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "persistentCacheIncludes")]
    public ConfigNodePropertyArray PersistentCacheIncludes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties {\n");
      sb.Append("  PersistentCacheIncludes: ").Append(PersistentCacheIncludes).Append("\n");
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
