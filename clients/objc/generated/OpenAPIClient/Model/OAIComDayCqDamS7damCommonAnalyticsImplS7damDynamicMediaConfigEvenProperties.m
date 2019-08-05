#import "OAIComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.h"

@implementation OAIComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqDamS7damDynamicmediaconfigeventlistenerEnabled": @"cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqDamS7damDynamicmediaconfigeventlistenerEnabled"];
  return [optionalProperties containsObject:propertyName];
}

@end
