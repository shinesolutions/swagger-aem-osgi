#import "OAIComAdobeGraniteAuthOauthProviderProperties.h"

@implementation OAIComAdobeGraniteAuthOauthProviderProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"oauthConfigId": @"oauth.config.id", @"oauthClientId": @"oauth.client.id", @"oauthClientSecret": @"oauth.client.secret", @"oauthScope": @"oauth.scope", @"oauthConfigProviderId": @"oauth.config.provider.id", @"oauthCreateUsers": @"oauth.create.users", @"oauthUseridProperty": @"oauth.userid.property", @"forceStrictUsernameMatching": @"force.strict.username.matching", @"oauthEncodeUserids": @"oauth.encode.userids", @"oauthHashUserids": @"oauth.hash.userids", @"oauthCallBackUrl": @"oauth.callBackUrl", @"oauthAccessTokenPersist": @"oauth.access.token.persist", @"oauthAccessTokenPersistCookie": @"oauth.access.token.persist.cookie", @"oauthCsrfStateProtection": @"oauth.csrf.state.protection", @"oauthRedirectRequestParams": @"oauth.redirect.request.params", @"oauthConfigSiblingsAllow": @"oauth.config.siblings.allow" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"oauthConfigId", @"oauthClientId", @"oauthClientSecret", @"oauthScope", @"oauthConfigProviderId", @"oauthCreateUsers", @"oauthUseridProperty", @"forceStrictUsernameMatching", @"oauthEncodeUserids", @"oauthHashUserids", @"oauthCallBackUrl", @"oauthAccessTokenPersist", @"oauthAccessTokenPersistCookie", @"oauthCsrfStateProtection", @"oauthRedirectRequestParams", @"oauthConfigSiblingsAllow"];
  return [optionalProperties containsObject:propertyName];
}

@end
