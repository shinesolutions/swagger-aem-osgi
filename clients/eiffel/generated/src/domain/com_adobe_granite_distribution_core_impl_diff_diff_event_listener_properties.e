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
class COM_ADOBE_GRANITE_DISTRIBUTION_CORE_IMPL_DIFF_DIFF_EVENT_LISTENER_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    diff_path: detachable CONFIG_NODE_PROPERTY_STRING 
      
    service_name: detachable CONFIG_NODE_PROPERTY_STRING 
      
    service_user_target: detachable CONFIG_NODE_PROPERTY_STRING 
      

feature -- Change Element  
 
    set_diff_path (a_name: like diff_path)
        -- Set 'diff_path' with 'a_name'.
      do
        diff_path := a_name
      ensure
        diff_path_set: diff_path = a_name		
      end

    set_service_name (a_name: like service_name)
        -- Set 'service_name' with 'a_name'.
      do
        service_name := a_name
      ensure
        service_name_set: service_name = a_name		
      end

    set_service_user_target (a_name: like service_user_target)
        -- Set 'service_user_target' with 'a_name'.
      do
        service_user_target := a_name
      ensure
        service_user_target_set: service_user_target = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_GRANITE_DISTRIBUTION_CORE_IMPL_DIFF_DIFF_EVENT_LISTENER_PROPERTIES%N")
        if attached diff_path as l_diff_path then
          Result.append ("%Ndiff_path:")
          Result.append (l_diff_path.out)
          Result.append ("%N")    
        end  
        if attached service_name as l_service_name then
          Result.append ("%Nservice_name:")
          Result.append (l_service_name.out)
          Result.append ("%N")    
        end  
        if attached service_user_target as l_service_user_target then
          Result.append ("%Nservice_user_target:")
          Result.append (l_service_user_target.out)
          Result.append ("%N")    
        end  
      end
end

