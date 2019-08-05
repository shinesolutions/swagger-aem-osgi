-module(openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_info/0]).

-type openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties:openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties()
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
