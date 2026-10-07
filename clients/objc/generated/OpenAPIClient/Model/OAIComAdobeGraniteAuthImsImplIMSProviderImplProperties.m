#import "OAIComAdobeGraniteAuthImsImplIMSProviderImplProperties.h"

@implementation OAIComAdobeGraniteAuthImsImplIMSProviderImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"oauthProviderId": @"oauth.provider.id", @"oauthProviderImsAuthorizationUrl": @"oauth.provider.ims.authorization.url", @"oauthProviderImsTokenUrl": @"oauth.provider.ims.token.url", @"oauthProviderImsProfileUrl": @"oauth.provider.ims.profile.url", @"oauthProviderImsExtendedDetailsUrls": @"oauth.provider.ims.extended.details.urls", @"oauthProviderImsValidateTokenUrl": @"oauth.provider.ims.validate.token.url", @"oauthProviderImsSessionProperty": @"oauth.provider.ims.session.property", @"oauthProviderImsServiceTokenClientId": @"oauth.provider.ims.service.token.client.id", @"oauthProviderImsServiceTokenClientSecret": @"oauth.provider.ims.service.token.client.secret", @"oauthProviderImsServiceToken": @"oauth.provider.ims.service.token", @"imsOrgRef": @"ims.org.ref", @"imsGroupMapping": @"ims.group.mapping", @"oauthProviderImsOnlyLicenseGroup": @"oauth.provider.ims.only.license.group" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"oauthProviderId", @"oauthProviderImsAuthorizationUrl", @"oauthProviderImsTokenUrl", @"oauthProviderImsProfileUrl", @"oauthProviderImsExtendedDetailsUrls", @"oauthProviderImsValidateTokenUrl", @"oauthProviderImsSessionProperty", @"oauthProviderImsServiceTokenClientId", @"oauthProviderImsServiceTokenClientSecret", @"oauthProviderImsServiceToken", @"imsOrgRef", @"imsGroupMapping", @"oauthProviderImsOnlyLicenseGroup"];
  return [optionalProperties containsObject:propertyName];
}

@end
