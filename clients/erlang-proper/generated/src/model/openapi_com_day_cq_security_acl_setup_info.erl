-module(openapi_com_day_cq_security_acl_setup_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_security_acl_setup_info/0]).

-export([openapi_com_day_cq_security_acl_setup_info/1]).

-export_type([openapi_com_day_cq_security_acl_setup_info/0]).

-type openapi_com_day_cq_security_acl_setup_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_security_acl_setup_properties:openapi_com_day_cq_security_acl_setup_properties() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_com_day_cq_security_acl_setup_info() ->
    openapi_com_day_cq_security_acl_setup_info([]).

openapi_com_day_cq_security_acl_setup_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_security_acl_setup_properties:openapi_com_day_cq_security_acl_setup_properties() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

