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
  public class ComAdobeCqAuditPurgeReplicationProperties {
    /// <summary>
    /// Gets or Sets AuditlogRuleName
    /// </summary>
    [DataMember(Name="auditlog.rule.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auditlog.rule.name")]
    public ConfigNodePropertyString AuditlogRuleName { get; set; }

    /// <summary>
    /// Gets or Sets AuditlogRuleContentpath
    /// </summary>
    [DataMember(Name="auditlog.rule.contentpath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auditlog.rule.contentpath")]
    public ConfigNodePropertyString AuditlogRuleContentpath { get; set; }

    /// <summary>
    /// Gets or Sets AuditlogRuleMinimumage
    /// </summary>
    [DataMember(Name="auditlog.rule.minimumage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auditlog.rule.minimumage")]
    public ConfigNodePropertyInteger AuditlogRuleMinimumage { get; set; }

    /// <summary>
    /// Gets or Sets AuditlogRuleTypes
    /// </summary>
    [DataMember(Name="auditlog.rule.types", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auditlog.rule.types")]
    public ConfigNodePropertyDropDown AuditlogRuleTypes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqAuditPurgeReplicationProperties {\n");
      sb.Append("  AuditlogRuleName: ").Append(AuditlogRuleName).Append("\n");
      sb.Append("  AuditlogRuleContentpath: ").Append(AuditlogRuleContentpath).Append("\n");
      sb.Append("  AuditlogRuleMinimumage: ").Append(AuditlogRuleMinimumage).Append("\n");
      sb.Append("  AuditlogRuleTypes: ").Append(AuditlogRuleTypes).Append("\n");
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
