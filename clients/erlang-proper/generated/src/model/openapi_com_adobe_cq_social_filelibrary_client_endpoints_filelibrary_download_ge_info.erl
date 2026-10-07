-module(openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_info/0]).

-export([openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_info/1]).

-export_type([openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_info/0]).

-type openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_properties:openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_properties() }
  ].


openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_info() ->
    openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_info([]).

openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_properties:openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

