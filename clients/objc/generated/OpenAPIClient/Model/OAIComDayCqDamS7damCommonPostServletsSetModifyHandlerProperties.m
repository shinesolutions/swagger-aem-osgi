#import "OAIComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.h"

@implementation OAIComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"slingPostOperation": @"sling.post.operation", @"slingServletMethods": @"sling.servlet.methods" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"slingPostOperation", @"slingServletMethods"];
  return [optionalProperties containsObject:propertyName];
}

@end
