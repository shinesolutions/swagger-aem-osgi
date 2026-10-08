namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties 
{
    public ConfigNodePropertyString Mongouri { get; set; }
    public ConfigNodePropertyString Db { get; set; }
    public ConfigNodePropertyBoolean SocketKeepAlive { get; set; }
    public ConfigNodePropertyInteger Cache { get; set; }
    public ConfigNodePropertyInteger NodeCachePercentage { get; set; }
    public ConfigNodePropertyInteger PrevDocCachePercentage { get; set; }
    public ConfigNodePropertyInteger ChildrenCachePercentage { get; set; }
    public ConfigNodePropertyInteger DiffCachePercentage { get; set; }
    public ConfigNodePropertyInteger CacheSegmentCount { get; set; }
    public ConfigNodePropertyInteger CacheStackMoveDistance { get; set; }
    public ConfigNodePropertyInteger BlobCacheSize { get; set; }
    public ConfigNodePropertyString PersistentCache { get; set; }
    public ConfigNodePropertyString JournalCache { get; set; }
    public ConfigNodePropertyBoolean CustomBlobStore { get; set; }
    public ConfigNodePropertyInteger JournalGCInterval { get; set; }
    public ConfigNodePropertyInteger JournalGCMaxAge { get; set; }
    public ConfigNodePropertyBoolean PrefetchExternalChanges { get; set; }
    public ConfigNodePropertyString Role { get; set; }
    public ConfigNodePropertyInteger VersionGcMaxAgeInSecs { get; set; }
    public ConfigNodePropertyString VersionGCExpression { get; set; }
    public ConfigNodePropertyInteger VersionGCTimeLimitInSecs { get; set; }
    public ConfigNodePropertyInteger BlobGcMaxAgeInSecs { get; set; }
    public ConfigNodePropertyInteger BlobTrackSnapshotIntervalInSecs { get; set; }
    public ConfigNodePropertyString RepositoryHome { get; set; }
    public ConfigNodePropertyInteger MaxReplicationLagInSecs { get; set; }
    public ConfigNodePropertyDropDown DocumentStoreType { get; set; }
    public ConfigNodePropertyBoolean BundlingDisabled { get; set; }
    public ConfigNodePropertyInteger UpdateLimit { get; set; }
    public ConfigNodePropertyArray PersistentCacheIncludes { get; set; }
    public ConfigNodePropertyDropDown LeaseCheckMode { get; set; }
}


