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
  public class ComAdobeCqAccountImplAccountManagementServletProperties {
    /// <summary>
    /// Gets or Sets CqAccountmanagerConfigInformnewaccountMail
    /// </summary>
    [DataMember(Name="cq.accountmanager.config.informnewaccount.mail", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.accountmanager.config.informnewaccount.mail")]
    public ConfigNodePropertyString CqAccountmanagerConfigInformnewaccountMail { get; set; }

    /// <summary>
    /// Gets or Sets CqAccountmanagerConfigInformnewpwdMail
    /// </summary>
    [DataMember(Name="cq.accountmanager.config.informnewpwd.mail", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.accountmanager.config.informnewpwd.mail")]
    public ConfigNodePropertyString CqAccountmanagerConfigInformnewpwdMail { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqAccountImplAccountManagementServletProperties {\n");
      sb.Append("  CqAccountmanagerConfigInformnewaccountMail: ").Append(CqAccountmanagerConfigInformnewaccountMail).Append("\n");
      sb.Append("  CqAccountmanagerConfigInformnewpwdMail: ").Append(CqAccountmanagerConfigInformnewpwdMail).Append("\n");
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
