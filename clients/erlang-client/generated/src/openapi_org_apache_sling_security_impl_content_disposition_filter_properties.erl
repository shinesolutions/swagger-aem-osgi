-module(openapi_org_apache_sling_security_impl_content_disposition_filter_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_security_impl_content_disposition_filter_properties/0]).

-type openapi_org_apache_sling_security_impl_content_disposition_filter_properties() ::
    #{ 'sling_content_disposition_paths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'sling_content_disposition_excluded_paths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'sling_content_disposition_all_paths' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'sling_content_disposition_paths' := SlingContentDispositionPaths,
          'sling_content_disposition_excluded_paths' := SlingContentDispositionExcludedPaths,
          'sling_content_disposition_all_paths' := SlingContentDispositionAllPaths
        }) ->
    #{ 'sling.content.disposition.paths' => SlingContentDispositionPaths,
       'sling.content.disposition.excluded.paths' => SlingContentDispositionExcludedPaths,
       'sling.content.disposition.all.paths' => SlingContentDispositionAllPaths
     }.
