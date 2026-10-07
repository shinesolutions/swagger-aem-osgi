-module(openapi_com_adobe_cq_audit_purge_dam_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_audit_purge_dam_info/0]).

-export([openapi_com_adobe_cq_audit_purge_dam_info/1]).

-export_type([openapi_com_adobe_cq_audit_purge_dam_info/0]).

-type openapi_com_adobe_cq_audit_purge_dam_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_audit_purge_dam_properties:openapi_com_adobe_cq_audit_purge_dam_properties() }
  ].


openapi_com_adobe_cq_audit_purge_dam_info() ->
    openapi_com_adobe_cq_audit_purge_dam_info([]).

openapi_com_adobe_cq_audit_purge_dam_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_audit_purge_dam_properties:openapi_com_adobe_cq_audit_purge_dam_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

