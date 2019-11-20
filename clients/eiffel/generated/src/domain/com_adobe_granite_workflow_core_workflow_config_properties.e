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
class COM_ADOBE_GRANITE_WORKFLOW_CORE_WORKFLOW_CONFIG_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    cq_workflow_config_workflow_packages_root_path: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    cq_workflow_config_workflow_process_legacy_mode: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    cq_workflow_config_allow_locking: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      

feature -- Change Element  
 
    set_cq_workflow_config_workflow_packages_root_path (a_name: like cq_workflow_config_workflow_packages_root_path)
        -- Set 'cq_workflow_config_workflow_packages_root_path' with 'a_name'.
      do
        cq_workflow_config_workflow_packages_root_path := a_name
      ensure
        cq_workflow_config_workflow_packages_root_path_set: cq_workflow_config_workflow_packages_root_path = a_name		
      end

    set_cq_workflow_config_workflow_process_legacy_mode (a_name: like cq_workflow_config_workflow_process_legacy_mode)
        -- Set 'cq_workflow_config_workflow_process_legacy_mode' with 'a_name'.
      do
        cq_workflow_config_workflow_process_legacy_mode := a_name
      ensure
        cq_workflow_config_workflow_process_legacy_mode_set: cq_workflow_config_workflow_process_legacy_mode = a_name		
      end

    set_cq_workflow_config_allow_locking (a_name: like cq_workflow_config_allow_locking)
        -- Set 'cq_workflow_config_allow_locking' with 'a_name'.
      do
        cq_workflow_config_allow_locking := a_name
      ensure
        cq_workflow_config_allow_locking_set: cq_workflow_config_allow_locking = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_GRANITE_WORKFLOW_CORE_WORKFLOW_CONFIG_PROPERTIES%N")
        if attached cq_workflow_config_workflow_packages_root_path as l_cq_workflow_config_workflow_packages_root_path then
          Result.append ("%Ncq_workflow_config_workflow_packages_root_path:")
          Result.append (l_cq_workflow_config_workflow_packages_root_path.out)
          Result.append ("%N")    
        end  
        if attached cq_workflow_config_workflow_process_legacy_mode as l_cq_workflow_config_workflow_process_legacy_mode then
          Result.append ("%Ncq_workflow_config_workflow_process_legacy_mode:")
          Result.append (l_cq_workflow_config_workflow_process_legacy_mode.out)
          Result.append ("%N")    
        end  
        if attached cq_workflow_config_allow_locking as l_cq_workflow_config_allow_locking then
          Result.append ("%Ncq_workflow_config_allow_locking:")
          Result.append (l_cq_workflow_config_allow_locking.out)
          Result.append ("%N")    
        end  
      end
end

