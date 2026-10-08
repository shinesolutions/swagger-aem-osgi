-module(openapi_com_day_cq_wcm_scripting_impl_bvp_manager_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_scripting_impl_bvp_manager_info/0]).

-export([openapi_com_day_cq_wcm_scripting_impl_bvp_manager_info/1]).

-export_type([openapi_com_day_cq_wcm_scripting_impl_bvp_manager_info/0]).

-type openapi_com_day_cq_wcm_scripting_impl_bvp_manager_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties:openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties() }
  ].


openapi_com_day_cq_wcm_scripting_impl_bvp_manager_info() ->
    openapi_com_day_cq_wcm_scripting_impl_bvp_manager_info([]).

openapi_com_day_cq_wcm_scripting_impl_bvp_manager_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties:openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

