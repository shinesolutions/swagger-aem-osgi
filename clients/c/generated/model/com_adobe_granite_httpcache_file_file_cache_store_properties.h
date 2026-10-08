/*
 * com_adobe_granite_httpcache_file_file_cache_store_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_httpcache_file_file_cache_store_properties_H_
#define _com_adobe_granite_httpcache_file_file_cache_store_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_httpcache_file_file_cache_store_properties_t com_adobe_granite_httpcache_file_file_cache_store_properties_t;

#include "config_node_property_string.h"



typedef struct com_adobe_granite_httpcache_file_file_cache_store_properties_t {
    struct config_node_property_string_t *com_adobe_granite_httpcache_file_document_root; //model
    struct config_node_property_string_t *com_adobe_granite_httpcache_file_include_host; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_httpcache_file_file_cache_store_properties_t;

__attribute__((deprecated)) com_adobe_granite_httpcache_file_file_cache_store_properties_t *com_adobe_granite_httpcache_file_file_cache_store_properties_create(
    config_node_property_string_t *com_adobe_granite_httpcache_file_document_root,
    config_node_property_string_t *com_adobe_granite_httpcache_file_include_host
);

void com_adobe_granite_httpcache_file_file_cache_store_properties_free(com_adobe_granite_httpcache_file_file_cache_store_properties_t *com_adobe_granite_httpcache_file_file_cache_store_properties);

com_adobe_granite_httpcache_file_file_cache_store_properties_t *com_adobe_granite_httpcache_file_file_cache_store_properties_parseFromJSON(cJSON *com_adobe_granite_httpcache_file_file_cache_store_propertiesJSON);

cJSON *com_adobe_granite_httpcache_file_file_cache_store_properties_convertToJSON(com_adobe_granite_httpcache_file_file_cache_store_properties_t *com_adobe_granite_httpcache_file_file_cache_store_properties);

#endif /* _com_adobe_granite_httpcache_file_file_cache_store_properties_H_ */

