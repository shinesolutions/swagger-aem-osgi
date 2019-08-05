-module(openapi_com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties/0]).

-type openapi_com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_properties() ::
    #{ 'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'ignored_bundles' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'hc_tags' := HcTags,
          'ignored_bundles' := IgnoredBundles
        }) ->
    #{ 'hc.tags' => HcTags,
       'ignored.bundles' => IgnoredBundles
     }.
