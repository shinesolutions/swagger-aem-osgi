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
  public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties {
    /// <summary>
    /// Gets or Sets RepositoryHome
    /// </summary>
    [DataMember(Name="repository.home", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repository.home")]
    public ConfigNodePropertyString RepositoryHome { get; set; }

    /// <summary>
    /// Gets or Sets TarmkMode
    /// </summary>
    [DataMember(Name="tarmk.mode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tarmk.mode")]
    public ConfigNodePropertyString TarmkMode { get; set; }

    /// <summary>
    /// Gets or Sets TarmkSize
    /// </summary>
    [DataMember(Name="tarmk.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tarmk.size")]
    public ConfigNodePropertyInteger TarmkSize { get; set; }

    /// <summary>
    /// Gets or Sets SegmentCacheSize
    /// </summary>
    [DataMember(Name="segmentCache.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "segmentCache.size")]
    public ConfigNodePropertyInteger SegmentCacheSize { get; set; }

    /// <summary>
    /// Gets or Sets StringCacheSize
    /// </summary>
    [DataMember(Name="stringCache.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stringCache.size")]
    public ConfigNodePropertyInteger StringCacheSize { get; set; }

    /// <summary>
    /// Gets or Sets TemplateCacheSize
    /// </summary>
    [DataMember(Name="templateCache.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "templateCache.size")]
    public ConfigNodePropertyInteger TemplateCacheSize { get; set; }

    /// <summary>
    /// Gets or Sets StringDeduplicationCacheSize
    /// </summary>
    [DataMember(Name="stringDeduplicationCache.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stringDeduplicationCache.size")]
    public ConfigNodePropertyInteger StringDeduplicationCacheSize { get; set; }

    /// <summary>
    /// Gets or Sets TemplateDeduplicationCacheSize
    /// </summary>
    [DataMember(Name="templateDeduplicationCache.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "templateDeduplicationCache.size")]
    public ConfigNodePropertyInteger TemplateDeduplicationCacheSize { get; set; }

    /// <summary>
    /// Gets or Sets NodeDeduplicationCacheSize
    /// </summary>
    [DataMember(Name="nodeDeduplicationCache.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nodeDeduplicationCache.size")]
    public ConfigNodePropertyInteger NodeDeduplicationCacheSize { get; set; }

    /// <summary>
    /// Gets or Sets PauseCompaction
    /// </summary>
    [DataMember(Name="pauseCompaction", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pauseCompaction")]
    public ConfigNodePropertyBoolean PauseCompaction { get; set; }

    /// <summary>
    /// Gets or Sets CompactionRetryCount
    /// </summary>
    [DataMember(Name="compaction.retryCount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "compaction.retryCount")]
    public ConfigNodePropertyInteger CompactionRetryCount { get; set; }

    /// <summary>
    /// Gets or Sets CompactionForceTimeout
    /// </summary>
    [DataMember(Name="compaction.force.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "compaction.force.timeout")]
    public ConfigNodePropertyInteger CompactionForceTimeout { get; set; }

    /// <summary>
    /// Gets or Sets CompactionSizeDeltaEstimation
    /// </summary>
    [DataMember(Name="compaction.sizeDeltaEstimation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "compaction.sizeDeltaEstimation")]
    public ConfigNodePropertyInteger CompactionSizeDeltaEstimation { get; set; }

    /// <summary>
    /// Gets or Sets CompactionDisableEstimation
    /// </summary>
    [DataMember(Name="compaction.disableEstimation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "compaction.disableEstimation")]
    public ConfigNodePropertyBoolean CompactionDisableEstimation { get; set; }

    /// <summary>
    /// Gets or Sets CompactionRetainedGenerations
    /// </summary>
    [DataMember(Name="compaction.retainedGenerations", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "compaction.retainedGenerations")]
    public ConfigNodePropertyInteger CompactionRetainedGenerations { get; set; }

    /// <summary>
    /// Gets or Sets CompactionMemoryThreshold
    /// </summary>
    [DataMember(Name="compaction.memoryThreshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "compaction.memoryThreshold")]
    public ConfigNodePropertyInteger CompactionMemoryThreshold { get; set; }

    /// <summary>
    /// Gets or Sets CompactionProgressLog
    /// </summary>
    [DataMember(Name="compaction.progressLog", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "compaction.progressLog")]
    public ConfigNodePropertyInteger CompactionProgressLog { get; set; }

    /// <summary>
    /// Gets or Sets Standby
    /// </summary>
    [DataMember(Name="standby", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "standby")]
    public ConfigNodePropertyBoolean Standby { get; set; }

    /// <summary>
    /// Gets or Sets CustomBlobStore
    /// </summary>
    [DataMember(Name="customBlobStore", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "customBlobStore")]
    public ConfigNodePropertyBoolean CustomBlobStore { get; set; }

    /// <summary>
    /// Gets or Sets CustomSegmentStore
    /// </summary>
    [DataMember(Name="customSegmentStore", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "customSegmentStore")]
    public ConfigNodePropertyBoolean CustomSegmentStore { get; set; }

    /// <summary>
    /// Gets or Sets SplitPersistence
    /// </summary>
    [DataMember(Name="splitPersistence", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "splitPersistence")]
    public ConfigNodePropertyBoolean SplitPersistence { get; set; }

    /// <summary>
    /// Gets or Sets RepositoryBackupDir
    /// </summary>
    [DataMember(Name="repository.backup.dir", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repository.backup.dir")]
    public ConfigNodePropertyString RepositoryBackupDir { get; set; }

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
    /// Gets or Sets Role
    /// </summary>
    [DataMember(Name="role", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "role")]
    public ConfigNodePropertyString Role { get; set; }

    /// <summary>
    /// Gets or Sets RegisterDescriptors
    /// </summary>
    [DataMember(Name="registerDescriptors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "registerDescriptors")]
    public ConfigNodePropertyBoolean RegisterDescriptors { get; set; }

    /// <summary>
    /// Gets or Sets DispatchChanges
    /// </summary>
    [DataMember(Name="dispatchChanges", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dispatchChanges")]
    public ConfigNodePropertyBoolean DispatchChanges { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties {\n");
      sb.Append("  RepositoryHome: ").Append(RepositoryHome).Append("\n");
      sb.Append("  TarmkMode: ").Append(TarmkMode).Append("\n");
      sb.Append("  TarmkSize: ").Append(TarmkSize).Append("\n");
      sb.Append("  SegmentCacheSize: ").Append(SegmentCacheSize).Append("\n");
      sb.Append("  StringCacheSize: ").Append(StringCacheSize).Append("\n");
      sb.Append("  TemplateCacheSize: ").Append(TemplateCacheSize).Append("\n");
      sb.Append("  StringDeduplicationCacheSize: ").Append(StringDeduplicationCacheSize).Append("\n");
      sb.Append("  TemplateDeduplicationCacheSize: ").Append(TemplateDeduplicationCacheSize).Append("\n");
      sb.Append("  NodeDeduplicationCacheSize: ").Append(NodeDeduplicationCacheSize).Append("\n");
      sb.Append("  PauseCompaction: ").Append(PauseCompaction).Append("\n");
      sb.Append("  CompactionRetryCount: ").Append(CompactionRetryCount).Append("\n");
      sb.Append("  CompactionForceTimeout: ").Append(CompactionForceTimeout).Append("\n");
      sb.Append("  CompactionSizeDeltaEstimation: ").Append(CompactionSizeDeltaEstimation).Append("\n");
      sb.Append("  CompactionDisableEstimation: ").Append(CompactionDisableEstimation).Append("\n");
      sb.Append("  CompactionRetainedGenerations: ").Append(CompactionRetainedGenerations).Append("\n");
      sb.Append("  CompactionMemoryThreshold: ").Append(CompactionMemoryThreshold).Append("\n");
      sb.Append("  CompactionProgressLog: ").Append(CompactionProgressLog).Append("\n");
      sb.Append("  Standby: ").Append(Standby).Append("\n");
      sb.Append("  CustomBlobStore: ").Append(CustomBlobStore).Append("\n");
      sb.Append("  CustomSegmentStore: ").Append(CustomSegmentStore).Append("\n");
      sb.Append("  SplitPersistence: ").Append(SplitPersistence).Append("\n");
      sb.Append("  RepositoryBackupDir: ").Append(RepositoryBackupDir).Append("\n");
      sb.Append("  BlobGcMaxAgeInSecs: ").Append(BlobGcMaxAgeInSecs).Append("\n");
      sb.Append("  BlobTrackSnapshotIntervalInSecs: ").Append(BlobTrackSnapshotIntervalInSecs).Append("\n");
      sb.Append("  Role: ").Append(Role).Append("\n");
      sb.Append("  RegisterDescriptors: ").Append(RegisterDescriptors).Append("\n");
      sb.Append("  DispatchChanges: ").Append(DispatchChanges).Append("\n");
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
