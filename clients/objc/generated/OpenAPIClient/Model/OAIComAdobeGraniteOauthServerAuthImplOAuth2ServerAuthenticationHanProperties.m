#import "OAIComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.h"

@implementation OAIComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"path": @"path", @"jaasControlFlag": @"jaas.controlFlag", @"jaasRealmName": @"jaas.realmName", @"jaasRanking": @"jaas.ranking", @"oauthOfflineValidation": @"oauth.offline.validation" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"path", @"jaasControlFlag", @"jaasRealmName", @"jaasRanking", @"oauthOfflineValidation"];
  return [optionalProperties containsObject:propertyName];
}

@end
