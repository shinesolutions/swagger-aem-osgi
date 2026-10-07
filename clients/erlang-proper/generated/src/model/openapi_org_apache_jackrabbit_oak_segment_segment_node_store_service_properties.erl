-module(openapi_org_apache_jackrabbit_oak_segment_segment_node_store_service_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_segment_segment_node_store_service_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_segment_segment_node_store_service_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_segment_segment_node_store_service_properties/0]).

-type openapi_org_apache_jackrabbit_oak_segment_segment_node_store_service_properties() ::
  [ {'repository_home', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'tarmk_mode', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'tarmk_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'segmentCache_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'stringCache_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'templateCache_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'stringDeduplicationCache_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'templateDeduplicationCache_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'nodeDeduplicationCache_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'pauseCompaction', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'compaction_retryCount', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'compaction_force_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'compaction_sizeDeltaEstimation', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'compaction_disableEstimation', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'compaction_retainedGenerations', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'compaction_memoryThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'compaction_progressLog', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'standby', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'customBlobStore', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'customSegmentStore', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'splitPersistence', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'repository_backup_dir', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'blobGcMaxAgeInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'blobTrackSnapshotIntervalInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_jackrabbit_oak_segment_segment_node_store_service_properties() ->
    openapi_org_apache_jackrabbit_oak_segment_segment_node_store_service_properties([]).

openapi_org_apache_jackrabbit_oak_segment_segment_node_store_service_properties(Fields) ->
  Default = [ {'repository.home', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'tarmk.mode', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'tarmk.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'segmentCache.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'stringCache.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'templateCache.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'stringDeduplicationCache.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'templateDeduplicationCache.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'nodeDeduplicationCache.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'pauseCompaction', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'compaction.retryCount', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'compaction.force.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'compaction.sizeDeltaEstimation', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'compaction.disableEstimation', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'compaction.retainedGenerations', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'compaction.memoryThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'compaction.progressLog', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'standby', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'customBlobStore', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'customSegmentStore', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'splitPersistence', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'repository.backup.dir', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'blobGcMaxAgeInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'blobTrackSnapshotIntervalInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

