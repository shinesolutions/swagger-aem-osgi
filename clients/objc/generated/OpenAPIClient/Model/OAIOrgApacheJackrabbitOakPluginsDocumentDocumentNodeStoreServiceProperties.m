#import "OAIOrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.h"

@implementation OAIOrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"mongouri": @"mongouri", @"db": @"db", @"socketKeepAlive": @"socketKeepAlive", @"cache": @"cache", @"nodeCachePercentage": @"nodeCachePercentage", @"prevDocCachePercentage": @"prevDocCachePercentage", @"childrenCachePercentage": @"childrenCachePercentage", @"diffCachePercentage": @"diffCachePercentage", @"cacheSegmentCount": @"cacheSegmentCount", @"cacheStackMoveDistance": @"cacheStackMoveDistance", @"blobCacheSize": @"blobCacheSize", @"persistentCache": @"persistentCache", @"journalCache": @"journalCache", @"customBlobStore": @"customBlobStore", @"journalGCInterval": @"journalGCInterval", @"journalGCMaxAge": @"journalGCMaxAge", @"prefetchExternalChanges": @"prefetchExternalChanges", @"role": @"role", @"versionGcMaxAgeInSecs": @"versionGcMaxAgeInSecs", @"versionGCExpression": @"versionGCExpression", @"versionGCTimeLimitInSecs": @"versionGCTimeLimitInSecs", @"blobGcMaxAgeInSecs": @"blobGcMaxAgeInSecs", @"blobTrackSnapshotIntervalInSecs": @"blobTrackSnapshotIntervalInSecs", @"repositoryHome": @"repository.home", @"maxReplicationLagInSecs": @"maxReplicationLagInSecs", @"documentStoreType": @"documentStoreType", @"bundlingDisabled": @"bundlingDisabled", @"updateLimit": @"updateLimit", @"persistentCacheIncludes": @"persistentCacheIncludes", @"leaseCheckMode": @"leaseCheckMode" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"mongouri", @"db", @"socketKeepAlive", @"cache", @"nodeCachePercentage", @"prevDocCachePercentage", @"childrenCachePercentage", @"diffCachePercentage", @"cacheSegmentCount", @"cacheStackMoveDistance", @"blobCacheSize", @"persistentCache", @"journalCache", @"customBlobStore", @"journalGCInterval", @"journalGCMaxAge", @"prefetchExternalChanges", @"role", @"versionGcMaxAgeInSecs", @"versionGCExpression", @"versionGCTimeLimitInSecs", @"blobGcMaxAgeInSecs", @"blobTrackSnapshotIntervalInSecs", @"repositoryHome", @"maxReplicationLagInSecs", @"documentStoreType", @"bundlingDisabled", @"updateLimit", @"persistentCacheIncludes", @"leaseCheckMode"];
  return [optionalProperties containsObject:propertyName];
}

@end
