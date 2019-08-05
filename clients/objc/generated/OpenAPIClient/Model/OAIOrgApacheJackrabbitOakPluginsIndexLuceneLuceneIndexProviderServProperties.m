#import "OAIOrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.h"

@implementation OAIOrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"disabled": @"disabled", @"debug": @"debug", @"localIndexDir": @"localIndexDir", @"enableOpenIndexAsync": @"enableOpenIndexAsync", @"threadPoolSize": @"threadPoolSize", @"prefetchIndexFiles": @"prefetchIndexFiles", @"extractedTextCacheSizeInMB": @"extractedTextCacheSizeInMB", @"extractedTextCacheExpiryInSecs": @"extractedTextCacheExpiryInSecs", @"alwaysUsePreExtractedCache": @"alwaysUsePreExtractedCache", @"booleanClauseLimit": @"booleanClauseLimit", @"enableHybridIndexing": @"enableHybridIndexing", @"hybridQueueSize": @"hybridQueueSize", @"disableStoredIndexDefinition": @"disableStoredIndexDefinition", @"deletedBlobsCollectionEnabled": @"deletedBlobsCollectionEnabled", @"propIndexCleanerIntervalInSecs": @"propIndexCleanerIntervalInSecs", @"enableSingleBlobIndexFiles": @"enableSingleBlobIndexFiles" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"disabled", @"debug", @"localIndexDir", @"enableOpenIndexAsync", @"threadPoolSize", @"prefetchIndexFiles", @"extractedTextCacheSizeInMB", @"extractedTextCacheExpiryInSecs", @"alwaysUsePreExtractedCache", @"booleanClauseLimit", @"enableHybridIndexing", @"hybridQueueSize", @"disableStoredIndexDefinition", @"deletedBlobsCollectionEnabled", @"propIndexCleanerIntervalInSecs", @"enableSingleBlobIndexFiles"];
  return [optionalProperties containsObject:propertyName];
}

@end
