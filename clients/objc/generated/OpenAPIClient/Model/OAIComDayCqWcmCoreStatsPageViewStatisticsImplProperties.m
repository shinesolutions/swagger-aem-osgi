#import "OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties.h"

@implementation OAIComDayCqWcmCoreStatsPageViewStatisticsImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"pageviewstatisticsTrackingurl": @"pageviewstatistics.trackingurl", @"pageviewstatisticsTrackingscriptEnabled": @"pageviewstatistics.trackingscript.enabled" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"pageviewstatisticsTrackingurl", @"pageviewstatisticsTrackingscriptEnabled"];
  return [optionalProperties containsObject:propertyName];
}

@end
