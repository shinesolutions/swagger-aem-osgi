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
  public class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties {
    /// <summary>
    /// Gets or Sets TokenExpiration
    /// </summary>
    [DataMember(Name="tokenExpiration", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tokenExpiration")]
    public ConfigNodePropertyString TokenExpiration { get; set; }

    /// <summary>
    /// Gets or Sets TokenLength
    /// </summary>
    [DataMember(Name="tokenLength", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tokenLength")]
    public ConfigNodePropertyString TokenLength { get; set; }

    /// <summary>
    /// Gets or Sets TokenRefresh
    /// </summary>
    [DataMember(Name="tokenRefresh", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tokenRefresh")]
    public ConfigNodePropertyBoolean TokenRefresh { get; set; }

    /// <summary>
    /// Gets or Sets TokenCleanupThreshold
    /// </summary>
    [DataMember(Name="tokenCleanupThreshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tokenCleanupThreshold")]
    public ConfigNodePropertyInteger TokenCleanupThreshold { get; set; }

    /// <summary>
    /// Gets or Sets PasswordHashAlgorithm
    /// </summary>
    [DataMember(Name="passwordHashAlgorithm", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "passwordHashAlgorithm")]
    public ConfigNodePropertyString PasswordHashAlgorithm { get; set; }

    /// <summary>
    /// Gets or Sets PasswordHashIterations
    /// </summary>
    [DataMember(Name="passwordHashIterations", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "passwordHashIterations")]
    public ConfigNodePropertyInteger PasswordHashIterations { get; set; }

    /// <summary>
    /// Gets or Sets PasswordSaltSize
    /// </summary>
    [DataMember(Name="passwordSaltSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "passwordSaltSize")]
    public ConfigNodePropertyInteger PasswordSaltSize { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties {\n");
      sb.Append("  TokenExpiration: ").Append(TokenExpiration).Append("\n");
      sb.Append("  TokenLength: ").Append(TokenLength).Append("\n");
      sb.Append("  TokenRefresh: ").Append(TokenRefresh).Append("\n");
      sb.Append("  TokenCleanupThreshold: ").Append(TokenCleanupThreshold).Append("\n");
      sb.Append("  PasswordHashAlgorithm: ").Append(PasswordHashAlgorithm).Append("\n");
      sb.Append("  PasswordHashIterations: ").Append(PasswordHashIterations).Append("\n");
      sb.Append("  PasswordSaltSize: ").Append(PasswordSaltSize).Append("\n");
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
