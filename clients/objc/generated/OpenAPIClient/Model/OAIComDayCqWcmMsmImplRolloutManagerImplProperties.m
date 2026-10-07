#import "OAIComDayCqWcmMsmImplRolloutManagerImplProperties.h"

@implementation OAIComDayCqWcmMsmImplRolloutManagerImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"eventFilter": @"event.filter", @"rolloutmgrExcludedpropsDefault": @"rolloutmgr.excludedprops.default", @"rolloutmgrExcludedparagraphpropsDefault": @"rolloutmgr.excludedparagraphprops.default", @"rolloutmgrExcludednodetypesDefault": @"rolloutmgr.excludednodetypes.default", @"rolloutmgrThreadpoolMaxsize": @"rolloutmgr.threadpool.maxsize", @"rolloutmgrThreadpoolMaxshutdowntime": @"rolloutmgr.threadpool.maxshutdowntime", @"rolloutmgrThreadpoolPriority": @"rolloutmgr.threadpool.priority", @"rolloutmgrCommitSize": @"rolloutmgr.commit.size", @"rolloutmgrConflicthandlingEnabled": @"rolloutmgr.conflicthandling.enabled" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"eventFilter", @"rolloutmgrExcludedpropsDefault", @"rolloutmgrExcludedparagraphpropsDefault", @"rolloutmgrExcludednodetypesDefault", @"rolloutmgrThreadpoolMaxsize", @"rolloutmgrThreadpoolMaxshutdowntime", @"rolloutmgrThreadpoolPriority", @"rolloutmgrCommitSize", @"rolloutmgrConflicthandlingEnabled"];
  return [optionalProperties containsObject:propertyName];
}

@end
