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
  public class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties {
    /// <summary>
    /// Gets or Sets EnabledActions
    /// </summary>
    [DataMember(Name="enabledActions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enabledActions")]
    public ConfigNodePropertyDropDown EnabledActions { get; set; }

    /// <summary>
    /// Gets or Sets UserPrivilegeNames
    /// </summary>
    [DataMember(Name="userPrivilegeNames", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "userPrivilegeNames")]
    public ConfigNodePropertyArray UserPrivilegeNames { get; set; }

    /// <summary>
    /// Gets or Sets GroupPrivilegeNames
    /// </summary>
    [DataMember(Name="groupPrivilegeNames", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "groupPrivilegeNames")]
    public ConfigNodePropertyArray GroupPrivilegeNames { get; set; }

    /// <summary>
    /// Gets or Sets Constraint
    /// </summary>
    [DataMember(Name="constraint", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "constraint")]
    public ConfigNodePropertyString Constraint { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties {\n");
      sb.Append("  EnabledActions: ").Append(EnabledActions).Append("\n");
      sb.Append("  UserPrivilegeNames: ").Append(UserPrivilegeNames).Append("\n");
      sb.Append("  GroupPrivilegeNames: ").Append(GroupPrivilegeNames).Append("\n");
      sb.Append("  Constraint: ").Append(Constraint).Append("\n");
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
