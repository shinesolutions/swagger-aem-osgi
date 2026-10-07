namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties 
{
    public ConfigNodePropertyArray Path { get; set; }
    public ConfigNodePropertyInteger ServiceRanking { get; set; }
    public ConfigNodePropertyString IdpUrl { get; set; }
    public ConfigNodePropertyString IdpCertAlias { get; set; }
    public ConfigNodePropertyBoolean IdpHttpRedirect { get; set; }
    public ConfigNodePropertyString ServiceProviderEntityId { get; set; }
    public ConfigNodePropertyString AssertionConsumerServiceURL { get; set; }
    public ConfigNodePropertyString SpPrivateKeyAlias { get; set; }
    public ConfigNodePropertyString KeyStorePassword { get; set; }
    public ConfigNodePropertyString DefaultRedirectUrl { get; set; }
    public ConfigNodePropertyString UserIDAttribute { get; set; }
    public ConfigNodePropertyBoolean UseEncryption { get; set; }
    public ConfigNodePropertyBoolean CreateUser { get; set; }
    public ConfigNodePropertyString UserIntermediatePath { get; set; }
    public ConfigNodePropertyBoolean AddGroupMemberships { get; set; }
    public ConfigNodePropertyString GroupMembershipAttribute { get; set; }
    public ConfigNodePropertyArray DefaultGroups { get; set; }
    public ConfigNodePropertyString NameIdFormat { get; set; }
    public ConfigNodePropertyArray SynchronizeAttributes { get; set; }
    public ConfigNodePropertyBoolean HandleLogout { get; set; }
    public ConfigNodePropertyString LogoutUrl { get; set; }
    public ConfigNodePropertyInteger ClockTolerance { get; set; }
    public ConfigNodePropertyString DigestMethod { get; set; }
    public ConfigNodePropertyString SignatureMethod { get; set; }
    public ConfigNodePropertyDropDown IdentitySyncType { get; set; }
    public ConfigNodePropertyString IdpIdentifier { get; set; }
}


