-module(openapi_org_apache_sling_servlets_get_default_get_servlet_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_servlets_get_default_get_servlet_properties/0]).

-export([openapi_org_apache_sling_servlets_get_default_get_servlet_properties/1]).

-export_type([openapi_org_apache_sling_servlets_get_default_get_servlet_properties/0]).

-type openapi_org_apache_sling_servlets_get_default_get_servlet_properties() ::
  [ {'aliases', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'index', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'index_files', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'enable_html', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'enable_json', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'enable_txt', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'enable_xml', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'json_maximumresults', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'ecmaSuport', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_servlets_get_default_get_servlet_properties() ->
    openapi_org_apache_sling_servlets_get_default_get_servlet_properties([]).

openapi_org_apache_sling_servlets_get_default_get_servlet_properties(Fields) ->
  Default = [ {'aliases', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'index', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'index.files', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'enable.html', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'enable.json', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'enable.txt', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'enable.xml', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'json.maximumresults', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'ecmaSuport', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

