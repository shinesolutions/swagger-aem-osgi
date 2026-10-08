namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties 
{
    public ConfigNodePropertyBoolean OrgApacheSlingInstallerConfigurationPersist { get; set; }
    public ConfigNodePropertyDropDown Mode { get; set; }
    public ConfigNodePropertyInteger Port { get; set; }
    public ConfigNodePropertyString PrimaryHost { get; set; }
    public ConfigNodePropertyInteger Interval { get; set; }
    public ConfigNodePropertyArray PrimaryAllowedClientIpRanges { get; set; }
    public ConfigNodePropertyBoolean Secure { get; set; }
    public ConfigNodePropertyInteger StandbyReadtimeout { get; set; }
    public ConfigNodePropertyBoolean StandbyAutoclean { get; set; }
}


