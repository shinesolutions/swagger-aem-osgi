#import "OAIComDayCqWcmCoreImplVersionManagerImplProperties.h"

@implementation OAIComDayCqWcmCoreImplVersionManagerImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"versionmanagerCreateVersionOnActivation": @"versionmanager.createVersionOnActivation", @"versionmanagerPurgingEnabled": @"versionmanager.purgingEnabled", @"versionmanagerPurgePaths": @"versionmanager.purgePaths", @"versionmanagerIvPaths": @"versionmanager.ivPaths", @"versionmanagerMaxAgeDays": @"versionmanager.maxAgeDays", @"versionmanagerMaxNumberVersions": @"versionmanager.maxNumberVersions", @"versionmanagerMinNumberVersions": @"versionmanager.minNumberVersions" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"versionmanagerCreateVersionOnActivation", @"versionmanagerPurgingEnabled", @"versionmanagerPurgePaths", @"versionmanagerIvPaths", @"versionmanagerMaxAgeDays", @"versionmanagerMaxNumberVersions", @"versionmanagerMinNumberVersions"];
  return [optionalProperties containsObject:propertyName];
}

@end
