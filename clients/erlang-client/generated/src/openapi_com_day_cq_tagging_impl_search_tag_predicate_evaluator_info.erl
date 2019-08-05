-module(openapi_com_day_cq_tagging_impl_search_tag_predicate_evaluator_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_tagging_impl_search_tag_predicate_evaluator_info/0]).

-type openapi_com_day_cq_tagging_impl_search_tag_predicate_evaluator_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties:openapi_com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
