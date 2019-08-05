-module(openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties/0]).

-type openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties() ::
    #{ 'importer_name' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'importer_name' := ImporterName
        }) ->
    #{ 'importer.name' => ImporterName
     }.
