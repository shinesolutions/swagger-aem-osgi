#import "OAIComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.h"

@implementation OAIComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"comAdobeGraniteJettySslPort": @"com.adobe.granite.jetty.ssl.port", @"comAdobeGraniteJettySslKeystoreUser": @"com.adobe.granite.jetty.ssl.keystore.user", @"comAdobeGraniteJettySslKeystorePassword": @"com.adobe.granite.jetty.ssl.keystore.password", @"comAdobeGraniteJettySslCiphersuitesExcluded": @"com.adobe.granite.jetty.ssl.ciphersuites.excluded", @"comAdobeGraniteJettySslCiphersuitesIncluded": @"com.adobe.granite.jetty.ssl.ciphersuites.included", @"comAdobeGraniteJettySslClientCertificate": @"com.adobe.granite.jetty.ssl.client.certificate" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"comAdobeGraniteJettySslPort", @"comAdobeGraniteJettySslKeystoreUser", @"comAdobeGraniteJettySslKeystorePassword", @"comAdobeGraniteJettySslCiphersuitesExcluded", @"comAdobeGraniteJettySslCiphersuitesIncluded", @"comAdobeGraniteJettySslClientCertificate"];
  return [optionalProperties containsObject:propertyName];
}

@end
