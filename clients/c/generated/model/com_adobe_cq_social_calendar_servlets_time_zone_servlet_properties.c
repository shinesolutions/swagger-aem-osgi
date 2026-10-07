#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties.h"



static com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_t *com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_create_internal(
    config_node_property_integer_t *timezones_expirytime
    ) {
    com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_t *com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_local_var = malloc(sizeof(com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_t));
    if (!com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_local_var, 0, sizeof(com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_t));
    com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_local_var->timezones_expirytime = timezones_expirytime;
    return com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_t *com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_create(
    config_node_property_integer_t *timezones_expirytime
    ) {
    com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_t *result = com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_create_internal (
        timezones_expirytime
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_free(com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_t *com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties) {
    if(NULL == com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties){
        return ;
    }
    if(com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties->timezones_expirytime) {
        config_node_property_integer_free(com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties->timezones_expirytime);
        com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties->timezones_expirytime = NULL;
    }
    free(com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties);
}

cJSON *com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_convertToJSON(com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_t *com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties->timezones_expirytime
    if(com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties->timezones_expirytime) {
    cJSON *timezones_expirytime_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties->timezones_expirytime);
    if(timezones_expirytime_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "timezones.expirytime", timezones_expirytime_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_t *com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_parseFromJSON(cJSON *com_adobe_cq_social_calendar_servlets_time_zone_servlet_propertiesJSON){

    com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_t *com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties->timezones_expirytime
    config_node_property_integer_t *timezones_expirytime_local_nonprim = NULL;

    // com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties->timezones_expirytime
    cJSON *timezones_expirytime = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_calendar_servlets_time_zone_servlet_propertiesJSON, "timezones.expirytime");
    if (cJSON_IsNull(timezones_expirytime)) {
        timezones_expirytime = NULL;
    }
    if (timezones_expirytime) { 
    timezones_expirytime_local_nonprim = config_node_property_integer_parseFromJSON(timezones_expirytime); //nonprimitive
    }



    com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_local_var = com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_create_internal (
        timezones_expirytime ? timezones_expirytime_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties_local_var;
end:
    if (timezones_expirytime_local_nonprim) {
        config_node_property_integer_free(timezones_expirytime_local_nonprim);
        timezones_expirytime_local_nonprim = NULL;
    }
    return NULL;

}
