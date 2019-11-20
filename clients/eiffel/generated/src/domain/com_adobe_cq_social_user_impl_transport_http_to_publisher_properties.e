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
class COM_ADOBE_CQ_SOCIAL_USER_IMPL_TRANSPORT_HTTP_TO_PUBLISHER_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    enable: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    agent_configuration: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    context_path: detachable CONFIG_NODE_PROPERTY_STRING 
      
    disabled_cipher_suites: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    enabled_cipher_suites: detachable CONFIG_NODE_PROPERTY_ARRAY 
      

feature -- Change Element  
 
    set_enable (a_name: like enable)
        -- Set 'enable' with 'a_name'.
      do
        enable := a_name
      ensure
        enable_set: enable = a_name		
      end

    set_agent_configuration (a_name: like agent_configuration)
        -- Set 'agent_configuration' with 'a_name'.
      do
        agent_configuration := a_name
      ensure
        agent_configuration_set: agent_configuration = a_name		
      end

    set_context_path (a_name: like context_path)
        -- Set 'context_path' with 'a_name'.
      do
        context_path := a_name
      ensure
        context_path_set: context_path = a_name		
      end

    set_disabled_cipher_suites (a_name: like disabled_cipher_suites)
        -- Set 'disabled_cipher_suites' with 'a_name'.
      do
        disabled_cipher_suites := a_name
      ensure
        disabled_cipher_suites_set: disabled_cipher_suites = a_name		
      end

    set_enabled_cipher_suites (a_name: like enabled_cipher_suites)
        -- Set 'enabled_cipher_suites' with 'a_name'.
      do
        enabled_cipher_suites := a_name
      ensure
        enabled_cipher_suites_set: enabled_cipher_suites = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_CQ_SOCIAL_USER_IMPL_TRANSPORT_HTTP_TO_PUBLISHER_PROPERTIES%N")
        if attached enable as l_enable then
          Result.append ("%Nenable:")
          Result.append (l_enable.out)
          Result.append ("%N")    
        end  
        if attached agent_configuration as l_agent_configuration then
          Result.append ("%Nagent_configuration:")
          Result.append (l_agent_configuration.out)
          Result.append ("%N")    
        end  
        if attached context_path as l_context_path then
          Result.append ("%Ncontext_path:")
          Result.append (l_context_path.out)
          Result.append ("%N")    
        end  
        if attached disabled_cipher_suites as l_disabled_cipher_suites then
          Result.append ("%Ndisabled_cipher_suites:")
          Result.append (l_disabled_cipher_suites.out)
          Result.append ("%N")    
        end  
        if attached enabled_cipher_suites as l_enabled_cipher_suites then
          Result.append ("%Nenabled_cipher_suites:")
          Result.append (l_enabled_cipher_suites.out)
          Result.append ("%N")    
        end  
      end
end

