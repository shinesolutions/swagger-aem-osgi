#import "OAIOrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.h"

@implementation OAIOrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"type": @"type", @"importMode": @"importMode", @"aclHandling": @"aclHandling", @"packageRoots": @"package.roots", @"packageFilters": @"package.filters", @"propertyFilters": @"property.filters", @"tempFsFolder": @"tempFsFolder", @"useBinaryReferences": @"useBinaryReferences", @"autoSaveThreshold": @"autoSaveThreshold", @"cleanupDelay": @"cleanupDelay", @"fileThreshold": @"fileThreshold", @"mEGABYTES": @"MEGA_BYTES", @"useOffHeapMemory": @"useOffHeapMemory", @"digestAlgorithm": @"digestAlgorithm", @"monitoringQueueSize": @"monitoringQueueSize", @"pathsMapping": @"pathsMapping", @"strictImport": @"strictImport" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"type", @"importMode", @"aclHandling", @"packageRoots", @"packageFilters", @"propertyFilters", @"tempFsFolder", @"useBinaryReferences", @"autoSaveThreshold", @"cleanupDelay", @"fileThreshold", @"mEGABYTES", @"useOffHeapMemory", @"digestAlgorithm", @"monitoringQueueSize", @"pathsMapping", @"strictImport"];
  return [optionalProperties containsObject:propertyName];
}

@end
