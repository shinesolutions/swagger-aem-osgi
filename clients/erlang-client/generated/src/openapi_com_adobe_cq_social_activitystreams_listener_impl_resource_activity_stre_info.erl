-module(openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_info/0]).

-type openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties:openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties(),
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
