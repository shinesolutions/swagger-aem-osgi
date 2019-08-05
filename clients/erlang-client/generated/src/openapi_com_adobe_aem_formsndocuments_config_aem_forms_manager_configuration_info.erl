-module(openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_info).

-export([encode/1]).

-export_type([openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_info/0]).

-type openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties:openapi_com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties()
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
