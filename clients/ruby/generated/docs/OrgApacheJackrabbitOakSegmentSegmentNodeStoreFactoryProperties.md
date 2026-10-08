# SwaggerAemOsgiClient::OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **repository_home** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **tarmk_mode** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **tarmk_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **segment_cache_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **string_cache_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **template_cache_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **string_deduplication_cache_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **template_deduplication_cache_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **node_deduplication_cache_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **pause_compaction** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **compaction_retry_count** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **compaction_force_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **compaction_size_delta_estimation** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **compaction_disable_estimation** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **compaction_retained_generations** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **compaction_memory_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **compaction_progress_log** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **standby** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **custom_blob_store** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **custom_segment_store** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **split_persistence** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **repository_backup_dir** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **blob_gc_max_age_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **blob_track_snapshot_interval_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **role** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **register_descriptors** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **dispatch_changes** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.new(
  repository_home: null,
  tarmk_mode: null,
  tarmk_size: null,
  segment_cache_size: null,
  string_cache_size: null,
  template_cache_size: null,
  string_deduplication_cache_size: null,
  template_deduplication_cache_size: null,
  node_deduplication_cache_size: null,
  pause_compaction: null,
  compaction_retry_count: null,
  compaction_force_timeout: null,
  compaction_size_delta_estimation: null,
  compaction_disable_estimation: null,
  compaction_retained_generations: null,
  compaction_memory_threshold: null,
  compaction_progress_log: null,
  standby: null,
  custom_blob_store: null,
  custom_segment_store: null,
  split_persistence: null,
  repository_backup_dir: null,
  blob_gc_max_age_in_secs: null,
  blob_track_snapshot_interval_in_secs: null,
  role: null,
  register_descriptors: null,
  dispatch_changes: null
)
```

