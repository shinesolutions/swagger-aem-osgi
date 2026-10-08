-module(openapi_com_adobe_cq_history_impl_history_request_filter_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_history_impl_history_request_filter_properties/0]).

-export([openapi_com_adobe_cq_history_impl_history_request_filter_properties/1]).

-export_type([openapi_com_adobe_cq_history_impl_history_request_filter_properties/0]).

-type openapi_com_adobe_cq_history_impl_history_request_filter_properties() ::
  [ {'history_requestFilter_excludedSelectors', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'history_requestFilter_excludedExtensions', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_history_impl_history_request_filter_properties() ->
    openapi_com_adobe_cq_history_impl_history_request_filter_properties([]).

openapi_com_adobe_cq_history_impl_history_request_filter_properties(Fields) ->
  Default = [ {'history.requestFilter.excludedSelectors', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'history.requestFilter.excludedExtensions', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

