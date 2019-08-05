#import "OAIComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.h"

@implementation OAIComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"path": @"path", @"oauthClientIdsAllowed": @"oauth.clientIds.allowed", @"authBearerSyncIms": @"auth.bearer.sync.ims", @"authTokenRequestParameter": @"auth.tokenRequestParameter", @"oauthBearerConfigid": @"oauth.bearer.configid", @"oauthJwtSupport": @"oauth.jwt.support" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"path", @"oauthClientIdsAllowed", @"authBearerSyncIms", @"authTokenRequestParameter", @"oauthBearerConfigid", @"oauthJwtSupport"];
  return [optionalProperties containsObject:propertyName];
}

@end
