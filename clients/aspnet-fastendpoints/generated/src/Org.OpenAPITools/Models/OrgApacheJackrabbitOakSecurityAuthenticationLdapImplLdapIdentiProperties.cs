namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties 
{
    public ConfigNodePropertyString ProviderName { get; set; }
    public ConfigNodePropertyString HostName { get; set; }
    public ConfigNodePropertyInteger HostPort { get; set; }
    public ConfigNodePropertyBoolean HostSsl { get; set; }
    public ConfigNodePropertyBoolean HostTls { get; set; }
    public ConfigNodePropertyBoolean HostNoCertCheck { get; set; }
    public ConfigNodePropertyString BindDn { get; set; }
    public ConfigNodePropertyString BindPassword { get; set; }
    public ConfigNodePropertyString SearchTimeout { get; set; }
    public ConfigNodePropertyInteger AdminPoolMaxActive { get; set; }
    public ConfigNodePropertyBoolean AdminPoolLookupOnValidate { get; set; }
    public ConfigNodePropertyInteger UserPoolMaxActive { get; set; }
    public ConfigNodePropertyBoolean UserPoolLookupOnValidate { get; set; }
    public ConfigNodePropertyString UserBaseDN { get; set; }
    public ConfigNodePropertyArray UserObjectclass { get; set; }
    public ConfigNodePropertyString UserIdAttribute { get; set; }
    public ConfigNodePropertyString UserExtraFilter { get; set; }
    public ConfigNodePropertyBoolean UserMakeDnPath { get; set; }
    public ConfigNodePropertyString GroupBaseDN { get; set; }
    public ConfigNodePropertyArray GroupObjectclass { get; set; }
    public ConfigNodePropertyString GroupNameAttribute { get; set; }
    public ConfigNodePropertyString GroupExtraFilter { get; set; }
    public ConfigNodePropertyBoolean GroupMakeDnPath { get; set; }
    public ConfigNodePropertyString GroupMemberAttribute { get; set; }
    public ConfigNodePropertyBoolean UseUidForExtId { get; set; }
    public ConfigNodePropertyArray Customattributes { get; set; }
}


