-module(openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_info/0]).

-export([openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_info/1]).

-export_type([openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_info/0]).

-type openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_properties:openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_properties() }
  ].


openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_info() ->
    openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_info([]).

openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_properties:openapi_com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

