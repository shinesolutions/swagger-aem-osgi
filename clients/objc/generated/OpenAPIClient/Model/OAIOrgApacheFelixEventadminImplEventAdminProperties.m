#import "OAIOrgApacheFelixEventadminImplEventAdminProperties.h"

@implementation OAIOrgApacheFelixEventadminImplEventAdminProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"orgApacheFelixEventadminThreadPoolSize": @"org.apache.felix.eventadmin.ThreadPoolSize", @"orgApacheFelixEventadminAsyncToSyncThreadRatio": @"org.apache.felix.eventadmin.AsyncToSyncThreadRatio", @"orgApacheFelixEventadminTimeout": @"org.apache.felix.eventadmin.Timeout", @"orgApacheFelixEventadminRequireTopic": @"org.apache.felix.eventadmin.RequireTopic", @"orgApacheFelixEventadminIgnoreTimeout": @"org.apache.felix.eventadmin.IgnoreTimeout", @"orgApacheFelixEventadminIgnoreTopic": @"org.apache.felix.eventadmin.IgnoreTopic" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"orgApacheFelixEventadminThreadPoolSize", @"orgApacheFelixEventadminAsyncToSyncThreadRatio", @"orgApacheFelixEventadminTimeout", @"orgApacheFelixEventadminRequireTopic", @"orgApacheFelixEventadminIgnoreTimeout", @"orgApacheFelixEventadminIgnoreTopic"];
  return [optionalProperties containsObject:propertyName];
}

@end
