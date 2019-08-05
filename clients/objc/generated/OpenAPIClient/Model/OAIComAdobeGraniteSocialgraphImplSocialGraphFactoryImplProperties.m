#import "OAIComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.h"

@implementation OAIComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"group2memberRelationshipOutgoing": @"group2member.relationship.outgoing", @"group2memberExcludedOutgoing": @"group2member.excluded.outgoing", @"group2memberRelationshipIncoming": @"group2member.relationship.incoming", @"group2memberExcludedIncoming": @"group2member.excluded.incoming" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"group2memberRelationshipOutgoing", @"group2memberExcludedOutgoing", @"group2memberRelationshipIncoming", @"group2memberExcludedIncoming"];
  return [optionalProperties containsObject:propertyName];
}

@end
