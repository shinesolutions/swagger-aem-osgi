#import "OAIComAdobeGraniteAuthOauthImplGraniteProviderProperties.h"

@implementation OAIComAdobeGraniteAuthOauthImplGraniteProviderProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"oauthProviderId": @"oauth.provider.id", @"oauthProviderGraniteAuthorizationUrl": @"oauth.provider.granite.authorization.url", @"oauthProviderGraniteTokenUrl": @"oauth.provider.granite.token.url", @"oauthProviderGraniteProfileUrl": @"oauth.provider.granite.profile.url", @"oauthProviderGraniteExtendedDetailsUrls": @"oauth.provider.granite.extended.details.urls" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"oauthProviderId", @"oauthProviderGraniteAuthorizationUrl", @"oauthProviderGraniteTokenUrl", @"oauthProviderGraniteProfileUrl", @"oauthProviderGraniteExtendedDetailsUrls"];
  return [optionalProperties containsObject:propertyName];
}

@end
