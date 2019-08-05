-module(openapi_com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties/0]).

-type openapi_com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties() ::
    #{ 'ignore_path' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'ignore_path' := IgnorePath
        }) ->
    #{ 'ignore_path' => IgnorePath
     }.
