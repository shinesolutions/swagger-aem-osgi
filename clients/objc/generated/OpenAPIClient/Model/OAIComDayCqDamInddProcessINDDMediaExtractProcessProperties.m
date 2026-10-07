#import "OAIComDayCqDamInddProcessINDDMediaExtractProcessProperties.h"

@implementation OAIComDayCqDamInddProcessINDDMediaExtractProcessProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"processLabel": @"process.label", @"cqDamInddPagesRegex": @"cq.dam.indd.pages.regex", @"idsJobDecoupled": @"ids.job.decoupled", @"idsJobWorkflowModel": @"ids.job.workflow.model" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"processLabel", @"cqDamInddPagesRegex", @"idsJobDecoupled", @"idsJobWorkflowModel"];
  return [optionalProperties containsObject:propertyName];
}

@end
