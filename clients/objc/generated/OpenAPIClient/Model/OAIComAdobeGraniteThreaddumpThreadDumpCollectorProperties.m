#import "OAIComAdobeGraniteThreaddumpThreadDumpCollectorProperties.h"

@implementation OAIComAdobeGraniteThreaddumpThreadDumpCollectorProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"schedulerPeriod": @"scheduler.period", @"schedulerRunOn": @"scheduler.runOn", @"graniteThreaddumpEnabled": @"granite.threaddump.enabled", @"graniteThreaddumpDumpsPerFile": @"granite.threaddump.dumpsPerFile", @"graniteThreaddumpEnableGzipCompression": @"granite.threaddump.enableGzipCompression", @"graniteThreaddumpEnableDirectoriesCompression": @"granite.threaddump.enableDirectoriesCompression", @"graniteThreaddumpEnableJStack": @"granite.threaddump.enableJStack", @"graniteThreaddumpMaxBackupDays": @"granite.threaddump.maxBackupDays", @"graniteThreaddumpBackupCleanTrigger": @"granite.threaddump.backupCleanTrigger" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"schedulerPeriod", @"schedulerRunOn", @"graniteThreaddumpEnabled", @"graniteThreaddumpDumpsPerFile", @"graniteThreaddumpEnableGzipCompression", @"graniteThreaddumpEnableDirectoriesCompression", @"graniteThreaddumpEnableJStack", @"graniteThreaddumpMaxBackupDays", @"graniteThreaddumpBackupCleanTrigger"];
  return [optionalProperties containsObject:propertyName];
}

@end
