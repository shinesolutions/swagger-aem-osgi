-module(openapi_com_day_cq_searchpromote_impl_search_promote_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_searchpromote_impl_search_promote_service_impl_properties/0]).

-type openapi_com_day_cq_searchpromote_impl_search_promote_service_impl_properties() ::
    #{ 'cq_searchpromote_configuration_server_uri' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_searchpromote_configuration_environment' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'connection_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'socket_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_searchpromote_configuration_server_uri' := CqSearchpromoteConfigurationServerUri,
          'cq_searchpromote_configuration_environment' := CqSearchpromoteConfigurationEnvironment,
          'connection_timeout' := ConnectionTimeout,
          'socket_timeout' := SocketTimeout
        }) ->
    #{ 'cq.searchpromote.configuration.server.uri' => CqSearchpromoteConfigurationServerUri,
       'cq.searchpromote.configuration.environment' => CqSearchpromoteConfigurationEnvironment,
       'connection.timeout' => ConnectionTimeout,
       'socket.timeout' => SocketTimeout
     }.
