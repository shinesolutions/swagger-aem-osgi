-module(openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties/0]).

-export([openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties/1]).

-export_type([openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties/0]).

-type openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties() ::
  [ {'org_apache_sling_scripting_sightly_js_bindings', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties() ->
    openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties([]).

openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties(Fields) ->
  Default = [ {'org.apache.sling.scripting.sightly.js.bindings', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

