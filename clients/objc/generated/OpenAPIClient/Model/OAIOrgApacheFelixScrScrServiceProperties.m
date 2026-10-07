#import "OAIOrgApacheFelixScrScrServiceProperties.h"

@implementation OAIOrgApacheFelixScrScrServiceProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"dsLoglevel": @"ds.loglevel", @"dsFactoryEnabled": @"ds.factory.enabled", @"dsDelayedKeepInstances": @"ds.delayed.keepInstances", @"dsLockTimeoutMilliseconds": @"ds.lock.timeout.milliseconds", @"dsStopTimeoutMilliseconds": @"ds.stop.timeout.milliseconds", @"dsGlobalExtender": @"ds.global.extender" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"dsLoglevel", @"dsFactoryEnabled", @"dsDelayedKeepInstances", @"dsLockTimeoutMilliseconds", @"dsStopTimeoutMilliseconds", @"dsGlobalExtender"];
  return [optionalProperties containsObject:propertyName];
}

@end
