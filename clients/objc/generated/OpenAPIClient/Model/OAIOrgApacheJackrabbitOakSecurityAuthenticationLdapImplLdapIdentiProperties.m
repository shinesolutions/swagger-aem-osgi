#import "OAIOrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.h"

@implementation OAIOrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"providerName": @"provider.name", @"hostName": @"host.name", @"hostPort": @"host.port", @"hostSsl": @"host.ssl", @"hostTls": @"host.tls", @"hostNoCertCheck": @"host.noCertCheck", @"bindDn": @"bind.dn", @"bindPassword": @"bind.password", @"searchTimeout": @"searchTimeout", @"adminPoolMaxActive": @"adminPool.maxActive", @"adminPoolLookupOnValidate": @"adminPool.lookupOnValidate", @"userPoolMaxActive": @"userPool.maxActive", @"userPoolLookupOnValidate": @"userPool.lookupOnValidate", @"userBaseDN": @"user.baseDN", @"userObjectclass": @"user.objectclass", @"userIdAttribute": @"user.idAttribute", @"userExtraFilter": @"user.extraFilter", @"userMakeDnPath": @"user.makeDnPath", @"groupBaseDN": @"group.baseDN", @"groupObjectclass": @"group.objectclass", @"groupNameAttribute": @"group.nameAttribute", @"groupExtraFilter": @"group.extraFilter", @"groupMakeDnPath": @"group.makeDnPath", @"groupMemberAttribute": @"group.memberAttribute", @"useUidForExtId": @"useUidForExtId", @"customattributes": @"customattributes" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"providerName", @"hostName", @"hostPort", @"hostSsl", @"hostTls", @"hostNoCertCheck", @"bindDn", @"bindPassword", @"searchTimeout", @"adminPoolMaxActive", @"adminPoolLookupOnValidate", @"userPoolMaxActive", @"userPoolLookupOnValidate", @"userBaseDN", @"userObjectclass", @"userIdAttribute", @"userExtraFilter", @"userMakeDnPath", @"groupBaseDN", @"groupObjectclass", @"groupNameAttribute", @"groupExtraFilter", @"groupMakeDnPath", @"groupMemberAttribute", @"useUidForExtId", @"customattributes"];
  return [optionalProperties containsObject:propertyName];
}

@end
