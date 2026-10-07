#import "OAIOrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.h"

@implementation OAIOrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"handlerName": @"handler.name", @"userExpirationTime": @"user.expirationTime", @"userAutoMembership": @"user.autoMembership", @"userPropertyMapping": @"user.propertyMapping", @"userPathPrefix": @"user.pathPrefix", @"userMembershipExpTime": @"user.membershipExpTime", @"userMembershipNestingDepth": @"user.membershipNestingDepth", @"userDynamicMembership": @"user.dynamicMembership", @"userDisableMissing": @"user.disableMissing", @"groupExpirationTime": @"group.expirationTime", @"groupAutoMembership": @"group.autoMembership", @"groupPropertyMapping": @"group.propertyMapping", @"groupPathPrefix": @"group.pathPrefix", @"enableRFC7613UsercaseMappedProfile": @"enableRFC7613UsercaseMappedProfile" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"handlerName", @"userExpirationTime", @"userAutoMembership", @"userPropertyMapping", @"userPathPrefix", @"userMembershipExpTime", @"userMembershipNestingDepth", @"userDynamicMembership", @"userDisableMissing", @"groupExpirationTime", @"groupAutoMembership", @"groupPropertyMapping", @"groupPathPrefix", @"enableRFC7613UsercaseMappedProfile"];
  return [optionalProperties containsObject:propertyName];
}

@end
