using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties {
    /// <summary>
    /// Gets or Sets Mongouri
    /// </summary>
    [DataMember(Name="mongouri", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mongouri")]
    public ConfigNodePropertyString Mongouri { get; set; }

    /// <summary>
    /// Gets or Sets Db
    /// </summary>
    [DataMember(Name="db", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "db")]
    public ConfigNodePropertyString Db { get; set; }

    /// <summary>
    /// Gets or Sets SocketKeepAlive
    /// </summary>
    [DataMember(Name="socketKeepAlive", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "socketKeepAlive")]
    public ConfigNodePropertyBoolean SocketKeepAlive { get; set; }

    /// <summary>
    /// Gets or Sets Cache
    /// </summary>
    [DataMember(Name="cache", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cache")]
    public ConfigNodePropertyInteger Cache { get; set; }

    /// <summary>
    /// Gets or Sets NodeCachePercentage
    /// </summary>
    [DataMember(Name="nodeCachePercentage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nodeCachePercentage")]
    public ConfigNodePropertyInteger NodeCachePercentage { get; set; }

    /// <summary>
    /// Gets or Sets PrevDocCachePercentage
    /// </summary>
    [DataMember(Name="prevDocCachePercentage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "prevDocCachePercentage")]
    public ConfigNodePropertyInteger PrevDocCachePercentage { get; set; }

    /// <summary>
    /// Gets or Sets ChildrenCachePercentage
    /// </summary>
    [DataMember(Name="childrenCachePercentage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "childrenCachePercentage")]
    public ConfigNodePropertyInteger ChildrenCachePercentage { get; set; }

    /// <summary>
    /// Gets or Sets DiffCachePercentage
    /// </summary>
    [DataMember(Name="diffCachePercentage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "diffCachePercentage")]
    public ConfigNodePropertyInteger DiffCachePercentage { get; set; }

    /// <summary>
    /// Gets or Sets CacheSegmentCount
    /// </summary>
    [DataMember(Name="cacheSegmentCount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cacheSegmentCount")]
    public ConfigNodePropertyInteger CacheSegmentCount { get; set; }

    /// <summary>
    /// Gets or Sets CacheStackMoveDistance
    /// </summary>
    [DataMember(Name="cacheStackMoveDistance", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cacheStackMoveDistance")]
    public ConfigNodePropertyInteger CacheStackMoveDistance { get; set; }

    /// <summary>
    /// Gets or Sets BlobCacheSize
    /// </summary>
    [DataMember(Name="blobCacheSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "blobCacheSize")]
    public ConfigNodePropertyInteger BlobCacheSize { get; set; }

    /// <summary>
    /// Gets or Sets PersistentCache
    /// </summary>
    [DataMember(Name="persistentCache", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "persistentCache")]
    public ConfigNodePropertyString PersistentCache { get; set; }

    /// <summary>
    /// Gets or Sets JournalCache
    /// </summary>
    [DataMember(Name="journalCache", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "journalCache")]
    public ConfigNodePropertyString JournalCache { get; set; }

    /// <summary>
    /// Gets or Sets CustomBlobStore
    /// </summary>
    [DataMember(Name="customBlobStore", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "customBlobStore")]
    public ConfigNodePropertyBoolean CustomBlobStore { get; set; }

    /// <summary>
    /// Gets or Sets JournalGCInterval
    /// </summary>
    [DataMember(Name="journalGCInterval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "journalGCInterval")]
    public ConfigNodePropertyInteger JournalGCInterval { get; set; }

    /// <summary>
    /// Gets or Sets JournalGCMaxAge
    /// </summary>
    [DataMember(Name="journalGCMaxAge", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "journalGCMaxAge")]
    public ConfigNodePropertyInteger JournalGCMaxAge { get; set; }

    /// <summary>
    /// Gets or Sets PrefetchExternalChanges
    /// </summary>
    [DataMember(Name="prefetchExternalChanges", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "prefetchExternalChanges")]
    public ConfigNodePropertyBoolean PrefetchExternalChanges { get; set; }

    /// <summary>
    /// Gets or Sets Role
    /// </summary>
    [DataMember(Name="role", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "role")]
    public ConfigNodePropertyString Role { get; set; }

    /// <summary>
    /// Gets or Sets VersionGcMaxAgeInSecs
    /// </summary>
    [DataMember(Name="versionGcMaxAgeInSecs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionGcMaxAgeInSecs")]
    public ConfigNodePropertyInteger VersionGcMaxAgeInSecs { get; set; }

    /// <summary>
    /// Gets or Sets VersionGCExpression
    /// </summary>
    [DataMember(Name="versionGCExpression", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionGCExpression")]
    public ConfigNodePropertyString VersionGCExpression { get; set; }

    /// <summary>
    /// Gets or Sets VersionGCTimeLimitInSecs
    /// </summary>
    [DataMember(Name="versionGCTimeLimitInSecs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionGCTimeLimitInSecs")]
    public ConfigNodePropertyInteger VersionGCTimeLimitInSecs { get; set; }

    /// <summary>
    /// Gets or Sets BlobGcMaxAgeInSecs
    /// </summary>
    [DataMember(Name="blobGcMaxAgeInSecs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "blobGcMaxAgeInSecs")]
    public ConfigNodePropertyInteger BlobGcMaxAgeInSecs { get; set; }

    /// <summary>
    /// Gets or Sets BlobTrackSnapshotIntervalInSecs
    /// </summary>
    [DataMember(Name="blobTrackSnapshotIntervalInSecs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "blobTrackSnapshotIntervalInSecs")]
    public ConfigNodePropertyInteger BlobTrackSnapshotIntervalInSecs { get; set; }

    /// <summary>
    /// Gets or Sets RepositoryHome
    /// </summary>
    [DataMember(Name="repository.home", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repository.home")]
    public ConfigNodePropertyString RepositoryHome { get; set; }

    /// <summary>
    /// Gets or Sets MaxReplicationLagInSecs
    /// </summary>
    [DataMember(Name="maxReplicationLagInSecs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxReplicationLagInSecs")]
    public ConfigNodePropertyInteger MaxReplicationLagInSecs { get; set; }

    /// <summary>
    /// Gets or Sets DocumentStoreType
    /// </summary>
    [DataMember(Name="documentStoreType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "documentStoreType")]
    public ConfigNodePropertyDropDown DocumentStoreType { get; set; }

    /// <summary>
    /// Gets or Sets BundlingDisabled
    /// </summary>
    [DataMember(Name="bundlingDisabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bundlingDisabled")]
    public ConfigNodePropertyBoolean BundlingDisabled { get; set; }

    /// <summary>
    /// Gets or Sets UpdateLimit
    /// </summary>
    [DataMember(Name="updateLimit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "updateLimit")]
    public ConfigNodePropertyInteger UpdateLimit { get; set; }

    /// <summary>
    /// Gets or Sets PersistentCacheIncludes
    /// </summary>
    [DataMember(Name="persistentCacheIncludes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "persistentCacheIncludes")]
    public ConfigNodePropertyArray PersistentCacheIncludes { get; set; }

    /// <summary>
    /// Gets or Sets LeaseCheckMode
    /// </summary>
    [DataMember(Name="leaseCheckMode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "leaseCheckMode")]
    public ConfigNodePropertyDropDown LeaseCheckMode { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties {\n");
      sb.Append("  Mongouri: ").Append(Mongouri).Append("\n");
      sb.Append("  Db: ").Append(Db).Append("\n");
      sb.Append("  SocketKeepAlive: ").Append(SocketKeepAlive).Append("\n");
      sb.Append("  Cache: ").Append(Cache).Append("\n");
      sb.Append("  NodeCachePercentage: ").Append(NodeCachePercentage).Append("\n");
      sb.Append("  PrevDocCachePercentage: ").Append(PrevDocCachePercentage).Append("\n");
      sb.Append("  ChildrenCachePercentage: ").Append(ChildrenCachePercentage).Append("\n");
      sb.Append("  DiffCachePercentage: ").Append(DiffCachePercentage).Append("\n");
      sb.Append("  CacheSegmentCount: ").Append(CacheSegmentCount).Append("\n");
      sb.Append("  CacheStackMoveDistance: ").Append(CacheStackMoveDistance).Append("\n");
      sb.Append("  BlobCacheSize: ").Append(BlobCacheSize).Append("\n");
      sb.Append("  PersistentCache: ").Append(PersistentCache).Append("\n");
      sb.Append("  JournalCache: ").Append(JournalCache).Append("\n");
      sb.Append("  CustomBlobStore: ").Append(CustomBlobStore).Append("\n");
      sb.Append("  JournalGCInterval: ").Append(JournalGCInterval).Append("\n");
      sb.Append("  JournalGCMaxAge: ").Append(JournalGCMaxAge).Append("\n");
      sb.Append("  PrefetchExternalChanges: ").Append(PrefetchExternalChanges).Append("\n");
      sb.Append("  Role: ").Append(Role).Append("\n");
      sb.Append("  VersionGcMaxAgeInSecs: ").Append(VersionGcMaxAgeInSecs).Append("\n");
      sb.Append("  VersionGCExpression: ").Append(VersionGCExpression).Append("\n");
      sb.Append("  VersionGCTimeLimitInSecs: ").Append(VersionGCTimeLimitInSecs).Append("\n");
      sb.Append("  BlobGcMaxAgeInSecs: ").Append(BlobGcMaxAgeInSecs).Append("\n");
      sb.Append("  BlobTrackSnapshotIntervalInSecs: ").Append(BlobTrackSnapshotIntervalInSecs).Append("\n");
      sb.Append("  RepositoryHome: ").Append(RepositoryHome).Append("\n");
      sb.Append("  MaxReplicationLagInSecs: ").Append(MaxReplicationLagInSecs).Append("\n");
      sb.Append("  DocumentStoreType: ").Append(DocumentStoreType).Append("\n");
      sb.Append("  BundlingDisabled: ").Append(BundlingDisabled).Append("\n");
      sb.Append("  UpdateLimit: ").Append(UpdateLimit).Append("\n");
      sb.Append("  PersistentCacheIncludes: ").Append(PersistentCacheIncludes).Append("\n");
      sb.Append("  LeaseCheckMode: ").Append(LeaseCheckMode).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
