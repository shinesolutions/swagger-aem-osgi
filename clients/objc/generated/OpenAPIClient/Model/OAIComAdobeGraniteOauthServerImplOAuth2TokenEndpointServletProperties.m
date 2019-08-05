#import "OAIComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.h"

@implementation OAIComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"oauthIssuer": @"oauth.issuer", @"oauthAccessTokenExpiresIn": @"oauth.access.token.expires.in", @"osgiHttpWhiteboardServletPattern": @"osgi.http.whiteboard.servlet.pattern", @"osgiHttpWhiteboardContextSelect": @"osgi.http.whiteboard.context.select" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"oauthIssuer", @"oauthAccessTokenExpiresIn", @"osgiHttpWhiteboardServletPattern", @"osgiHttpWhiteboardContextSelect"];
  return [optionalProperties containsObject:propertyName];
}

@end
