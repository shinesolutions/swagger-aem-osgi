-module(openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties/0]).

-type openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties() ::
    #{ 'cq_analytics_sitecatalyst_service_datacenter_url' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'devhostnamepatterns' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'connection_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'socket_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_analytics_sitecatalyst_service_datacenter_url' := CqAnalyticsSitecatalystServiceDatacenterUrl,
          'devhostnamepatterns' := Devhostnamepatterns,
          'connection_timeout' := ConnectionTimeout,
          'socket_timeout' := SocketTimeout
        }) ->
    #{ 'cq.analytics.sitecatalyst.service.datacenter.url' => CqAnalyticsSitecatalystServiceDatacenterUrl,
       'devhostnamepatterns' => Devhostnamepatterns,
       'connection.timeout' => ConnectionTimeout,
       'socket.timeout' => SocketTimeout
     }.
