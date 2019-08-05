#import "OAIComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.h"

@implementation OAIComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqWcmMsmActionExcludednodetypes": @"cq.wcm.msm.action.excludednodetypes", @"cqWcmMsmActionExcludedparagraphitems": @"cq.wcm.msm.action.excludedparagraphitems", @"cqWcmMsmActionExcludedprops": @"cq.wcm.msm.action.excludedprops" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqWcmMsmActionExcludednodetypes", @"cqWcmMsmActionExcludedparagraphitems", @"cqWcmMsmActionExcludedprops"];
  return [optionalProperties containsObject:propertyName];
}

@end
