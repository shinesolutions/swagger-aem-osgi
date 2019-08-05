#import "OAIComAdobeCqProjectsPurgeSchedulerProperties.h"

@implementation OAIComAdobeCqProjectsPurgeSchedulerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"scheduledpurgeName": @"scheduledpurge.name", @"scheduledpurgePurgeActive": @"scheduledpurge.purgeActive", @"scheduledpurgeTemplates": @"scheduledpurge.templates", @"scheduledpurgePurgeGroups": @"scheduledpurge.purgeGroups", @"scheduledpurgePurgeAssets": @"scheduledpurge.purgeAssets", @"scheduledpurgeTerminateRunningWorkflows": @"scheduledpurge.terminateRunningWorkflows", @"scheduledpurgeDaysold": @"scheduledpurge.daysold", @"scheduledpurgeSaveThreshold": @"scheduledpurge.saveThreshold" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"scheduledpurgeName", @"scheduledpurgePurgeActive", @"scheduledpurgeTemplates", @"scheduledpurgePurgeGroups", @"scheduledpurgePurgeAssets", @"scheduledpurgeTerminateRunningWorkflows", @"scheduledpurgeDaysold", @"scheduledpurgeSaveThreshold"];
  return [optionalProperties containsObject:propertyName];
}

@end
