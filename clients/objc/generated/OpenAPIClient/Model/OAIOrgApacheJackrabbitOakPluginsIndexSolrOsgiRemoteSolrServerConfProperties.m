#import "OAIOrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.h"

@implementation OAIOrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"solrHttpUrl": @"solr.http.url", @"solrZkHost": @"solr.zk.host", @"solrCollection": @"solr.collection", @"solrSocketTimeout": @"solr.socket.timeout", @"solrConnectionTimeout": @"solr.connection.timeout", @"solrShardsNo": @"solr.shards.no", @"solrReplicationFactor": @"solr.replication.factor", @"solrConfDir": @"solr.conf.dir" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"solrHttpUrl", @"solrZkHost", @"solrCollection", @"solrSocketTimeout", @"solrConnectionTimeout", @"solrShardsNo", @"solrReplicationFactor", @"solrConfDir"];
  return [optionalProperties containsObject:propertyName];
}

@end
