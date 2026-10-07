-module(openapi_org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties/0]).

-type openapi_org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'queue' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'drop_invalid_items' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'agent_target' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'queue' := Queue,
          'drop_invalid_items' := DropInvalidItems,
          'agent_target' := AgentTarget
        }) ->
    #{ 'name' => Name,
       'queue' => Queue,
       'drop.invalid.items' => DropInvalidItems,
       'agent.target' => AgentTarget
     }.
