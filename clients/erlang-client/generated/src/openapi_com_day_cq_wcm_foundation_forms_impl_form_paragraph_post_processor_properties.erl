-module(openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties/0]).

-type openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties() ::
    #{ 'forms_formparagraphpostprocessor_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'forms_formparagraphpostprocessor_formresourcetypes' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'forms_formparagraphpostprocessor_enabled' := FormsFormparagraphpostprocessorEnabled,
          'forms_formparagraphpostprocessor_formresourcetypes' := FormsFormparagraphpostprocessorFormresourcetypes
        }) ->
    #{ 'forms.formparagraphpostprocessor.enabled' => FormsFormparagraphpostprocessorEnabled,
       'forms.formparagraphpostprocessor.formresourcetypes' => FormsFormparagraphpostprocessorFormresourcetypes
     }.
