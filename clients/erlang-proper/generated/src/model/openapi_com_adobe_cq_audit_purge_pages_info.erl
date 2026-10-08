-module(openapi_com_adobe_cq_audit_purge_pages_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_audit_purge_pages_info/0]).

-export([openapi_com_adobe_cq_audit_purge_pages_info/1]).

-export_type([openapi_com_adobe_cq_audit_purge_pages_info/0]).

-type openapi_com_adobe_cq_audit_purge_pages_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_audit_purge_pages_properties:openapi_com_adobe_cq_audit_purge_pages_properties() }
  ].


openapi_com_adobe_cq_audit_purge_pages_info() ->
    openapi_com_adobe_cq_audit_purge_pages_info([]).

openapi_com_adobe_cq_audit_purge_pages_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_audit_purge_pages_properties:openapi_com_adobe_cq_audit_purge_pages_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

