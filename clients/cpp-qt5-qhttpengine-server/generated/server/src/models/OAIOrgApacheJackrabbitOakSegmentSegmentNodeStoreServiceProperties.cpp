/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


#include "OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties(QString json) {
    this->fromJson(json);
}

OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties() {
    this->init();
}

OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::~OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties() {
    
}

void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::init() {
    m_repository_home_isSet = false;
    m_tarmk_mode_isSet = false;
    m_tarmk_size_isSet = false;
    m_segment_cache_size_isSet = false;
    m_string_cache_size_isSet = false;
    m_template_cache_size_isSet = false;
    m_string_deduplication_cache_size_isSet = false;
    m_template_deduplication_cache_size_isSet = false;
    m_node_deduplication_cache_size_isSet = false;
    m_pause_compaction_isSet = false;
    m_compaction_retry_count_isSet = false;
    m_compaction_force_timeout_isSet = false;
    m_compaction_size_delta_estimation_isSet = false;
    m_compaction_disable_estimation_isSet = false;
    m_compaction_retained_generations_isSet = false;
    m_compaction_memory_threshold_isSet = false;
    m_compaction_progress_log_isSet = false;
    m_standby_isSet = false;
    m_custom_blob_store_isSet = false;
    m_custom_segment_store_isSet = false;
    m_split_persistence_isSet = false;
    m_repository_backup_dir_isSet = false;
    m_blob_gc_max_age_in_secs_isSet = false;
    m_blob_track_snapshot_interval_in_secs_isSet = false;
}

void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(repository_home, json[QString("repository.home")]);
    
    ::OpenAPI::fromJsonValue(tarmk_mode, json[QString("tarmk.mode")]);
    
    ::OpenAPI::fromJsonValue(tarmk_size, json[QString("tarmk.size")]);
    
    ::OpenAPI::fromJsonValue(segment_cache_size, json[QString("segmentCache.size")]);
    
    ::OpenAPI::fromJsonValue(string_cache_size, json[QString("stringCache.size")]);
    
    ::OpenAPI::fromJsonValue(template_cache_size, json[QString("templateCache.size")]);
    
    ::OpenAPI::fromJsonValue(string_deduplication_cache_size, json[QString("stringDeduplicationCache.size")]);
    
    ::OpenAPI::fromJsonValue(template_deduplication_cache_size, json[QString("templateDeduplicationCache.size")]);
    
    ::OpenAPI::fromJsonValue(node_deduplication_cache_size, json[QString("nodeDeduplicationCache.size")]);
    
    ::OpenAPI::fromJsonValue(pause_compaction, json[QString("pauseCompaction")]);
    
    ::OpenAPI::fromJsonValue(compaction_retry_count, json[QString("compaction.retryCount")]);
    
    ::OpenAPI::fromJsonValue(compaction_force_timeout, json[QString("compaction.force.timeout")]);
    
    ::OpenAPI::fromJsonValue(compaction_size_delta_estimation, json[QString("compaction.sizeDeltaEstimation")]);
    
    ::OpenAPI::fromJsonValue(compaction_disable_estimation, json[QString("compaction.disableEstimation")]);
    
    ::OpenAPI::fromJsonValue(compaction_retained_generations, json[QString("compaction.retainedGenerations")]);
    
    ::OpenAPI::fromJsonValue(compaction_memory_threshold, json[QString("compaction.memoryThreshold")]);
    
    ::OpenAPI::fromJsonValue(compaction_progress_log, json[QString("compaction.progressLog")]);
    
    ::OpenAPI::fromJsonValue(standby, json[QString("standby")]);
    
    ::OpenAPI::fromJsonValue(custom_blob_store, json[QString("customBlobStore")]);
    
    ::OpenAPI::fromJsonValue(custom_segment_store, json[QString("customSegmentStore")]);
    
    ::OpenAPI::fromJsonValue(split_persistence, json[QString("splitPersistence")]);
    
    ::OpenAPI::fromJsonValue(repository_backup_dir, json[QString("repository.backup.dir")]);
    
    ::OpenAPI::fromJsonValue(blob_gc_max_age_in_secs, json[QString("blobGcMaxAgeInSecs")]);
    
    ::OpenAPI::fromJsonValue(blob_track_snapshot_interval_in_secs, json[QString("blobTrackSnapshotIntervalInSecs")]);
    
}

