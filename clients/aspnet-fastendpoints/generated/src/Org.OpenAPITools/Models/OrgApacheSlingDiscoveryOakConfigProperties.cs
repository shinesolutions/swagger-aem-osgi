namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheSlingDiscoveryOakConfigProperties 
{
    public ConfigNodePropertyInteger ConnectorPingTimeout { get; set; }
    public ConfigNodePropertyInteger ConnectorPingInterval { get; set; }
    public ConfigNodePropertyInteger DiscoveryLiteCheckInterval { get; set; }
    public ConfigNodePropertyInteger ClusterSyncServiceTimeout { get; set; }
    public ConfigNodePropertyInteger ClusterSyncServiceInterval { get; set; }
    public ConfigNodePropertyBoolean EnableSyncToken { get; set; }
    public ConfigNodePropertyInteger MinEventDelay { get; set; }
    public ConfigNodePropertyInteger SocketConnectTimeout { get; set; }
    public ConfigNodePropertyInteger SoTimeout { get; set; }
    public ConfigNodePropertyArray TopologyConnectorUrls { get; set; }
    public ConfigNodePropertyArray TopologyConnectorWhitelist { get; set; }
    public ConfigNodePropertyBoolean AutoStopLocalLoopEnabled { get; set; }
    public ConfigNodePropertyBoolean GzipConnectorRequestsEnabled { get; set; }
    public ConfigNodePropertyBoolean HmacEnabled { get; set; }
    public ConfigNodePropertyBoolean EnableEncryption { get; set; }
    public ConfigNodePropertyString SharedKey { get; set; }
    public ConfigNodePropertyInteger HmacSharedKeyTTL { get; set; }
    public ConfigNodePropertyString BackoffStandbyFactor { get; set; }
    public ConfigNodePropertyString BackoffStableFactor { get; set; }
}


