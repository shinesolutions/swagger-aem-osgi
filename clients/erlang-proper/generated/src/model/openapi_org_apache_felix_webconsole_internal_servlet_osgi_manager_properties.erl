-module(openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties).

-include("openapi.hrl").

-export([openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties/0]).

-export([openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties/1]).

-export_type([openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties/0]).

-type openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties() ::
  [ {'manager_root', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'http_service_filter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'default_render', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'realm', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'username', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'password', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'category', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'locale', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'loglevel', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'plugins', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties() ->
    openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties([]).

openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties(Fields) ->
  Default = [ {'manager.root', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'http.service.filter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'default.render', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'realm', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'username', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'password', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'category', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'locale', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'loglevel', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'plugins', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

