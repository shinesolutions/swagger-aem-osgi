#import "OAIComAdobeCqAccountApiAccountManagementServiceProperties.h"

@implementation OAIComAdobeCqAccountApiAccountManagementServiceProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqAccountmanagerTokenValidityPeriod": @"cq.accountmanager.token.validity.period", @"cqAccountmanagerConfigRequestnewaccountMail": @"cq.accountmanager.config.requestnewaccount.mail", @"cqAccountmanagerConfigRequestnewpwdMail": @"cq.accountmanager.config.requestnewpwd.mail" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqAccountmanagerTokenValidityPeriod", @"cqAccountmanagerConfigRequestnewaccountMail", @"cqAccountmanagerConfigRequestnewpwdMail"];
  return [optionalProperties containsObject:propertyName];
}

@end
