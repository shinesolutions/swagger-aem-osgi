-module(openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_info/0]).

-type openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties:openapi_com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_properties()
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
