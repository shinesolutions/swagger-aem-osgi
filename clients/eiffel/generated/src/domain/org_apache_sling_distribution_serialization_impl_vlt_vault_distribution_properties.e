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
class ORG_APACHE_SLING_DISTRIBUTION_SERIALIZATION_IMPL_VLT_VAULT_DISTRIBUTION_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    name: detachable CONFIG_NODE_PROPERTY_STRING 
      
    type: detachable CONFIG_NODE_PROPERTY_DROP_DOWN 
      
    import_mode: detachable CONFIG_NODE_PROPERTY_STRING 
      
    acl_handling: detachable CONFIG_NODE_PROPERTY_STRING 
      
    package_roots: detachable CONFIG_NODE_PROPERTY_STRING 
      
    package_filters: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    property_filters: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    temp_fs_folder: detachable CONFIG_NODE_PROPERTY_STRING 
      
    use_binary_references: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    auto_save_threshold: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    cleanup_delay: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    file_threshold: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    MEGA_BYTES: detachable CONFIG_NODE_PROPERTY_DROP_DOWN 
      
    use_off_heap_memory: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    digest_algorithm: detachable CONFIG_NODE_PROPERTY_DROP_DOWN 
      
    monitoring_queue_size: detachable CONFIG_NODE_PROPERTY_INTEGER 
      
    paths_mapping: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    strict_import: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      

