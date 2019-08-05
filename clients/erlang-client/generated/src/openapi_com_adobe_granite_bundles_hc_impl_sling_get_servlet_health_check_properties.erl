-module(openapi_com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check_properties/0]).

-type openapi_com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check_properties() ::
    #{ 'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'hc_tags' := HcTags
        }) ->
    #{ 'hc.tags' => HcTags
     }.
