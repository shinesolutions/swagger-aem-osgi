/*
 * com_day_cq_wcm_msm_impl_rollout_manager_impl_info.h
 *
 * 
 */

#ifndef _com_day_cq_wcm_msm_impl_rollout_manager_impl_info_H_
#define _com_day_cq_wcm_msm_impl_rollout_manager_impl_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_day_cq_wcm_msm_impl_rollout_manager_impl_info_t com_day_cq_wcm_msm_impl_rollout_manager_impl_info_t;

#include "com_day_cq_wcm_msm_impl_rollout_manager_impl_properties.h"



typedef struct com_day_cq_wcm_msm_impl_rollout_manager_impl_info_t {
    char *pid; // string
    char *title; // string
    char *description; // string
    struct com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_t *properties; //model
    char *additional_properties; // string
    char *bundle_location; // string
    char *service_location; // string

    int _library_owned; // Is the library responsible for freeing this object?
} com_day_cq_wcm_msm_impl_rollout_manager_impl_info_t;

__attribute__((deprecated)) com_day_cq_wcm_msm_impl_rollout_manager_impl_info_t *com_day_cq_wcm_msm_impl_rollout_manager_impl_info_create(
    char *pid,
    char *title,
    char *description,
    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_t *properties,
    char *additional_properties,
    char *bundle_location,
    char *service_location
);

void com_day_cq_wcm_msm_impl_rollout_manager_impl_info_free(com_day_cq_wcm_msm_impl_rollout_manager_impl_info_t *com_day_cq_wcm_msm_impl_rollout_manager_impl_info);

com_day_cq_wcm_msm_impl_rollout_manager_impl_info_t *com_day_cq_wcm_msm_impl_rollout_manager_impl_info_parseFromJSON(cJSON *com_day_cq_wcm_msm_impl_rollout_manager_impl_infoJSON);

cJSON *com_day_cq_wcm_msm_impl_rollout_manager_impl_info_convertToJSON(com_day_cq_wcm_msm_impl_rollout_manager_impl_info_t *com_day_cq_wcm_msm_impl_rollout_manager_impl_info);

#endif /* _com_day_cq_wcm_msm_impl_rollout_manager_impl_info_H_ */

