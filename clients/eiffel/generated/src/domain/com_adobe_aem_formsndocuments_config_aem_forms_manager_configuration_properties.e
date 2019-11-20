note
 description:"[
		Adobe Experience Manager OSGI config (AEM) API
 		Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
  		OpenAPI spec version: 1.0.0-pre.0
 	    Contact: opensource@shinesolutions.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class COM_ADOBE_AEM_FORMSNDOCUMENTS_CONFIG_AEM_FORMS_MANAGER_CONFIGURATION_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    forms_manager_config_include_oo_tb_templates: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    forms_manager_config_include_deprecated_templates: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      

feature -- Change Element  
 
    set_forms_manager_config_include_oo_tb_templates (a_name: like forms_manager_config_include_oo_tb_templates)
        -- Set 'forms_manager_config_include_oo_tb_templates' with 'a_name'.
      do
        forms_manager_config_include_oo_tb_templates := a_name
      ensure
        forms_manager_config_include_oo_tb_templates_set: forms_manager_config_include_oo_tb_templates = a_name		
      end

    set_forms_manager_config_include_deprecated_templates (a_name: like forms_manager_config_include_deprecated_templates)
        -- Set 'forms_manager_config_include_deprecated_templates' with 'a_name'.
      do
        forms_manager_config_include_deprecated_templates := a_name
      ensure
        forms_manager_config_include_deprecated_templates_set: forms_manager_config_include_deprecated_templates = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_AEM_FORMSNDOCUMENTS_CONFIG_AEM_FORMS_MANAGER_CONFIGURATION_PROPERTIES%N")
        if attached forms_manager_config_include_oo_tb_templates as l_forms_manager_config_include_oo_tb_templates then
          Result.append ("%Nforms_manager_config_include_oo_tb_templates:")
          Result.append (l_forms_manager_config_include_oo_tb_templates.out)
          Result.append ("%N")    
        end  
        if attached forms_manager_config_include_deprecated_templates as l_forms_manager_config_include_deprecated_templates then
          Result.append ("%Nforms_manager_config_include_deprecated_templates:")
          Result.append (l_forms_manager_config_include_deprecated_templates.out)
          Result.append ("%N")    
        end  
      end
end

