#import "OAIOrgApacheSlingSecurityImplContentDispositionFilterProperties.h"

@implementation OAIOrgApacheSlingSecurityImplContentDispositionFilterProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"slingContentDispositionPaths": @"sling.content.disposition.paths", @"slingContentDispositionExcludedPaths": @"sling.content.disposition.excluded.paths", @"slingContentDispositionAllPaths": @"sling.content.disposition.all.paths" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"slingContentDispositionPaths", @"slingContentDispositionExcludedPaths", @"slingContentDispositionAllPaths"];
  return [optionalProperties containsObject:propertyName];
}

@end
