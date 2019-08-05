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
  public class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties {
    /// <summary>
    /// Gets or Sets AuthTokenValidatorType
    /// </summary>
    [DataMember(Name="auth.token.validator.type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auth.token.validator.type")]
    public ConfigNodePropertyString AuthTokenValidatorType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties {\n");
      sb.Append("  AuthTokenValidatorType: ").Append(AuthTokenValidatorType).Append("\n");
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
