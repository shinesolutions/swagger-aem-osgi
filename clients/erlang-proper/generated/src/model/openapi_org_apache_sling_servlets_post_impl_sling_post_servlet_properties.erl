-module(openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_properties/0]).

-export([openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_properties/1]).

-export_type([openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_properties/0]).

-type openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_properties() ::
  [ {'servlet_post_dateFormats', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'servlet_post_nodeNameHints', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'servlet_post_nodeNameMaxLength', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'servlet_post_checkinNewVersionableNodes', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'servlet_post_autoCheckout', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'servlet_post_autoCheckin', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'servlet_post_ignorePattern', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_properties() ->
    openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_properties([]).

openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_properties(Fields) ->
  Default = [ {'servlet.post.dateFormats', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'servlet.post.nodeNameHints', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'servlet.post.nodeNameMaxLength', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'servlet.post.checkinNewVersionableNodes', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'servlet.post.autoCheckout', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'servlet.post.autoCheckin', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'servlet.post.ignorePattern', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

