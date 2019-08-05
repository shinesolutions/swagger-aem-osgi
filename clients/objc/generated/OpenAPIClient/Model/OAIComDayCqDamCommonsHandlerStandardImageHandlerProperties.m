#import "OAIComDayCqDamCommonsHandlerStandardImageHandlerProperties.h"

@implementation OAIComDayCqDamCommonsHandlerStandardImageHandlerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"largeFileThreshold": @"large_file_threshold", @"largeCommentThreshold": @"large_comment_threshold", @"cqDamEnableExtMetaExtraction": @"cq.dam.enable.ext.meta.extraction" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"largeFileThreshold", @"largeCommentThreshold", @"cqDamEnableExtMetaExtraction"];
  return [optionalProperties containsObject:propertyName];
}

@end
