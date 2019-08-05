-module(openapi_com_day_cq_wcm_designimporter_design_package_importer_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_designimporter_design_package_importer_properties/0]).

-type openapi_com_day_cq_wcm_designimporter_design_package_importer_properties() ::
    #{ 'extract_filter' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'extract_filter' := ExtractFilter
        }) ->
    #{ 'extract.filter' => ExtractFilter
     }.
