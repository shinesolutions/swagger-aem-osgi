-module(openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties/0]).

-type openapi_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties() ::
    #{ 'org_apache_sling_scripting_sightly_js_bindings' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'org_apache_sling_scripting_sightly_js_bindings' := OrgApacheSlingScriptingSightlyJsBindings
        }) ->
    #{ 'org.apache.sling.scripting.sightly.js.bindings' => OrgApacheSlingScriptingSightlyJsBindings
     }.
