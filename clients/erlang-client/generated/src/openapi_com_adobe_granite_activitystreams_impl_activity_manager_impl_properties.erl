-module(openapi_com_adobe_granite_activitystreams_impl_activity_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_activitystreams_impl_activity_manager_impl_properties/0]).

-type openapi_com_adobe_granite_activitystreams_impl_activity_manager_impl_properties() ::
    #{ 'aggregate_relationships' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'aggregate_descend_virtual' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'aggregate_relationships' := AggregateRelationships,
          'aggregate_descend_virtual' := AggregateDescendVirtual
        }) ->
    #{ 'aggregate.relationships' => AggregateRelationships,
       'aggregate.descend.virtual' => AggregateDescendVirtual
     }.
