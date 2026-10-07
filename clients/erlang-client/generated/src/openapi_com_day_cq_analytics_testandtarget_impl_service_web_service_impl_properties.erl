-module(openapi_com_day_cq_analytics_testandtarget_impl_service_web_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_testandtarget_impl_service_web_service_impl_properties/0]).

-type openapi_com_day_cq_analytics_testandtarget_impl_service_web_service_impl_properties() ::
    #{ 'endpointUri' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'connectionTimeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'socketTimeout' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'endpointUri' := EndpointUri,
          'connectionTimeout' := ConnectionTimeout,
          'socketTimeout' := SocketTimeout
        }) ->
    #{ 'endpointUri' => EndpointUri,
       'connectionTimeout' => ConnectionTimeout,
       'socketTimeout' => SocketTimeout
     }.
