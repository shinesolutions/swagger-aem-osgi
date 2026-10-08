-module(openapi_org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties/0]).

-export([openapi_org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties/1]).

-export_type([openapi_org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties/0]).

-type openapi_org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties() ::
  [ {'dav_root', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'dav_create_absolute_uri', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'dav_realm', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'collection_types', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'filter_prefixes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'filter_types', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'filter_uris', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'type_collections', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'type_noncollections', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'type_content', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties() ->
    openapi_org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties([]).

openapi_org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties(Fields) ->
  Default = [ {'dav.root', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'dav.create-absolute-uri', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'dav.realm', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'collection.types', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'filter.prefixes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'filter.types', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'filter.uris', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'type.collections', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'type.noncollections', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'type.content', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

