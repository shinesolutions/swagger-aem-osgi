#import "OAIComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.h"

@implementation OAIComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"mailerEmailEmbed": @"mailer.email.embed", @"mailerEmailCharset": @"mailer.email.charset", @"mailerEmailRetrieverUserID": @"mailer.email.retrieverUserID", @"mailerEmailRetrieverUserPWD": @"mailer.email.retrieverUserPWD" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"mailerEmailEmbed", @"mailerEmailCharset", @"mailerEmailRetrieverUserID", @"mailerEmailRetrieverUserPWD"];
  return [optionalProperties containsObject:propertyName];
}

@end
