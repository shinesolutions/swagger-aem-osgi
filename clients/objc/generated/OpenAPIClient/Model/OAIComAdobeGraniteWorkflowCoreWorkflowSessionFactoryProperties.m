#import "OAIComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.h"

@implementation OAIComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"graniteWorkflowinboxSortPropertyName": @"granite.workflowinbox.sort.propertyName", @"graniteWorkflowinboxSortOrder": @"granite.workflowinbox.sort.order", @"cqWorkflowJobRetry": @"cq.workflow.job.retry", @"cqWorkflowSuperuser": @"cq.workflow.superuser", @"graniteWorkflowInboxQuerySize": @"granite.workflow.inboxQuerySize", @"graniteWorkflowAdminUserGroupFilter": @"granite.workflow.adminUserGroupFilter", @"graniteWorkflowEnforceWorkitemAssigneePermissions": @"granite.workflow.enforceWorkitemAssigneePermissions", @"graniteWorkflowEnforceWorkflowInitiatorPermissions": @"granite.workflow.enforceWorkflowInitiatorPermissions", @"graniteWorkflowInjectTenantIdInJobTopics": @"granite.workflow.injectTenantIdInJobTopics", @"graniteWorkflowMaxPurgeSaveThreshold": @"granite.workflow.maxPurgeSaveThreshold", @"graniteWorkflowMaxPurgeQueryCount": @"granite.workflow.maxPurgeQueryCount" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"graniteWorkflowinboxSortPropertyName", @"graniteWorkflowinboxSortOrder", @"cqWorkflowJobRetry", @"cqWorkflowSuperuser", @"graniteWorkflowInboxQuerySize", @"graniteWorkflowAdminUserGroupFilter", @"graniteWorkflowEnforceWorkitemAssigneePermissions", @"graniteWorkflowEnforceWorkflowInitiatorPermissions", @"graniteWorkflowInjectTenantIdInJobTopics", @"graniteWorkflowMaxPurgeSaveThreshold", @"graniteWorkflowMaxPurgeQueryCount"];
  return [optionalProperties containsObject:propertyName];
}

@end
