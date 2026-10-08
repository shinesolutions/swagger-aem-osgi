-module(openapi_com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties/0]).

-export([openapi_com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties/1]).

-export_type([openapi_com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties/0]).

-type openapi_com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties() ::
  [ {'group2member_relationship_outgoing', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'group2member_excluded_outgoing', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'group2member_relationship_incoming', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'group2member_excluded_incoming', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties() ->
    openapi_com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties([]).

openapi_com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties(Fields) ->
  Default = [ {'group2member.relationship.outgoing', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'group2member.excluded.outgoing', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'group2member.relationship.incoming', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'group2member.excluded.incoming', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

