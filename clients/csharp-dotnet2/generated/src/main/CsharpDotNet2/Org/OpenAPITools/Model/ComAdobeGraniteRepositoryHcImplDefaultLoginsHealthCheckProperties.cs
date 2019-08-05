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
  public class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties {
    /// <summary>
    /// Gets or Sets HcTags
    /// </summary>
    [DataMember(Name="hc.tags", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hc.tags")]
    public ConfigNodePropertyArray HcTags { get; set; }

    /// <summary>
    /// Gets or Sets AccountLogins
    /// </summary>
    [DataMember(Name="account.logins", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "account.logins")]
    public ConfigNodePropertyArray AccountLogins { get; set; }

    /// <summary>
    /// Gets or Sets ConsoleLogins
    /// </summary>
    [DataMember(Name="console.logins", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "console.logins")]
    public ConfigNodePropertyArray ConsoleLogins { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties {\n");
      sb.Append("  HcTags: ").Append(HcTags).Append("\n");
      sb.Append("  AccountLogins: ").Append(AccountLogins).Append("\n");
      sb.Append("  ConsoleLogins: ").Append(ConsoleLogins).Append("\n");
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
