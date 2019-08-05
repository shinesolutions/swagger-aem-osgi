#import "OAIOrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.h"

@implementation OAIOrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"minPoolSize": @"minPoolSize", @"maxPoolSize": @"maxPoolSize", @"queueSize": @"queueSize", @"maxThreadAge": @"maxThreadAge", @"keepAliveTime": @"keepAliveTime", @"blockPolicy": @"blockPolicy", @"shutdownGraceful": @"shutdownGraceful", @"daemon": @"daemon", @"shutdownWaitTime": @"shutdownWaitTime", @"priority": @"priority" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"minPoolSize", @"maxPoolSize", @"queueSize", @"maxThreadAge", @"keepAliveTime", @"blockPolicy", @"shutdownGraceful", @"daemon", @"shutdownWaitTime", @"priority"];
  return [optionalProperties containsObject:propertyName];
}

@end
