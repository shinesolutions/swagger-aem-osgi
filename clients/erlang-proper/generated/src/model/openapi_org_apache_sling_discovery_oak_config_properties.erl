-module(openapi_org_apache_sling_discovery_oak_config_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_discovery_oak_config_properties/0]).

-export([openapi_org_apache_sling_discovery_oak_config_properties/1]).

-export_type([openapi_org_apache_sling_discovery_oak_config_properties/0]).

-type openapi_org_apache_sling_discovery_oak_config_properties() ::
  [ {'connectorPingTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'connectorPingInterval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'discoveryLiteCheckInterval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'clusterSyncServiceTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'clusterSyncServiceInterval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'enableSyncToken', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'minEventDelay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'socketConnectTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'soTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'topologyConnectorUrls', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'topologyConnectorWhitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'autoStopLocalLoopEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'gzipConnectorRequestsEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'hmacEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'enableEncryption', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'sharedKey', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'hmacSharedKeyTTL', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'backoffStandbyFactor', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'backoffStableFactor', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_discovery_oak_config_properties() ->
    openapi_org_apache_sling_discovery_oak_config_properties([]).

openapi_org_apache_sling_discovery_oak_config_properties(Fields) ->
  Default = [ {'connectorPingTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'connectorPingInterval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'discoveryLiteCheckInterval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'clusterSyncServiceTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'clusterSyncServiceInterval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'enableSyncToken', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'minEventDelay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'socketConnectTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'soTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'topologyConnectorUrls', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'topologyConnectorWhitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'autoStopLocalLoopEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'gzipConnectorRequestsEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'hmacEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'enableEncryption', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'sharedKey', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'hmacSharedKeyTTL', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'backoffStandbyFactor', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'backoffStableFactor', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

