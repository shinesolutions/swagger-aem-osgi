#import "OAIComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.h"

@implementation OAIComAdobeCqInboxImplTypeproviderItemTypeProviderProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"inboxImplTypeproviderRegistrypaths": @"inbox.impl.typeprovider.registrypaths", @"inboxImplTypeproviderLegacypaths": @"inbox.impl.typeprovider.legacypaths", @"inboxImplTypeproviderDefaulturlFailureitem": @"inbox.impl.typeprovider.defaulturl.failureitem", @"inboxImplTypeproviderDefaulturlWorkitem": @"inbox.impl.typeprovider.defaulturl.workitem", @"inboxImplTypeproviderDefaulturlTask": @"inbox.impl.typeprovider.defaulturl.task" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"inboxImplTypeproviderRegistrypaths", @"inboxImplTypeproviderLegacypaths", @"inboxImplTypeproviderDefaulturlFailureitem", @"inboxImplTypeproviderDefaulturlWorkitem", @"inboxImplTypeproviderDefaulturlTask"];
  return [optionalProperties containsObject:propertyName];
}

@end
