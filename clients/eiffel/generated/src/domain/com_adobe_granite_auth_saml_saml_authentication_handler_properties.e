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
class COM_ADOBE_GRANITE_AUTH_SAML_SAML_AUTHENTICATION_HANDLER_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    path: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    service_ranking: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    idp_url: detachable CONFIG_NODE_PROPERTY_STRING 
      
    idp_cert_alias: detachable CONFIG_NODE_PROPERTY_STRING 
      
    idp_http_redirect: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    service_provider_entity_id: detachable CONFIG_NODE_PROPERTY_STRING 
      
    assertion_consumer_service_ur_l: detachable CONFIG_NODE_PROPERTY_STRING 
      
    sp_private_key_alias: detachable CONFIG_NODE_PROPERTY_STRING 
      
    key_store_password: detachable CONFIG_NODE_PROPERTY_STRING 
      
    default_redirect_url: detachable CONFIG_NODE_PROPERTY_STRING 
      
    user_id_attribute: detachable CONFIG_NODE_PROPERTY_STRING 
      
    use_encryption: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    create_user: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    user_intermediate_path: detachable CONFIG_NODE_PROPERTY_STRING 
      
    add_group_memberships: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    group_membership_attribute: detachable CONFIG_NODE_PROPERTY_STRING 
      
    default_groups: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    name_id_format: detachable CONFIG_NODE_PROPERTY_STRING 
      
    synchronize_attributes: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    handle_logout: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    logout_url: detachable CONFIG_NODE_PROPERTY_STRING 
      
    clock_tolerance: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    digest_method: detachable CONFIG_NODE_PROPERTY_STRING 
      
    signature_method: detachable CONFIG_NODE_PROPERTY_STRING 
      
    identity_sync_type: detachable CONFIG_NODE_PROPERTY_DROP_DOWN 
      
    idp_identifier: detachable CONFIG_NODE_PROPERTY_STRING 
      

