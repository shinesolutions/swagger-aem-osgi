#import "OAIOrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.h"

@implementation OAIOrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"orgApacheSlingInstallerConfigurationPersist": @"org.apache.sling.installer.configuration.persist", @"mode": @"mode", @"port": @"port", @"primaryHost": @"primary.host", @"interval": @"interval", @"primaryAllowedClientIpRanges": @"primary.allowed-client-ip-ranges", @"secure": @"secure", @"standbyReadtimeout": @"standby.readtimeout", @"standbyAutoclean": @"standby.autoclean" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"orgApacheSlingInstallerConfigurationPersist", @"mode", @"port", @"primaryHost", @"interval", @"primaryAllowedClientIpRanges", @"secure", @"standbyReadtimeout", @"standbyAutoclean"];
  return [optionalProperties containsObject:propertyName];
}

@end
