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
  public class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties {
    /// <summary>
    /// Gets or Sets OsgiHttpWhiteboardContextSelect
    /// </summary>
    [DataMember(Name="osgi.http.whiteboard.context.select", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "osgi.http.whiteboard.context.select")]
    public ConfigNodePropertyString OsgiHttpWhiteboardContextSelect { get; set; }

    /// <summary>
    /// Gets or Sets OsgiHttpWhiteboardListener
    /// </summary>
    [DataMember(Name="osgi.http.whiteboard.listener", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "osgi.http.whiteboard.listener")]
    public ConfigNodePropertyString OsgiHttpWhiteboardListener { get; set; }

    /// <summary>
    /// Gets or Sets AuthSudoCookie
    /// </summary>
    [DataMember(Name="auth.sudo.cookie", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.sudo.cookie")]
    public ConfigNodePropertyString AuthSudoCookie { get; set; }

    /// <summary>
    /// Gets or Sets AuthSudoParameter
    /// </summary>
    [DataMember(Name="auth.sudo.parameter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.sudo.parameter")]
    public ConfigNodePropertyString AuthSudoParameter { get; set; }

    /// <summary>
    /// Gets or Sets AuthAnnonymous
    /// </summary>
    [DataMember(Name="auth.annonymous", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.annonymous")]
    public ConfigNodePropertyBoolean AuthAnnonymous { get; set; }

    /// <summary>
    /// Gets or Sets SlingAuthRequirements
    /// </summary>
    [DataMember(Name="sling.auth.requirements", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.auth.requirements")]
    public ConfigNodePropertyArray SlingAuthRequirements { get; set; }

    /// <summary>
    /// Gets or Sets SlingAuthAnonymousUser
    /// </summary>
    [DataMember(Name="sling.auth.anonymous.user", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.auth.anonymous.user")]
    public ConfigNodePropertyString SlingAuthAnonymousUser { get; set; }

    /// <summary>
    /// Gets or Sets SlingAuthAnonymousPassword
    /// </summary>
    [DataMember(Name="sling.auth.anonymous.password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.auth.anonymous.password")]
    public ConfigNodePropertyString SlingAuthAnonymousPassword { get; set; }

    /// <summary>
    /// Gets or Sets AuthHttp
    /// </summary>
    [DataMember(Name="auth.http", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.http")]
    public ConfigNodePropertyDropDown AuthHttp { get; set; }

    /// <summary>
    /// Gets or Sets AuthHttpRealm
    /// </summary>
    [DataMember(Name="auth.http.realm", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.http.realm")]
    public ConfigNodePropertyString AuthHttpRealm { get; set; }

    /// <summary>
    /// Gets or Sets AuthUriSuffix
    /// </summary>
    [DataMember(Name="auth.uri.suffix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.uri.suffix")]
    public ConfigNodePropertyArray AuthUriSuffix { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties {\n");
      sb.Append("  OsgiHttpWhiteboardContextSelect: ").Append(OsgiHttpWhiteboardContextSelect).Append("\n");
      sb.Append("  OsgiHttpWhiteboardListener: ").Append(OsgiHttpWhiteboardListener).Append("\n");
      sb.Append("  AuthSudoCookie: ").Append(AuthSudoCookie).Append("\n");
      sb.Append("  AuthSudoParameter: ").Append(AuthSudoParameter).Append("\n");
      sb.Append("  AuthAnnonymous: ").Append(AuthAnnonymous).Append("\n");
      sb.Append("  SlingAuthRequirements: ").Append(SlingAuthRequirements).Append("\n");
      sb.Append("  SlingAuthAnonymousUser: ").Append(SlingAuthAnonymousUser).Append("\n");
      sb.Append("  SlingAuthAnonymousPassword: ").Append(SlingAuthAnonymousPassword).Append("\n");
      sb.Append("  AuthHttp: ").Append(AuthHttp).Append("\n");
      sb.Append("  AuthHttpRealm: ").Append(AuthHttpRealm).Append("\n");
      sb.Append("  AuthUriSuffix: ").Append(AuthUriSuffix).Append("\n");
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
