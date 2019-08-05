#import "OAIComAdobeGraniteCorsImplCORSPolicyImplProperties.h"

@implementation OAIComAdobeGraniteCorsImplCORSPolicyImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"alloworigin": @"alloworigin", @"alloworiginregexp": @"alloworiginregexp", @"allowedpaths": @"allowedpaths", @"exposedheaders": @"exposedheaders", @"maxage": @"maxage", @"supportedheaders": @"supportedheaders", @"supportedmethods": @"supportedmethods", @"supportscredentials": @"supportscredentials" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"alloworigin", @"alloworiginregexp", @"allowedpaths", @"exposedheaders", @"maxage", @"supportedheaders", @"supportedmethods", @"supportscredentials"];
  return [optionalProperties containsObject:propertyName];
}

@end
