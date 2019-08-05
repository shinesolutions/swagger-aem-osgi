#import "OAIOrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.h"

@implementation OAIOrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"hcName": @"hc.name", @"hcTags": @"hc.tags", @"hcMbeanName": @"hc.mbean.name", @"mbeanName": @"mbean.name", @"attributeName": @"attribute.name", @"attributeValueConstraint": @"attribute.value.constraint" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"hcName", @"hcTags", @"hcMbeanName", @"mbeanName", @"attributeName", @"attributeValueConstraint"];
  return [optionalProperties containsObject:propertyName];
}

@end
