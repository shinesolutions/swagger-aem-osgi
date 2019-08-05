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
  public class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    /// <summary>
    /// Gets or Sets UsersPath
    /// </summary>
    [DataMember(Name="usersPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "usersPath")]
    public ConfigNodePropertyString UsersPath { get; set; }

    /// <summary>
    /// Gets or Sets GroupsPath
    /// </summary>
    [DataMember(Name="groupsPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "groupsPath")]
    public ConfigNodePropertyString GroupsPath { get; set; }

    /// <summary>
    /// Gets or Sets SystemRelativePath
    /// </summary>
    [DataMember(Name="systemRelativePath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "systemRelativePath")]
    public ConfigNodePropertyString SystemRelativePath { get; set; }

    /// <summary>
    /// Gets or Sets DefaultDepth
    /// </summary>
    [DataMember(Name="defaultDepth", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defaultDepth")]
    public ConfigNodePropertyInteger DefaultDepth { get; set; }

    /// <summary>
    /// Gets or Sets ImportBehavior
    /// </summary>
    [DataMember(Name="importBehavior", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "importBehavior")]
    public ConfigNodePropertyDropDown ImportBehavior { get; set; }

    /// <summary>
    /// Gets or Sets PasswordHashAlgorithm
    /// </summary>
    [DataMember(Name="passwordHashAlgorithm", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "passwordHashAlgorithm")]
    public ConfigNodePropertyString PasswordHashAlgorithm { get; set; }

    /// <summary>
    /// Gets or Sets PasswordHashIterations
    /// </summary>
    [DataMember(Name="passwordHashIterations", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "passwordHashIterations")]
    public ConfigNodePropertyInteger PasswordHashIterations { get; set; }

    /// <summary>
    /// Gets or Sets PasswordSaltSize
    /// </summary>
    [DataMember(Name="passwordSaltSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "passwordSaltSize")]
    public ConfigNodePropertyInteger PasswordSaltSize { get; set; }

    /// <summary>
    /// Gets or Sets OmitAdminPw
    /// </summary>
    [DataMember(Name="omitAdminPw", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "omitAdminPw")]
    public ConfigNodePropertyBoolean OmitAdminPw { get; set; }

    /// <summary>
    /// Gets or Sets SupportAutoSave
    /// </summary>
    [DataMember(Name="supportAutoSave", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "supportAutoSave")]
    public ConfigNodePropertyBoolean SupportAutoSave { get; set; }

    /// <summary>
    /// Gets or Sets PasswordMaxAge
    /// </summary>
    [DataMember(Name="passwordMaxAge", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "passwordMaxAge")]
    public ConfigNodePropertyInteger PasswordMaxAge { get; set; }

    /// <summary>
    /// Gets or Sets InitialPasswordChange
    /// </summary>
    [DataMember(Name="initialPasswordChange", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "initialPasswordChange")]
    public ConfigNodePropertyBoolean InitialPasswordChange { get; set; }

    /// <summary>
    /// Gets or Sets PasswordHistorySize
    /// </summary>
    [DataMember(Name="passwordHistorySize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "passwordHistorySize")]
    public ConfigNodePropertyInteger PasswordHistorySize { get; set; }

    /// <summary>
    /// Gets or Sets PasswordExpiryForAdmin
    /// </summary>
    [DataMember(Name="passwordExpiryForAdmin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "passwordExpiryForAdmin")]
    public ConfigNodePropertyBoolean PasswordExpiryForAdmin { get; set; }

    /// <summary>
    /// Gets or Sets CacheExpiration
    /// </summary>
    [DataMember(Name="cacheExpiration", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cacheExpiration")]
    public ConfigNodePropertyInteger CacheExpiration { get; set; }

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
      sb.Append("class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {\n");
      sb.Append("  UsersPath: ").Append(UsersPath).Append("\n");
      sb.Append("  GroupsPath: ").Append(GroupsPath).Append("\n");
      sb.Append("  SystemRelativePath: ").Append(SystemRelativePath).Append("\n");
      sb.Append("  DefaultDepth: ").Append(DefaultDepth).Append("\n");
      sb.Append("  ImportBehavior: ").Append(ImportBehavior).Append("\n");
      sb.Append("  PasswordHashAlgorithm: ").Append(PasswordHashAlgorithm).Append("\n");
      sb.Append("  PasswordHashIterations: ").Append(PasswordHashIterations).Append("\n");
      sb.Append("  PasswordSaltSize: ").Append(PasswordSaltSize).Append("\n");
      sb.Append("  OmitAdminPw: ").Append(OmitAdminPw).Append("\n");
      sb.Append("  SupportAutoSave: ").Append(SupportAutoSave).Append("\n");
      sb.Append("  PasswordMaxAge: ").Append(PasswordMaxAge).Append("\n");
      sb.Append("  InitialPasswordChange: ").Append(InitialPasswordChange).Append("\n");
      sb.Append("  PasswordHistorySize: ").Append(PasswordHistorySize).Append("\n");
      sb.Append("  PasswordExpiryForAdmin: ").Append(PasswordExpiryForAdmin).Append("\n");
      sb.Append("  CacheExpiration: ").Append(CacheExpiration).Append("\n");
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
