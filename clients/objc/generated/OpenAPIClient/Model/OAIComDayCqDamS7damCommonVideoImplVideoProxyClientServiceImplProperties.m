#import "OAIComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.h"

@implementation OAIComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName": @"cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name", @"cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName": @"cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name", @"cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName": @"cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name", @"cqDamS7damVideoproxyclientserviceHttpReadtimeoutName": @"cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name", @"cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName": @"cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name", @"cqDamS7damVideoproxyclientserviceHttpMaxretrycountName": @"cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name", @"cqDamS7damVideoproxyclientserviceUploadprogressIntervalName": @"cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName", @"cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName", @"cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName", @"cqDamS7damVideoproxyclientserviceHttpReadtimeoutName", @"cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName", @"cqDamS7damVideoproxyclientserviceHttpMaxretrycountName", @"cqDamS7damVideoproxyclientserviceUploadprogressIntervalName"];
  return [optionalProperties containsObject:propertyName];
}

@end
