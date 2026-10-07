-module(openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_info/0]).

-type openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties:openapi_com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties()
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
