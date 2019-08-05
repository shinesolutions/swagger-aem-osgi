-module(openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties/0]).

-type openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties() ::
    #{ 'fieldWhitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'sitePathFilters' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'sitePackageGroup' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'fieldWhitelist' := FieldWhitelist,
          'sitePathFilters' := SitePathFilters,
          'sitePackageGroup' := SitePackageGroup
        }) ->
    #{ 'fieldWhitelist' => FieldWhitelist,
       'sitePathFilters' => SitePathFilters,
       'sitePackageGroup' => SitePackageGroup
     }.
