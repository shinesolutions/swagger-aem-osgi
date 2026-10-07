-module(openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties/0]).

-export([openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties/1]).

-export_type([openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties/0]).

-type openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties() ::
  [ {'forms_formparagraphpostprocessor_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'forms_formparagraphpostprocessor_formresourcetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties() ->
    openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties([]).

openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties(Fields) ->
  Default = [ {'forms.formparagraphpostprocessor.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'forms.formparagraphpostprocessor.formresourcetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

