-module(openapi_com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties/0]).

-type openapi_com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties() ::
    #{ 'connection_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'socket_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'connection_timeout' := ConnectionTimeout,
          'socket_timeout' := SocketTimeout
        }) ->
    #{ 'connection.timeout' => ConnectionTimeout,
       'socket.timeout' => SocketTimeout
     }.
