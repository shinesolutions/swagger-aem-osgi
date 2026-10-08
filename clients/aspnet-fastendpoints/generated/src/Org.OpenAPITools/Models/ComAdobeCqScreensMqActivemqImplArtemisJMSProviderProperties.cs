namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties 
{
    public ConfigNodePropertyInteger ServiceRanking { get; set; }
    public ConfigNodePropertyInteger GlobalSize { get; set; }
    public ConfigNodePropertyInteger MaxDiskUsage { get; set; }
    public ConfigNodePropertyBoolean PersistenceEnabled { get; set; }
    public ConfigNodePropertyInteger ThreadPoolMaxSize { get; set; }
    public ConfigNodePropertyInteger ScheduledThreadPoolMaxSize { get; set; }
    public ConfigNodePropertyInteger GracefulShutdownTimeout { get; set; }
    public ConfigNodePropertyArray Queues { get; set; }
    public ConfigNodePropertyArray Topics { get; set; }
    public ConfigNodePropertyInteger AddressesMaxDeliveryAttempts { get; set; }
    public ConfigNodePropertyInteger AddressesExpiryDelay { get; set; }
    public ConfigNodePropertyDropDown AddressesAddressFullMessagePolicy { get; set; }
    public ConfigNodePropertyInteger AddressesMaxSizeBytes { get; set; }
    public ConfigNodePropertyInteger AddressesPageSizeBytes { get; set; }
    public ConfigNodePropertyInteger AddressesPageCacheMaxSize { get; set; }
    public ConfigNodePropertyString ClusterUser { get; set; }
    public ConfigNodePropertyString ClusterPassword { get; set; }
    public ConfigNodePropertyInteger ClusterCallTimeout { get; set; }
    public ConfigNodePropertyInteger ClusterCallFailoverTimeout { get; set; }
    public ConfigNodePropertyInteger ClusterClientFailureCheckPeriod { get; set; }
    public ConfigNodePropertyInteger ClusterNotificationAttempts { get; set; }
    public ConfigNodePropertyInteger ClusterNotificationInterval { get; set; }
    public ConfigNodePropertyInteger IdCacheSize { get; set; }
    public ConfigNodePropertyInteger ClusterConfirmationWindowSize { get; set; }
    public ConfigNodePropertyInteger ClusterConnectionTtl { get; set; }
    public ConfigNodePropertyBoolean ClusterDuplicateDetection { get; set; }
    public ConfigNodePropertyInteger ClusterInitialConnectAttempts { get; set; }
    public ConfigNodePropertyInteger ClusterMaxRetryInterval { get; set; }
    public ConfigNodePropertyInteger ClusterMinLargeMessageSize { get; set; }
    public ConfigNodePropertyInteger ClusterProducerWindowSize { get; set; }
    public ConfigNodePropertyInteger ClusterReconnectAttempts { get; set; }
    public ConfigNodePropertyInteger ClusterRetryInterval { get; set; }
    public ConfigNodePropertyFloat ClusterRetryIntervalMultiplier { get; set; }
}


