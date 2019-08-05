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
  public class OrgApacheFelixJaasConfigurationFactoryProperties {
    /// <summary>
    /// Gets or Sets JaasControlFlag
    /// </summary>
    [DataMember(Name="jaas.controlFlag", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jaas.controlFlag")]
    public ConfigNodePropertyDropDown JaasControlFlag { get; set; }

    /// <summary>
    /// Gets or Sets JaasRanking
    /// </summary>
    [DataMember(Name="jaas.ranking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jaas.ranking")]
    public ConfigNodePropertyInteger JaasRanking { get; set; }

    /// <summary>
    /// Gets or Sets JaasRealmName
    /// </summary>
    [DataMember(Name="jaas.realmName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jaas.realmName")]
    public ConfigNodePropertyString JaasRealmName { get; set; }

    /// <summary>
    /// Gets or Sets JaasClassname
    /// </summary>
    [DataMember(Name="jaas.classname", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jaas.classname")]
    public ConfigNodePropertyString JaasClassname { get; set; }

    /// <summary>
    /// Gets or Sets JaasOptions
    /// </summary>
    [DataMember(Name="jaas.options", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jaas.options")]
    public ConfigNodePropertyArray JaasOptions { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheFelixJaasConfigurationFactoryProperties {\n");
      sb.Append("  JaasControlFlag: ").Append(JaasControlFlag).Append("\n");
      sb.Append("  JaasRanking: ").Append(JaasRanking).Append("\n");
      sb.Append("  JaasRealmName: ").Append(JaasRealmName).Append("\n");
      sb.Append("  JaasClassname: ").Append(JaasClassname).Append("\n");
      sb.Append("  JaasOptions: ").Append(JaasOptions).Append("\n");
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
