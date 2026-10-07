#import "OAIComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.h"

@implementation OAIComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqPagesupdatehandlerImageresourcetypes": @"cq.pagesupdatehandler.imageresourcetypes", @"cqPagesupdatehandlerProductresourcetypes": @"cq.pagesupdatehandler.productresourcetypes", @"cqPagesupdatehandlerVideoresourcetypes": @"cq.pagesupdatehandler.videoresourcetypes", @"cqPagesupdatehandlerDynamicsequenceresourcetypes": @"cq.pagesupdatehandler.dynamicsequenceresourcetypes", @"cqPagesupdatehandlerPreviewmodepaths": @"cq.pagesupdatehandler.previewmodepaths" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqPagesupdatehandlerImageresourcetypes", @"cqPagesupdatehandlerProductresourcetypes", @"cqPagesupdatehandlerVideoresourcetypes", @"cqPagesupdatehandlerDynamicsequenceresourcetypes", @"cqPagesupdatehandlerPreviewmodepaths"];
  return [optionalProperties containsObject:propertyName];
}

@end
