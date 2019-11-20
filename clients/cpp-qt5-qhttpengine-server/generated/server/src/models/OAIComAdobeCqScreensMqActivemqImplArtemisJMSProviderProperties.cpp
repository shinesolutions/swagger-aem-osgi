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


#include "OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties(QString json) {
    this->fromJson(json);
}

OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties() {
    this->init();
}

OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::~OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties() {
    
}

void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::init() {
    m_service_ranking_isSet = false;
    m_global_size_isSet = false;
    m_max_disk_usage_isSet = false;
    m_persistence_enabled_isSet = false;
    m_thread_pool_max_size_isSet = false;
    m_scheduled_thread_pool_max_size_isSet = false;
    m_graceful_shutdown_timeout_isSet = false;
    m_queues_isSet = false;
    m_topics_isSet = false;
    m_addresses_max_delivery_attempts_isSet = false;
    m_addresses_expiry_delay_isSet = false;
    m_addresses_address_full_message_policy_isSet = false;
    m_addresses_max_size_bytes_isSet = false;
    m_addresses_page_size_bytes_isSet = false;
    m_addresses_page_cache_max_size_isSet = false;
    m_cluster_user_isSet = false;
    m_cluster_password_isSet = false;
    m_cluster_call_timeout_isSet = false;
    m_cluster_call_failover_timeout_isSet = false;
    m_cluster_client_failure_check_period_isSet = false;
    m_cluster_notification_attempts_isSet = false;
    m_cluster_notification_interval_isSet = false;
    m_id_cache_size_isSet = false;
    m_cluster_confirmation_window_size_isSet = false;
    m_cluster_connection_ttl_isSet = false;
    m_cluster_duplicate_detection_isSet = false;
    m_cluster_initial_connect_attempts_isSet = false;
    m_cluster_max_retry_interval_isSet = false;
    m_cluster_min_large_message_size_isSet = false;
    m_cluster_producer_window_size_isSet = false;
    m_cluster_reconnect_attempts_isSet = false;
    m_cluster_retry_interval_isSet = false;
    m_cluster_retry_interval_multiplier_isSet = false;
}

