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
class COM_ADOBE_GRANITE_AUTH_OAUTH_IMPL_BEARER_AUTHENTICATION_HANDLER_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    path: detachable CONFIG_NODE_PROPERTY_STRING 
      
    oauth_client_ids_allowed: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    auth_bearer_sync_ims: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    auth_token_request_parameter: detachable CONFIG_NODE_PROPERTY_STRING 
      
    oauth_bearer_configid: detachable CONFIG_NODE_PROPERTY_STRING 
      
    oauth_jwt_support: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      

feature -- Change Element  
 
    set_path (a_name: like path)
        -- Set 'path' with 'a_name'.
      do
        path := a_name
      ensure
        path_set: path = a_name		
      end

    set_oauth_client_ids_allowed (a_name: like oauth_client_ids_allowed)
        -- Set 'oauth_client_ids_allowed' with 'a_name'.
      do
        oauth_client_ids_allowed := a_name
      ensure
        oauth_client_ids_allowed_set: oauth_client_ids_allowed = a_name		
      end

    set_auth_bearer_sync_ims (a_name: like auth_bearer_sync_ims)
        -- Set 'auth_bearer_sync_ims' with 'a_name'.
      do
        auth_bearer_sync_ims := a_name
      ensure
        auth_bearer_sync_ims_set: auth_bearer_sync_ims = a_name		
      end

    set_auth_token_request_parameter (a_name: like auth_token_request_parameter)
        -- Set 'auth_token_request_parameter' with 'a_name'.
      do
        auth_token_request_parameter := a_name
      ensure
        auth_token_request_parameter_set: auth_token_request_parameter = a_name		
      end

    set_oauth_bearer_configid (a_name: like oauth_bearer_configid)
        -- Set 'oauth_bearer_configid' with 'a_name'.
      do
        oauth_bearer_configid := a_name
      ensure
        oauth_bearer_configid_set: oauth_bearer_configid = a_name		
      end

    set_oauth_jwt_support (a_name: like oauth_jwt_support)
        -- Set 'oauth_jwt_support' with 'a_name'.
      do
        oauth_jwt_support := a_name
      ensure
        oauth_jwt_support_set: oauth_jwt_support = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_GRANITE_AUTH_OAUTH_IMPL_BEARER_AUTHENTICATION_HANDLER_PROPERTIES%N")
        if attached path as l_path then
          Result.append ("%Npath:")
          Result.append (l_path.out)
          Result.append ("%N")    
        end  
        if attached oauth_client_ids_allowed as l_oauth_client_ids_allowed then
          Result.append ("%Noauth_client_ids_allowed:")
          Result.append (l_oauth_client_ids_allowed.out)
          Result.append ("%N")    
        end  
        if attached auth_bearer_sync_ims as l_auth_bearer_sync_ims then
          Result.append ("%Nauth_bearer_sync_ims:")
          Result.append (l_auth_bearer_sync_ims.out)
          Result.append ("%N")    
        end  
        if attached auth_token_request_parameter as l_auth_token_request_parameter then
          Result.append ("%Nauth_token_request_parameter:")
          Result.append (l_auth_token_request_parameter.out)
          Result.append ("%N")    
        end  
        if attached oauth_bearer_configid as l_oauth_bearer_configid then
          Result.append ("%Noauth_bearer_configid:")
          Result.append (l_oauth_bearer_configid.out)
          Result.append ("%N")    
        end  
        if attached oauth_jwt_support as l_oauth_jwt_support then
          Result.append ("%Noauth_jwt_support:")
          Result.append (l_oauth_jwt_support.out)
          Result.append ("%N")    
        end  
      end
end

