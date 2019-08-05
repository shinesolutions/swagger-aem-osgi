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
  public class ComDayCqReportingImplCacheCacheImplProperties {
    /// <summary>
    /// Gets or Sets RepcacheEnable
    /// </summary>
    [DataMember(Name="repcache.enable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repcache.enable")]
    public ConfigNodePropertyBoolean RepcacheEnable { get; set; }

    /// <summary>
    /// Gets or Sets RepcacheTtl
    /// </summary>
    [DataMember(Name="repcache.ttl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repcache.ttl")]
    public ConfigNodePropertyInteger RepcacheTtl { get; set; }

    /// <summary>
    /// Gets or Sets RepcacheMax
    /// </summary>
    [DataMember(Name="repcache.max", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repcache.max")]
    public ConfigNodePropertyInteger RepcacheMax { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqReportingImplCacheCacheImplProperties {\n");
      sb.Append("  RepcacheEnable: ").Append(RepcacheEnable).Append("\n");
      sb.Append("  RepcacheTtl: ").Append(RepcacheTtl).Append("\n");
      sb.Append("  RepcacheMax: ").Append(RepcacheMax).Append("\n");
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
