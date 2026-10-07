namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties 
{
    public ConfigNodePropertyString OsgiHttpWhiteboardContextSelect { get; set; }
    public ConfigNodePropertyString OsgiHttpWhiteboardListener { get; set; }
    public ConfigNodePropertyString AuthSudoCookie { get; set; }
    public ConfigNodePropertyString AuthSudoParameter { get; set; }
    public ConfigNodePropertyBoolean AuthAnnonymous { get; set; }
    public ConfigNodePropertyArray SlingAuthRequirements { get; set; }
    public ConfigNodePropertyString SlingAuthAnonymousUser { get; set; }
    public ConfigNodePropertyString SlingAuthAnonymousPassword { get; set; }
    public ConfigNodePropertyDropDown AuthHttp { get; set; }
    public ConfigNodePropertyString AuthHttpRealm { get; set; }
    public ConfigNodePropertyArray AuthUriSuffix { get; set; }
}


