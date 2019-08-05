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
  public class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {
    /// <summary>
    /// Gets or Sets Path
    /// </summary>
    [DataMember(Name="path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path")]
    public ConfigNodePropertyString Path { get; set; }

    /// <summary>
    /// Gets or Sets ServiceRanking
    /// </summary>
    [DataMember(Name="service.ranking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.ranking")]
    public ConfigNodePropertyInteger ServiceRanking { get; set; }

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
    /// Gets or Sets JaasRanking
    /// </summary>
    [DataMember(Name="jaas.ranking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jaas.ranking")]
    public ConfigNodePropertyInteger JaasRanking { get; set; }

    /// <summary>
    /// Gets or Sets Headers
    /// </summary>
    [DataMember(Name="headers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "headers")]
    public ConfigNodePropertyArray Headers { get; set; }

    /// <summary>
    /// Gets or Sets Cookies
    /// </summary>
    [DataMember(Name="cookies", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cookies")]
    public ConfigNodePropertyArray Cookies { get; set; }

    /// <summary>
    /// Gets or Sets Parameters
    /// </summary>
    [DataMember(Name="parameters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "parameters")]
    public ConfigNodePropertyArray Parameters { get; set; }

    /// <summary>
    /// Gets or Sets Usermap
    /// </summary>
    [DataMember(Name="usermap", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "usermap")]
    public ConfigNodePropertyArray Usermap { get; set; }

    /// <summary>
    /// Gets or Sets Format
    /// </summary>
    [DataMember(Name="format", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "format")]
    public ConfigNodePropertyString Format { get; set; }

    /// <summary>
    /// Gets or Sets TrustedCredentialsAttribute
    /// </summary>
    [DataMember(Name="trustedCredentialsAttribute", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "trustedCredentialsAttribute")]
    public ConfigNodePropertyString TrustedCredentialsAttribute { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {\n");
      sb.Append("  Path: ").Append(Path).Append("\n");
      sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
      sb.Append("  JaasControlFlag: ").Append(JaasControlFlag).Append("\n");
      sb.Append("  JaasRealmName: ").Append(JaasRealmName).Append("\n");
      sb.Append("  JaasRanking: ").Append(JaasRanking).Append("\n");
      sb.Append("  Headers: ").Append(Headers).Append("\n");
      sb.Append("  Cookies: ").Append(Cookies).Append("\n");
      sb.Append("  Parameters: ").Append(Parameters).Append("\n");
      sb.Append("  Usermap: ").Append(Usermap).Append("\n");
      sb.Append("  Format: ").Append(Format).Append("\n");
      sb.Append("  TrustedCredentialsAttribute: ").Append(TrustedCredentialsAttribute).Append("\n");
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
