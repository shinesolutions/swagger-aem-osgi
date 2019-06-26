# SwaggerAemOsgiClient::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mongouri** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**db** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**socket_keep_alive** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**cache** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**node_cache_percentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**prev_doc_cache_percentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**children_cache_percentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**diff_cache_percentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cache_segment_count** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cache_stack_move_distance** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**blob_cache_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**persistent_cache** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**journal_cache** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**custom_blob_store** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**journal_gc_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**journal_gc_max_age** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**prefetch_external_changes** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**role** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**version_gc_max_age_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**version_gc_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**version_gc_time_limit_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**blob_gc_max_age_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**blob_track_snapshot_interval_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**repository_home** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**max_replication_lag_in_secs** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**document_store_type** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**bundling_disabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**update_limit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**persistent_cache_includes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**lease_check_mode** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Code Sample

```ruby
require 'SwaggerAemOsgiClient'

instance = SwaggerAemOsgiClient::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.new(mongouri: null,
                                 db: null,
                                 socket_keep_alive: null,
                                 cache: null,
                                 node_cache_percentage: null,
                                 prev_doc_cache_percentage: null,
                                 children_cache_percentage: null,
                                 diff_cache_percentage: null,
                                 cache_segment_count: null,
                                 cache_stack_move_distance: null,
                                 blob_cache_size: null,
                                 persistent_cache: null,
                                 journal_cache: null,
                                 custom_blob_store: null,
                                 journal_gc_interval: null,
                                 journal_gc_max_age: null,
                                 prefetch_external_changes: null,
                                 role: null,
                                 version_gc_max_age_in_secs: null,
                                 version_gc_expression: null,
                                 version_gc_time_limit_in_secs: null,
                                 blob_gc_max_age_in_secs: null,
                                 blob_track_snapshot_interval_in_secs: null,
                                 repository_home: null,
                                 max_replication_lag_in_secs: null,
                                 document_store_type: null,
                                 bundling_disabled: null,
                                 update_limit: null,
                                 persistent_cache_includes: null,
                                 lease_check_mode: null)
```


