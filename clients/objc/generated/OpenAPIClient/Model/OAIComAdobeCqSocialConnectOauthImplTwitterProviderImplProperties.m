#import "OAIComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.h"

@implementation OAIComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"oauthProviderId": @"oauth.provider.id", @"oauthCloudConfigRoot": @"oauth.cloud.config.root", @"providerConfigRoot": @"provider.config.root", @"providerConfigUserFolder": @"provider.config.user.folder", @"providerConfigTwitterEnableParams": @"provider.config.twitter.enable.params", @"providerConfigTwitterParams": @"provider.config.twitter.params", @"providerConfigRefreshUserdataEnabled": @"provider.config.refresh.userdata.enabled" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"oauthProviderId", @"oauthCloudConfigRoot", @"providerConfigRoot", @"providerConfigUserFolder", @"providerConfigTwitterEnableParams", @"providerConfigTwitterParams", @"providerConfigRefreshUserdataEnabled"];
  return [optionalProperties containsObject:propertyName];
}

@end
