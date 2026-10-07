#import "OAIComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.h"

@implementation OAIComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"preserveHierarchyNodes": @"preserve.hierarchy.nodes", @"ignoreVersioning": @"ignore.versioning", @"importAcl": @"import.acl", @"saveThreshold": @"save.threshold", @"preserveUserPaths": @"preserve.user.paths", @"preserveUuid": @"preserve.uuid", @"preserveUuidNodetypes": @"preserve.uuid.nodetypes", @"preserveUuidSubtrees": @"preserve.uuid.subtrees", @"autoCommit": @"auto.commit" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"preserveHierarchyNodes", @"ignoreVersioning", @"importAcl", @"saveThreshold", @"preserveUserPaths", @"preserveUuid", @"preserveUuidNodetypes", @"preserveUuidSubtrees", @"autoCommit"];
  return [optionalProperties containsObject:propertyName];
}

@end