QString
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::asJsonObject() const {
    QJsonObject obj;
	if(repository_home.isSet()){
        obj.insert(QString("repository.home"), ::OpenAPI::toJsonValue(repository_home));
    }
	if(tarmk_mode.isSet()){
        obj.insert(QString("tarmk.mode"), ::OpenAPI::toJsonValue(tarmk_mode));
    }
	if(tarmk_size.isSet()){
        obj.insert(QString("tarmk.size"), ::OpenAPI::toJsonValue(tarmk_size));
    }
	if(segment_cache_size.isSet()){
        obj.insert(QString("segmentCache.size"), ::OpenAPI::toJsonValue(segment_cache_size));
    }
	if(string_cache_size.isSet()){
        obj.insert(QString("stringCache.size"), ::OpenAPI::toJsonValue(string_cache_size));
    }
	if(template_cache_size.isSet()){
        obj.insert(QString("templateCache.size"), ::OpenAPI::toJsonValue(template_cache_size));
    }
	if(string_deduplication_cache_size.isSet()){
        obj.insert(QString("stringDeduplicationCache.size"), ::OpenAPI::toJsonValue(string_deduplication_cache_size));
    }
	if(template_deduplication_cache_size.isSet()){
        obj.insert(QString("templateDeduplicationCache.size"), ::OpenAPI::toJsonValue(template_deduplication_cache_size));
    }
	if(node_deduplication_cache_size.isSet()){
        obj.insert(QString("nodeDeduplicationCache.size"), ::OpenAPI::toJsonValue(node_deduplication_cache_size));
    }
	if(pause_compaction.isSet()){
        obj.insert(QString("pauseCompaction"), ::OpenAPI::toJsonValue(pause_compaction));
    }
	if(compaction_retry_count.isSet()){
        obj.insert(QString("compaction.retryCount"), ::OpenAPI::toJsonValue(compaction_retry_count));
    }
	if(compaction_force_timeout.isSet()){
        obj.insert(QString("compaction.force.timeout"), ::OpenAPI::toJsonValue(compaction_force_timeout));
    }
	if(compaction_size_delta_estimation.isSet()){
        obj.insert(QString("compaction.sizeDeltaEstimation"), ::OpenAPI::toJsonValue(compaction_size_delta_estimation));
    }
	if(compaction_disable_estimation.isSet()){
        obj.insert(QString("compaction.disableEstimation"), ::OpenAPI::toJsonValue(compaction_disable_estimation));
    }
	if(compaction_retained_generations.isSet()){
        obj.insert(QString("compaction.retainedGenerations"), ::OpenAPI::toJsonValue(compaction_retained_generations));
    }
	if(compaction_memory_threshold.isSet()){
        obj.insert(QString("compaction.memoryThreshold"), ::OpenAPI::toJsonValue(compaction_memory_threshold));
    }
	if(compaction_progress_log.isSet()){
        obj.insert(QString("compaction.progressLog"), ::OpenAPI::toJsonValue(compaction_progress_log));
    }
	if(standby.isSet()){
        obj.insert(QString("standby"), ::OpenAPI::toJsonValue(standby));
    }
	if(custom_blob_store.isSet()){
        obj.insert(QString("customBlobStore"), ::OpenAPI::toJsonValue(custom_blob_store));
    }
	if(custom_segment_store.isSet()){
        obj.insert(QString("customSegmentStore"), ::OpenAPI::toJsonValue(custom_segment_store));
    }
	if(split_persistence.isSet()){
        obj.insert(QString("splitPersistence"), ::OpenAPI::toJsonValue(split_persistence));
    }
	if(repository_backup_dir.isSet()){
        obj.insert(QString("repository.backup.dir"), ::OpenAPI::toJsonValue(repository_backup_dir));
    }
	if(blob_gc_max_age_in_secs.isSet()){
        obj.insert(QString("blobGcMaxAgeInSecs"), ::OpenAPI::toJsonValue(blob_gc_max_age_in_secs));
    }
	if(blob_track_snapshot_interval_in_secs.isSet()){
        obj.insert(QString("blobTrackSnapshotIntervalInSecs"), ::OpenAPI::toJsonValue(blob_track_snapshot_interval_in_secs));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getRepositoryHome() const {
    return repository_home;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setRepositoryHome(const OAIConfigNodePropertyString &repository_home) {
    this->repository_home = repository_home;
    this->m_repository_home_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getTarmkMode() const {
    return tarmk_mode;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setTarmkMode(const OAIConfigNodePropertyString &tarmk_mode) {
    this->tarmk_mode = tarmk_mode;
    this->m_tarmk_mode_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getTarmkSize() const {
    return tarmk_size;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setTarmkSize(const OAIConfigNodePropertyInteger &tarmk_size) {
    this->tarmk_size = tarmk_size;
    this->m_tarmk_size_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getSegmentCacheSize() const {
    return segment_cache_size;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setSegmentCacheSize(const OAIConfigNodePropertyInteger &segment_cache_size) {
    this->segment_cache_size = segment_cache_size;
    this->m_segment_cache_size_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getStringCacheSize() const {
    return string_cache_size;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setStringCacheSize(const OAIConfigNodePropertyInteger &string_cache_size) {
    this->string_cache_size = string_cache_size;
    this->m_string_cache_size_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getTemplateCacheSize() const {
    return template_cache_size;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setTemplateCacheSize(const OAIConfigNodePropertyInteger &template_cache_size) {
    this->template_cache_size = template_cache_size;
    this->m_template_cache_size_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getStringDeduplicationCacheSize() const {
    return string_deduplication_cache_size;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setStringDeduplicationCacheSize(const OAIConfigNodePropertyInteger &string_deduplication_cache_size) {
    this->string_deduplication_cache_size = string_deduplication_cache_size;
    this->m_string_deduplication_cache_size_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getTemplateDeduplicationCacheSize() const {
    return template_deduplication_cache_size;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setTemplateDeduplicationCacheSize(const OAIConfigNodePropertyInteger &template_deduplication_cache_size) {
    this->template_deduplication_cache_size = template_deduplication_cache_size;
    this->m_template_deduplication_cache_size_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getNodeDeduplicationCacheSize() const {
    return node_deduplication_cache_size;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setNodeDeduplicationCacheSize(const OAIConfigNodePropertyInteger &node_deduplication_cache_size) {
    this->node_deduplication_cache_size = node_deduplication_cache_size;
    this->m_node_deduplication_cache_size_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getPauseCompaction() const {
    return pause_compaction;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setPauseCompaction(const OAIConfigNodePropertyBoolean &pause_compaction) {
    this->pause_compaction = pause_compaction;
    this->m_pause_compaction_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionRetryCount() const {
    return compaction_retry_count;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionRetryCount(const OAIConfigNodePropertyInteger &compaction_retry_count) {
    this->compaction_retry_count = compaction_retry_count;
    this->m_compaction_retry_count_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionForceTimeout() const {
    return compaction_force_timeout;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionForceTimeout(const OAIConfigNodePropertyInteger &compaction_force_timeout) {
    this->compaction_force_timeout = compaction_force_timeout;
    this->m_compaction_force_timeout_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionSizeDeltaEstimation() const {
    return compaction_size_delta_estimation;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionSizeDeltaEstimation(const OAIConfigNodePropertyInteger &compaction_size_delta_estimation) {
    this->compaction_size_delta_estimation = compaction_size_delta_estimation;
    this->m_compaction_size_delta_estimation_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionDisableEstimation() const {
    return compaction_disable_estimation;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionDisableEstimation(const OAIConfigNodePropertyBoolean &compaction_disable_estimation) {
    this->compaction_disable_estimation = compaction_disable_estimation;
    this->m_compaction_disable_estimation_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionRetainedGenerations() const {
    return compaction_retained_generations;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionRetainedGenerations(const OAIConfigNodePropertyInteger &compaction_retained_generations) {
    this->compaction_retained_generations = compaction_retained_generations;
    this->m_compaction_retained_generations_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionMemoryThreshold() const {
    return compaction_memory_threshold;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionMemoryThreshold(const OAIConfigNodePropertyInteger &compaction_memory_threshold) {
    this->compaction_memory_threshold = compaction_memory_threshold;
    this->m_compaction_memory_threshold_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCompactionProgressLog() const {
    return compaction_progress_log;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCompactionProgressLog(const OAIConfigNodePropertyInteger &compaction_progress_log) {
    this->compaction_progress_log = compaction_progress_log;
    this->m_compaction_progress_log_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getStandby() const {
    return standby;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setStandby(const OAIConfigNodePropertyBoolean &standby) {
    this->standby = standby;
    this->m_standby_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCustomBlobStore() const {
    return custom_blob_store;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCustomBlobStore(const OAIConfigNodePropertyBoolean &custom_blob_store) {
    this->custom_blob_store = custom_blob_store;
    this->m_custom_blob_store_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getCustomSegmentStore() const {
    return custom_segment_store;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setCustomSegmentStore(const OAIConfigNodePropertyBoolean &custom_segment_store) {
    this->custom_segment_store = custom_segment_store;
    this->m_custom_segment_store_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getSplitPersistence() const {
    return split_persistence;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setSplitPersistence(const OAIConfigNodePropertyBoolean &split_persistence) {
    this->split_persistence = split_persistence;
    this->m_split_persistence_isSet = true;
}

OAIConfigNodePropertyString
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getRepositoryBackupDir() const {
    return repository_backup_dir;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setRepositoryBackupDir(const OAIConfigNodePropertyString &repository_backup_dir) {
    this->repository_backup_dir = repository_backup_dir;
    this->m_repository_backup_dir_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getBlobGcMaxAgeInSecs() const {
    return blob_gc_max_age_in_secs;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setBlobGcMaxAgeInSecs(const OAIConfigNodePropertyInteger &blob_gc_max_age_in_secs) {
    this->blob_gc_max_age_in_secs = blob_gc_max_age_in_secs;
    this->m_blob_gc_max_age_in_secs_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::getBlobTrackSnapshotIntervalInSecs() const {
    return blob_track_snapshot_interval_in_secs;
}
void
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::setBlobTrackSnapshotIntervalInSecs(const OAIConfigNodePropertyInteger &blob_track_snapshot_interval_in_secs) {
    this->blob_track_snapshot_interval_in_secs = blob_track_snapshot_interval_in_secs;
    this->m_blob_track_snapshot_interval_in_secs_isSet = true;
}


bool
OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(repository_home.isSet()){ isObjectUpdated = true; break;}
    
        if(tarmk_mode.isSet()){ isObjectUpdated = true; break;}
    
        if(tarmk_size.isSet()){ isObjectUpdated = true; break;}
    
        if(segment_cache_size.isSet()){ isObjectUpdated = true; break;}
    
        if(string_cache_size.isSet()){ isObjectUpdated = true; break;}
    
        if(template_cache_size.isSet()){ isObjectUpdated = true; break;}
    
        if(string_deduplication_cache_size.isSet()){ isObjectUpdated = true; break;}
    
        if(template_deduplication_cache_size.isSet()){ isObjectUpdated = true; break;}
    
        if(node_deduplication_cache_size.isSet()){ isObjectUpdated = true; break;}
    
        if(pause_compaction.isSet()){ isObjectUpdated = true; break;}
    
        if(compaction_retry_count.isSet()){ isObjectUpdated = true; break;}
    
        if(compaction_force_timeout.isSet()){ isObjectUpdated = true; break;}
    
        if(compaction_size_delta_estimation.isSet()){ isObjectUpdated = true; break;}
    
        if(compaction_disable_estimation.isSet()){ isObjectUpdated = true; break;}
    
        if(compaction_retained_generations.isSet()){ isObjectUpdated = true; break;}
    
        if(compaction_memory_threshold.isSet()){ isObjectUpdated = true; break;}
    
        if(compaction_progress_log.isSet()){ isObjectUpdated = true; break;}
    
        if(standby.isSet()){ isObjectUpdated = true; break;}
    
        if(custom_blob_store.isSet()){ isObjectUpdated = true; break;}
    
        if(custom_segment_store.isSet()){ isObjectUpdated = true; break;}
    
        if(split_persistence.isSet()){ isObjectUpdated = true; break;}
    
        if(repository_backup_dir.isSet()){ isObjectUpdated = true; break;}
    
        if(blob_gc_max_age_in_secs.isSet()){ isObjectUpdated = true; break;}
    
        if(blob_track_snapshot_interval_in_secs.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
