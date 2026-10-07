#import "OAIComAdobeGraniteAuthOauthImplGithubProviderImplProperties.h"

@implementation OAIComAdobeGraniteAuthOauthImplGithubProviderImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"oauthProviderId": @"oauth.provider.id", @"oauthProviderGithubAuthorizationUrl": @"oauth.provider.github.authorization.url", @"oauthProviderGithubTokenUrl": @"oauth.provider.github.token.url", @"oauthProviderGithubProfileUrl": @"oauth.provider.github.profile.url" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"oauthProviderId", @"oauthProviderGithubAuthorizationUrl", @"oauthProviderGithubTokenUrl", @"oauthProviderGithubProfileUrl"];
  return [optionalProperties containsObject:propertyName];
}

@end
