-module(openapi_com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties/0]).

-type openapi_com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties() ::
    #{ 'omnisearch_suggestion_requiretext_min' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'omnisearch_suggestion_spellcheck_require' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'omnisearch_suggestion_requiretext_min' := OmnisearchSuggestionRequiretextMin,
          'omnisearch_suggestion_spellcheck_require' := OmnisearchSuggestionSpellcheckRequire
        }) ->
    #{ 'omnisearch.suggestion.requiretext.min' => OmnisearchSuggestionRequiretextMin,
       'omnisearch.suggestion.spellcheck.require' => OmnisearchSuggestionSpellcheckRequire
     }.