feature -- Change Element  
 
    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name		
      end

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name		
      end

    set_import_mode (a_name: like import_mode)
        -- Set 'import_mode' with 'a_name'.
      do
        import_mode := a_name
      ensure
        import_mode_set: import_mode = a_name		
      end

    set_acl_handling (a_name: like acl_handling)
        -- Set 'acl_handling' with 'a_name'.
      do
        acl_handling := a_name
      ensure
        acl_handling_set: acl_handling = a_name		
      end

    set_package_roots (a_name: like package_roots)
        -- Set 'package_roots' with 'a_name'.
      do
        package_roots := a_name
      ensure
        package_roots_set: package_roots = a_name		
      end

    set_package_filters (a_name: like package_filters)
        -- Set 'package_filters' with 'a_name'.
      do
        package_filters := a_name
      ensure
        package_filters_set: package_filters = a_name		
      end

    set_property_filters (a_name: like property_filters)
        -- Set 'property_filters' with 'a_name'.
      do
        property_filters := a_name
      ensure
        property_filters_set: property_filters = a_name		
      end

    set_temp_fs_folder (a_name: like temp_fs_folder)
        -- Set 'temp_fs_folder' with 'a_name'.
      do
        temp_fs_folder := a_name
      ensure
        temp_fs_folder_set: temp_fs_folder = a_name		
      end

    set_use_binary_references (a_name: like use_binary_references)
        -- Set 'use_binary_references' with 'a_name'.
      do
        use_binary_references := a_name
      ensure
        use_binary_references_set: use_binary_references = a_name		
      end

    set_auto_save_threshold (a_name: like auto_save_threshold)
        -- Set 'auto_save_threshold' with 'a_name'.
      do
        auto_save_threshold := a_name
      ensure
        auto_save_threshold_set: auto_save_threshold = a_name		
      end

    set_cleanup_delay (a_name: like cleanup_delay)
        -- Set 'cleanup_delay' with 'a_name'.
      do
        cleanup_delay := a_name
      ensure
        cleanup_delay_set: cleanup_delay = a_name		
      end

    set_file_threshold (a_name: like file_threshold)
        -- Set 'file_threshold' with 'a_name'.
      do
        file_threshold := a_name
      ensure
        file_threshold_set: file_threshold = a_name		
      end

    set_MEGA_BYTES (a_name: like MEGA_BYTES)
        -- Set 'MEGA_BYTES' with 'a_name'.
      do
        MEGA_BYTES := a_name
      ensure
        MEGA_BYTES_set: MEGA_BYTES = a_name		
      end

    set_use_off_heap_memory (a_name: like use_off_heap_memory)
        -- Set 'use_off_heap_memory' with 'a_name'.
      do
        use_off_heap_memory := a_name
      ensure
        use_off_heap_memory_set: use_off_heap_memory = a_name		
      end

    set_digest_algorithm (a_name: like digest_algorithm)
        -- Set 'digest_algorithm' with 'a_name'.
      do
        digest_algorithm := a_name
      ensure
        digest_algorithm_set: digest_algorithm = a_name		
      end

    set_monitoring_queue_size (a_name: like monitoring_queue_size)
        -- Set 'monitoring_queue_size' with 'a_name'.
      do
        monitoring_queue_size := a_name
      ensure
        monitoring_queue_size_set: monitoring_queue_size = a_name		
      end

    set_paths_mapping (a_name: like paths_mapping)
        -- Set 'paths_mapping' with 'a_name'.
      do
        paths_mapping := a_name
      ensure
        paths_mapping_set: paths_mapping = a_name		
      end

    set_strict_import (a_name: like strict_import)
        -- Set 'strict_import' with 'a_name'.
      do
        strict_import := a_name
      ensure
        strict_import_set: strict_import = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ORG_APACHE_SLING_DISTRIBUTION_SERIALIZATION_IMPL_VLT_VAULT_DISTRIBUTION_PROPERTIES%N")
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")    
        end  
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")    
        end  
        if attached import_mode as l_import_mode then
          Result.append ("%Nimport_mode:")
          Result.append (l_import_mode.out)
          Result.append ("%N")    
        end  
        if attached acl_handling as l_acl_handling then
          Result.append ("%Nacl_handling:")
          Result.append (l_acl_handling.out)
          Result.append ("%N")    
        end  
        if attached package_roots as l_package_roots then
          Result.append ("%Npackage_roots:")
          Result.append (l_package_roots.out)
          Result.append ("%N")    
        end  
        if attached package_filters as l_package_filters then
          Result.append ("%Npackage_filters:")
          Result.append (l_package_filters.out)
          Result.append ("%N")    
        end  
        if attached property_filters as l_property_filters then
          Result.append ("%Nproperty_filters:")
          Result.append (l_property_filters.out)
          Result.append ("%N")    
        end  
        if attached temp_fs_folder as l_temp_fs_folder then
          Result.append ("%Ntemp_fs_folder:")
          Result.append (l_temp_fs_folder.out)
          Result.append ("%N")    
        end  
        if attached use_binary_references as l_use_binary_references then
          Result.append ("%Nuse_binary_references:")
          Result.append (l_use_binary_references.out)
          Result.append ("%N")    
        end  
        if attached auto_save_threshold as l_auto_save_threshold then
          Result.append ("%Nauto_save_threshold:")
          Result.append (l_auto_save_threshold.out)
          Result.append ("%N")    
        end  
        if attached cleanup_delay as l_cleanup_delay then
          Result.append ("%Ncleanup_delay:")
          Result.append (l_cleanup_delay.out)
          Result.append ("%N")    
        end  
        if attached file_threshold as l_file_threshold then
          Result.append ("%Nfile_threshold:")
          Result.append (l_file_threshold.out)
          Result.append ("%N")    
        end  
        if attached MEGA_BYTES as l_MEGA_BYTES then
          Result.append ("%NMEGA_BYTES:")
          Result.append (l_MEGA_BYTES.out)
          Result.append ("%N")    
        end  
        if attached use_off_heap_memory as l_use_off_heap_memory then
          Result.append ("%Nuse_off_heap_memory:")
          Result.append (l_use_off_heap_memory.out)
          Result.append ("%N")    
        end  
        if attached digest_algorithm as l_digest_algorithm then
          Result.append ("%Ndigest_algorithm:")
          Result.append (l_digest_algorithm.out)
          Result.append ("%N")    
        end  
        if attached monitoring_queue_size as l_monitoring_queue_size then
          Result.append ("%Nmonitoring_queue_size:")
          Result.append (l_monitoring_queue_size.out)
          Result.append ("%N")    
        end  
        if attached paths_mapping as l_paths_mapping then
          Result.append ("%Npaths_mapping:")
          Result.append (l_paths_mapping.out)
          Result.append ("%N")    
        end  
        if attached strict_import as l_strict_import then
          Result.append ("%Nstrict_import:")
          Result.append (l_strict_import.out)
          Result.append ("%N")    
        end  
      end
end

