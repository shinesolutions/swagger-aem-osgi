#import "OAIOrgApacheFelixHttpSslfilterSslFilterProperties.h"

@implementation OAIOrgApacheFelixHttpSslfilterSslFilterProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"sslForwardHeader": @"ssl-forward.header", @"sslForwardValue": @"ssl-forward.value", @"sslForwardCertHeader": @"ssl-forward-cert.header", @"rewriteAbsoluteUrls": @"rewrite.absolute.urls" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"sslForwardHeader", @"sslForwardValue", @"sslForwardCertHeader", @"rewriteAbsoluteUrls"];
  return [optionalProperties containsObject:propertyName];
}

@end
