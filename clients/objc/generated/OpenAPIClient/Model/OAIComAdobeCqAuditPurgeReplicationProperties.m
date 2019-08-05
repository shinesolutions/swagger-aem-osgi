#import "OAIComAdobeCqAuditPurgeReplicationProperties.h"

@implementation OAIComAdobeCqAuditPurgeReplicationProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"auditlogRuleName": @"auditlog.rule.name", @"auditlogRuleContentpath": @"auditlog.rule.contentpath", @"auditlogRuleMinimumage": @"auditlog.rule.minimumage", @"auditlogRuleTypes": @"auditlog.rule.types" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"auditlogRuleName", @"auditlogRuleContentpath", @"auditlogRuleMinimumage", @"auditlogRuleTypes"];
  return [optionalProperties containsObject:propertyName];
}

@end
