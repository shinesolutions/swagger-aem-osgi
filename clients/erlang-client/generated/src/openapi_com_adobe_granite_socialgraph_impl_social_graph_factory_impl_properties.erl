-module(openapi_com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties/0]).

-type openapi_com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties() ::
    #{ 'group2member_relationship_outgoing' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'group2member_excluded_outgoing' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'group2member_relationship_incoming' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'group2member_excluded_incoming' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'group2member_relationship_outgoing' := Group2memberRelationshipOutgoing,
          'group2member_excluded_outgoing' := Group2memberExcludedOutgoing,
          'group2member_relationship_incoming' := Group2memberRelationshipIncoming,
          'group2member_excluded_incoming' := Group2memberExcludedIncoming
        }) ->
    #{ 'group2member.relationship.outgoing' => Group2memberRelationshipOutgoing,
       'group2member.excluded.outgoing' => Group2memberExcludedOutgoing,
       'group2member.relationship.incoming' => Group2memberRelationshipIncoming,
       'group2member.excluded.incoming' => Group2memberExcludedIncoming
     }.
