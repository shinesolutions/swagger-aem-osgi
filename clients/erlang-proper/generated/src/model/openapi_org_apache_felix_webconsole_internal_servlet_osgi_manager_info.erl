-module(openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_info).

-include("openapi.hrl").

-export([openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_info/0]).

-export([openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_info/1]).

-export_type([openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_info/0]).

-type openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties:openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties() }
  ].


openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_info() ->
    openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_info([]).

openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties:openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

