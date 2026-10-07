#import "OAIOrgApacheSlingEventJobsQueueConfigurationProperties.h"

@implementation OAIOrgApacheSlingEventJobsQueueConfigurationProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"queueName": @"queue.name", @"queueTopics": @"queue.topics", @"queueType": @"queue.type", @"queuePriority": @"queue.priority", @"queueRetries": @"queue.retries", @"queueRetrydelay": @"queue.retrydelay", @"queueMaxparallel": @"queue.maxparallel", @"queueKeepJobs": @"queue.keepJobs", @"queuePreferRunOnCreationInstance": @"queue.preferRunOnCreationInstance", @"queueThreadPoolSize": @"queue.threadPoolSize", @"serviceRanking": @"service.ranking" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"queueName", @"queueTopics", @"queueType", @"queuePriority", @"queueRetries", @"queueRetrydelay", @"queueMaxparallel", @"queueKeepJobs", @"queuePreferRunOnCreationInstance", @"queueThreadPoolSize", @"serviceRanking"];
  return [optionalProperties containsObject:propertyName];
}

@end
