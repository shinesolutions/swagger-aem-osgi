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
class COM_ADOBE_GRANITE_AUTH_IMS_IMPL_IMS_ACCESS_TOKEN_REQUEST_CUSTOMIZER_IMPL_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    auth_ims_client_secret: detachable CONFIG_NODE_PROPERTY_STRING 
      
    customizer_type: detachable CONFIG_NODE_PROPERTY_STRING 
      

feature -- Change Element  
 
    set_auth_ims_client_secret (a_name: like auth_ims_client_secret)
        -- Set 'auth_ims_client_secret' with 'a_name'.
      do
        auth_ims_client_secret := a_name
      ensure
        auth_ims_client_secret_set: auth_ims_client_secret = a_name		
      end

    set_customizer_type (a_name: like customizer_type)
        -- Set 'customizer_type' with 'a_name'.
      do
        customizer_type := a_name
      ensure
        customizer_type_set: customizer_type = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_GRANITE_AUTH_IMS_IMPL_IMS_ACCESS_TOKEN_REQUEST_CUSTOMIZER_IMPL_PROPERTIES%N")
        if attached auth_ims_client_secret as l_auth_ims_client_secret then
          Result.append ("%Nauth_ims_client_secret:")
          Result.append (l_auth_ims_client_secret.out)
          Result.append ("%N")    
        end  
        if attached customizer_type as l_customizer_type then
          Result.append ("%Ncustomizer_type:")
          Result.append (l_customizer_type.out)
          Result.append ("%N")    
        end  
      end
end

