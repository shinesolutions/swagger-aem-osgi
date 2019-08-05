-module(openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties/0]).

-type openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties() ::
    #{ 'pseudo_patterns' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'pseudo_patterns' := PseudoPatterns
        }) ->
    #{ 'pseudo.patterns' => PseudoPatterns
     }.
