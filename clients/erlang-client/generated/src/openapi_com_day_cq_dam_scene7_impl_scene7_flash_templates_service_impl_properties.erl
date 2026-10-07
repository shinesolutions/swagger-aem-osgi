-module(openapi_com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties/0]).

-type openapi_com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties() ::
    #{ 'scene7FlashTemplates_rti' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'scene7FlashTemplates_rsi' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'scene7FlashTemplates_rb' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'scene7FlashTemplates_rurl' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'scene7FlashTemplate_urlFormatParameter' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'scene7FlashTemplates_rti' := Scene7FlashTemplatesRti,
          'scene7FlashTemplates_rsi' := Scene7FlashTemplatesRsi,
          'scene7FlashTemplates_rb' := Scene7FlashTemplatesRb,
          'scene7FlashTemplates_rurl' := Scene7FlashTemplatesRurl,
          'scene7FlashTemplate_urlFormatParameter' := Scene7FlashTemplateUrlFormatParameter
        }) ->
    #{ 'scene7FlashTemplates.rti' => Scene7FlashTemplatesRti,
       'scene7FlashTemplates.rsi' => Scene7FlashTemplatesRsi,
       'scene7FlashTemplates.rb' => Scene7FlashTemplatesRb,
       'scene7FlashTemplates.rurl' => Scene7FlashTemplatesRurl,
       'scene7FlashTemplate.urlFormatParameter' => Scene7FlashTemplateUrlFormatParameter
     }.
