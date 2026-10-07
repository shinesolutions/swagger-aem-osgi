-module(openapi_org_apache_sling_settings_impl_sling_settings_service_impl_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_settings_impl_sling_settings_service_impl_properties/0]).

-type openapi_org_apache_sling_settings_impl_sling_settings_service_impl_properties() ::
    #{ 'sling_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_description' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'sling_name' := SlingName,
          'sling_description' := SlingDescription
        }) ->
    #{ 'sling.name' => SlingName,
       'sling.description' => SlingDescription
     }.
