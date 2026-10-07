-module(openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties/0]).

-type openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'service_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'privilege_name' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'service_name' := ServiceName,
          'path' := Path,
          'privilege_name' := PrivilegeName
        }) ->
    #{ 'name' => Name,
       'service.name' => ServiceName,
       'path' => Path,
       'privilege.name' => PrivilegeName
     }.
