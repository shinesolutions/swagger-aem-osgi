#import "OAIComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.h"

@implementation OAIComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"translateLanguage": @"translate.language", @"translateDisplay": @"translate.display", @"translateAttribution": @"translate.attribution", @"translateCaching": @"translate.caching", @"translateSmartRendering": @"translate.smart.rendering", @"translateCachingDuration": @"translate.caching.duration", @"translateSessionSaveInterval": @"translate.session.save.interval", @"translateSessionSaveBatchLimit": @"translate.session.save.batchLimit" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"translateLanguage", @"translateDisplay", @"translateAttribution", @"translateCaching", @"translateSmartRendering", @"translateCachingDuration", @"translateSessionSaveInterval", @"translateSessionSaveBatchLimit"];
  return [optionalProperties containsObject:propertyName];
}

@end
