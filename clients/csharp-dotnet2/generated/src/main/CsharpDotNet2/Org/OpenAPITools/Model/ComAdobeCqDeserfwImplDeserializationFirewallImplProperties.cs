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
  public class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties {
    /// <summary>
    /// Gets or Sets FirewallDeserializationWhitelist
    /// </summary>
    [DataMember(Name="firewall.deserialization.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "firewall.deserialization.whitelist")]
    public ConfigNodePropertyArray FirewallDeserializationWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets FirewallDeserializationBlacklist
    /// </summary>
    [DataMember(Name="firewall.deserialization.blacklist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "firewall.deserialization.blacklist")]
    public ConfigNodePropertyArray FirewallDeserializationBlacklist { get; set; }

    /// <summary>
    /// Gets or Sets FirewallDeserializationDiagnostics
    /// </summary>
    [DataMember(Name="firewall.deserialization.diagnostics", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "firewall.deserialization.diagnostics")]
    public ConfigNodePropertyString FirewallDeserializationDiagnostics { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties {\n");
      sb.Append("  FirewallDeserializationWhitelist: ").Append(FirewallDeserializationWhitelist).Append("\n");
      sb.Append("  FirewallDeserializationBlacklist: ").Append(FirewallDeserializationBlacklist).Append("\n");
      sb.Append("  FirewallDeserializationDiagnostics: ").Append(FirewallDeserializationDiagnostics).Append("\n");
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
