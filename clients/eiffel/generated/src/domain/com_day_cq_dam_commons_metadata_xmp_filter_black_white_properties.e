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
class COM_DAY_CQ_DAM_COMMONS_METADATA_XMP_FILTER_BLACK_WHITE_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    xmp_filter_apply_whitelist: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    xmp_filter_whitelist: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    xmp_filter_apply_blacklist: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    xmp_filter_blacklist: detachable CONFIG_NODE_PROPERTY_ARRAY 
      

feature -- Change Element  
 
    set_xmp_filter_apply_whitelist (a_name: like xmp_filter_apply_whitelist)
        -- Set 'xmp_filter_apply_whitelist' with 'a_name'.
      do
        xmp_filter_apply_whitelist := a_name
      ensure
        xmp_filter_apply_whitelist_set: xmp_filter_apply_whitelist = a_name		
      end

    set_xmp_filter_whitelist (a_name: like xmp_filter_whitelist)
        -- Set 'xmp_filter_whitelist' with 'a_name'.
      do
        xmp_filter_whitelist := a_name
      ensure
        xmp_filter_whitelist_set: xmp_filter_whitelist = a_name		
      end

    set_xmp_filter_apply_blacklist (a_name: like xmp_filter_apply_blacklist)
        -- Set 'xmp_filter_apply_blacklist' with 'a_name'.
      do
        xmp_filter_apply_blacklist := a_name
      ensure
        xmp_filter_apply_blacklist_set: xmp_filter_apply_blacklist = a_name		
      end

    set_xmp_filter_blacklist (a_name: like xmp_filter_blacklist)
        -- Set 'xmp_filter_blacklist' with 'a_name'.
      do
        xmp_filter_blacklist := a_name
      ensure
        xmp_filter_blacklist_set: xmp_filter_blacklist = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_DAY_CQ_DAM_COMMONS_METADATA_XMP_FILTER_BLACK_WHITE_PROPERTIES%N")
        if attached xmp_filter_apply_whitelist as l_xmp_filter_apply_whitelist then
          Result.append ("%Nxmp_filter_apply_whitelist:")
          Result.append (l_xmp_filter_apply_whitelist.out)
          Result.append ("%N")    
        end  
        if attached xmp_filter_whitelist as l_xmp_filter_whitelist then
          Result.append ("%Nxmp_filter_whitelist:")
          Result.append (l_xmp_filter_whitelist.out)
          Result.append ("%N")    
        end  
        if attached xmp_filter_apply_blacklist as l_xmp_filter_apply_blacklist then
          Result.append ("%Nxmp_filter_apply_blacklist:")
          Result.append (l_xmp_filter_apply_blacklist.out)
          Result.append ("%N")    
        end  
        if attached xmp_filter_blacklist as l_xmp_filter_blacklist then
          Result.append ("%Nxmp_filter_blacklist:")
          Result.append (l_xmp_filter_blacklist.out)
          Result.append ("%N")    
        end  
      end
end

