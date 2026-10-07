-module(openapi_org_apache_http_proxyconfigurator_info).

-include("openapi.hrl").

-export([openapi_org_apache_http_proxyconfigurator_info/0]).

-export([openapi_org_apache_http_proxyconfigurator_info/1]).

-export_type([openapi_org_apache_http_proxyconfigurator_info/0]).

-type openapi_org_apache_http_proxyconfigurator_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_http_proxyconfigurator_properties:openapi_org_apache_http_proxyconfigurator_properties() }
  ].


openapi_org_apache_http_proxyconfigurator_info() ->
    openapi_org_apache_http_proxyconfigurator_info([]).

openapi_org_apache_http_proxyconfigurator_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_http_proxyconfigurator_properties:openapi_org_apache_http_proxyconfigurator_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

