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
class COM_DAY_CQ_WCM_UNDO_UNDO_CONFIG_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    cq_wcm_undo_enabled: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    cq_wcm_undo_path: detachable CONFIG_NODE_PROPERTY_STRING 
      
    cq_wcm_undo_validity: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    cq_wcm_undo_steps: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    cq_wcm_undo_persistence: detachable CONFIG_NODE_PROPERTY_STRING 
      
    cq_wcm_undo_persistence_mode: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    cq_wcm_undo_markermode: detachable CONFIG_NODE_PROPERTY_STRING 
      
    cq_wcm_undo_whitelist: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    cq_wcm_undo_blacklist: detachable CONFIG_NODE_PROPERTY_ARRAY 
      

feature -- Change Element  
 
    set_cq_wcm_undo_enabled (a_name: like cq_wcm_undo_enabled)
        -- Set 'cq_wcm_undo_enabled' with 'a_name'.
      do
        cq_wcm_undo_enabled := a_name
      ensure
        cq_wcm_undo_enabled_set: cq_wcm_undo_enabled = a_name		
      end

    set_cq_wcm_undo_path (a_name: like cq_wcm_undo_path)
        -- Set 'cq_wcm_undo_path' with 'a_name'.
      do
        cq_wcm_undo_path := a_name
      ensure
        cq_wcm_undo_path_set: cq_wcm_undo_path = a_name		
      end

    set_cq_wcm_undo_validity (a_name: like cq_wcm_undo_validity)
        -- Set 'cq_wcm_undo_validity' with 'a_name'.
      do
        cq_wcm_undo_validity := a_name
      ensure
        cq_wcm_undo_validity_set: cq_wcm_undo_validity = a_name		
      end

    set_cq_wcm_undo_steps (a_name: like cq_wcm_undo_steps)
        -- Set 'cq_wcm_undo_steps' with 'a_name'.
      do
        cq_wcm_undo_steps := a_name
      ensure
        cq_wcm_undo_steps_set: cq_wcm_undo_steps = a_name		
      end

    set_cq_wcm_undo_persistence (a_name: like cq_wcm_undo_persistence)
        -- Set 'cq_wcm_undo_persistence' with 'a_name'.
      do
        cq_wcm_undo_persistence := a_name
      ensure
        cq_wcm_undo_persistence_set: cq_wcm_undo_persistence = a_name		
      end

    set_cq_wcm_undo_persistence_mode (a_name: like cq_wcm_undo_persistence_mode)
        -- Set 'cq_wcm_undo_persistence_mode' with 'a_name'.
      do
        cq_wcm_undo_persistence_mode := a_name
      ensure
        cq_wcm_undo_persistence_mode_set: cq_wcm_undo_persistence_mode = a_name		
      end

    set_cq_wcm_undo_markermode (a_name: like cq_wcm_undo_markermode)
        -- Set 'cq_wcm_undo_markermode' with 'a_name'.
      do
        cq_wcm_undo_markermode := a_name
      ensure
        cq_wcm_undo_markermode_set: cq_wcm_undo_markermode = a_name		
      end

    set_cq_wcm_undo_whitelist (a_name: like cq_wcm_undo_whitelist)
        -- Set 'cq_wcm_undo_whitelist' with 'a_name'.
      do
        cq_wcm_undo_whitelist := a_name
      ensure
        cq_wcm_undo_whitelist_set: cq_wcm_undo_whitelist = a_name		
      end

    set_cq_wcm_undo_blacklist (a_name: like cq_wcm_undo_blacklist)
        -- Set 'cq_wcm_undo_blacklist' with 'a_name'.
      do
        cq_wcm_undo_blacklist := a_name
      ensure
        cq_wcm_undo_blacklist_set: cq_wcm_undo_blacklist = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_DAY_CQ_WCM_UNDO_UNDO_CONFIG_PROPERTIES%N")
        if attached cq_wcm_undo_enabled as l_cq_wcm_undo_enabled then
          Result.append ("%Ncq_wcm_undo_enabled:")
          Result.append (l_cq_wcm_undo_enabled.out)
          Result.append ("%N")    
        end  
        if attached cq_wcm_undo_path as l_cq_wcm_undo_path then
          Result.append ("%Ncq_wcm_undo_path:")
          Result.append (l_cq_wcm_undo_path.out)
          Result.append ("%N")    
        end  
        if attached cq_wcm_undo_validity as l_cq_wcm_undo_validity then
          Result.append ("%Ncq_wcm_undo_validity:")
          Result.append (l_cq_wcm_undo_validity.out)
          Result.append ("%N")    
        end  
        if attached cq_wcm_undo_steps as l_cq_wcm_undo_steps then
          Result.append ("%Ncq_wcm_undo_steps:")
          Result.append (l_cq_wcm_undo_steps.out)
          Result.append ("%N")    
        end  
        if attached cq_wcm_undo_persistence as l_cq_wcm_undo_persistence then
          Result.append ("%Ncq_wcm_undo_persistence:")
          Result.append (l_cq_wcm_undo_persistence.out)
          Result.append ("%N")    
        end  
        if attached cq_wcm_undo_persistence_mode as l_cq_wcm_undo_persistence_mode then
          Result.append ("%Ncq_wcm_undo_persistence_mode:")
          Result.append (l_cq_wcm_undo_persistence_mode.out)
          Result.append ("%N")    
        end  
        if attached cq_wcm_undo_markermode as l_cq_wcm_undo_markermode then
          Result.append ("%Ncq_wcm_undo_markermode:")
          Result.append (l_cq_wcm_undo_markermode.out)
          Result.append ("%N")    
        end  
        if attached cq_wcm_undo_whitelist as l_cq_wcm_undo_whitelist then
          Result.append ("%Ncq_wcm_undo_whitelist:")
          Result.append (l_cq_wcm_undo_whitelist.out)
          Result.append ("%N")    
        end  
        if attached cq_wcm_undo_blacklist as l_cq_wcm_undo_blacklist then
          Result.append ("%Ncq_wcm_undo_blacklist:")
          Result.append (l_cq_wcm_undo_blacklist.out)
          Result.append ("%N")    
        end  
      end
end

