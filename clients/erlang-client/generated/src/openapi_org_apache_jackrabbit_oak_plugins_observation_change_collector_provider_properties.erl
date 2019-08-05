-module(openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties() ::
    #{ 'maxItems' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'maxPathDepth' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'maxItems' := MaxItems,
          'maxPathDepth' := MaxPathDepth,
          'enabled' := Enabled
        }) ->
    #{ 'maxItems' => MaxItems,
       'maxPathDepth' => MaxPathDepth,
       'enabled' => Enabled
     }.
