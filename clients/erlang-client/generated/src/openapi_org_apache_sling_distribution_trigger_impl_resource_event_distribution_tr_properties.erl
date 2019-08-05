-module(openapi_org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr_properties/0]).

-type openapi_org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'path' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'path' := Path
        }) ->
    #{ 'name' => Name,
       'path' => Path
     }.
