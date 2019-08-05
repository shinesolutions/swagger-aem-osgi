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
  public class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties {
    /// <summary>
    /// Gets or Sets ProviderName
    /// </summary>
    [DataMember(Name="provider.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "provider.name")]
    public ConfigNodePropertyString ProviderName { get; set; }

    /// <summary>
    /// Gets or Sets HostName
    /// </summary>
    [DataMember(Name="host.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "host.name")]
    public ConfigNodePropertyString HostName { get; set; }

    /// <summary>
    /// Gets or Sets HostPort
    /// </summary>
    [DataMember(Name="host.port", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "host.port")]
    public ConfigNodePropertyInteger HostPort { get; set; }

    /// <summary>
    /// Gets or Sets HostSsl
    /// </summary>
    [DataMember(Name="host.ssl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "host.ssl")]
    public ConfigNodePropertyBoolean HostSsl { get; set; }

    /// <summary>
    /// Gets or Sets HostTls
    /// </summary>
    [DataMember(Name="host.tls", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "host.tls")]
    public ConfigNodePropertyBoolean HostTls { get; set; }

    /// <summary>
    /// Gets or Sets HostNoCertCheck
    /// </summary>
    [DataMember(Name="host.noCertCheck", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "host.noCertCheck")]
    public ConfigNodePropertyBoolean HostNoCertCheck { get; set; }

    /// <summary>
    /// Gets or Sets BindDn
    /// </summary>
    [DataMember(Name="bind.dn", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bind.dn")]
    public ConfigNodePropertyString BindDn { get; set; }

    /// <summary>
    /// Gets or Sets BindPassword
    /// </summary>
    [DataMember(Name="bind.password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bind.password")]
    public ConfigNodePropertyString BindPassword { get; set; }

    /// <summary>
    /// Gets or Sets SearchTimeout
    /// </summary>
    [DataMember(Name="searchTimeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "searchTimeout")]
    public ConfigNodePropertyString SearchTimeout { get; set; }

    /// <summary>
    /// Gets or Sets AdminPoolMaxActive
    /// </summary>
    [DataMember(Name="adminPool.maxActive", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "adminPool.maxActive")]
    public ConfigNodePropertyInteger AdminPoolMaxActive { get; set; }

    /// <summary>
    /// Gets or Sets AdminPoolLookupOnValidate
    /// </summary>
    [DataMember(Name="adminPool.lookupOnValidate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "adminPool.lookupOnValidate")]
    public ConfigNodePropertyBoolean AdminPoolLookupOnValidate { get; set; }

    /// <summary>
    /// Gets or Sets UserPoolMaxActive
    /// </summary>
    [DataMember(Name="userPool.maxActive", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "userPool.maxActive")]
    public ConfigNodePropertyInteger UserPoolMaxActive { get; set; }

    /// <summary>
    /// Gets or Sets UserPoolLookupOnValidate
    /// </summary>
    [DataMember(Name="userPool.lookupOnValidate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "userPool.lookupOnValidate")]
    public ConfigNodePropertyBoolean UserPoolLookupOnValidate { get; set; }

    /// <summary>
    /// Gets or Sets UserBaseDN
    /// </summary>
    [DataMember(Name="user.baseDN", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.baseDN")]
    public ConfigNodePropertyString UserBaseDN { get; set; }

    /// <summary>
    /// Gets or Sets UserObjectclass
    /// </summary>
    [DataMember(Name="user.objectclass", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.objectclass")]
    public ConfigNodePropertyArray UserObjectclass { get; set; }

    /// <summary>
    /// Gets or Sets UserIdAttribute
    /// </summary>
    [DataMember(Name="user.idAttribute", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.idAttribute")]
    public ConfigNodePropertyString UserIdAttribute { get; set; }

    /// <summary>
    /// Gets or Sets UserExtraFilter
    /// </summary>
    [DataMember(Name="user.extraFilter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.extraFilter")]
    public ConfigNodePropertyString UserExtraFilter { get; set; }

    /// <summary>
    /// Gets or Sets UserMakeDnPath
    /// </summary>
    [DataMember(Name="user.makeDnPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.makeDnPath")]
    public ConfigNodePropertyBoolean UserMakeDnPath { get; set; }

    /// <summary>
    /// Gets or Sets GroupBaseDN
    /// </summary>
    [DataMember(Name="group.baseDN", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group.baseDN")]
    public ConfigNodePropertyString GroupBaseDN { get; set; }

    /// <summary>
    /// Gets or Sets GroupObjectclass
    /// </summary>
    [DataMember(Name="group.objectclass", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group.objectclass")]
    public ConfigNodePropertyArray GroupObjectclass { get; set; }

    /// <summary>
    /// Gets or Sets GroupNameAttribute
    /// </summary>
    [DataMember(Name="group.nameAttribute", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group.nameAttribute")]
    public ConfigNodePropertyString GroupNameAttribute { get; set; }

    /// <summary>
    /// Gets or Sets GroupExtraFilter
    /// </summary>
    [DataMember(Name="group.extraFilter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group.extraFilter")]
    public ConfigNodePropertyString GroupExtraFilter { get; set; }

    /// <summary>
    /// Gets or Sets GroupMakeDnPath
    /// </summary>
    [DataMember(Name="group.makeDnPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group.makeDnPath")]
    public ConfigNodePropertyBoolean GroupMakeDnPath { get; set; }

    /// <summary>
    /// Gets or Sets GroupMemberAttribute
    /// </summary>
    [DataMember(Name="group.memberAttribute", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group.memberAttribute")]
    public ConfigNodePropertyString GroupMemberAttribute { get; set; }

    /// <summary>
    /// Gets or Sets UseUidForExtId
    /// </summary>
    [DataMember(Name="useUidForExtId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "useUidForExtId")]
    public ConfigNodePropertyBoolean UseUidForExtId { get; set; }

    /// <summary>
    /// Gets or Sets Customattributes
    /// </summary>
    [DataMember(Name="customattributes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "customattributes")]
    public ConfigNodePropertyArray Customattributes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties {\n");
      sb.Append("  ProviderName: ").Append(ProviderName).Append("\n");
      sb.Append("  HostName: ").Append(HostName).Append("\n");
      sb.Append("  HostPort: ").Append(HostPort).Append("\n");
      sb.Append("  HostSsl: ").Append(HostSsl).Append("\n");
      sb.Append("  HostTls: ").Append(HostTls).Append("\n");
      sb.Append("  HostNoCertCheck: ").Append(HostNoCertCheck).Append("\n");
      sb.Append("  BindDn: ").Append(BindDn).Append("\n");
      sb.Append("  BindPassword: ").Append(BindPassword).Append("\n");
      sb.Append("  SearchTimeout: ").Append(SearchTimeout).Append("\n");
      sb.Append("  AdminPoolMaxActive: ").Append(AdminPoolMaxActive).Append("\n");
      sb.Append("  AdminPoolLookupOnValidate: ").Append(AdminPoolLookupOnValidate).Append("\n");
      sb.Append("  UserPoolMaxActive: ").Append(UserPoolMaxActive).Append("\n");
      sb.Append("  UserPoolLookupOnValidate: ").Append(UserPoolLookupOnValidate).Append("\n");
      sb.Append("  UserBaseDN: ").Append(UserBaseDN).Append("\n");
      sb.Append("  UserObjectclass: ").Append(UserObjectclass).Append("\n");
      sb.Append("  UserIdAttribute: ").Append(UserIdAttribute).Append("\n");
      sb.Append("  UserExtraFilter: ").Append(UserExtraFilter).Append("\n");
      sb.Append("  UserMakeDnPath: ").Append(UserMakeDnPath).Append("\n");
      sb.Append("  GroupBaseDN: ").Append(GroupBaseDN).Append("\n");
      sb.Append("  GroupObjectclass: ").Append(GroupObjectclass).Append("\n");
      sb.Append("  GroupNameAttribute: ").Append(GroupNameAttribute).Append("\n");
      sb.Append("  GroupExtraFilter: ").Append(GroupExtraFilter).Append("\n");
      sb.Append("  GroupMakeDnPath: ").Append(GroupMakeDnPath).Append("\n");
      sb.Append("  GroupMemberAttribute: ").Append(GroupMemberAttribute).Append("\n");
      sb.Append("  UseUidForExtId: ").Append(UseUidForExtId).Append("\n");
      sb.Append("  Customattributes: ").Append(Customattributes).Append("\n");
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
