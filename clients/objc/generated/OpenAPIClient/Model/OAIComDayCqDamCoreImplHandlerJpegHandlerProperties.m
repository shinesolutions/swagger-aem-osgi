#import "OAIComDayCqDamCoreImplHandlerJpegHandlerProperties.h"

@implementation OAIComDayCqDamCoreImplHandlerJpegHandlerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqDamEnableExtMetaExtraction": @"cq.dam.enable.ext.meta.extraction", @"largeFileThreshold": @"large_file_threshold", @"largeCommentThreshold": @"large_comment_threshold" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqDamEnableExtMetaExtraction", @"largeFileThreshold", @"largeCommentThreshold"];
  return [optionalProperties containsObject:propertyName];
}

@end
