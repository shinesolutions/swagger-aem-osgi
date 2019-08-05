#import "OAIComAdobeGraniteCsrfImplCSRFFilterProperties.h"

@implementation OAIComAdobeGraniteCsrfImplCSRFFilterProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"filterMethods": @"filter.methods", @"filterEnableSafeUserAgents": @"filter.enable.safe.user.agents", @"filterSafeUserAgents": @"filter.safe.user.agents", @"filterExcludedPaths": @"filter.excluded.paths" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"filterMethods", @"filterEnableSafeUserAgents", @"filterSafeUserAgents", @"filterExcludedPaths"];
  return [optionalProperties containsObject:propertyName];
}

@end
