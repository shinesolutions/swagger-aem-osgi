#import "OAIComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.h"

@implementation OAIComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"path": @"path", @"serviceRanking": @"service.ranking", @"jaasControlFlag": @"jaas.controlFlag", @"jaasRealmName": @"jaas.realmName", @"jaasRanking": @"jaas.ranking", @"headers": @"headers", @"cookies": @"cookies", @"parameters": @"parameters", @"usermap": @"usermap", @"format": @"format", @"trustedCredentialsAttribute": @"trustedCredentialsAttribute" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"path", @"serviceRanking", @"jaasControlFlag", @"jaasRealmName", @"jaasRanking", @"headers", @"cookies", @"parameters", @"usermap", @"format", @"trustedCredentialsAttribute"];
  return [optionalProperties containsObject:propertyName];
}

@end
