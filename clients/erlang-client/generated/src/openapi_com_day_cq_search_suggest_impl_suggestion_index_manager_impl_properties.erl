-module(openapi_com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties/0]).

-type openapi_com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties() ::
    #{ 'pathBuilder_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'suggest_basepath' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'pathBuilder_target' := PathBuilderTarget,
          'suggest_basepath' := SuggestBasepath
        }) ->
    #{ 'pathBuilder.target' => PathBuilderTarget,
       'suggest.basepath' => SuggestBasepath
     }.
