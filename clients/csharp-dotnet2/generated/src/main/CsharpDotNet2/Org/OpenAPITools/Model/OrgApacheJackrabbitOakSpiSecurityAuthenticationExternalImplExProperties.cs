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
  public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties {
    /// <summary>
    /// Gets or Sets JaasRanking
    /// </summary>
    [DataMember(Name="jaas.ranking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jaas.ranking")]
    public ConfigNodePropertyInteger JaasRanking { get; set; }

    /// <summary>
    /// Gets or Sets JaasControlFlag
    /// </summary>
    [DataMember(Name="jaas.controlFlag", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jaas.controlFlag")]
    public ConfigNodePropertyString JaasControlFlag { get; set; }

    /// <summary>
    /// Gets or Sets JaasRealmName
    /// </summary>
    [DataMember(Name="jaas.realmName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jaas.realmName")]
    public ConfigNodePropertyString JaasRealmName { get; set; }

    /// <summary>
    /// Gets or Sets IdpName
    /// </summary>
    [DataMember(Name="idp.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "idp.name")]
    public ConfigNodePropertyString IdpName { get; set; }

    /// <summary>
    /// Gets or Sets SyncHandlerName
    /// </summary>
    [DataMember(Name="sync.handlerName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sync.handlerName")]
    public ConfigNodePropertyString SyncHandlerName { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties {\n");
      sb.Append("  JaasRanking: ").Append(JaasRanking).Append("\n");
      sb.Append("  JaasControlFlag: ").Append(JaasControlFlag).Append("\n");
      sb.Append("  JaasRealmName: ").Append(JaasRealmName).Append("\n");
      sb.Append("  IdpName: ").Append(IdpName).Append("\n");
      sb.Append("  SyncHandlerName: ").Append(SyncHandlerName).Append("\n");
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