void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(service_ranking, json[QString("service.ranking")]);
    
    ::OpenAPI::fromJsonValue(global_size, json[QString("global.size")]);
    
    ::OpenAPI::fromJsonValue(max_disk_usage, json[QString("max.disk.usage")]);
    
    ::OpenAPI::fromJsonValue(persistence_enabled, json[QString("persistence.enabled")]);
    
    ::OpenAPI::fromJsonValue(thread_pool_max_size, json[QString("thread.pool.max.size")]);
    
    ::OpenAPI::fromJsonValue(scheduled_thread_pool_max_size, json[QString("scheduled.thread.pool.max.size")]);
    
    ::OpenAPI::fromJsonValue(graceful_shutdown_timeout, json[QString("graceful.shutdown.timeout")]);
    
    ::OpenAPI::fromJsonValue(queues, json[QString("queues")]);
    
    ::OpenAPI::fromJsonValue(topics, json[QString("topics")]);
    
    ::OpenAPI::fromJsonValue(addresses_max_delivery_attempts, json[QString("addresses.max.delivery.attempts")]);
    
    ::OpenAPI::fromJsonValue(addresses_expiry_delay, json[QString("addresses.expiry.delay")]);
    
    ::OpenAPI::fromJsonValue(addresses_address_full_message_policy, json[QString("addresses.address.full.message.policy")]);
    
    ::OpenAPI::fromJsonValue(addresses_max_size_bytes, json[QString("addresses.max.size.bytes")]);
    
    ::OpenAPI::fromJsonValue(addresses_page_size_bytes, json[QString("addresses.page.size.bytes")]);
    
    ::OpenAPI::fromJsonValue(addresses_page_cache_max_size, json[QString("addresses.page.cache.max.size")]);
    
    ::OpenAPI::fromJsonValue(cluster_user, json[QString("cluster.user")]);
    
    ::OpenAPI::fromJsonValue(cluster_password, json[QString("cluster.password")]);
    
    ::OpenAPI::fromJsonValue(cluster_call_timeout, json[QString("cluster.call.timeout")]);
    
    ::OpenAPI::fromJsonValue(cluster_call_failover_timeout, json[QString("cluster.call.failover.timeout")]);
    
    ::OpenAPI::fromJsonValue(cluster_client_failure_check_period, json[QString("cluster.client.failure.check.period")]);
    
    ::OpenAPI::fromJsonValue(cluster_notification_attempts, json[QString("cluster.notification.attempts")]);
    
    ::OpenAPI::fromJsonValue(cluster_notification_interval, json[QString("cluster.notification.interval")]);
    
    ::OpenAPI::fromJsonValue(id_cache_size, json[QString("id.cache.size")]);
    
    ::OpenAPI::fromJsonValue(cluster_confirmation_window_size, json[QString("cluster.confirmation.window.size")]);
    
    ::OpenAPI::fromJsonValue(cluster_connection_ttl, json[QString("cluster.connection.ttl")]);
    
    ::OpenAPI::fromJsonValue(cluster_duplicate_detection, json[QString("cluster.duplicate.detection")]);
    
    ::OpenAPI::fromJsonValue(cluster_initial_connect_attempts, json[QString("cluster.initial.connect.attempts")]);
    
    ::OpenAPI::fromJsonValue(cluster_max_retry_interval, json[QString("cluster.max.retry.interval")]);
    
    ::OpenAPI::fromJsonValue(cluster_min_large_message_size, json[QString("cluster.min.large.message.size")]);
    
    ::OpenAPI::fromJsonValue(cluster_producer_window_size, json[QString("cluster.producer.window.size")]);
    
    ::OpenAPI::fromJsonValue(cluster_reconnect_attempts, json[QString("cluster.reconnect.attempts")]);
    
    ::OpenAPI::fromJsonValue(cluster_retry_interval, json[QString("cluster.retry.interval")]);
    
    ::OpenAPI::fromJsonValue(cluster_retry_interval_multiplier, json[QString("cluster.retry.interval.multiplier")]);
    
}

