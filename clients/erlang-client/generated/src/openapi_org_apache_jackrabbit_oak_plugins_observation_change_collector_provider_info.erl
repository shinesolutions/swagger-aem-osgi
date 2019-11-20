-module(openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_info).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_info/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties:openapi_org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties(),
       'bundle_location' => binary(),
       'service_location' => binary()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties,
          'bundle_location' := BundleLocation,
          'service_location' := ServiceLocation
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties,
       'bundle_location' => BundleLocation,
       'service_location' => ServiceLocation
     }.