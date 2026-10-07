-module(openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_properties/0]).

-type openapi_org_apache_sling_distribution_packaging_impl_exporter_local_distributio_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'packageBuilder_target' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'packageBuilder_target' := PackageBuilderTarget
        }) ->
    #{ 'name' => Name,
       'packageBuilder.target' => PackageBuilderTarget
     }.
