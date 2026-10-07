#import "OAIOrgApacheSlingDiscoveryOakConfigProperties.h"

@implementation OAIOrgApacheSlingDiscoveryOakConfigProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"connectorPingTimeout": @"connectorPingTimeout", @"connectorPingInterval": @"connectorPingInterval", @"discoveryLiteCheckInterval": @"discoveryLiteCheckInterval", @"clusterSyncServiceTimeout": @"clusterSyncServiceTimeout", @"clusterSyncServiceInterval": @"clusterSyncServiceInterval", @"enableSyncToken": @"enableSyncToken", @"minEventDelay": @"minEventDelay", @"socketConnectTimeout": @"socketConnectTimeout", @"soTimeout": @"soTimeout", @"topologyConnectorUrls": @"topologyConnectorUrls", @"topologyConnectorWhitelist": @"topologyConnectorWhitelist", @"autoStopLocalLoopEnabled": @"autoStopLocalLoopEnabled", @"gzipConnectorRequestsEnabled": @"gzipConnectorRequestsEnabled", @"hmacEnabled": @"hmacEnabled", @"enableEncryption": @"enableEncryption", @"sharedKey": @"sharedKey", @"hmacSharedKeyTTL": @"hmacSharedKeyTTL", @"backoffStandbyFactor": @"backoffStandbyFactor", @"backoffStableFactor": @"backoffStableFactor" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"connectorPingTimeout", @"connectorPingInterval", @"discoveryLiteCheckInterval", @"clusterSyncServiceTimeout", @"clusterSyncServiceInterval", @"enableSyncToken", @"minEventDelay", @"socketConnectTimeout", @"soTimeout", @"topologyConnectorUrls", @"topologyConnectorWhitelist", @"autoStopLocalLoopEnabled", @"gzipConnectorRequestsEnabled", @"hmacEnabled", @"enableEncryption", @"sharedKey", @"hmacSharedKeyTTL", @"backoffStandbyFactor", @"backoffStableFactor"];
  return [optionalProperties containsObject:propertyName];
}

@end
