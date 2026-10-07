-module(openapi_com_adobe_granite_frags_impl_check_http_header_flag_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_frags_impl_check_http_header_flag_info/0]).

-export([openapi_com_adobe_granite_frags_impl_check_http_header_flag_info/1]).

-export_type([openapi_com_adobe_granite_frags_impl_check_http_header_flag_info/0]).

-type openapi_com_adobe_granite_frags_impl_check_http_header_flag_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties:openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties() }
  ].


openapi_com_adobe_granite_frags_impl_check_http_header_flag_info() ->
    openapi_com_adobe_granite_frags_impl_check_http_header_flag_info([]).

openapi_com_adobe_granite_frags_impl_check_http_header_flag_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties:openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

