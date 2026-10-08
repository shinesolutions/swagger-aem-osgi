namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComAdobeGraniteAuthOauthAccesstokenProviderProperties 
{
    public ConfigNodePropertyString Name { get; set; }
    public ConfigNodePropertyString AuthTokenProviderTitle { get; set; }
    public ConfigNodePropertyArray AuthTokenProviderDefaultClaims { get; set; }
    public ConfigNodePropertyString AuthTokenProviderEndpoint { get; set; }
    public ConfigNodePropertyString AuthAccessTokenRequest { get; set; }
    public ConfigNodePropertyString AuthTokenProviderKeypairAlias { get; set; }
    public ConfigNodePropertyInteger AuthTokenProviderConnTimeout { get; set; }
    public ConfigNodePropertyInteger AuthTokenProviderSoTimeout { get; set; }
    public ConfigNodePropertyString AuthTokenProviderClientId { get; set; }
    public ConfigNodePropertyString AuthTokenProviderScope { get; set; }
    public ConfigNodePropertyBoolean AuthTokenProviderReuseAccessToken { get; set; }
    public ConfigNodePropertyBoolean AuthTokenProviderRelaxedSsl { get; set; }
    public ConfigNodePropertyString TokenRequestCustomizerType { get; set; }
    public ConfigNodePropertyString AuthTokenValidatorType { get; set; }
}


