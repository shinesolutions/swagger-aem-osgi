-module(openapi_org_apache_sling_resourcemerger_picker_overriding_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_resourcemerger_picker_overriding_info/0]).

-type openapi_org_apache_sling_resourcemerger_picker_overriding_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_resourcemerger_picker_overriding_properties:openapi_org_apache_sling_resourcemerger_picker_overriding_properties(),
       'additionalProperties' => binary(),
       'bundle_location' => binary(),
       'service_location' => binary()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties,
          'additionalProperties' := AdditionalProperties,
          'bundle_location' := BundleLocation,
          'service_location' := ServiceLocation
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties,
       'additionalProperties' => AdditionalProperties,
       'bundle_location' => BundleLocation,
       'service_location' => ServiceLocation
     }.
