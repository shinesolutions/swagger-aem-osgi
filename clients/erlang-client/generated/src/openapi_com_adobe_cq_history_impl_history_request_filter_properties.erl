-module(openapi_com_adobe_cq_history_impl_history_request_filter_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_history_impl_history_request_filter_properties/0]).

-type openapi_com_adobe_cq_history_impl_history_request_filter_properties() ::
    #{ 'history_requestFilter_excludedSelectors' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'history_requestFilter_excludedExtensions' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'history_requestFilter_excludedSelectors' := HistoryRequestFilterExcludedSelectors,
          'history_requestFilter_excludedExtensions' := HistoryRequestFilterExcludedExtensions
        }) ->
    #{ 'history.requestFilter.excludedSelectors' => HistoryRequestFilterExcludedSelectors,
       'history.requestFilter.excludedExtensions' => HistoryRequestFilterExcludedExtensions
     }.
