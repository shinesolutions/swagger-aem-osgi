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
  public class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {
    /// <summary>
    /// Gets or Sets Path
    /// </summary>
    [DataMember(Name="path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path")]
    public ConfigNodePropertyString Path { get; set; }

    /// <summary>
    /// Gets or Sets TokenRequiredAttr
    /// </summary>
    [DataMember(Name="token.required.attr", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "token.required.attr")]
    public ConfigNodePropertyDropDown TokenRequiredAttr { get; set; }

    /// <summary>
    /// Gets or Sets TokenAlternateUrl
    /// </summary>
    [DataMember(Name="token.alternate.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "token.alternate.url")]
    public ConfigNodePropertyString TokenAlternateUrl { get; set; }

    /// <summary>
    /// Gets or Sets TokenEncapsulated
    /// </summary>
    [DataMember(Name="token.encapsulated", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "token.encapsulated")]
    public ConfigNodePropertyBoolean TokenEncapsulated { get; set; }

    /// <summary>
    /// Gets or Sets SkipTokenRefresh
    /// </summary>
    [DataMember(Name="skip.token.refresh", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "skip.token.refresh")]
    public ConfigNodePropertyArray SkipTokenRefresh { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {\n");
      sb.Append("  Path: ").Append(Path).Append("\n");
      sb.Append("  TokenRequiredAttr: ").Append(TokenRequiredAttr).Append("\n");
      sb.Append("  TokenAlternateUrl: ").Append(TokenAlternateUrl).Append("\n");
      sb.Append("  TokenEncapsulated: ").Append(TokenEncapsulated).Append("\n");
      sb.Append("  SkipTokenRefresh: ").Append(SkipTokenRefresh).Append("\n");
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
