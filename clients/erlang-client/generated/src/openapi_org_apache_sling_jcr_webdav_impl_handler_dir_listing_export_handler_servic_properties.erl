-module(openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties/0]).

-type openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties() ::
    #{ 'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'service_ranking' := ServiceRanking
        }) ->
    #{ 'service.ranking' => ServiceRanking
     }.
