-module(openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties/0]).

-export([openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties/1]).

-export_type([openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties/0]).

-type openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties() ::
  [ {'cq_analytics_sitecatalyst_service_datacenter_url', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'devhostnamepatterns', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'connection_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'socket_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties() ->
    openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties([]).

openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties(Fields) ->
  Default = [ {'cq.analytics.sitecatalyst.service.datacenter.url', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'devhostnamepatterns', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'connection.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'socket.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

