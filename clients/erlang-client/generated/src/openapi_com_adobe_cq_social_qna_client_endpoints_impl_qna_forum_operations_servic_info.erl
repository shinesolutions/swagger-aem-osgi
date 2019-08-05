-module(openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_info/0]).

-type openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_properties:openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_properties()
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
