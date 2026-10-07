#import "OAIComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.h"

@implementation OAIComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"preUpgradeMaintenanceTasks": @"pre-upgrade.maintenance.tasks", @"preUpgradeHcTags": @"pre-upgrade.hc.tags" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"preUpgradeMaintenanceTasks", @"preUpgradeHcTags"];
  return [optionalProperties containsObject:propertyName];
}

@end
