#import "OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.h"

@implementation OAIComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"serviceRanking": @"service.ranking", @"globalSize": @"global.size", @"maxDiskUsage": @"max.disk.usage", @"persistenceEnabled": @"persistence.enabled", @"threadPoolMaxSize": @"thread.pool.max.size", @"scheduledThreadPoolMaxSize": @"scheduled.thread.pool.max.size", @"gracefulShutdownTimeout": @"graceful.shutdown.timeout", @"queues": @"queues", @"topics": @"topics", @"addressesMaxDeliveryAttempts": @"addresses.max.delivery.attempts", @"addressesExpiryDelay": @"addresses.expiry.delay", @"addressesAddressFullMessagePolicy": @"addresses.address.full.message.policy", @"addressesMaxSizeBytes": @"addresses.max.size.bytes", @"addressesPageSizeBytes": @"addresses.page.size.bytes", @"addressesPageCacheMaxSize": @"addresses.page.cache.max.size", @"clusterUser": @"cluster.user", @"clusterPassword": @"cluster.password", @"clusterCallTimeout": @"cluster.call.timeout", @"clusterCallFailoverTimeout": @"cluster.call.failover.timeout", @"clusterClientFailureCheckPeriod": @"cluster.client.failure.check.period", @"clusterNotificationAttempts": @"cluster.notification.attempts", @"clusterNotificationInterval": @"cluster.notification.interval", @"idCacheSize": @"id.cache.size", @"clusterConfirmationWindowSize": @"cluster.confirmation.window.size", @"clusterConnectionTtl": @"cluster.connection.ttl", @"clusterDuplicateDetection": @"cluster.duplicate.detection", @"clusterInitialConnectAttempts": @"cluster.initial.connect.attempts", @"clusterMaxRetryInterval": @"cluster.max.retry.interval", @"clusterMinLargeMessageSize": @"cluster.min.large.message.size", @"clusterProducerWindowSize": @"cluster.producer.window.size", @"clusterReconnectAttempts": @"cluster.reconnect.attempts", @"clusterRetryInterval": @"cluster.retry.interval", @"clusterRetryIntervalMultiplier": @"cluster.retry.interval.multiplier" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"serviceRanking", @"globalSize", @"maxDiskUsage", @"persistenceEnabled", @"threadPoolMaxSize", @"scheduledThreadPoolMaxSize", @"gracefulShutdownTimeout", @"queues", @"topics", @"addressesMaxDeliveryAttempts", @"addressesExpiryDelay", @"addressesAddressFullMessagePolicy", @"addressesMaxSizeBytes", @"addressesPageSizeBytes", @"addressesPageCacheMaxSize", @"clusterUser", @"clusterPassword", @"clusterCallTimeout", @"clusterCallFailoverTimeout", @"clusterClientFailureCheckPeriod", @"clusterNotificationAttempts", @"clusterNotificationInterval", @"idCacheSize", @"clusterConfirmationWindowSize", @"clusterConnectionTtl", @"clusterDuplicateDetection", @"clusterInitialConnectAttempts", @"clusterMaxRetryInterval", @"clusterMinLargeMessageSize", @"clusterProducerWindowSize", @"clusterReconnectAttempts", @"clusterRetryInterval", @"clusterRetryIntervalMultiplier"];
  return [optionalProperties containsObject:propertyName];
}

@end