QString
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::asJsonObject() const {
    QJsonObject obj;
	if(service_ranking.isSet()){
        obj.insert(QString("service.ranking"), ::OpenAPI::toJsonValue(service_ranking));
    }
	if(global_size.isSet()){
        obj.insert(QString("global.size"), ::OpenAPI::toJsonValue(global_size));
    }
	if(max_disk_usage.isSet()){
        obj.insert(QString("max.disk.usage"), ::OpenAPI::toJsonValue(max_disk_usage));
    }
	if(persistence_enabled.isSet()){
        obj.insert(QString("persistence.enabled"), ::OpenAPI::toJsonValue(persistence_enabled));
    }
	if(thread_pool_max_size.isSet()){
        obj.insert(QString("thread.pool.max.size"), ::OpenAPI::toJsonValue(thread_pool_max_size));
    }
	if(scheduled_thread_pool_max_size.isSet()){
        obj.insert(QString("scheduled.thread.pool.max.size"), ::OpenAPI::toJsonValue(scheduled_thread_pool_max_size));
    }
	if(graceful_shutdown_timeout.isSet()){
        obj.insert(QString("graceful.shutdown.timeout"), ::OpenAPI::toJsonValue(graceful_shutdown_timeout));
    }
	if(queues.isSet()){
        obj.insert(QString("queues"), ::OpenAPI::toJsonValue(queues));
    }
	if(topics.isSet()){
        obj.insert(QString("topics"), ::OpenAPI::toJsonValue(topics));
    }
	if(addresses_max_delivery_attempts.isSet()){
        obj.insert(QString("addresses.max.delivery.attempts"), ::OpenAPI::toJsonValue(addresses_max_delivery_attempts));
    }
	if(addresses_expiry_delay.isSet()){
        obj.insert(QString("addresses.expiry.delay"), ::OpenAPI::toJsonValue(addresses_expiry_delay));
    }
	if(addresses_address_full_message_policy.isSet()){
        obj.insert(QString("addresses.address.full.message.policy"), ::OpenAPI::toJsonValue(addresses_address_full_message_policy));
    }
	if(addresses_max_size_bytes.isSet()){
        obj.insert(QString("addresses.max.size.bytes"), ::OpenAPI::toJsonValue(addresses_max_size_bytes));
    }
	if(addresses_page_size_bytes.isSet()){
        obj.insert(QString("addresses.page.size.bytes"), ::OpenAPI::toJsonValue(addresses_page_size_bytes));
    }
	if(addresses_page_cache_max_size.isSet()){
        obj.insert(QString("addresses.page.cache.max.size"), ::OpenAPI::toJsonValue(addresses_page_cache_max_size));
    }
	if(cluster_user.isSet()){
        obj.insert(QString("cluster.user"), ::OpenAPI::toJsonValue(cluster_user));
    }
	if(cluster_password.isSet()){
        obj.insert(QString("cluster.password"), ::OpenAPI::toJsonValue(cluster_password));
    }
	if(cluster_call_timeout.isSet()){
        obj.insert(QString("cluster.call.timeout"), ::OpenAPI::toJsonValue(cluster_call_timeout));
    }
	if(cluster_call_failover_timeout.isSet()){
        obj.insert(QString("cluster.call.failover.timeout"), ::OpenAPI::toJsonValue(cluster_call_failover_timeout));
    }
	if(cluster_client_failure_check_period.isSet()){
        obj.insert(QString("cluster.client.failure.check.period"), ::OpenAPI::toJsonValue(cluster_client_failure_check_period));
    }
	if(cluster_notification_attempts.isSet()){
        obj.insert(QString("cluster.notification.attempts"), ::OpenAPI::toJsonValue(cluster_notification_attempts));
    }
	if(cluster_notification_interval.isSet()){
        obj.insert(QString("cluster.notification.interval"), ::OpenAPI::toJsonValue(cluster_notification_interval));
    }
	if(id_cache_size.isSet()){
        obj.insert(QString("id.cache.size"), ::OpenAPI::toJsonValue(id_cache_size));
    }
	if(cluster_confirmation_window_size.isSet()){
        obj.insert(QString("cluster.confirmation.window.size"), ::OpenAPI::toJsonValue(cluster_confirmation_window_size));
    }
	if(cluster_connection_ttl.isSet()){
        obj.insert(QString("cluster.connection.ttl"), ::OpenAPI::toJsonValue(cluster_connection_ttl));
    }
	if(cluster_duplicate_detection.isSet()){
        obj.insert(QString("cluster.duplicate.detection"), ::OpenAPI::toJsonValue(cluster_duplicate_detection));
    }
	if(cluster_initial_connect_attempts.isSet()){
        obj.insert(QString("cluster.initial.connect.attempts"), ::OpenAPI::toJsonValue(cluster_initial_connect_attempts));
    }
	if(cluster_max_retry_interval.isSet()){
        obj.insert(QString("cluster.max.retry.interval"), ::OpenAPI::toJsonValue(cluster_max_retry_interval));
    }
	if(cluster_min_large_message_size.isSet()){
        obj.insert(QString("cluster.min.large.message.size"), ::OpenAPI::toJsonValue(cluster_min_large_message_size));
    }
	if(cluster_producer_window_size.isSet()){
        obj.insert(QString("cluster.producer.window.size"), ::OpenAPI::toJsonValue(cluster_producer_window_size));
    }
	if(cluster_reconnect_attempts.isSet()){
        obj.insert(QString("cluster.reconnect.attempts"), ::OpenAPI::toJsonValue(cluster_reconnect_attempts));
    }
	if(cluster_retry_interval.isSet()){
        obj.insert(QString("cluster.retry.interval"), ::OpenAPI::toJsonValue(cluster_retry_interval));
    }
	if(cluster_retry_interval_multiplier.isSet()){
        obj.insert(QString("cluster.retry.interval.multiplier"), ::OpenAPI::toJsonValue(cluster_retry_interval_multiplier));
    }
    return obj;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getServiceRanking() const {
    return service_ranking;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setServiceRanking(const OAIConfigNodePropertyInteger &service_ranking) {
    this->service_ranking = service_ranking;
    this->m_service_ranking_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getGlobalSize() const {
    return global_size;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setGlobalSize(const OAIConfigNodePropertyInteger &global_size) {
    this->global_size = global_size;
    this->m_global_size_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getMaxDiskUsage() const {
    return max_disk_usage;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setMaxDiskUsage(const OAIConfigNodePropertyInteger &max_disk_usage) {
    this->max_disk_usage = max_disk_usage;
    this->m_max_disk_usage_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getPersistenceEnabled() const {
    return persistence_enabled;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setPersistenceEnabled(const OAIConfigNodePropertyBoolean &persistence_enabled) {
    this->persistence_enabled = persistence_enabled;
    this->m_persistence_enabled_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getThreadPoolMaxSize() const {
    return thread_pool_max_size;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setThreadPoolMaxSize(const OAIConfigNodePropertyInteger &thread_pool_max_size) {
    this->thread_pool_max_size = thread_pool_max_size;
    this->m_thread_pool_max_size_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getScheduledThreadPoolMaxSize() const {
    return scheduled_thread_pool_max_size;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setScheduledThreadPoolMaxSize(const OAIConfigNodePropertyInteger &scheduled_thread_pool_max_size) {
    this->scheduled_thread_pool_max_size = scheduled_thread_pool_max_size;
    this->m_scheduled_thread_pool_max_size_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getGracefulShutdownTimeout() const {
    return graceful_shutdown_timeout;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setGracefulShutdownTimeout(const OAIConfigNodePropertyInteger &graceful_shutdown_timeout) {
    this->graceful_shutdown_timeout = graceful_shutdown_timeout;
    this->m_graceful_shutdown_timeout_isSet = true;
}

OAIConfigNodePropertyArray
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getQueues() const {
    return queues;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setQueues(const OAIConfigNodePropertyArray &queues) {
    this->queues = queues;
    this->m_queues_isSet = true;
}

OAIConfigNodePropertyArray
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getTopics() const {
    return topics;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setTopics(const OAIConfigNodePropertyArray &topics) {
    this->topics = topics;
    this->m_topics_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getAddressesMaxDeliveryAttempts() const {
    return addresses_max_delivery_attempts;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setAddressesMaxDeliveryAttempts(const OAIConfigNodePropertyInteger &addresses_max_delivery_attempts) {
    this->addresses_max_delivery_attempts = addresses_max_delivery_attempts;
    this->m_addresses_max_delivery_attempts_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getAddressesExpiryDelay() const {
    return addresses_expiry_delay;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setAddressesExpiryDelay(const OAIConfigNodePropertyInteger &addresses_expiry_delay) {
    this->addresses_expiry_delay = addresses_expiry_delay;
    this->m_addresses_expiry_delay_isSet = true;
}

OAIConfigNodePropertyDropDown
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getAddressesAddressFullMessagePolicy() const {
    return addresses_address_full_message_policy;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setAddressesAddressFullMessagePolicy(const OAIConfigNodePropertyDropDown &addresses_address_full_message_policy) {
    this->addresses_address_full_message_policy = addresses_address_full_message_policy;
    this->m_addresses_address_full_message_policy_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getAddressesMaxSizeBytes() const {
    return addresses_max_size_bytes;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setAddressesMaxSizeBytes(const OAIConfigNodePropertyInteger &addresses_max_size_bytes) {
    this->addresses_max_size_bytes = addresses_max_size_bytes;
    this->m_addresses_max_size_bytes_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getAddressesPageSizeBytes() const {
    return addresses_page_size_bytes;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setAddressesPageSizeBytes(const OAIConfigNodePropertyInteger &addresses_page_size_bytes) {
    this->addresses_page_size_bytes = addresses_page_size_bytes;
    this->m_addresses_page_size_bytes_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getAddressesPageCacheMaxSize() const {
    return addresses_page_cache_max_size;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setAddressesPageCacheMaxSize(const OAIConfigNodePropertyInteger &addresses_page_cache_max_size) {
    this->addresses_page_cache_max_size = addresses_page_cache_max_size;
    this->m_addresses_page_cache_max_size_isSet = true;
}

OAIConfigNodePropertyString
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterUser() const {
    return cluster_user;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterUser(const OAIConfigNodePropertyString &cluster_user) {
    this->cluster_user = cluster_user;
    this->m_cluster_user_isSet = true;
}

OAIConfigNodePropertyString
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterPassword() const {
    return cluster_password;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterPassword(const OAIConfigNodePropertyString &cluster_password) {
    this->cluster_password = cluster_password;
    this->m_cluster_password_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterCallTimeout() const {
    return cluster_call_timeout;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterCallTimeout(const OAIConfigNodePropertyInteger &cluster_call_timeout) {
    this->cluster_call_timeout = cluster_call_timeout;
    this->m_cluster_call_timeout_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterCallFailoverTimeout() const {
    return cluster_call_failover_timeout;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterCallFailoverTimeout(const OAIConfigNodePropertyInteger &cluster_call_failover_timeout) {
    this->cluster_call_failover_timeout = cluster_call_failover_timeout;
    this->m_cluster_call_failover_timeout_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterClientFailureCheckPeriod() const {
    return cluster_client_failure_check_period;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterClientFailureCheckPeriod(const OAIConfigNodePropertyInteger &cluster_client_failure_check_period) {
    this->cluster_client_failure_check_period = cluster_client_failure_check_period;
    this->m_cluster_client_failure_check_period_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterNotificationAttempts() const {
    return cluster_notification_attempts;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterNotificationAttempts(const OAIConfigNodePropertyInteger &cluster_notification_attempts) {
    this->cluster_notification_attempts = cluster_notification_attempts;
    this->m_cluster_notification_attempts_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterNotificationInterval() const {
    return cluster_notification_interval;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterNotificationInterval(const OAIConfigNodePropertyInteger &cluster_notification_interval) {
    this->cluster_notification_interval = cluster_notification_interval;
    this->m_cluster_notification_interval_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getIdCacheSize() const {
    return id_cache_size;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setIdCacheSize(const OAIConfigNodePropertyInteger &id_cache_size) {
    this->id_cache_size = id_cache_size;
    this->m_id_cache_size_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterConfirmationWindowSize() const {
    return cluster_confirmation_window_size;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterConfirmationWindowSize(const OAIConfigNodePropertyInteger &cluster_confirmation_window_size) {
    this->cluster_confirmation_window_size = cluster_confirmation_window_size;
    this->m_cluster_confirmation_window_size_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterConnectionTtl() const {
    return cluster_connection_ttl;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterConnectionTtl(const OAIConfigNodePropertyInteger &cluster_connection_ttl) {
    this->cluster_connection_ttl = cluster_connection_ttl;
    this->m_cluster_connection_ttl_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterDuplicateDetection() const {
    return cluster_duplicate_detection;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterDuplicateDetection(const OAIConfigNodePropertyBoolean &cluster_duplicate_detection) {
    this->cluster_duplicate_detection = cluster_duplicate_detection;
    this->m_cluster_duplicate_detection_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterInitialConnectAttempts() const {
    return cluster_initial_connect_attempts;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterInitialConnectAttempts(const OAIConfigNodePropertyInteger &cluster_initial_connect_attempts) {
    this->cluster_initial_connect_attempts = cluster_initial_connect_attempts;
    this->m_cluster_initial_connect_attempts_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterMaxRetryInterval() const {
    return cluster_max_retry_interval;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterMaxRetryInterval(const OAIConfigNodePropertyInteger &cluster_max_retry_interval) {
    this->cluster_max_retry_interval = cluster_max_retry_interval;
    this->m_cluster_max_retry_interval_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterMinLargeMessageSize() const {
    return cluster_min_large_message_size;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterMinLargeMessageSize(const OAIConfigNodePropertyInteger &cluster_min_large_message_size) {
    this->cluster_min_large_message_size = cluster_min_large_message_size;
    this->m_cluster_min_large_message_size_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterProducerWindowSize() const {
    return cluster_producer_window_size;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterProducerWindowSize(const OAIConfigNodePropertyInteger &cluster_producer_window_size) {
    this->cluster_producer_window_size = cluster_producer_window_size;
    this->m_cluster_producer_window_size_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterReconnectAttempts() const {
    return cluster_reconnect_attempts;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterReconnectAttempts(const OAIConfigNodePropertyInteger &cluster_reconnect_attempts) {
    this->cluster_reconnect_attempts = cluster_reconnect_attempts;
    this->m_cluster_reconnect_attempts_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterRetryInterval() const {
    return cluster_retry_interval;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterRetryInterval(const OAIConfigNodePropertyInteger &cluster_retry_interval) {
    this->cluster_retry_interval = cluster_retry_interval;
    this->m_cluster_retry_interval_isSet = true;
}

OAIConfigNodePropertyFloat
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::getClusterRetryIntervalMultiplier() const {
    return cluster_retry_interval_multiplier;
}
void
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::setClusterRetryIntervalMultiplier(const OAIConfigNodePropertyFloat &cluster_retry_interval_multiplier) {
    this->cluster_retry_interval_multiplier = cluster_retry_interval_multiplier;
    this->m_cluster_retry_interval_multiplier_isSet = true;
}


bool
OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(service_ranking.isSet()){ isObjectUpdated = true; break;}
    
        if(global_size.isSet()){ isObjectUpdated = true; break;}
    
        if(max_disk_usage.isSet()){ isObjectUpdated = true; break;}
    
        if(persistence_enabled.isSet()){ isObjectUpdated = true; break;}
    
        if(thread_pool_max_size.isSet()){ isObjectUpdated = true; break;}
    
        if(scheduled_thread_pool_max_size.isSet()){ isObjectUpdated = true; break;}
    
        if(graceful_shutdown_timeout.isSet()){ isObjectUpdated = true; break;}
    
        if(queues.isSet()){ isObjectUpdated = true; break;}
    
        if(topics.isSet()){ isObjectUpdated = true; break;}
    
        if(addresses_max_delivery_attempts.isSet()){ isObjectUpdated = true; break;}
    
        if(addresses_expiry_delay.isSet()){ isObjectUpdated = true; break;}
    
        if(addresses_address_full_message_policy.isSet()){ isObjectUpdated = true; break;}
    
        if(addresses_max_size_bytes.isSet()){ isObjectUpdated = true; break;}
    
        if(addresses_page_size_bytes.isSet()){ isObjectUpdated = true; break;}
    
        if(addresses_page_cache_max_size.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_user.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_password.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_call_timeout.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_call_failover_timeout.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_client_failure_check_period.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_notification_attempts.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_notification_interval.isSet()){ isObjectUpdated = true; break;}
    
        if(id_cache_size.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_confirmation_window_size.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_connection_ttl.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_duplicate_detection.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_initial_connect_attempts.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_max_retry_interval.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_min_large_message_size.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_producer_window_size.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_reconnect_attempts.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_retry_interval.isSet()){ isObjectUpdated = true; break;}
    
        if(cluster_retry_interval_multiplier.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
