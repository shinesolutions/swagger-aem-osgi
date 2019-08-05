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
  public class OrgApacheSlingSecurityImplReferrerFilterProperties {
    /// <summary>
    /// Gets or Sets AllowEmpty
    /// </summary>
    [DataMember(Name="allow.empty", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "allow.empty")]
    public ConfigNodePropertyBoolean AllowEmpty { get; set; }

    /// <summary>
    /// Gets or Sets AllowHosts
    /// </summary>
    [DataMember(Name="allow.hosts", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "allow.hosts")]
    public ConfigNodePropertyArray AllowHosts { get; set; }

    /// <summary>
    /// Gets or Sets AllowHostsRegexp
    /// </summary>
    [DataMember(Name="allow.hosts.regexp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "allow.hosts.regexp")]
    public ConfigNodePropertyArray AllowHostsRegexp { get; set; }

    /// <summary>
    /// Gets or Sets FilterMethods
    /// </summary>
    [DataMember(Name="filter.methods", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "filter.methods")]
    public ConfigNodePropertyArray FilterMethods { get; set; }

    /// <summary>
    /// Gets or Sets ExcludeAgentsRegexp
    /// </summary>
    [DataMember(Name="exclude.agents.regexp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "exclude.agents.regexp")]
    public ConfigNodePropertyArray ExcludeAgentsRegexp { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingSecurityImplReferrerFilterProperties {\n");
      sb.Append("  AllowEmpty: ").Append(AllowEmpty).Append("\n");
      sb.Append("  AllowHosts: ").Append(AllowHosts).Append("\n");
      sb.Append("  AllowHostsRegexp: ").Append(AllowHostsRegexp).Append("\n");
      sb.Append("  FilterMethods: ").Append(FilterMethods).Append("\n");
      sb.Append("  ExcludeAgentsRegexp: ").Append(ExcludeAgentsRegexp).Append("\n");
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
