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
  public class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties {
    /// <summary>
    /// Gets or Sets Disabled
    /// </summary>
    [DataMember(Name="disabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disabled")]
    public ConfigNodePropertyBoolean Disabled { get; set; }

    /// <summary>
    /// Gets or Sets Debug
    /// </summary>
    [DataMember(Name="debug", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "debug")]
    public ConfigNodePropertyBoolean Debug { get; set; }

    /// <summary>
    /// Gets or Sets LocalIndexDir
    /// </summary>
    [DataMember(Name="localIndexDir", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "localIndexDir")]
    public ConfigNodePropertyString LocalIndexDir { get; set; }

    /// <summary>
    /// Gets or Sets EnableOpenIndexAsync
    /// </summary>
    [DataMember(Name="enableOpenIndexAsync", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enableOpenIndexAsync")]
    public ConfigNodePropertyBoolean EnableOpenIndexAsync { get; set; }

    /// <summary>
    /// Gets or Sets ThreadPoolSize
    /// </summary>
    [DataMember(Name="threadPoolSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "threadPoolSize")]
    public ConfigNodePropertyInteger ThreadPoolSize { get; set; }

    /// <summary>
    /// Gets or Sets PrefetchIndexFiles
    /// </summary>
    [DataMember(Name="prefetchIndexFiles", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "prefetchIndexFiles")]
    public ConfigNodePropertyBoolean PrefetchIndexFiles { get; set; }

    /// <summary>
    /// Gets or Sets ExtractedTextCacheSizeInMB
    /// </summary>
    [DataMember(Name="extractedTextCacheSizeInMB", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "extractedTextCacheSizeInMB")]
    public ConfigNodePropertyInteger ExtractedTextCacheSizeInMB { get; set; }

    /// <summary>
    /// Gets or Sets ExtractedTextCacheExpiryInSecs
    /// </summary>
    [DataMember(Name="extractedTextCacheExpiryInSecs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "extractedTextCacheExpiryInSecs")]
    public ConfigNodePropertyInteger ExtractedTextCacheExpiryInSecs { get; set; }

    /// <summary>
    /// Gets or Sets AlwaysUsePreExtractedCache
    /// </summary>
    [DataMember(Name="alwaysUsePreExtractedCache", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "alwaysUsePreExtractedCache")]
    public ConfigNodePropertyBoolean AlwaysUsePreExtractedCache { get; set; }

    /// <summary>
    /// Gets or Sets BooleanClauseLimit
    /// </summary>
    [DataMember(Name="booleanClauseLimit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "booleanClauseLimit")]
    public ConfigNodePropertyInteger BooleanClauseLimit { get; set; }

    /// <summary>
    /// Gets or Sets EnableHybridIndexing
    /// </summary>
    [DataMember(Name="enableHybridIndexing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enableHybridIndexing")]
    public ConfigNodePropertyBoolean EnableHybridIndexing { get; set; }

    /// <summary>
    /// Gets or Sets HybridQueueSize
    /// </summary>
    [DataMember(Name="hybridQueueSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hybridQueueSize")]
    public ConfigNodePropertyInteger HybridQueueSize { get; set; }

    /// <summary>
    /// Gets or Sets DisableStoredIndexDefinition
    /// </summary>
    [DataMember(Name="disableStoredIndexDefinition", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disableStoredIndexDefinition")]
    public ConfigNodePropertyBoolean DisableStoredIndexDefinition { get; set; }

    /// <summary>
    /// Gets or Sets DeletedBlobsCollectionEnabled
    /// </summary>
    [DataMember(Name="deletedBlobsCollectionEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "deletedBlobsCollectionEnabled")]
    public ConfigNodePropertyBoolean DeletedBlobsCollectionEnabled { get; set; }

    /// <summary>
    /// Gets or Sets PropIndexCleanerIntervalInSecs
    /// </summary>
    [DataMember(Name="propIndexCleanerIntervalInSecs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "propIndexCleanerIntervalInSecs")]
    public ConfigNodePropertyInteger PropIndexCleanerIntervalInSecs { get; set; }

    /// <summary>
    /// Gets or Sets EnableSingleBlobIndexFiles
    /// </summary>
    [DataMember(Name="enableSingleBlobIndexFiles", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enableSingleBlobIndexFiles")]
    public ConfigNodePropertyBoolean EnableSingleBlobIndexFiles { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties {\n");
      sb.Append("  Disabled: ").Append(Disabled).Append("\n");
      sb.Append("  Debug: ").Append(Debug).Append("\n");
      sb.Append("  LocalIndexDir: ").Append(LocalIndexDir).Append("\n");
      sb.Append("  EnableOpenIndexAsync: ").Append(EnableOpenIndexAsync).Append("\n");
      sb.Append("  ThreadPoolSize: ").Append(ThreadPoolSize).Append("\n");
      sb.Append("  PrefetchIndexFiles: ").Append(PrefetchIndexFiles).Append("\n");
      sb.Append("  ExtractedTextCacheSizeInMB: ").Append(ExtractedTextCacheSizeInMB).Append("\n");
      sb.Append("  ExtractedTextCacheExpiryInSecs: ").Append(ExtractedTextCacheExpiryInSecs).Append("\n");
      sb.Append("  AlwaysUsePreExtractedCache: ").Append(AlwaysUsePreExtractedCache).Append("\n");
      sb.Append("  BooleanClauseLimit: ").Append(BooleanClauseLimit).Append("\n");
      sb.Append("  EnableHybridIndexing: ").Append(EnableHybridIndexing).Append("\n");
      sb.Append("  HybridQueueSize: ").Append(HybridQueueSize).Append("\n");
      sb.Append("  DisableStoredIndexDefinition: ").Append(DisableStoredIndexDefinition).Append("\n");
      sb.Append("  DeletedBlobsCollectionEnabled: ").Append(DeletedBlobsCollectionEnabled).Append("\n");
      sb.Append("  PropIndexCleanerIntervalInSecs: ").Append(PropIndexCleanerIntervalInSecs).Append("\n");
      sb.Append("  EnableSingleBlobIndexFiles: ").Append(EnableSingleBlobIndexFiles).Append("\n");
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
