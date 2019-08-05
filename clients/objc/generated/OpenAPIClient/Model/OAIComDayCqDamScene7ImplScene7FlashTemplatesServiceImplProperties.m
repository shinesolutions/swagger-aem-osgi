#import "OAIComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.h"

@implementation OAIComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"scene7FlashTemplatesRti": @"scene7FlashTemplates.rti", @"scene7FlashTemplatesRsi": @"scene7FlashTemplates.rsi", @"scene7FlashTemplatesRb": @"scene7FlashTemplates.rb", @"scene7FlashTemplatesRurl": @"scene7FlashTemplates.rurl", @"scene7FlashTemplateUrlFormatParameter": @"scene7FlashTemplate.urlFormatParameter" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"scene7FlashTemplatesRti", @"scene7FlashTemplatesRsi", @"scene7FlashTemplatesRb", @"scene7FlashTemplatesRurl", @"scene7FlashTemplateUrlFormatParameter"];
  return [optionalProperties containsObject:propertyName];
}

@end
