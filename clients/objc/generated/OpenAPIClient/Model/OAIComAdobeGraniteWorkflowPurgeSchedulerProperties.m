#import "OAIComAdobeGraniteWorkflowPurgeSchedulerProperties.h"

@implementation OAIComAdobeGraniteWorkflowPurgeSchedulerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"scheduledpurgeName": @"scheduledpurge.name", @"scheduledpurgeWorkflowStatus": @"scheduledpurge.workflowStatus", @"scheduledpurgeModelIds": @"scheduledpurge.modelIds", @"scheduledpurgeDaysold": @"scheduledpurge.daysold" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"scheduledpurgeName", @"scheduledpurgeWorkflowStatus", @"scheduledpurgeModelIds", @"scheduledpurgeDaysold"];
  return [optionalProperties containsObject:propertyName];
}

@end
