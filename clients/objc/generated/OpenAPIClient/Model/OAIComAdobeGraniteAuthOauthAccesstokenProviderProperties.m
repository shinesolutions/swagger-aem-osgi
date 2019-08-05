#import "OAIComAdobeGraniteAuthOauthAccesstokenProviderProperties.h"

@implementation OAIComAdobeGraniteAuthOauthAccesstokenProviderProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"authTokenProviderTitle": @"auth.token.provider.title", @"authTokenProviderDefaultClaims": @"auth.token.provider.default.claims", @"authTokenProviderEndpoint": @"auth.token.provider.endpoint", @"authAccessTokenRequest": @"auth.access.token.request", @"authTokenProviderKeypairAlias": @"auth.token.provider.keypair.alias", @"authTokenProviderConnTimeout": @"auth.token.provider.conn.timeout", @"authTokenProviderSoTimeout": @"auth.token.provider.so.timeout", @"authTokenProviderClientId": @"auth.token.provider.client.id", @"authTokenProviderScope": @"auth.token.provider.scope", @"authTokenProviderReuseAccessToken": @"auth.token.provider.reuse.access.token", @"authTokenProviderRelaxedSsl": @"auth.token.provider.relaxed.ssl", @"tokenRequestCustomizerType": @"token.request.customizer.type", @"authTokenValidatorType": @"auth.token.validator.type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"authTokenProviderTitle", @"authTokenProviderDefaultClaims", @"authTokenProviderEndpoint", @"authAccessTokenRequest", @"authTokenProviderKeypairAlias", @"authTokenProviderConnTimeout", @"authTokenProviderSoTimeout", @"authTokenProviderClientId", @"authTokenProviderScope", @"authTokenProviderReuseAccessToken", @"authTokenProviderRelaxedSsl", @"tokenRequestCustomizerType", @"authTokenValidatorType"];
  return [optionalProperties containsObject:propertyName];
}

@end
