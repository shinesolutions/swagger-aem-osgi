#import "OAIComDayCqWcmCoreImplVersionPurgeTaskProperties.h"

@implementation OAIComDayCqWcmCoreImplVersionPurgeTaskProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"versionpurgePaths": @"versionpurge.paths", @"versionpurgeRecursive": @"versionpurge.recursive", @"versionpurgeMaxVersions": @"versionpurge.maxVersions", @"versionpurgeMinVersions": @"versionpurge.minVersions", @"versionpurgeMaxAgeDays": @"versionpurge.maxAgeDays" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"versionpurgePaths", @"versionpurgeRecursive", @"versionpurgeMaxVersions", @"versionpurgeMinVersions", @"versionpurgeMaxAgeDays"];
  return [optionalProperties containsObject:propertyName];
}

@end
