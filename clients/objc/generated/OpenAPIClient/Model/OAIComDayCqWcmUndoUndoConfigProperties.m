#import "OAIComDayCqWcmUndoUndoConfigProperties.h"

@implementation OAIComDayCqWcmUndoUndoConfigProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqWcmUndoEnabled": @"cq.wcm.undo.enabled", @"cqWcmUndoPath": @"cq.wcm.undo.path", @"cqWcmUndoValidity": @"cq.wcm.undo.validity", @"cqWcmUndoSteps": @"cq.wcm.undo.steps", @"cqWcmUndoPersistence": @"cq.wcm.undo.persistence", @"cqWcmUndoPersistenceMode": @"cq.wcm.undo.persistence.mode", @"cqWcmUndoMarkermode": @"cq.wcm.undo.markermode", @"cqWcmUndoWhitelist": @"cq.wcm.undo.whitelist", @"cqWcmUndoBlacklist": @"cq.wcm.undo.blacklist" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqWcmUndoEnabled", @"cqWcmUndoPath", @"cqWcmUndoValidity", @"cqWcmUndoSteps", @"cqWcmUndoPersistence", @"cqWcmUndoPersistenceMode", @"cqWcmUndoMarkermode", @"cqWcmUndoWhitelist", @"cqWcmUndoBlacklist"];
  return [optionalProperties containsObject:propertyName];
}

@end
