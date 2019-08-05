#import "OAIOrgApacheHttpProxyconfiguratorProperties.h"

@implementation OAIOrgApacheHttpProxyconfiguratorProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"proxyEnabled": @"proxy.enabled", @"proxyHost": @"proxy.host", @"proxyPort": @"proxy.port", @"proxyUser": @"proxy.user", @"proxyPassword": @"proxy.password", @"proxyExceptions": @"proxy.exceptions" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"proxyEnabled", @"proxyHost", @"proxyPort", @"proxyUser", @"proxyPassword", @"proxyExceptions"];
  return [optionalProperties containsObject:propertyName];
}

@end
