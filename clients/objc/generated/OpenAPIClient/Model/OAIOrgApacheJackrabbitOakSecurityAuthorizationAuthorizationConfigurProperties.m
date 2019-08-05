#import "OAIOrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.h"

@implementation OAIOrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"permissionsJr2": @"permissionsJr2", @"importBehavior": @"importBehavior", @"readPaths": @"readPaths", @"administrativePrincipals": @"administrativePrincipals", @"configurationRanking": @"configurationRanking" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"permissionsJr2", @"importBehavior", @"readPaths", @"administrativePrincipals", @"configurationRanking"];
  return [optionalProperties containsObject:propertyName];
}

@end
