-module(openapi_com_adobe_granite_frags_impl_check_http_header_flag_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_frags_impl_check_http_header_flag_info/0]).

-type openapi_com_adobe_granite_frags_impl_check_http_header_flag_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties:openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
