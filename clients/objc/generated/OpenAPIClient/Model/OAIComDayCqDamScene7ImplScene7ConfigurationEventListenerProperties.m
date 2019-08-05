#import "OAIComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.h"

@implementation OAIComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqDamScene7ConfigurationeventlistenerEnabled": @"cq.dam.scene7.configurationeventlistener.enabled" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqDamScene7ConfigurationeventlistenerEnabled"];
  return [optionalProperties containsObject:propertyName];
}

@end
