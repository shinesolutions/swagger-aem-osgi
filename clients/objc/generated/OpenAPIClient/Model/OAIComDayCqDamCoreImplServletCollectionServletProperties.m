#import "OAIComDayCqDamCoreImplServletCollectionServletProperties.h"

@implementation OAIComDayCqDamCoreImplServletCollectionServletProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqDamBatchCollectionProperties": @"cq.dam.batch.collection.properties", @"cqDamBatchCollectionMaxcollections": @"cq.dam.batch.collection.maxcollections" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqDamBatchCollectionProperties", @"cqDamBatchCollectionMaxcollections"];
  return [optionalProperties containsObject:propertyName];
}

@end
