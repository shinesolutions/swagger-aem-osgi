#import "OAIComAdobeGraniteWorkflowCoreWorkflowConfigProperties.h"

@implementation OAIComAdobeGraniteWorkflowCoreWorkflowConfigProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqWorkflowConfigWorkflowPackagesRootPath": @"cq.workflow.config.workflow.packages.root.path", @"cqWorkflowConfigWorkflowProcessLegacyMode": @"cq.workflow.config.workflow.process.legacy.mode", @"cqWorkflowConfigAllowLocking": @"cq.workflow.config.allow.locking" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqWorkflowConfigWorkflowPackagesRootPath", @"cqWorkflowConfigWorkflowProcessLegacyMode", @"cqWorkflowConfigAllowLocking"];
  return [optionalProperties containsObject:propertyName];
}

@end
