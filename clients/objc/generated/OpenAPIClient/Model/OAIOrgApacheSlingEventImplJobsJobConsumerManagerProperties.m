#import "OAIOrgApacheSlingEventImplJobsJobConsumerManagerProperties.h"

@implementation OAIOrgApacheSlingEventImplJobsJobConsumerManagerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"orgApacheSlingInstallerConfigurationPersist": @"org.apache.sling.installer.configuration.persist", @"jobConsumermanagerWhitelist": @"job.consumermanager.whitelist", @"jobConsumermanagerBlacklist": @"job.consumermanager.blacklist" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"orgApacheSlingInstallerConfigurationPersist", @"jobConsumermanagerWhitelist", @"jobConsumermanagerBlacklist"];
  return [optionalProperties containsObject:propertyName];
}

@end
