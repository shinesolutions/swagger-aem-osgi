namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties 
{
    public ConfigNodePropertyString Name { get; set; }
    public ConfigNodePropertyDropDown Type { get; set; }
    public ConfigNodePropertyString ImportMode { get; set; }
    public ConfigNodePropertyString AclHandling { get; set; }
    public ConfigNodePropertyString PackageRoots { get; set; }
    public ConfigNodePropertyArray PackageFilters { get; set; }
    public ConfigNodePropertyArray PropertyFilters { get; set; }
    public ConfigNodePropertyString TempFsFolder { get; set; }
    public ConfigNodePropertyBoolean UseBinaryReferences { get; set; }
    public ConfigNodePropertyInteger AutoSaveThreshold { get; set; }
    public ConfigNodePropertyInteger CleanupDelay { get; set; }
    public ConfigNodePropertyInteger FileThreshold { get; set; }
    public ConfigNodePropertyDropDown MEGA_BYTES { get; set; }
    public ConfigNodePropertyBoolean UseOffHeapMemory { get; set; }
    public ConfigNodePropertyDropDown DigestAlgorithm { get; set; }
    public ConfigNodePropertyInteger MonitoringQueueSize { get; set; }
    public ConfigNodePropertyArray PathsMapping { get; set; }
    public ConfigNodePropertyBoolean StrictImport { get; set; }
}


