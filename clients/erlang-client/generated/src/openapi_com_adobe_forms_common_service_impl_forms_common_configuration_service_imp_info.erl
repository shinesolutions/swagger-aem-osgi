-module(openapi_com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_info).

-export([encode/1]).

-export_type([openapi_com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_info/0]).

-type openapi_com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties:openapi_com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_properties()
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
