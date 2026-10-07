-module(openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_info/0]).

-export([openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_info/1]).

-export_type([openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_info/0]).

-type openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties:openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties() }
  | {'additionalProperties', binary() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_info() ->
    openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_info([]).

openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties:openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties() }
            , {'additionalProperties', binary() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

