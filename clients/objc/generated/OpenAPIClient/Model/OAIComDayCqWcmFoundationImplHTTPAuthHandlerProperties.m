#import "OAIComDayCqWcmFoundationImplHTTPAuthHandlerProperties.h"

@implementation OAIComDayCqWcmFoundationImplHTTPAuthHandlerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"path": @"path", @"authHttpNologin": @"auth.http.nologin", @"authHttpRealm": @"auth.http.realm", @"authDefaultLoginpage": @"auth.default.loginpage", @"authCredForm": @"auth.cred.form", @"authCredUtf8": @"auth.cred.utf8" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"path", @"authHttpNologin", @"authHttpRealm", @"authDefaultLoginpage", @"authCredForm", @"authCredUtf8"];
  return [optionalProperties containsObject:propertyName];
}

@end
