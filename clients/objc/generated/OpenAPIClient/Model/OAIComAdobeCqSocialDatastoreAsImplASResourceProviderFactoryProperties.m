#import "OAIComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.h"

@implementation OAIComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"versionId": @"version.id", @"cacheOn": @"cache.on", @"concurrencyLevel": @"concurrency.level", @"cacheStartSize": @"cache.start.size", @"cacheTtl": @"cache.ttl", @"cacheSize": @"cache.size", @"timeLimit": @"time.limit" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"versionId", @"cacheOn", @"concurrencyLevel", @"cacheStartSize", @"cacheTtl", @"cacheSize", @"timeLimit"];
  return [optionalProperties containsObject:propertyName];
}

@end
