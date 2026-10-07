-module(openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties).

-include("openapi.hrl").

-export([openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties/0]).

-export([openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties/1]).

-export_type([openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties/0]).

-type openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties() ::
  [ {'max_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties() ->
    openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties([]).

openapi_org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties(Fields) ->
  Default = [ {'max.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

