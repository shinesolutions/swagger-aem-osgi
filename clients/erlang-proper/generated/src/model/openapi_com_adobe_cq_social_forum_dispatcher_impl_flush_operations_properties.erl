-module(openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties/0]).

-export([openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties/1]).

-export_type([openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties/0]).

-type openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties() ::
  [ {'extension_order', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'flush_forumontopic', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties() ->
    openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties([]).

openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties(Fields) ->
  Default = [ {'extension.order', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'flush.forumontopic', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

