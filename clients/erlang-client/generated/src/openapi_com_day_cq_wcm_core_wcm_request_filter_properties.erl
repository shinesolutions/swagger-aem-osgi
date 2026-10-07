-module(openapi_com_day_cq_wcm_core_wcm_request_filter_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_wcm_request_filter_properties/0]).

-type openapi_com_day_cq_wcm_core_wcm_request_filter_properties() ::
    #{ 'wcmfilter_mode' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'wcmfilter_mode' := WcmfilterMode
        }) ->
    #{ 'wcmfilter.mode' => WcmfilterMode
     }.
