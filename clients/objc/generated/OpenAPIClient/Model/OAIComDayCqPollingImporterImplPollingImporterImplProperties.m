#import "OAIComDayCqPollingImporterImplPollingImporterImplProperties.h"

@implementation OAIComDayCqPollingImporterImplPollingImporterImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"importerMinInterval": @"importer.min.interval", @"importerUser": @"importer.user", @"excludePaths": @"exclude.paths", @"includePaths": @"include.paths" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"importerMinInterval", @"importerUser", @"excludePaths", @"includePaths"];
  return [optionalProperties containsObject:propertyName];
}

@end
