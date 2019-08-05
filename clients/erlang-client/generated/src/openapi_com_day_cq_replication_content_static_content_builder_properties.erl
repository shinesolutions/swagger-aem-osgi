-module(openapi_com_day_cq_replication_content_static_content_builder_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_replication_content_static_content_builder_properties/0]).

-type openapi_com_day_cq_replication_content_static_content_builder_properties() ::
    #{ 'host' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'port' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'host' := Host,
          'port' := Port
        }) ->
    #{ 'host' => Host,
       'port' => Port
     }.
