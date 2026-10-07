-module(openapi_com_adobe_octopus_ncomm_bootstrap_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_octopus_ncomm_bootstrap_properties/0]).

-type openapi_com_adobe_octopus_ncomm_bootstrap_properties() ::
    #{ 'maxConnections' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'maxRequests' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'requestTimeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'requestRetries' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'launchTimeout' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'maxConnections' := MaxConnections,
          'maxRequests' := MaxRequests,
          'requestTimeout' := RequestTimeout,
          'requestRetries' := RequestRetries,
          'launchTimeout' := LaunchTimeout
        }) ->
    #{ 'maxConnections' => MaxConnections,
       'maxRequests' => MaxRequests,
       'requestTimeout' => RequestTimeout,
       'requestRetries' => RequestRetries,
       'launchTimeout' => LaunchTimeout
     }.
