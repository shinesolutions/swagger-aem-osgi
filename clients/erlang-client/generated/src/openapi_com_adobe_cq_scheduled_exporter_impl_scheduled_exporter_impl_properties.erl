-module(openapi_com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties/0]).

-type openapi_com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties() ::
    #{ 'include_paths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'exporter_user' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'include_paths' := IncludePaths,
          'exporter_user' := ExporterUser
        }) ->
    #{ 'include.paths' => IncludePaths,
       'exporter.user' => ExporterUser
     }.
