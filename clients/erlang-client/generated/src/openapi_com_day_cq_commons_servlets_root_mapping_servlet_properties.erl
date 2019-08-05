-module(openapi_com_day_cq_commons_servlets_root_mapping_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_commons_servlets_root_mapping_servlet_properties/0]).

-type openapi_com_day_cq_commons_servlets_root_mapping_servlet_properties() ::
    #{ 'rootmapping_target' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'rootmapping_target' := RootmappingTarget
        }) ->
    #{ 'rootmapping.target' => RootmappingTarget
     }.
