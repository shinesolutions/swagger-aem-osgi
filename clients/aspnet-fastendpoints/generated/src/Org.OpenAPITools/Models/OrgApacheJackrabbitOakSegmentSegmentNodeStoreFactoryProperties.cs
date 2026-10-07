namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties 
{
    public ConfigNodePropertyString RepositoryHome { get; set; }
    public ConfigNodePropertyString TarmkMode { get; set; }
    public ConfigNodePropertyInteger TarmkSize { get; set; }
    public ConfigNodePropertyInteger SegmentCacheSize { get; set; }
    public ConfigNodePropertyInteger StringCacheSize { get; set; }
    public ConfigNodePropertyInteger TemplateCacheSize { get; set; }
    public ConfigNodePropertyInteger StringDeduplicationCacheSize { get; set; }
    public ConfigNodePropertyInteger TemplateDeduplicationCacheSize { get; set; }
    public ConfigNodePropertyInteger NodeDeduplicationCacheSize { get; set; }
    public ConfigNodePropertyBoolean PauseCompaction { get; set; }
    public ConfigNodePropertyInteger CompactionRetryCount { get; set; }
    public ConfigNodePropertyInteger CompactionForceTimeout { get; set; }
    public ConfigNodePropertyInteger CompactionSizeDeltaEstimation { get; set; }
    public ConfigNodePropertyBoolean CompactionDisableEstimation { get; set; }
    public ConfigNodePropertyInteger CompactionRetainedGenerations { get; set; }
    public ConfigNodePropertyInteger CompactionMemoryThreshold { get; set; }
    public ConfigNodePropertyInteger CompactionProgressLog { get; set; }
    public ConfigNodePropertyBoolean Standby { get; set; }
    public ConfigNodePropertyBoolean CustomBlobStore { get; set; }
    public ConfigNodePropertyBoolean CustomSegmentStore { get; set; }
    public ConfigNodePropertyBoolean SplitPersistence { get; set; }
    public ConfigNodePropertyString RepositoryBackupDir { get; set; }
    public ConfigNodePropertyInteger BlobGcMaxAgeInSecs { get; set; }
    public ConfigNodePropertyInteger BlobTrackSnapshotIntervalInSecs { get; set; }
    public ConfigNodePropertyString Role { get; set; }
    public ConfigNodePropertyBoolean RegisterDescriptors { get; set; }
    public ConfigNodePropertyBoolean DispatchChanges { get; set; }
}


