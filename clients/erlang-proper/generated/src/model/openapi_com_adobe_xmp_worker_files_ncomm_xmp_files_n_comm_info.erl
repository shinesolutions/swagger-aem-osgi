-module(openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info).

-include("openapi.hrl").

-export([openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info/0]).

-export([openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info/1]).

-export_type([openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info/0]).

-type openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties:openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info() ->
    openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info([]).

openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties:openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

