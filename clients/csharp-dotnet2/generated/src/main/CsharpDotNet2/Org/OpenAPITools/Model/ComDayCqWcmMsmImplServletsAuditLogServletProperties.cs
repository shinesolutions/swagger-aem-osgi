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
  public class ComDayCqWcmMsmImplServletsAuditLogServletProperties {
    /// <summary>
    /// Gets or Sets AuditlogservletDefaultEventsCount
    /// </summary>
    [DataMember(Name="auditlogservlet.default.events.count", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auditlogservlet.default.events.count")]
    public ConfigNodePropertyInteger AuditlogservletDefaultEventsCount { get; set; }

    /// <summary>
    /// Gets or Sets AuditlogservletDefaultPath
    /// </summary>
    [DataMember(Name="auditlogservlet.default.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auditlogservlet.default.path")]
    public ConfigNodePropertyString AuditlogservletDefaultPath { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmMsmImplServletsAuditLogServletProperties {\n");
      sb.Append("  AuditlogservletDefaultEventsCount: ").Append(AuditlogservletDefaultEventsCount).Append("\n");
      sb.Append("  AuditlogservletDefaultPath: ").Append(AuditlogservletDefaultPath).Append("\n");
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
