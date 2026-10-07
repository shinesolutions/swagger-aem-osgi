-module(openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_properties/0]).

-export([openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_properties/1]).

-export_type([openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_properties/0]).

-type openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_properties() ::
  [ {'hc_tags', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_properties() ->
    openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_properties([]).

openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_properties(Fields) ->
  Default = [ {'hc.tags', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

