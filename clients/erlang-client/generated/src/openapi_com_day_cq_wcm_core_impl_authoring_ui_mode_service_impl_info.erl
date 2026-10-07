-module(openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info/0]).

-type openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties:openapi_com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_properties(),
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
