#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties.h"



static com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_create_internal(
    config_node_property_string_t *scene7_flash_templates_rti,
    config_node_property_string_t *scene7_flash_templates_rsi,
    config_node_property_string_t *scene7_flash_templates_rb,
    config_node_property_string_t *scene7_flash_templates_rurl,
    config_node_property_string_t *scene7_flash_template_url_format_parameter
    ) {
    com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_local_var = malloc(sizeof(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t));
    if (!com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_local_var, 0, sizeof(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t));
    com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_local_var->_library_owned = 1;
    com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_local_var->scene7_flash_templates_rti = scene7_flash_templates_rti;
    com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_local_var->scene7_flash_templates_rsi = scene7_flash_templates_rsi;
    com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_local_var->scene7_flash_templates_rb = scene7_flash_templates_rb;
    com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_local_var->scene7_flash_templates_rurl = scene7_flash_templates_rurl;
    com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_local_var->scene7_flash_template_url_format_parameter = scene7_flash_template_url_format_parameter;
    return com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_create(
    config_node_property_string_t *scene7_flash_templates_rti,
    config_node_property_string_t *scene7_flash_templates_rsi,
    config_node_property_string_t *scene7_flash_templates_rb,
    config_node_property_string_t *scene7_flash_templates_rurl,
    config_node_property_string_t *scene7_flash_template_url_format_parameter
    ) {
    com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t *result = com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_create_internal (
        scene7_flash_templates_rti,
        scene7_flash_templates_rsi,
        scene7_flash_templates_rb,
        scene7_flash_templates_rurl,
        scene7_flash_template_url_format_parameter
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_free(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties) {
    if(NULL == com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties){
        return ;
    }
    if(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rti) {
        config_node_property_string_free(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rti);
        com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rti = NULL;
    }
    if (com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rsi) {
        config_node_property_string_free(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rsi);
        com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rsi = NULL;
    }
    if (com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rb) {
        config_node_property_string_free(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rb);
        com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rb = NULL;
    }
    if (com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rurl) {
        config_node_property_string_free(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rurl);
        com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rurl = NULL;
    }
    if (com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_template_url_format_parameter) {
        config_node_property_string_free(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_template_url_format_parameter);
        com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_template_url_format_parameter = NULL;
    }
    free(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties);
}

cJSON *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_convertToJSON(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rti
    if(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rti) {
    cJSON *scene7_flash_templates_rti_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rti);
    if(scene7_flash_templates_rti_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scene7FlashTemplates.rti", scene7_flash_templates_rti_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rsi
    if(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rsi) {
    cJSON *scene7_flash_templates_rsi_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rsi);
    if(scene7_flash_templates_rsi_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scene7FlashTemplates.rsi", scene7_flash_templates_rsi_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rb
    if(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rb) {
    cJSON *scene7_flash_templates_rb_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rb);
    if(scene7_flash_templates_rb_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scene7FlashTemplates.rb", scene7_flash_templates_rb_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rurl
    if(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rurl) {
    cJSON *scene7_flash_templates_rurl_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rurl);
    if(scene7_flash_templates_rurl_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scene7FlashTemplates.rurl", scene7_flash_templates_rurl_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_template_url_format_parameter
    if(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_template_url_format_parameter) {
    cJSON *scene7_flash_template_url_format_parameter_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_template_url_format_parameter);
    if(scene7_flash_template_url_format_parameter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scene7FlashTemplate.urlFormatParameter", scene7_flash_template_url_format_parameter_local_JSON);
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

com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_propertiesJSON){

    com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rti
    config_node_property_string_t *scene7_flash_templates_rti_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rsi
    config_node_property_string_t *scene7_flash_templates_rsi_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rb
    config_node_property_string_t *scene7_flash_templates_rb_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rurl
    config_node_property_string_t *scene7_flash_templates_rurl_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_template_url_format_parameter
    config_node_property_string_t *scene7_flash_template_url_format_parameter_local_nonprim = NULL;

    // com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rti
    cJSON *scene7_flash_templates_rti = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_propertiesJSON, "scene7FlashTemplates.rti");
    if (cJSON_IsNull(scene7_flash_templates_rti)) {
        scene7_flash_templates_rti = NULL;
    }
    if (scene7_flash_templates_rti) { 
    scene7_flash_templates_rti_local_nonprim = config_node_property_string_parseFromJSON(scene7_flash_templates_rti); //nonprimitive
    }

    // com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rsi
    cJSON *scene7_flash_templates_rsi = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_propertiesJSON, "scene7FlashTemplates.rsi");
    if (cJSON_IsNull(scene7_flash_templates_rsi)) {
        scene7_flash_templates_rsi = NULL;
    }
    if (scene7_flash_templates_rsi) { 
    scene7_flash_templates_rsi_local_nonprim = config_node_property_string_parseFromJSON(scene7_flash_templates_rsi); //nonprimitive
    }

    // com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rb
    cJSON *scene7_flash_templates_rb = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_propertiesJSON, "scene7FlashTemplates.rb");
    if (cJSON_IsNull(scene7_flash_templates_rb)) {
        scene7_flash_templates_rb = NULL;
    }
    if (scene7_flash_templates_rb) { 
    scene7_flash_templates_rb_local_nonprim = config_node_property_string_parseFromJSON(scene7_flash_templates_rb); //nonprimitive
    }

    // com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_templates_rurl
    cJSON *scene7_flash_templates_rurl = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_propertiesJSON, "scene7FlashTemplates.rurl");
    if (cJSON_IsNull(scene7_flash_templates_rurl)) {
        scene7_flash_templates_rurl = NULL;
    }
    if (scene7_flash_templates_rurl) { 
    scene7_flash_templates_rurl_local_nonprim = config_node_property_string_parseFromJSON(scene7_flash_templates_rurl); //nonprimitive
    }

    // com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties->scene7_flash_template_url_format_parameter
    cJSON *scene7_flash_template_url_format_parameter = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_propertiesJSON, "scene7FlashTemplate.urlFormatParameter");
    if (cJSON_IsNull(scene7_flash_template_url_format_parameter)) {
        scene7_flash_template_url_format_parameter = NULL;
    }
    if (scene7_flash_template_url_format_parameter) { 
    scene7_flash_template_url_format_parameter_local_nonprim = config_node_property_string_parseFromJSON(scene7_flash_template_url_format_parameter); //nonprimitive
    }



    com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_local_var = com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_create_internal (
        scene7_flash_templates_rti ? scene7_flash_templates_rti_local_nonprim : NULL,
        scene7_flash_templates_rsi ? scene7_flash_templates_rsi_local_nonprim : NULL,
        scene7_flash_templates_rb ? scene7_flash_templates_rb_local_nonprim : NULL,
        scene7_flash_templates_rurl ? scene7_flash_templates_rurl_local_nonprim : NULL,
        scene7_flash_template_url_format_parameter ? scene7_flash_template_url_format_parameter_local_nonprim : NULL
        );

    if (!com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties_local_var;
end:
    if (scene7_flash_templates_rti_local_nonprim) {
        config_node_property_string_free(scene7_flash_templates_rti_local_nonprim);
        scene7_flash_templates_rti_local_nonprim = NULL;
    }
    if (scene7_flash_templates_rsi_local_nonprim) {
        config_node_property_string_free(scene7_flash_templates_rsi_local_nonprim);
        scene7_flash_templates_rsi_local_nonprim = NULL;
    }
    if (scene7_flash_templates_rb_local_nonprim) {
        config_node_property_string_free(scene7_flash_templates_rb_local_nonprim);
        scene7_flash_templates_rb_local_nonprim = NULL;
    }
    if (scene7_flash_templates_rurl_local_nonprim) {
        config_node_property_string_free(scene7_flash_templates_rurl_local_nonprim);
        scene7_flash_templates_rurl_local_nonprim = NULL;
    }
    if (scene7_flash_template_url_format_parameter_local_nonprim) {
        config_node_property_string_free(scene7_flash_template_url_format_parameter_local_nonprim);
        scene7_flash_template_url_format_parameter_local_nonprim = NULL;
    }
    return NULL;

}
