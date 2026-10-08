-module(openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_info/0]).

-export([openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_info/1]).

-export_type([openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_info/0]).

-type openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_properties:openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_properties() }
  ].


openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_info() ->
    openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_info([]).

openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_properties:openapi_com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

