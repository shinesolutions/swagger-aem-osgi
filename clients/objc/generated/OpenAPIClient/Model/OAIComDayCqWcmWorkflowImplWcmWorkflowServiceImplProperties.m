#import "OAIComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.h"

@implementation OAIComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"eventFilter": @"event.filter", @"minThreadPoolSize": @"minThreadPoolSize", @"maxThreadPoolSize": @"maxThreadPoolSize", @"cqWcmWorkflowTerminateOnActivate": @"cq.wcm.workflow.terminate.on.activate", @"cqWcmWorklfowTerminateExclusionList": @"cq.wcm.worklfow.terminate.exclusion.list" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"eventFilter", @"minThreadPoolSize", @"maxThreadPoolSize", @"cqWcmWorkflowTerminateOnActivate", @"cqWcmWorklfowTerminateExclusionList"];
  return [optionalProperties containsObject:propertyName];
}

@end
