-module(openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties() ::
  [ {'disabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'debug', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'localIndexDir', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'enableOpenIndexAsync', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'threadPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'prefetchIndexFiles', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'extractedTextCacheSizeInMB', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'extractedTextCacheExpiryInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'alwaysUsePreExtractedCache', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'booleanClauseLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'enableHybridIndexing', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'hybridQueueSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'disableStoredIndexDefinition', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'deletedBlobsCollectionEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'propIndexCleanerIntervalInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'enableSingleBlobIndexFiles', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties() ->
    openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties([]).

openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties(Fields) ->
  Default = [ {'disabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'debug', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'localIndexDir', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'enableOpenIndexAsync', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'threadPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'prefetchIndexFiles', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'extractedTextCacheSizeInMB', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'extractedTextCacheExpiryInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'alwaysUsePreExtractedCache', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'booleanClauseLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'enableHybridIndexing', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'hybridQueueSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'disableStoredIndexDefinition', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'deletedBlobsCollectionEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'propIndexCleanerIntervalInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'enableSingleBlobIndexFiles', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

