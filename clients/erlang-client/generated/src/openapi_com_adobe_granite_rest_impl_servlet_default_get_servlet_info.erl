-module(openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_info/0]).

-type openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_properties:openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_properties()
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