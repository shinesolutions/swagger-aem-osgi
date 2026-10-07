-module(openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_info/0]).

-type openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties:openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties()
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
