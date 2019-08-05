#import "OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.h"

@implementation OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"repositoryHome": @"repository.home", @"tarmkMode": @"tarmk.mode", @"tarmkSize": @"tarmk.size", @"segmentCacheSize": @"segmentCache.size", @"stringCacheSize": @"stringCache.size", @"templateCacheSize": @"templateCache.size", @"stringDeduplicationCacheSize": @"stringDeduplicationCache.size", @"templateDeduplicationCacheSize": @"templateDeduplicationCache.size", @"nodeDeduplicationCacheSize": @"nodeDeduplicationCache.size", @"pauseCompaction": @"pauseCompaction", @"compactionRetryCount": @"compaction.retryCount", @"compactionForceTimeout": @"compaction.force.timeout", @"compactionSizeDeltaEstimation": @"compaction.sizeDeltaEstimation", @"compactionDisableEstimation": @"compaction.disableEstimation", @"compactionRetainedGenerations": @"compaction.retainedGenerations", @"compactionMemoryThreshold": @"compaction.memoryThreshold", @"compactionProgressLog": @"compaction.progressLog", @"standby": @"standby", @"customBlobStore": @"customBlobStore", @"customSegmentStore": @"customSegmentStore", @"splitPersistence": @"splitPersistence", @"repositoryBackupDir": @"repository.backup.dir", @"blobGcMaxAgeInSecs": @"blobGcMaxAgeInSecs", @"blobTrackSnapshotIntervalInSecs": @"blobTrackSnapshotIntervalInSecs" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"repositoryHome", @"tarmkMode", @"tarmkSize", @"segmentCacheSize", @"stringCacheSize", @"templateCacheSize", @"stringDeduplicationCacheSize", @"templateDeduplicationCacheSize", @"nodeDeduplicationCacheSize", @"pauseCompaction", @"compactionRetryCount", @"compactionForceTimeout", @"compactionSizeDeltaEstimation", @"compactionDisableEstimation", @"compactionRetainedGenerations", @"compactionMemoryThreshold", @"compactionProgressLog", @"standby", @"customBlobStore", @"customSegmentStore", @"splitPersistence", @"repositoryBackupDir", @"blobGcMaxAgeInSecs", @"blobTrackSnapshotIntervalInSecs"];
  return [optionalProperties containsObject:propertyName];
}

@end
