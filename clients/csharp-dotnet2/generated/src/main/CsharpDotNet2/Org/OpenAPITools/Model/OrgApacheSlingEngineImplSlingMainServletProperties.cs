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
  public class OrgApacheSlingEngineImplSlingMainServletProperties {
    /// <summary>
    /// Gets or Sets SlingMaxCalls
    /// </summary>
    [DataMember(Name="sling.max.calls", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.max.calls")]
    public ConfigNodePropertyInteger SlingMaxCalls { get; set; }

    /// <summary>
    /// Gets or Sets SlingMaxInclusions
    /// </summary>
    [DataMember(Name="sling.max.inclusions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.max.inclusions")]
    public ConfigNodePropertyInteger SlingMaxInclusions { get; set; }

    /// <summary>
    /// Gets or Sets SlingTraceAllow
    /// </summary>
    [DataMember(Name="sling.trace.allow", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.trace.allow")]
    public ConfigNodePropertyBoolean SlingTraceAllow { get; set; }

    /// <summary>
    /// Gets or Sets SlingMaxRecordRequests
    /// </summary>
    [DataMember(Name="sling.max.record.requests", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.max.record.requests")]
    public ConfigNodePropertyInteger SlingMaxRecordRequests { get; set; }

    /// <summary>
    /// Gets or Sets SlingStorePatternRequests
    /// </summary>
    [DataMember(Name="sling.store.pattern.requests", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.store.pattern.requests")]
    public ConfigNodePropertyArray SlingStorePatternRequests { get; set; }

    /// <summary>
    /// Gets or Sets SlingServerinfo
    /// </summary>
    [DataMember(Name="sling.serverinfo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.serverinfo")]
    public ConfigNodePropertyString SlingServerinfo { get; set; }

    /// <summary>
    /// Gets or Sets SlingAdditionalResponseHeaders
    /// </summary>
    [DataMember(Name="sling.additional.response.headers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.additional.response.headers")]
    public ConfigNodePropertyArray SlingAdditionalResponseHeaders { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingEngineImplSlingMainServletProperties {\n");
      sb.Append("  SlingMaxCalls: ").Append(SlingMaxCalls).Append("\n");
      sb.Append("  SlingMaxInclusions: ").Append(SlingMaxInclusions).Append("\n");
      sb.Append("  SlingTraceAllow: ").Append(SlingTraceAllow).Append("\n");
      sb.Append("  SlingMaxRecordRequests: ").Append(SlingMaxRecordRequests).Append("\n");
      sb.Append("  SlingStorePatternRequests: ").Append(SlingStorePatternRequests).Append("\n");
      sb.Append("  SlingServerinfo: ").Append(SlingServerinfo).Append("\n");
      sb.Append("  SlingAdditionalResponseHeaders: ").Append(SlingAdditionalResponseHeaders).Append("\n");
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
