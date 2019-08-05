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
  public class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties {
    /// <summary>
    /// Gets or Sets QueryLimitInMemory
    /// </summary>
    [DataMember(Name="queryLimitInMemory", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queryLimitInMemory")]
    public ConfigNodePropertyInteger QueryLimitInMemory { get; set; }

    /// <summary>
    /// Gets or Sets QueryLimitReads
    /// </summary>
    [DataMember(Name="queryLimitReads", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queryLimitReads")]
    public ConfigNodePropertyInteger QueryLimitReads { get; set; }

    /// <summary>
    /// Gets or Sets QueryFailTraversal
    /// </summary>
    [DataMember(Name="queryFailTraversal", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queryFailTraversal")]
    public ConfigNodePropertyBoolean QueryFailTraversal { get; set; }

    /// <summary>
    /// Gets or Sets FastQuerySize
    /// </summary>
    [DataMember(Name="fastQuerySize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fastQuerySize")]
    public ConfigNodePropertyBoolean FastQuerySize { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties {\n");
      sb.Append("  QueryLimitInMemory: ").Append(QueryLimitInMemory).Append("\n");
      sb.Append("  QueryLimitReads: ").Append(QueryLimitReads).Append("\n");
      sb.Append("  QueryFailTraversal: ").Append(QueryFailTraversal).Append("\n");
      sb.Append("  FastQuerySize: ").Append(FastQuerySize).Append("\n");
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