feature -- Change Element  
 
    set_path (a_name: like path)
        -- Set 'path' with 'a_name'.
      do
        path := a_name
      ensure
        path_set: path = a_name		
      end

    set_service_ranking (a_name: like service_ranking)
        -- Set 'service_ranking' with 'a_name'.
      do
        service_ranking := a_name
      ensure
        service_ranking_set: service_ranking = a_name		
      end

    set_idp_url (a_name: like idp_url)
        -- Set 'idp_url' with 'a_name'.
      do
        idp_url := a_name
      ensure
        idp_url_set: idp_url = a_name		
      end

    set_idp_cert_alias (a_name: like idp_cert_alias)
        -- Set 'idp_cert_alias' with 'a_name'.
      do
        idp_cert_alias := a_name
      ensure
        idp_cert_alias_set: idp_cert_alias = a_name		
      end

    set_idp_http_redirect (a_name: like idp_http_redirect)
        -- Set 'idp_http_redirect' with 'a_name'.
      do
        idp_http_redirect := a_name
      ensure
        idp_http_redirect_set: idp_http_redirect = a_name		
      end

    set_service_provider_entity_id (a_name: like service_provider_entity_id)
        -- Set 'service_provider_entity_id' with 'a_name'.
      do
        service_provider_entity_id := a_name
      ensure
        service_provider_entity_id_set: service_provider_entity_id = a_name		
      end

    set_assertion_consumer_service_ur_l (a_name: like assertion_consumer_service_ur_l)
        -- Set 'assertion_consumer_service_ur_l' with 'a_name'.
      do
        assertion_consumer_service_ur_l := a_name
      ensure
        assertion_consumer_service_ur_l_set: assertion_consumer_service_ur_l = a_name		
      end

    set_sp_private_key_alias (a_name: like sp_private_key_alias)
        -- Set 'sp_private_key_alias' with 'a_name'.
      do
        sp_private_key_alias := a_name
      ensure
        sp_private_key_alias_set: sp_private_key_alias = a_name		
      end

    set_key_store_password (a_name: like key_store_password)
        -- Set 'key_store_password' with 'a_name'.
      do
        key_store_password := a_name
      ensure
        key_store_password_set: key_store_password = a_name		
      end

    set_default_redirect_url (a_name: like default_redirect_url)
        -- Set 'default_redirect_url' with 'a_name'.
      do
        default_redirect_url := a_name
      ensure
        default_redirect_url_set: default_redirect_url = a_name		
      end

    set_user_id_attribute (a_name: like user_id_attribute)
        -- Set 'user_id_attribute' with 'a_name'.
      do
        user_id_attribute := a_name
      ensure
        user_id_attribute_set: user_id_attribute = a_name		
      end

    set_use_encryption (a_name: like use_encryption)
        -- Set 'use_encryption' with 'a_name'.
      do
        use_encryption := a_name
      ensure
        use_encryption_set: use_encryption = a_name		
      end

    set_create_user (a_name: like create_user)
        -- Set 'create_user' with 'a_name'.
      do
        create_user := a_name
      ensure
        create_user_set: create_user = a_name		
      end

    set_user_intermediate_path (a_name: like user_intermediate_path)
        -- Set 'user_intermediate_path' with 'a_name'.
      do
        user_intermediate_path := a_name
      ensure
        user_intermediate_path_set: user_intermediate_path = a_name		
      end

    set_add_group_memberships (a_name: like add_group_memberships)
        -- Set 'add_group_memberships' with 'a_name'.
      do
        add_group_memberships := a_name
      ensure
        add_group_memberships_set: add_group_memberships = a_name		
      end

    set_group_membership_attribute (a_name: like group_membership_attribute)
        -- Set 'group_membership_attribute' with 'a_name'.
      do
        group_membership_attribute := a_name
      ensure
        group_membership_attribute_set: group_membership_attribute = a_name		
      end

    set_default_groups (a_name: like default_groups)
        -- Set 'default_groups' with 'a_name'.
      do
        default_groups := a_name
      ensure
        default_groups_set: default_groups = a_name		
      end

    set_name_id_format (a_name: like name_id_format)
        -- Set 'name_id_format' with 'a_name'.
      do
        name_id_format := a_name
      ensure
        name_id_format_set: name_id_format = a_name		
      end

    set_synchronize_attributes (a_name: like synchronize_attributes)
        -- Set 'synchronize_attributes' with 'a_name'.
      do
        synchronize_attributes := a_name
      ensure
        synchronize_attributes_set: synchronize_attributes = a_name		
      end

    set_handle_logout (a_name: like handle_logout)
        -- Set 'handle_logout' with 'a_name'.
      do
        handle_logout := a_name
      ensure
        handle_logout_set: handle_logout = a_name		
      end

    set_logout_url (a_name: like logout_url)
        -- Set 'logout_url' with 'a_name'.
      do
        logout_url := a_name
      ensure
        logout_url_set: logout_url = a_name		
      end

    set_clock_tolerance (a_name: like clock_tolerance)
        -- Set 'clock_tolerance' with 'a_name'.
      do
        clock_tolerance := a_name
      ensure
        clock_tolerance_set: clock_tolerance = a_name		
      end

    set_digest_method (a_name: like digest_method)
        -- Set 'digest_method' with 'a_name'.
      do
        digest_method := a_name
      ensure
        digest_method_set: digest_method = a_name		
      end

    set_signature_method (a_name: like signature_method)
        -- Set 'signature_method' with 'a_name'.
      do
        signature_method := a_name
      ensure
        signature_method_set: signature_method = a_name		
      end

    set_identity_sync_type (a_name: like identity_sync_type)
        -- Set 'identity_sync_type' with 'a_name'.
      do
        identity_sync_type := a_name
      ensure
        identity_sync_type_set: identity_sync_type = a_name		
      end

    set_idp_identifier (a_name: like idp_identifier)
        -- Set 'idp_identifier' with 'a_name'.
      do
        idp_identifier := a_name
      ensure
        idp_identifier_set: idp_identifier = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_GRANITE_AUTH_SAML_SAML_AUTHENTICATION_HANDLER_PROPERTIES%N")
        if attached path as l_path then
          Result.append ("%Npath:")
          Result.append (l_path.out)
          Result.append ("%N")    
        end  
        if attached service_ranking as l_service_ranking then
          Result.append ("%Nservice_ranking:")
          Result.append (l_service_ranking.out)
          Result.append ("%N")    
        end  
        if attached idp_url as l_idp_url then
          Result.append ("%Nidp_url:")
          Result.append (l_idp_url.out)
          Result.append ("%N")    
        end  
        if attached idp_cert_alias as l_idp_cert_alias then
          Result.append ("%Nidp_cert_alias:")
          Result.append (l_idp_cert_alias.out)
          Result.append ("%N")    
        end  
        if attached idp_http_redirect as l_idp_http_redirect then
          Result.append ("%Nidp_http_redirect:")
          Result.append (l_idp_http_redirect.out)
          Result.append ("%N")    
        end  
        if attached service_provider_entity_id as l_service_provider_entity_id then
          Result.append ("%Nservice_provider_entity_id:")
          Result.append (l_service_provider_entity_id.out)
          Result.append ("%N")    
        end  
        if attached assertion_consumer_service_ur_l as l_assertion_consumer_service_ur_l then
          Result.append ("%Nassertion_consumer_service_ur_l:")
          Result.append (l_assertion_consumer_service_ur_l.out)
          Result.append ("%N")    
        end  
        if attached sp_private_key_alias as l_sp_private_key_alias then
          Result.append ("%Nsp_private_key_alias:")
          Result.append (l_sp_private_key_alias.out)
          Result.append ("%N")    
        end  
        if attached key_store_password as l_key_store_password then
          Result.append ("%Nkey_store_password:")
          Result.append (l_key_store_password.out)
          Result.append ("%N")    
        end  
        if attached default_redirect_url as l_default_redirect_url then
          Result.append ("%Ndefault_redirect_url:")
          Result.append (l_default_redirect_url.out)
          Result.append ("%N")    
        end  
        if attached user_id_attribute as l_user_id_attribute then
          Result.append ("%Nuser_id_attribute:")
          Result.append (l_user_id_attribute.out)
          Result.append ("%N")    
        end  
        if attached use_encryption as l_use_encryption then
          Result.append ("%Nuse_encryption:")
          Result.append (l_use_encryption.out)
          Result.append ("%N")    
        end  
        if attached create_user as l_create_user then
          Result.append ("%Ncreate_user:")
          Result.append (l_create_user.out)
          Result.append ("%N")    
        end  
        if attached user_intermediate_path as l_user_intermediate_path then
          Result.append ("%Nuser_intermediate_path:")
          Result.append (l_user_intermediate_path.out)
          Result.append ("%N")    
        end  
        if attached add_group_memberships as l_add_group_memberships then
          Result.append ("%Nadd_group_memberships:")
          Result.append (l_add_group_memberships.out)
          Result.append ("%N")    
        end  
        if attached group_membership_attribute as l_group_membership_attribute then
          Result.append ("%Ngroup_membership_attribute:")
          Result.append (l_group_membership_attribute.out)
          Result.append ("%N")    
        end  
        if attached default_groups as l_default_groups then
          Result.append ("%Ndefault_groups:")
          Result.append (l_default_groups.out)
          Result.append ("%N")    
        end  
        if attached name_id_format as l_name_id_format then
          Result.append ("%Nname_id_format:")
          Result.append (l_name_id_format.out)
          Result.append ("%N")    
        end  
        if attached synchronize_attributes as l_synchronize_attributes then
          Result.append ("%Nsynchronize_attributes:")
          Result.append (l_synchronize_attributes.out)
          Result.append ("%N")    
        end  
        if attached handle_logout as l_handle_logout then
          Result.append ("%Nhandle_logout:")
          Result.append (l_handle_logout.out)
          Result.append ("%N")    
        end  
        if attached logout_url as l_logout_url then
          Result.append ("%Nlogout_url:")
          Result.append (l_logout_url.out)
          Result.append ("%N")    
        end  
        if attached clock_tolerance as l_clock_tolerance then
          Result.append ("%Nclock_tolerance:")
          Result.append (l_clock_tolerance.out)
          Result.append ("%N")    
        end  
        if attached digest_method as l_digest_method then
          Result.append ("%Ndigest_method:")
          Result.append (l_digest_method.out)
          Result.append ("%N")    
        end  
        if attached signature_method as l_signature_method then
          Result.append ("%Nsignature_method:")
          Result.append (l_signature_method.out)
          Result.append ("%N")    
        end  
        if attached identity_sync_type as l_identity_sync_type then
          Result.append ("%Nidentity_sync_type:")
          Result.append (l_identity_sync_type.out)
          Result.append ("%N")    
        end  
        if attached idp_identifier as l_idp_identifier then
          Result.append ("%Nidp_identifier:")
          Result.append (l_idp_identifier.out)
          Result.append ("%N")    
        end  
      end
end

