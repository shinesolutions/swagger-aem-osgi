-module(openapi_org_apache_sling_xss_impl_xss_filter_impl_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_xss_impl_xss_filter_impl_properties/0]).

-type openapi_org_apache_sling_xss_impl_xss_filter_impl_properties() ::
    #{ 'policyPath' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'policyPath' := PolicyPath
        }) ->
    #{ 'policyPath' => PolicyPath
     }.
