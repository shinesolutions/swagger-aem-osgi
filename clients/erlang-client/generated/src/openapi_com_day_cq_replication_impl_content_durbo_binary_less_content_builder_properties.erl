-module(openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties/0]).

-type openapi_com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties() ::
    #{ 'binary_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'binary_threshold' := BinaryThreshold
        }) ->
    #{ 'binary.threshold' => BinaryThreshold
     }.
