-module(openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties/0]).

-type openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties() ::
    #{ 'formsManagerConfig_includeOOTBTemplates' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'formsManagerConfig_includeDeprecatedTemplates' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'formsManagerConfig_includeOOTBTemplates' := FormsManagerConfigIncludeOOTBTemplates,
          'formsManagerConfig_includeDeprecatedTemplates' := FormsManagerConfigIncludeDeprecatedTemplates
        }) ->
    #{ 'formsManagerConfig.includeOOTBTemplates' => FormsManagerConfigIncludeOOTBTemplates,
       'formsManagerConfig.includeDeprecatedTemplates' => FormsManagerConfigIncludeDeprecatedTemplates
     }.
