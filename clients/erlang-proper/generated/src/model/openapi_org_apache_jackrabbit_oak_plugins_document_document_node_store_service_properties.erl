-module(openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties() ::
  [ {'mongouri', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'db', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'socketKeepAlive', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cache', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'nodeCachePercentage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'prevDocCachePercentage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'childrenCachePercentage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'diffCachePercentage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cacheSegmentCount', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cacheStackMoveDistance', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'blobCacheSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'persistentCache', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'journalCache', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'customBlobStore', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'journalGCInterval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'journalGCMaxAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'prefetchExternalChanges', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'role', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'versionGcMaxAgeInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'versionGCExpression', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'versionGCTimeLimitInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'blobGcMaxAgeInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'blobTrackSnapshotIntervalInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'repository_home', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'maxReplicationLagInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'documentStoreType', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'bundlingDisabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'updateLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'persistentCacheIncludes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'leaseCheckMode', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties() ->
    openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties([]).

openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties(Fields) ->
  Default = [ {'mongouri', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'db', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'socketKeepAlive', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cache', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'nodeCachePercentage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'prevDocCachePercentage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'childrenCachePercentage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'diffCachePercentage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cacheSegmentCount', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cacheStackMoveDistance', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'blobCacheSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'persistentCache', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'journalCache', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'customBlobStore', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'journalGCInterval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'journalGCMaxAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'prefetchExternalChanges', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'role', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'versionGcMaxAgeInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'versionGCExpression', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'versionGCTimeLimitInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'blobGcMaxAgeInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'blobTrackSnapshotIntervalInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'repository.home', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'maxReplicationLagInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'documentStoreType', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'bundlingDisabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'updateLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'persistentCacheIncludes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'leaseCheckMode', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

