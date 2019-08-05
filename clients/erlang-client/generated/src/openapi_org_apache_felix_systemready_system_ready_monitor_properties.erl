-module(openapi_org_apache_felix_systemready_system_ready_monitor_properties).

-export([encode/1]).

-export_type([openapi_org_apache_felix_systemready_system_ready_monitor_properties/0]).

-type openapi_org_apache_felix_systemready_system_ready_monitor_properties() ::
    #{ 'poll_interval' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'poll_interval' := PollInterval
        }) ->
    #{ 'poll.interval' => PollInterval
     }.
