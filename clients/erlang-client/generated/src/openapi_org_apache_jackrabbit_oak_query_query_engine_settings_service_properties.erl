-module(openapi_org_apache_jackrabbit_oak_query_query_engine_settings_service_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_query_query_engine_settings_service_properties/0]).

-type openapi_org_apache_jackrabbit_oak_query_query_engine_settings_service_properties() ::
    #{ 'queryLimitInMemory' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'queryLimitReads' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'queryFailTraversal' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'fastQuerySize' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'queryLimitInMemory' := QueryLimitInMemory,
          'queryLimitReads' := QueryLimitReads,
          'queryFailTraversal' := QueryFailTraversal,
          'fastQuerySize' := FastQuerySize
        }) ->
    #{ 'queryLimitInMemory' => QueryLimitInMemory,
       'queryLimitReads' => QueryLimitReads,
       'queryFailTraversal' => QueryFailTraversal,
       'fastQuerySize' => FastQuerySize
     }.
