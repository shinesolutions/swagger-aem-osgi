#import "OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.h"

@implementation OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"osgiHttpWhiteboardContextSelect": @"osgi.http.whiteboard.context.select", @"osgiHttpWhiteboardListener": @"osgi.http.whiteboard.listener", @"authSudoCookie": @"auth.sudo.cookie", @"authSudoParameter": @"auth.sudo.parameter", @"authAnnonymous": @"auth.annonymous", @"slingAuthRequirements": @"sling.auth.requirements", @"slingAuthAnonymousUser": @"sling.auth.anonymous.user", @"slingAuthAnonymousPassword": @"sling.auth.anonymous.password", @"authHttp": @"auth.http", @"authHttpRealm": @"auth.http.realm", @"authUriSuffix": @"auth.uri.suffix" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"osgiHttpWhiteboardContextSelect", @"osgiHttpWhiteboardListener", @"authSudoCookie", @"authSudoParameter", @"authAnnonymous", @"slingAuthRequirements", @"slingAuthAnonymousUser", @"slingAuthAnonymousPassword", @"authHttp", @"authHttpRealm", @"authUriSuffix"];
  return [optionalProperties containsObject:propertyName];
}

@end
