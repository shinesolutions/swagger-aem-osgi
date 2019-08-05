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
  public class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties {
    /// <summary>
    /// Gets or Sets ParameterWhitelist
    /// </summary>
    [DataMember(Name="parameter.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "parameter.whitelist")]
    public ConfigNodePropertyArray ParameterWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets ParameterWhitelistPrefixes
    /// </summary>
    [DataMember(Name="parameter.whitelist.prefixes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "parameter.whitelist.prefixes")]
    public ConfigNodePropertyArray ParameterWhitelistPrefixes { get; set; }

    /// <summary>
    /// Gets or Sets BinaryParameterWhitelist
    /// </summary>
    [DataMember(Name="binary.parameter.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "binary.parameter.whitelist")]
    public ConfigNodePropertyArray BinaryParameterWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets ModifierWhitelist
    /// </summary>
    [DataMember(Name="modifier.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "modifier.whitelist")]
    public ConfigNodePropertyArray ModifierWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets OperationWhitelist
    /// </summary>
    [DataMember(Name="operation.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "operation.whitelist")]
    public ConfigNodePropertyArray OperationWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets OperationWhitelistPrefixes
    /// </summary>
    [DataMember(Name="operation.whitelist.prefixes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "operation.whitelist.prefixes")]
    public ConfigNodePropertyArray OperationWhitelistPrefixes { get; set; }

    /// <summary>
    /// Gets or Sets TypehintWhitelist
    /// </summary>
    [DataMember(Name="typehint.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "typehint.whitelist")]
    public ConfigNodePropertyArray TypehintWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets ResourcetypeWhitelist
    /// </summary>
    [DataMember(Name="resourcetype.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resourcetype.whitelist")]
    public ConfigNodePropertyArray ResourcetypeWhitelist { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties {\n");
      sb.Append("  ParameterWhitelist: ").Append(ParameterWhitelist).Append("\n");
      sb.Append("  ParameterWhitelistPrefixes: ").Append(ParameterWhitelistPrefixes).Append("\n");
      sb.Append("  BinaryParameterWhitelist: ").Append(BinaryParameterWhitelist).Append("\n");
      sb.Append("  ModifierWhitelist: ").Append(ModifierWhitelist).Append("\n");
      sb.Append("  OperationWhitelist: ").Append(OperationWhitelist).Append("\n");
      sb.Append("  OperationWhitelistPrefixes: ").Append(OperationWhitelistPrefixes).Append("\n");
      sb.Append("  TypehintWhitelist: ").Append(TypehintWhitelist).Append("\n");
      sb.Append("  ResourcetypeWhitelist: ").Append(ResourcetypeWhitelist).Append("\n");
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
