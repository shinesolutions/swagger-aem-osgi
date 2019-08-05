#import "OAIOrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.h"

@implementation OAIOrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"title": @"title", @"details": @"details", @"enabled": @"enabled", @"serviceName": @"serviceName", @"logLevel": @"log.level", @"allowedRoots": @"allowed.roots", @"queueProcessingEnabled": @"queue.processing.enabled", @"packageImporterEndpoints": @"packageImporter.endpoints", @"passiveQueues": @"passiveQueues", @"priorityQueues": @"priorityQueues", @"retryStrategy": @"retry.strategy", @"retryAttempts": @"retry.attempts", @"requestAuthorizationStrategyTarget": @"requestAuthorizationStrategy.target", @"transportSecretProviderTarget": @"transportSecretProvider.target", @"packageBuilderTarget": @"packageBuilder.target", @"triggersTarget": @"triggers.target", @"queueProvider": @"queue.provider", @"asyncDelivery": @"async.delivery", @"httpConnTimeout": @"http.conn.timeout" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"title", @"details", @"enabled", @"serviceName", @"logLevel", @"allowedRoots", @"queueProcessingEnabled", @"packageImporterEndpoints", @"passiveQueues", @"priorityQueues", @"retryStrategy", @"retryAttempts", @"requestAuthorizationStrategyTarget", @"transportSecretProviderTarget", @"packageBuilderTarget", @"triggersTarget", @"queueProvider", @"asyncDelivery", @"httpConnTimeout"];
  return [optionalProperties containsObject:propertyName];
}

@end
