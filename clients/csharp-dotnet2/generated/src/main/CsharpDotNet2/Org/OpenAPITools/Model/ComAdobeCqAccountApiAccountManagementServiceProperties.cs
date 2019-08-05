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
  public class ComAdobeCqAccountApiAccountManagementServiceProperties {
    /// <summary>
    /// Gets or Sets CqAccountmanagerTokenValidityPeriod
    /// </summary>
    [DataMember(Name="cq.accountmanager.token.validity.period", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.accountmanager.token.validity.period")]
    public ConfigNodePropertyInteger CqAccountmanagerTokenValidityPeriod { get; set; }

    /// <summary>
    /// Gets or Sets CqAccountmanagerConfigRequestnewaccountMail
    /// </summary>
    [DataMember(Name="cq.accountmanager.config.requestnewaccount.mail", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.accountmanager.config.requestnewaccount.mail")]
    public ConfigNodePropertyString CqAccountmanagerConfigRequestnewaccountMail { get; set; }

    /// <summary>
    /// Gets or Sets CqAccountmanagerConfigRequestnewpwdMail
    /// </summary>
    [DataMember(Name="cq.accountmanager.config.requestnewpwd.mail", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.accountmanager.config.requestnewpwd.mail")]
    public ConfigNodePropertyString CqAccountmanagerConfigRequestnewpwdMail { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqAccountApiAccountManagementServiceProperties {\n");
      sb.Append("  CqAccountmanagerTokenValidityPeriod: ").Append(CqAccountmanagerTokenValidityPeriod).Append("\n");
      sb.Append("  CqAccountmanagerConfigRequestnewaccountMail: ").Append(CqAccountmanagerConfigRequestnewaccountMail).Append("\n");
      sb.Append("  CqAccountmanagerConfigRequestnewpwdMail: ").Append(CqAccountmanagerConfigRequestnewpwdMail).Append("\n");
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
