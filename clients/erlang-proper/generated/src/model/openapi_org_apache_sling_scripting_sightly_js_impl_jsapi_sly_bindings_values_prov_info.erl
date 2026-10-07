-module(openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info/0]).

-export([openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info/1]).

-export_type([openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info/0]).

-type openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties:openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info() ->
    openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info([]).

openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties:openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

