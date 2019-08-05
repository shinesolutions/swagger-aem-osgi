-module(openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties/0]).

-type openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties() ::
    #{ 'alias' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'dav_create_absolute_uri' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'dav_protectedhandlers' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'alias' := Alias,
          'dav_create_absolute_uri' := DavCreateAbsoluteUri,
          'dav_protectedhandlers' := DavProtectedhandlers
        }) ->
    #{ 'alias' => Alias,
       'dav.create-absolute-uri' => DavCreateAbsoluteUri,
       'dav.protectedhandlers' => DavProtectedhandlers
     }.
