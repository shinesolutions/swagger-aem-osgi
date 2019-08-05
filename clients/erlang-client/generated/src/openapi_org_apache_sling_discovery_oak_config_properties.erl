-module(openapi_org_apache_sling_discovery_oak_config_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_discovery_oak_config_properties/0]).

-type openapi_org_apache_sling_discovery_oak_config_properties() ::
    #{ 'connectorPingTimeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'connectorPingInterval' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'discoveryLiteCheckInterval' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'clusterSyncServiceTimeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'clusterSyncServiceInterval' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'enableSyncToken' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'minEventDelay' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'socketConnectTimeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'soTimeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'topologyConnectorUrls' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'topologyConnectorWhitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'autoStopLocalLoopEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'gzipConnectorRequestsEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'hmacEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'enableEncryption' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'sharedKey' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'hmacSharedKeyTTL' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'backoffStandbyFactor' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'backoffStableFactor' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'connectorPingTimeout' := ConnectorPingTimeout,
          'connectorPingInterval' := ConnectorPingInterval,
          'discoveryLiteCheckInterval' := DiscoveryLiteCheckInterval,
          'clusterSyncServiceTimeout' := ClusterSyncServiceTimeout,
          'clusterSyncServiceInterval' := ClusterSyncServiceInterval,
          'enableSyncToken' := EnableSyncToken,
          'minEventDelay' := MinEventDelay,
          'socketConnectTimeout' := SocketConnectTimeout,
          'soTimeout' := SoTimeout,
          'topologyConnectorUrls' := TopologyConnectorUrls,
          'topologyConnectorWhitelist' := TopologyConnectorWhitelist,
          'autoStopLocalLoopEnabled' := AutoStopLocalLoopEnabled,
          'gzipConnectorRequestsEnabled' := GzipConnectorRequestsEnabled,
          'hmacEnabled' := HmacEnabled,
          'enableEncryption' := EnableEncryption,
          'sharedKey' := SharedKey,
          'hmacSharedKeyTTL' := HmacSharedKeyTTL,
          'backoffStandbyFactor' := BackoffStandbyFactor,
          'backoffStableFactor' := BackoffStableFactor
        }) ->
    #{ 'connectorPingTimeout' => ConnectorPingTimeout,
       'connectorPingInterval' => ConnectorPingInterval,
       'discoveryLiteCheckInterval' => DiscoveryLiteCheckInterval,
       'clusterSyncServiceTimeout' => ClusterSyncServiceTimeout,
       'clusterSyncServiceInterval' => ClusterSyncServiceInterval,
       'enableSyncToken' => EnableSyncToken,
       'minEventDelay' => MinEventDelay,
       'socketConnectTimeout' => SocketConnectTimeout,
       'soTimeout' => SoTimeout,
       'topologyConnectorUrls' => TopologyConnectorUrls,
       'topologyConnectorWhitelist' => TopologyConnectorWhitelist,
       'autoStopLocalLoopEnabled' => AutoStopLocalLoopEnabled,
       'gzipConnectorRequestsEnabled' => GzipConnectorRequestsEnabled,
       'hmacEnabled' => HmacEnabled,
       'enableEncryption' => EnableEncryption,
       'sharedKey' => SharedKey,
       'hmacSharedKeyTTL' => HmacSharedKeyTTL,
       'backoffStandbyFactor' => BackoffStandbyFactor,
       'backoffStableFactor' => BackoffStableFactor
     }.
