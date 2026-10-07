#import "OAIComDayCommonsHttpclientProperties.h"

@implementation OAIComDayCommonsHttpclientProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"proxyEnabled": @"proxy.enabled", @"proxyHost": @"proxy.host", @"proxyUser": @"proxy.user", @"proxyPassword": @"proxy.password", @"proxyNtlmHost": @"proxy.ntlm.host", @"proxyNtlmDomain": @"proxy.ntlm.domain", @"proxyExceptions": @"proxy.exceptions" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"proxyEnabled", @"proxyHost", @"proxyUser", @"proxyPassword", @"proxyNtlmHost", @"proxyNtlmDomain", @"proxyExceptions"];
  return [optionalProperties containsObject:propertyName];
}

@end
