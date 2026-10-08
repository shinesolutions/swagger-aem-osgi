namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties 
{
    public ConfigNodePropertyString UsersPath { get; set; }
    public ConfigNodePropertyString GroupsPath { get; set; }
    public ConfigNodePropertyString SystemRelativePath { get; set; }
    public ConfigNodePropertyInteger DefaultDepth { get; set; }
    public ConfigNodePropertyDropDown ImportBehavior { get; set; }
    public ConfigNodePropertyString PasswordHashAlgorithm { get; set; }
    public ConfigNodePropertyInteger PasswordHashIterations { get; set; }
    public ConfigNodePropertyInteger PasswordSaltSize { get; set; }
    public ConfigNodePropertyBoolean OmitAdminPw { get; set; }
    public ConfigNodePropertyBoolean SupportAutoSave { get; set; }
    public ConfigNodePropertyInteger PasswordMaxAge { get; set; }
    public ConfigNodePropertyBoolean InitialPasswordChange { get; set; }
    public ConfigNodePropertyInteger PasswordHistorySize { get; set; }
    public ConfigNodePropertyBoolean PasswordExpiryForAdmin { get; set; }
    public ConfigNodePropertyInteger CacheExpiration { get; set; }
    public ConfigNodePropertyBoolean EnableRFC7613UsercaseMappedProfile { get; set; }
}


