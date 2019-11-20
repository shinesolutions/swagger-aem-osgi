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
class COM_ADOBE_CQ_SOCIAL_MEMBERS_IMPL_COMMUNITY_MEMBER_GROUP_PROFILE_COMPONENT_F_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    everyone_limit: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    priority: detachable CONFIG_NODE_PROPERTY_INTEGER 
      

feature -- Change Element  
 
    set_everyone_limit (a_name: like everyone_limit)
        -- Set 'everyone_limit' with 'a_name'.
      do
        everyone_limit := a_name
      ensure
        everyone_limit_set: everyone_limit = a_name		
      end

    set_priority (a_name: like priority)
        -- Set 'priority' with 'a_name'.
      do
        priority := a_name
      ensure
        priority_set: priority = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_CQ_SOCIAL_MEMBERS_IMPL_COMMUNITY_MEMBER_GROUP_PROFILE_COMPONENT_F_PROPERTIES%N")
        if attached everyone_limit as l_everyone_limit then
          Result.append ("%Neveryone_limit:")
          Result.append (l_everyone_limit.out)
          Result.append ("%N")    
        end  
        if attached priority as l_priority then
          Result.append ("%Npriority:")
          Result.append (l_priority.out)
          Result.append ("%N")    
        end  
      end
end

