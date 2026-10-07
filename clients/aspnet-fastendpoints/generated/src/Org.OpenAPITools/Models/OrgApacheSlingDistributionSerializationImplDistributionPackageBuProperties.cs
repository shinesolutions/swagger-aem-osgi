namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties 
{
    public ConfigNodePropertyString Name { get; set; }
    public ConfigNodePropertyDropDown Type { get; set; }
    public ConfigNodePropertyString FormatTarget { get; set; }
    public ConfigNodePropertyString TempFsFolder { get; set; }
    public ConfigNodePropertyInteger FileThreshold { get; set; }
    public ConfigNodePropertyDropDown MemoryUnit { get; set; }
    public ConfigNodePropertyBoolean UseOffHeapMemory { get; set; }
    public ConfigNodePropertyDropDown DigestAlgorithm { get; set; }
    public ConfigNodePropertyInteger MonitoringQueueSize { get; set; }
    public ConfigNodePropertyInteger CleanupDelay { get; set; }
    public ConfigNodePropertyArray PackageFilters { get; set; }
    public ConfigNodePropertyArray PropertyFilters { get; set; }
}


