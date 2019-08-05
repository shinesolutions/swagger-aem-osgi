-module(openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_properties/0]).

-type openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_properties() ::
    #{ 'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'hc_tags' := HcTags
        }) ->
    #{ 'hc.tags' => HcTags
     }.
