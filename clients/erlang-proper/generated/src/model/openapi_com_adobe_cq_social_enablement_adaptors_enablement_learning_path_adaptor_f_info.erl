-module(openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_info/0]).

-export([openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_info/1]).

-export_type([openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_info/0]).

-type openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties:openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties() }
  ].


openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_info() ->
    openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_info([]).

openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties:openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

