#import "OAIComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.h"

@implementation OAIComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"syncTranslationStateSchedulingFormat": @"syncTranslationState.schedulingFormat", @"schedulingRepeatTranslationSchedulingFormat": @"schedulingRepeatTranslation.schedulingFormat", @"syncTranslationStateLockTimeoutInMinutes": @"syncTranslationState.lockTimeoutInMinutes", @"exportFormat": @"export.format" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"syncTranslationStateSchedulingFormat", @"schedulingRepeatTranslationSchedulingFormat", @"syncTranslationStateLockTimeoutInMinutes", @"exportFormat"];
  return [optionalProperties containsObject:propertyName];
}

@end
