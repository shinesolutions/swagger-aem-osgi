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
class ORG_APACHE_SLING_SECURITY_IMPL_REFERRER_FILTER_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    allow_empty: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    allow_hosts: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    allow_hosts_regexp: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    filter_methods: detachable CONFIG_NODE_PROPERTY_ARRAY 
      
    exclude_agents_regexp: detachable CONFIG_NODE_PROPERTY_ARRAY 
      

feature -- Change Element  
 
    set_allow_empty (a_name: like allow_empty)
        -- Set 'allow_empty' with 'a_name'.
      do
        allow_empty := a_name
      ensure
        allow_empty_set: allow_empty = a_name		
      end

    set_allow_hosts (a_name: like allow_hosts)
        -- Set 'allow_hosts' with 'a_name'.
      do
        allow_hosts := a_name
      ensure
        allow_hosts_set: allow_hosts = a_name		
      end

    set_allow_hosts_regexp (a_name: like allow_hosts_regexp)
        -- Set 'allow_hosts_regexp' with 'a_name'.
      do
        allow_hosts_regexp := a_name
      ensure
        allow_hosts_regexp_set: allow_hosts_regexp = a_name		
      end

    set_filter_methods (a_name: like filter_methods)
        -- Set 'filter_methods' with 'a_name'.
      do
        filter_methods := a_name
      ensure
        filter_methods_set: filter_methods = a_name		
      end

    set_exclude_agents_regexp (a_name: like exclude_agents_regexp)
        -- Set 'exclude_agents_regexp' with 'a_name'.
      do
        exclude_agents_regexp := a_name
      ensure
        exclude_agents_regexp_set: exclude_agents_regexp = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ORG_APACHE_SLING_SECURITY_IMPL_REFERRER_FILTER_PROPERTIES%N")
        if attached allow_empty as l_allow_empty then
          Result.append ("%Nallow_empty:")
          Result.append (l_allow_empty.out)
          Result.append ("%N")    
        end  
        if attached allow_hosts as l_allow_hosts then
          Result.append ("%Nallow_hosts:")
          Result.append (l_allow_hosts.out)
          Result.append ("%N")    
        end  
        if attached allow_hosts_regexp as l_allow_hosts_regexp then
          Result.append ("%Nallow_hosts_regexp:")
          Result.append (l_allow_hosts_regexp.out)
          Result.append ("%N")    
        end  
        if attached filter_methods as l_filter_methods then
          Result.append ("%Nfilter_methods:")
          Result.append (l_filter_methods.out)
          Result.append ("%N")    
        end  
        if attached exclude_agents_regexp as l_exclude_agents_regexp then
          Result.append ("%Nexclude_agents_regexp:")
          Result.append (l_exclude_agents_regexp.out)
          Result.append ("%N")    
        end  
      end
end

