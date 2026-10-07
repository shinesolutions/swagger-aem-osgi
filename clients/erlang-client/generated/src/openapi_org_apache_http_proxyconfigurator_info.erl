-module(openapi_org_apache_http_proxyconfigurator_info).

-export([encode/1]).

-export_type([openapi_org_apache_http_proxyconfigurator_info/0]).

-type openapi_org_apache_http_proxyconfigurator_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_http_proxyconfigurator_properties:openapi_org_apache_http_proxyconfigurator_properties()
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
