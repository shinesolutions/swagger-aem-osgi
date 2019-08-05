-module(openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_info/0]).

-type openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties:openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties(),
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
