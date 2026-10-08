namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties 
{
    public ConfigNodePropertyString Name { get; set; }
    public ConfigNodePropertyString Title { get; set; }
    public ConfigNodePropertyString Details { get; set; }
    public ConfigNodePropertyBoolean Enabled { get; set; }
    public ConfigNodePropertyString ServiceName { get; set; }
    public ConfigNodePropertyDropDown LogLevel { get; set; }
    public ConfigNodePropertyArray AllowedRoots { get; set; }
    public ConfigNodePropertyBoolean QueueProcessingEnabled { get; set; }
    public ConfigNodePropertyArray PackageImporterEndpoints { get; set; }
    public ConfigNodePropertyArray PassiveQueues { get; set; }
    public ConfigNodePropertyArray PriorityQueues { get; set; }
    public ConfigNodePropertyDropDown RetryStrategy { get; set; }
    public ConfigNodePropertyInteger RetryAttempts { get; set; }
    public ConfigNodePropertyString RequestAuthorizationStrategyTarget { get; set; }
    public ConfigNodePropertyString TransportSecretProviderTarget { get; set; }
    public ConfigNodePropertyString PackageBuilderTarget { get; set; }
    public ConfigNodePropertyString TriggersTarget { get; set; }
    public ConfigNodePropertyDropDown QueueProvider { get; set; }
    public ConfigNodePropertyBoolean AsyncDelivery { get; set; }
    public ConfigNodePropertyInteger HttpConnTimeout { get; set; }
}


