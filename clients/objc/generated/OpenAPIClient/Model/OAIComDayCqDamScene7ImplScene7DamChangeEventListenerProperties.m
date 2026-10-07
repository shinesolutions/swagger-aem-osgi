#import "OAIComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.h"

@implementation OAIComDayCqDamScene7ImplScene7DamChangeEventListenerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqDamScene7DamchangeeventlistenerEnabled": @"cq.dam.scene7.damchangeeventlistener.enabled", @"cqDamScene7DamchangeeventlistenerObservedPaths": @"cq.dam.scene7.damchangeeventlistener.observed.paths" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqDamScene7DamchangeeventlistenerEnabled", @"cqDamScene7DamchangeeventlistenerObservedPaths"];
  return [optionalProperties containsObject:propertyName];
}

@end
