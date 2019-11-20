#import "OAIComAdobeGraniteSecurityUserUserPropertiesServiceInfo.h"

@implementation OAIComAdobeGraniteSecurityUserUserPropertiesServiceInfo

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"pid": @"pid", @"title": @"title", @"_description": @"description", @"properties": @"properties", @"bundleLocation": @"bundle_location", @"serviceLocation": @"service_location" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"pid", @"title", @"_description", @"properties", @"bundleLocation", @"serviceLocation"];
  return [optionalProperties containsObject:propertyName];
}

@end