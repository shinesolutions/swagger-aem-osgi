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
  public class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties {
    /// <summary>
    /// Gets or Sets Path
    /// </summary>
    [DataMember(Name="path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path")]
    public ConfigNodePropertyString Path { get; set; }

    /// <summary>
    /// Gets or Sets AuthHttpNologin
    /// </summary>
    [DataMember(Name="auth.http.nologin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.http.nologin")]
    public ConfigNodePropertyBoolean AuthHttpNologin { get; set; }

    /// <summary>
    /// Gets or Sets AuthHttpRealm
    /// </summary>
    [DataMember(Name="auth.http.realm", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.http.realm")]
    public ConfigNodePropertyString AuthHttpRealm { get; set; }

    /// <summary>
    /// Gets or Sets AuthDefaultLoginpage
    /// </summary>
    [DataMember(Name="auth.default.loginpage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.default.loginpage")]
    public ConfigNodePropertyString AuthDefaultLoginpage { get; set; }

    /// <summary>
    /// Gets or Sets AuthCredForm
    /// </summary>
    [DataMember(Name="auth.cred.form", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.cred.form")]
    public ConfigNodePropertyArray AuthCredForm { get; set; }

    /// <summary>
    /// Gets or Sets AuthCredUtf8
    /// </summary>
    [DataMember(Name="auth.cred.utf8", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.cred.utf8")]
    public ConfigNodePropertyArray AuthCredUtf8 { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties {\n");
      sb.Append("  Path: ").Append(Path).Append("\n");
      sb.Append("  AuthHttpNologin: ").Append(AuthHttpNologin).Append("\n");
      sb.Append("  AuthHttpRealm: ").Append(AuthHttpRealm).Append("\n");
      sb.Append("  AuthDefaultLoginpage: ").Append(AuthDefaultLoginpage).Append("\n");
      sb.Append("  AuthCredForm: ").Append(AuthCredForm).Append("\n");
      sb.Append("  AuthCredUtf8: ").Append(AuthCredUtf8).Append("\n");
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
