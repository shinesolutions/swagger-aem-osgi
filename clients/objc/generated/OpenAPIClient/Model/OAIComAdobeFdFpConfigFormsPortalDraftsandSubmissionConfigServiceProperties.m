#import "OAIComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.h"

@implementation OAIComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"portalOutboxes": @"portal.outboxes", @"draftDataService": @"draft.data.service", @"draftMetadataService": @"draft.metadata.service", @"submitDataService": @"submit.data.service", @"submitMetadataService": @"submit.metadata.service", @"pendingSignDataService": @"pendingSign.data.service", @"pendingSignMetadataService": @"pendingSign.metadata.service" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"portalOutboxes", @"draftDataService", @"draftMetadataService", @"submitDataService", @"submitMetadataService", @"pendingSignDataService", @"pendingSignMetadataService"];
  return [optionalProperties containsObject:propertyName];
}

@end
