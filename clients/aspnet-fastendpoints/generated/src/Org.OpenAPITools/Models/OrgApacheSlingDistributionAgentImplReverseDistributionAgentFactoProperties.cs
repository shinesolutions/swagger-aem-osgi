namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties 
{
    public ConfigNodePropertyString Name { get; set; }
    public ConfigNodePropertyString Title { get; set; }
    public ConfigNodePropertyString Details { get; set; }
    public ConfigNodePropertyBoolean Enabled { get; set; }
    public ConfigNodePropertyString ServiceName { get; set; }
    public ConfigNodePropertyDropDown LogLevel { get; set; }
    public ConfigNodePropertyBoolean QueueProcessingEnabled { get; set; }
    public ConfigNodePropertyArray PackageExporterEndpoints { get; set; }
    public ConfigNodePropertyInteger PullItems { get; set; }
    public ConfigNodePropertyInteger HttpConnTimeout { get; set; }
    public ConfigNodePropertyString RequestAuthorizationStrategyTarget { get; set; }
    public ConfigNodePropertyString TransportSecretProviderTarget { get; set; }
    public ConfigNodePropertyString PackageBuilderTarget { get; set; }
    public ConfigNodePropertyString TriggersTarget { get; set; }
}


