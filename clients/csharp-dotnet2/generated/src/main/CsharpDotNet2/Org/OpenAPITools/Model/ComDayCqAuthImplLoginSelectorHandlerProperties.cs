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
  public class ComDayCqAuthImplLoginSelectorHandlerProperties {
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
    /// Gets or Sets AuthLoginselectorMappings
    /// </summary>
    [DataMember(Name="auth.loginselector.mappings", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.loginselector.mappings")]
    public ConfigNodePropertyArray AuthLoginselectorMappings { get; set; }

    /// <summary>
    /// Gets or Sets AuthLoginselectorChangepwMappings
    /// </summary>
    [DataMember(Name="auth.loginselector.changepw.mappings", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.loginselector.changepw.mappings")]
    public ConfigNodePropertyArray AuthLoginselectorChangepwMappings { get; set; }

    /// <summary>
    /// Gets or Sets AuthLoginselectorDefaultloginpage
    /// </summary>
    [DataMember(Name="auth.loginselector.defaultloginpage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.loginselector.defaultloginpage")]
    public ConfigNodePropertyString AuthLoginselectorDefaultloginpage { get; set; }

    /// <summary>
    /// Gets or Sets AuthLoginselectorDefaultchangepwpage
    /// </summary>
    [DataMember(Name="auth.loginselector.defaultchangepwpage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.loginselector.defaultchangepwpage")]
    public ConfigNodePropertyString AuthLoginselectorDefaultchangepwpage { get; set; }

    /// <summary>
    /// Gets or Sets AuthLoginselectorHandle
    /// </summary>
    [DataMember(Name="auth.loginselector.handle", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.loginselector.handle")]
    public ConfigNodePropertyArray AuthLoginselectorHandle { get; set; }

    /// <summary>
    /// Gets or Sets AuthLoginselectorHandleAllExtensions
    /// </summary>
    [DataMember(Name="auth.loginselector.handle.all.extensions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.loginselector.handle.all.extensions")]
    public ConfigNodePropertyBoolean AuthLoginselectorHandleAllExtensions { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqAuthImplLoginSelectorHandlerProperties {\n");
      sb.Append("  Path: ").Append(Path).Append("\n");
      sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
      sb.Append("  AuthLoginselectorMappings: ").Append(AuthLoginselectorMappings).Append("\n");
      sb.Append("  AuthLoginselectorChangepwMappings: ").Append(AuthLoginselectorChangepwMappings).Append("\n");
      sb.Append("  AuthLoginselectorDefaultloginpage: ").Append(AuthLoginselectorDefaultloginpage).Append("\n");
      sb.Append("  AuthLoginselectorDefaultchangepwpage: ").Append(AuthLoginselectorDefaultchangepwpage).Append("\n");
      sb.Append("  AuthLoginselectorHandle: ").Append(AuthLoginselectorHandle).Append("\n");
      sb.Append("  AuthLoginselectorHandleAllExtensions: ").Append(AuthLoginselectorHandleAllExtensions).Append("\n");
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
