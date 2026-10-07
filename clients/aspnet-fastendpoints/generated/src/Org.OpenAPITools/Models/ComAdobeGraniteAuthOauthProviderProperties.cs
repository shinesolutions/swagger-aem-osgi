namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComAdobeGraniteAuthOauthProviderProperties 
{
    public ConfigNodePropertyString OauthConfigId { get; set; }
    public ConfigNodePropertyString OauthClientId { get; set; }
    public ConfigNodePropertyString OauthClientSecret { get; set; }
    public ConfigNodePropertyArray OauthScope { get; set; }
    public ConfigNodePropertyString OauthConfigProviderId { get; set; }
    public ConfigNodePropertyBoolean OauthCreateUsers { get; set; }
    public ConfigNodePropertyString OauthUseridProperty { get; set; }
    public ConfigNodePropertyBoolean ForceStrictUsernameMatching { get; set; }
    public ConfigNodePropertyBoolean OauthEncodeUserids { get; set; }
    public ConfigNodePropertyBoolean OauthHashUserids { get; set; }
    public ConfigNodePropertyString OauthCallBackUrl { get; set; }
    public ConfigNodePropertyBoolean OauthAccessTokenPersist { get; set; }
    public ConfigNodePropertyBoolean OauthAccessTokenPersistCookie { get; set; }
    public ConfigNodePropertyBoolean OauthCsrfStateProtection { get; set; }
    public ConfigNodePropertyBoolean OauthRedirectRequestParams { get; set; }
    public ConfigNodePropertyBoolean OauthConfigSiblingsAllow { get; set; }
}


