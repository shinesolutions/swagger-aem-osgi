#import "OAIComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.h"

@implementation OAIComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"path": @"path", @"serviceRanking": @"service.ranking", @"idpUrl": @"idpUrl", @"idpCertAlias": @"idpCertAlias", @"idpHttpRedirect": @"idpHttpRedirect", @"serviceProviderEntityId": @"serviceProviderEntityId", @"assertionConsumerServiceURL": @"assertionConsumerServiceURL", @"spPrivateKeyAlias": @"spPrivateKeyAlias", @"keyStorePassword": @"keyStorePassword", @"defaultRedirectUrl": @"defaultRedirectUrl", @"userIDAttribute": @"userIDAttribute", @"useEncryption": @"useEncryption", @"createUser": @"createUser", @"userIntermediatePath": @"userIntermediatePath", @"addGroupMemberships": @"addGroupMemberships", @"groupMembershipAttribute": @"groupMembershipAttribute", @"defaultGroups": @"defaultGroups", @"nameIdFormat": @"nameIdFormat", @"synchronizeAttributes": @"synchronizeAttributes", @"handleLogout": @"handleLogout", @"logoutUrl": @"logoutUrl", @"clockTolerance": @"clockTolerance", @"digestMethod": @"digestMethod", @"signatureMethod": @"signatureMethod", @"identitySyncType": @"identitySyncType", @"idpIdentifier": @"idpIdentifier" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"path", @"serviceRanking", @"idpUrl", @"idpCertAlias", @"idpHttpRedirect", @"serviceProviderEntityId", @"assertionConsumerServiceURL", @"spPrivateKeyAlias", @"keyStorePassword", @"defaultRedirectUrl", @"userIDAttribute", @"useEncryption", @"createUser", @"userIntermediatePath", @"addGroupMemberships", @"groupMembershipAttribute", @"defaultGroups", @"nameIdFormat", @"synchronizeAttributes", @"handleLogout", @"logoutUrl", @"clockTolerance", @"digestMethod", @"signatureMethod", @"identitySyncType", @"idpIdentifier"];
  return [optionalProperties containsObject:propertyName];
}

@end
