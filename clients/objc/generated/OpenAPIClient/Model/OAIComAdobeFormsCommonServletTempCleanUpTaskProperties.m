#import "OAIComAdobeFormsCommonServletTempCleanUpTaskProperties.h"

@implementation OAIComAdobeFormsCommonServletTempCleanUpTaskProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"schedulerExpression": @"scheduler.expression", @"durationForTemporaryStorage": @"Duration for Temporary Storage", @"durationForAnonymousStorage": @"Duration for Anonymous Storage" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"schedulerExpression", @"durationForTemporaryStorage", @"durationForAnonymousStorage"];
  return [optionalProperties containsObject:propertyName];
}

@end
