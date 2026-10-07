namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties 
{
    public ConfigNodePropertyString Name { get; set; }
    public ConfigNodePropertyString Title { get; set; }
    public ConfigNodePropertyString Details { get; set; }
    public ConfigNodePropertyBoolean Enabled { get; set; }
    public ConfigNodePropertyString ServiceName { get; set; }
    public ConfigNodePropertyDropDown LogLevel { get; set; }
    public ConfigNodePropertyArray AllowedRoots { get; set; }
    public ConfigNodePropertyString RequestAuthorizationStrategyTarget { get; set; }
    public ConfigNodePropertyString QueueProviderFactoryTarget { get; set; }
    public ConfigNodePropertyString PackageBuilderTarget { get; set; }
    public ConfigNodePropertyString TriggersTarget { get; set; }
    public ConfigNodePropertyArray PriorityQueues { get; set; }
}


