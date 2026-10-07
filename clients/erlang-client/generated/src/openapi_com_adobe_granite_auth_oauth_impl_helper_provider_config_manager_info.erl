-module(openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_info/0]).

-type openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_properties:openapi_com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_properties(),
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
