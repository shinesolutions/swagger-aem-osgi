#import "OAIComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.h"

@implementation OAIComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"jmxObjectname": @"jmx.objectname", @"propertyMeasureEnabled": @"property.measure.enabled", @"propertyName": @"property.name", @"propertyMaxWaitMs": @"property.max.wait.ms", @"propertyMaxRate": @"property.max.rate", @"fulltextMeasureEnabled": @"fulltext.measure.enabled", @"fulltextName": @"fulltext.name", @"fulltextMaxWaitMs": @"fulltext.max.wait.ms", @"fulltextMaxRate": @"fulltext.max.rate" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"jmxObjectname", @"propertyMeasureEnabled", @"propertyName", @"propertyMaxWaitMs", @"propertyMaxRate", @"fulltextMeasureEnabled", @"fulltextName", @"fulltextMaxWaitMs", @"fulltextMaxRate"];
  return [optionalProperties containsObject:propertyName];
}

@end
