-module(openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_info/0]).

-type openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties:openapi_com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
