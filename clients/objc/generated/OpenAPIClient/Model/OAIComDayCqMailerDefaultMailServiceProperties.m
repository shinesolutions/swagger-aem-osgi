#import "OAIComDayCqMailerDefaultMailServiceProperties.h"

@implementation OAIComDayCqMailerDefaultMailServiceProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"smtpHost": @"smtp.host", @"smtpPort": @"smtp.port", @"smtpUser": @"smtp.user", @"smtpPassword": @"smtp.password", @"fromAddress": @"from.address", @"smtpSsl": @"smtp.ssl", @"smtpStarttls": @"smtp.starttls", @"debugEmail": @"debug.email" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"smtpHost", @"smtpPort", @"smtpUser", @"smtpPassword", @"fromAddress", @"smtpSsl", @"smtpStarttls", @"debugEmail"];
  return [optionalProperties containsObject:propertyName];
}

@end
