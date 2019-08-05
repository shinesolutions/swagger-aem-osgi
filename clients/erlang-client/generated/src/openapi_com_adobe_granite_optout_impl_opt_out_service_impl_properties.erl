-module(openapi_com_adobe_granite_optout_impl_opt_out_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_optout_impl_opt_out_service_impl_properties/0]).

-type openapi_com_adobe_granite_optout_impl_opt_out_service_impl_properties() ::
    #{ 'optout_cookies' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'optout_headers' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'optout_whitelist_cookies' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'optout_cookies' := OptoutCookies,
          'optout_headers' := OptoutHeaders,
          'optout_whitelist_cookies' := OptoutWhitelistCookies
        }) ->
    #{ 'optout.cookies' => OptoutCookies,
       'optout.headers' => OptoutHeaders,
       'optout.whitelist.cookies' => OptoutWhitelistCookies
     }.
