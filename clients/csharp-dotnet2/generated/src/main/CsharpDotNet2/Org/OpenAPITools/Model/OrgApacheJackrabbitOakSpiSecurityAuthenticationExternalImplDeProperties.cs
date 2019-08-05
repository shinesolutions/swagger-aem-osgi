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
  public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties {
    /// <summary>
    /// Gets or Sets HandlerName
    /// </summary>
    [DataMember(Name="handler.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "handler.name")]
    public ConfigNodePropertyString HandlerName { get; set; }

    /// <summary>
    /// Gets or Sets UserExpirationTime
    /// </summary>
    [DataMember(Name="user.expirationTime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.expirationTime")]
    public ConfigNodePropertyString UserExpirationTime { get; set; }

    /// <summary>
    /// Gets or Sets UserAutoMembership
    /// </summary>
    [DataMember(Name="user.autoMembership", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.autoMembership")]
    public ConfigNodePropertyArray UserAutoMembership { get; set; }

    /// <summary>
    /// Gets or Sets UserPropertyMapping
    /// </summary>
    [DataMember(Name="user.propertyMapping", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.propertyMapping")]
    public ConfigNodePropertyArray UserPropertyMapping { get; set; }

    /// <summary>
    /// Gets or Sets UserPathPrefix
    /// </summary>
    [DataMember(Name="user.pathPrefix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.pathPrefix")]
    public ConfigNodePropertyString UserPathPrefix { get; set; }

    /// <summary>
    /// Gets or Sets UserMembershipExpTime
    /// </summary>
    [DataMember(Name="user.membershipExpTime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.membershipExpTime")]
    public ConfigNodePropertyString UserMembershipExpTime { get; set; }

    /// <summary>
    /// Gets or Sets UserMembershipNestingDepth
    /// </summary>
    [DataMember(Name="user.membershipNestingDepth", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.membershipNestingDepth")]
    public ConfigNodePropertyInteger UserMembershipNestingDepth { get; set; }

    /// <summary>
    /// Gets or Sets UserDynamicMembership
    /// </summary>
    [DataMember(Name="user.dynamicMembership", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.dynamicMembership")]
    public ConfigNodePropertyBoolean UserDynamicMembership { get; set; }

    /// <summary>
    /// Gets or Sets UserDisableMissing
    /// </summary>
    [DataMember(Name="user.disableMissing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.disableMissing")]
    public ConfigNodePropertyBoolean UserDisableMissing { get; set; }

    /// <summary>
    /// Gets or Sets GroupExpirationTime
    /// </summary>
    [DataMember(Name="group.expirationTime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group.expirationTime")]
    public ConfigNodePropertyString GroupExpirationTime { get; set; }

    /// <summary>
    /// Gets or Sets GroupAutoMembership
    /// </summary>
    [DataMember(Name="group.autoMembership", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group.autoMembership")]
    public ConfigNodePropertyArray GroupAutoMembership { get; set; }

    /// <summary>
    /// Gets or Sets GroupPropertyMapping
    /// </summary>
    [DataMember(Name="group.propertyMapping", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group.propertyMapping")]
    public ConfigNodePropertyArray GroupPropertyMapping { get; set; }

    /// <summary>
    /// Gets or Sets GroupPathPrefix
    /// </summary>
    [DataMember(Name="group.pathPrefix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group.pathPrefix")]
    public ConfigNodePropertyString GroupPathPrefix { get; set; }

    /// <summary>
    /// Gets or Sets EnableRFC7613UsercaseMappedProfile
    /// </summary>
    [DataMember(Name="enableRFC7613UsercaseMappedProfile", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enableRFC7613UsercaseMappedProfile")]
    public ConfigNodePropertyBoolean EnableRFC7613UsercaseMappedProfile { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties {\n");
      sb.Append("  HandlerName: ").Append(HandlerName).Append("\n");
      sb.Append("  UserExpirationTime: ").Append(UserExpirationTime).Append("\n");
      sb.Append("  UserAutoMembership: ").Append(UserAutoMembership).Append("\n");
      sb.Append("  UserPropertyMapping: ").Append(UserPropertyMapping).Append("\n");
      sb.Append("  UserPathPrefix: ").Append(UserPathPrefix).Append("\n");
      sb.Append("  UserMembershipExpTime: ").Append(UserMembershipExpTime).Append("\n");
      sb.Append("  UserMembershipNestingDepth: ").Append(UserMembershipNestingDepth).Append("\n");
      sb.Append("  UserDynamicMembership: ").Append(UserDynamicMembership).Append("\n");
      sb.Append("  UserDisableMissing: ").Append(UserDisableMissing).Append("\n");
      sb.Append("  GroupExpirationTime: ").Append(GroupExpirationTime).Append("\n");
      sb.Append("  GroupAutoMembership: ").Append(GroupAutoMembership).Append("\n");
      sb.Append("  GroupPropertyMapping: ").Append(GroupPropertyMapping).Append("\n");
      sb.Append("  GroupPathPrefix: ").Append(GroupPathPrefix).Append("\n");
      sb.Append("  EnableRFC7613UsercaseMappedProfile: ").Append(EnableRFC7613UsercaseMappedProfile).Append("\n");
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
