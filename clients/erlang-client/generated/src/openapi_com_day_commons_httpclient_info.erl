-module(openapi_com_day_commons_httpclient_info).

-export([encode/1]).

-export_type([openapi_com_day_commons_httpclient_info/0]).

-type openapi_com_day_commons_httpclient_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_commons_httpclient_properties:openapi_com_day_commons_httpclient_properties()
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
