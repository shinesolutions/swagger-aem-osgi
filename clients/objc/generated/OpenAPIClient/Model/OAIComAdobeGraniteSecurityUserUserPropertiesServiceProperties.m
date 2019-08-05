#import "OAIComAdobeGraniteSecurityUserUserPropertiesServiceProperties.h"

@implementation OAIComAdobeGraniteSecurityUserUserPropertiesServiceProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adapterCondition": @"adapter.condition", @"graniteUserpropertiesNodetypes": @"granite.userproperties.nodetypes", @"graniteUserpropertiesResourcetypes": @"granite.userproperties.resourcetypes" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adapterCondition", @"graniteUserpropertiesNodetypes", @"graniteUserpropertiesResourcetypes"];
  return [optionalProperties containsObject:propertyName];
}

@end
