-module(openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_properties/0]).

-type openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'path' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'path' := Path
        }) ->
    #{ 'name' => Name,
       'path' => Path
     }.
