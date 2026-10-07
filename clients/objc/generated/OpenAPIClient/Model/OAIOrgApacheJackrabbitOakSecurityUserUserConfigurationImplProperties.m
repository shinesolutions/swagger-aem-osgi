#import "OAIOrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.h"

@implementation OAIOrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"usersPath": @"usersPath", @"groupsPath": @"groupsPath", @"systemRelativePath": @"systemRelativePath", @"defaultDepth": @"defaultDepth", @"importBehavior": @"importBehavior", @"passwordHashAlgorithm": @"passwordHashAlgorithm", @"passwordHashIterations": @"passwordHashIterations", @"passwordSaltSize": @"passwordSaltSize", @"omitAdminPw": @"omitAdminPw", @"supportAutoSave": @"supportAutoSave", @"passwordMaxAge": @"passwordMaxAge", @"initialPasswordChange": @"initialPasswordChange", @"passwordHistorySize": @"passwordHistorySize", @"passwordExpiryForAdmin": @"passwordExpiryForAdmin", @"cacheExpiration": @"cacheExpiration", @"enableRFC7613UsercaseMappedProfile": @"enableRFC7613UsercaseMappedProfile" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"usersPath", @"groupsPath", @"systemRelativePath", @"defaultDepth", @"importBehavior", @"passwordHashAlgorithm", @"passwordHashIterations", @"passwordSaltSize", @"omitAdminPw", @"supportAutoSave", @"passwordMaxAge", @"initialPasswordChange", @"passwordHistorySize", @"passwordExpiryForAdmin", @"cacheExpiration", @"enableRFC7613UsercaseMappedProfile"];
  return [optionalProperties containsObject:propertyName];
}

@end
