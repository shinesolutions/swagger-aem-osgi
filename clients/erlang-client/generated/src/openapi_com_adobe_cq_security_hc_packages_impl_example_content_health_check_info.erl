-module(openapi_com_adobe_cq_security_hc_packages_impl_example_content_health_check_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_security_hc_packages_impl_example_content_health_check_info/0]).

-type openapi_com_adobe_cq_security_hc_packages_impl_example_content_health_check_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_security_hc_packages_impl_example_content_health_check_properties:openapi_com_adobe_cq_security_hc_packages_impl_example_content_health_check_properties(),
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
