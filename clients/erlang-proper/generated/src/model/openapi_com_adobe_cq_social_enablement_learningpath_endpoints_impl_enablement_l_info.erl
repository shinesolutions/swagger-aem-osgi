-module(openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_info/0]).

-export([openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_info/1]).

-export_type([openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_info/0]).

-type openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_properties:openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_properties() }
  ].


openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_info() ->
    openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_info([]).

openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_properties:openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

