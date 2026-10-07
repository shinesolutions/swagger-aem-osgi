#import "OAIComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.h"

@implementation OAIComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"patternTime": @"pattern.time", @"patternNewline": @"pattern.newline", @"patternDayOfMonth": @"pattern.dayOfMonth", @"patternMonth": @"pattern.month", @"patternYear": @"pattern.year", @"patternDate": @"pattern.date", @"patternDateTime": @"pattern.dateTime", @"patternEmail": @"pattern.email" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"patternTime", @"patternNewline", @"patternDayOfMonth", @"patternMonth", @"patternYear", @"patternDate", @"patternDateTime", @"patternEmail"];
  return [optionalProperties containsObject:propertyName];
}

@end
