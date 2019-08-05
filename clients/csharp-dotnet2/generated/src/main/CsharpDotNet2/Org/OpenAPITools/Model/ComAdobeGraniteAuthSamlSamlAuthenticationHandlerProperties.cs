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
  public class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties {
    /// <summary>
    /// Gets or Sets Path
    /// </summary>
    [DataMember(Name="path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path")]
    public ConfigNodePropertyArray Path { get; set; }

    /// <summary>
    /// Gets or Sets ServiceRanking
    /// </summary>
    [DataMember(Name="service.ranking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.ranking")]
    public ConfigNodePropertyInteger ServiceRanking { get; set; }

    /// <summary>
    /// Gets or Sets IdpUrl
    /// </summary>
    [DataMember(Name="idpUrl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "idpUrl")]
    public ConfigNodePropertyString IdpUrl { get; set; }

    /// <summary>
    /// Gets or Sets IdpCertAlias
    /// </summary>
    [DataMember(Name="idpCertAlias", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "idpCertAlias")]
    public ConfigNodePropertyString IdpCertAlias { get; set; }

    /// <summary>
    /// Gets or Sets IdpHttpRedirect
    /// </summary>
    [DataMember(Name="idpHttpRedirect", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "idpHttpRedirect")]
    public ConfigNodePropertyBoolean IdpHttpRedirect { get; set; }

    /// <summary>
    /// Gets or Sets ServiceProviderEntityId
    /// </summary>
    [DataMember(Name="serviceProviderEntityId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serviceProviderEntityId")]
    public ConfigNodePropertyString ServiceProviderEntityId { get; set; }

    /// <summary>
    /// Gets or Sets AssertionConsumerServiceURL
    /// </summary>
    [DataMember(Name="assertionConsumerServiceURL", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "assertionConsumerServiceURL")]
    public ConfigNodePropertyString AssertionConsumerServiceURL { get; set; }

    /// <summary>
    /// Gets or Sets SpPrivateKeyAlias
    /// </summary>
    [DataMember(Name="spPrivateKeyAlias", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "spPrivateKeyAlias")]
    public ConfigNodePropertyString SpPrivateKeyAlias { get; set; }

    /// <summary>
    /// Gets or Sets KeyStorePassword
    /// </summary>
    [DataMember(Name="keyStorePassword", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "keyStorePassword")]
    public ConfigNodePropertyString KeyStorePassword { get; set; }

    /// <summary>
    /// Gets or Sets DefaultRedirectUrl
    /// </summary>
    [DataMember(Name="defaultRedirectUrl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defaultRedirectUrl")]
    public ConfigNodePropertyString DefaultRedirectUrl { get; set; }

    /// <summary>
    /// Gets or Sets UserIDAttribute
    /// </summary>
    [DataMember(Name="userIDAttribute", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "userIDAttribute")]
    public ConfigNodePropertyString UserIDAttribute { get; set; }

    /// <summary>
    /// Gets or Sets UseEncryption
    /// </summary>
    [DataMember(Name="useEncryption", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "useEncryption")]
    public ConfigNodePropertyBoolean UseEncryption { get; set; }

    /// <summary>
    /// Gets or Sets CreateUser
    /// </summary>
    [DataMember(Name="createUser", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "createUser")]
    public ConfigNodePropertyBoolean CreateUser { get; set; }

    /// <summary>
    /// Gets or Sets UserIntermediatePath
    /// </summary>
    [DataMember(Name="userIntermediatePath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "userIntermediatePath")]
    public ConfigNodePropertyString UserIntermediatePath { get; set; }

    /// <summary>
    /// Gets or Sets AddGroupMemberships
    /// </summary>
    [DataMember(Name="addGroupMemberships", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "addGroupMemberships")]
    public ConfigNodePropertyBoolean AddGroupMemberships { get; set; }

    /// <summary>
    /// Gets or Sets GroupMembershipAttribute
    /// </summary>
    [DataMember(Name="groupMembershipAttribute", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "groupMembershipAttribute")]
    public ConfigNodePropertyString GroupMembershipAttribute { get; set; }

    /// <summary>
    /// Gets or Sets DefaultGroups
    /// </summary>
    [DataMember(Name="defaultGroups", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defaultGroups")]
    public ConfigNodePropertyArray DefaultGroups { get; set; }

    /// <summary>
    /// Gets or Sets NameIdFormat
    /// </summary>
    [DataMember(Name="nameIdFormat", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nameIdFormat")]
    public ConfigNodePropertyString NameIdFormat { get; set; }

    /// <summary>
    /// Gets or Sets SynchronizeAttributes
    /// </summary>
    [DataMember(Name="synchronizeAttributes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "synchronizeAttributes")]
    public ConfigNodePropertyArray SynchronizeAttributes { get; set; }

    /// <summary>
    /// Gets or Sets HandleLogout
    /// </summary>
    [DataMember(Name="handleLogout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "handleLogout")]
    public ConfigNodePropertyBoolean HandleLogout { get; set; }

    /// <summary>
    /// Gets or Sets LogoutUrl
    /// </summary>
    [DataMember(Name="logoutUrl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "logoutUrl")]
    public ConfigNodePropertyString LogoutUrl { get; set; }

    /// <summary>
    /// Gets or Sets ClockTolerance
    /// </summary>
    [DataMember(Name="clockTolerance", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "clockTolerance")]
    public ConfigNodePropertyInteger ClockTolerance { get; set; }

    /// <summary>
    /// Gets or Sets DigestMethod
    /// </summary>
    [DataMember(Name="digestMethod", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "digestMethod")]
    public ConfigNodePropertyString DigestMethod { get; set; }

    /// <summary>
    /// Gets or Sets SignatureMethod
    /// </summary>
    [DataMember(Name="signatureMethod", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "signatureMethod")]
    public ConfigNodePropertyString SignatureMethod { get; set; }

    /// <summary>
    /// Gets or Sets IdentitySyncType
    /// </summary>
    [DataMember(Name="identitySyncType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "identitySyncType")]
    public ConfigNodePropertyDropDown IdentitySyncType { get; set; }

    /// <summary>
    /// Gets or Sets IdpIdentifier
    /// </summary>
    [DataMember(Name="idpIdentifier", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "idpIdentifier")]
    public ConfigNodePropertyString IdpIdentifier { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties {\n");
      sb.Append("  Path: ").Append(Path).Append("\n");
      sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
      sb.Append("  IdpUrl: ").Append(IdpUrl).Append("\n");
      sb.Append("  IdpCertAlias: ").Append(IdpCertAlias).Append("\n");
      sb.Append("  IdpHttpRedirect: ").Append(IdpHttpRedirect).Append("\n");
      sb.Append("  ServiceProviderEntityId: ").Append(ServiceProviderEntityId).Append("\n");
      sb.Append("  AssertionConsumerServiceURL: ").Append(AssertionConsumerServiceURL).Append("\n");
      sb.Append("  SpPrivateKeyAlias: ").Append(SpPrivateKeyAlias).Append("\n");
      sb.Append("  KeyStorePassword: ").Append(KeyStorePassword).Append("\n");
      sb.Append("  DefaultRedirectUrl: ").Append(DefaultRedirectUrl).Append("\n");
      sb.Append("  UserIDAttribute: ").Append(UserIDAttribute).Append("\n");
      sb.Append("  UseEncryption: ").Append(UseEncryption).Append("\n");
      sb.Append("  CreateUser: ").Append(CreateUser).Append("\n");
      sb.Append("  UserIntermediatePath: ").Append(UserIntermediatePath).Append("\n");
      sb.Append("  AddGroupMemberships: ").Append(AddGroupMemberships).Append("\n");
      sb.Append("  GroupMembershipAttribute: ").Append(GroupMembershipAttribute).Append("\n");
      sb.Append("  DefaultGroups: ").Append(DefaultGroups).Append("\n");
      sb.Append("  NameIdFormat: ").Append(NameIdFormat).Append("\n");
      sb.Append("  SynchronizeAttributes: ").Append(SynchronizeAttributes).Append("\n");
      sb.Append("  HandleLogout: ").Append(HandleLogout).Append("\n");
      sb.Append("  LogoutUrl: ").Append(LogoutUrl).Append("\n");
      sb.Append("  ClockTolerance: ").Append(ClockTolerance).Append("\n");
      sb.Append("  DigestMethod: ").Append(DigestMethod).Append("\n");
      sb.Append("  SignatureMethod: ").Append(SignatureMethod).Append("\n");
      sb.Append("  IdentitySyncType: ").Append(IdentitySyncType).Append("\n");
      sb.Append("  IdpIdentifier: ").Append(IdpIdentifier).Append("\n");
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
