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
  public class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {
    /// <summary>
    /// Gets or Sets Enabled
    /// </summary>
    [DataMember(Name="enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enabled")]
    public ConfigNodePropertyBoolean Enabled { get; set; }

    /// <summary>
    /// Gets or Sets ConfigRefResourceNames
    /// </summary>
    [DataMember(Name="configRefResourceNames", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "configRefResourceNames")]
    public ConfigNodePropertyArray ConfigRefResourceNames { get; set; }

    /// <summary>
    /// Gets or Sets ConfigRefPropertyNames
    /// </summary>
    [DataMember(Name="configRefPropertyNames", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "configRefPropertyNames")]
    public ConfigNodePropertyArray ConfigRefPropertyNames { get; set; }

    /// <summary>
    /// Gets or Sets ServiceRanking
    /// </summary>
    [DataMember(Name="service.ranking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.ranking")]
    public ConfigNodePropertyInteger ServiceRanking { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {\n");
      sb.Append("  Enabled: ").Append(Enabled).Append("\n");
      sb.Append("  ConfigRefResourceNames: ").Append(ConfigRefResourceNames).Append("\n");
      sb.Append("  ConfigRefPropertyNames: ").Append(ConfigRefPropertyNames).Append("\n");
      sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
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
