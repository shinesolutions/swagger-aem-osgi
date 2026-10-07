-module(openapi_com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properties/0]).

-export([openapi_com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properties/1]).

-export_type([openapi_com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properties/0]).

-type openapi_com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properties() ::
  [ {'endpointUri', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'connectionTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'socketTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properties() ->
    openapi_com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properties([]).

openapi_com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properties(Fields) ->
  Default = [ {'endpointUri', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'connectionTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'socketTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

