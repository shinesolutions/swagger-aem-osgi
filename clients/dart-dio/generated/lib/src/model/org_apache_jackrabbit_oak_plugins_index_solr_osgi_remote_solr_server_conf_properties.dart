//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties
///
/// Properties:
/// * [solrPeriodHttpPeriodUrl] 
/// * [solrPeriodZkPeriodHost] 
/// * [solrPeriodCollection] 
/// * [solrPeriodSocketPeriodTimeout] 
/// * [solrPeriodConnectionPeriodTimeout] 
/// * [solrPeriodShardsPeriodNo] 
/// * [solrPeriodReplicationPeriodFactor] 
/// * [solrPeriodConfPeriodDir] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties implements Built<OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties, OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder> {
  @BuiltValueField(wireName: r'solr.http.url')
  ConfigNodePropertyString? get solrPeriodHttpPeriodUrl;

  @BuiltValueField(wireName: r'solr.zk.host')
  ConfigNodePropertyString? get solrPeriodZkPeriodHost;

  @BuiltValueField(wireName: r'solr.collection')
  ConfigNodePropertyString? get solrPeriodCollection;

  @BuiltValueField(wireName: r'solr.socket.timeout')
  ConfigNodePropertyInteger? get solrPeriodSocketPeriodTimeout;

  @BuiltValueField(wireName: r'solr.connection.timeout')
  ConfigNodePropertyInteger? get solrPeriodConnectionPeriodTimeout;

  @BuiltValueField(wireName: r'solr.shards.no')
  ConfigNodePropertyInteger? get solrPeriodShardsPeriodNo;

  @BuiltValueField(wireName: r'solr.replication.factor')
  ConfigNodePropertyInteger? get solrPeriodReplicationPeriodFactor;

  @BuiltValueField(wireName: r'solr.conf.dir')
  ConfigNodePropertyString? get solrPeriodConfPeriodDir;

  OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties._();

  factory OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties([void updates(OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties> get serializer => _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties, _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.solrPeriodHttpPeriodUrl != null) {
      yield r'solr.http.url';
      yield serializers.serialize(
        object.solrPeriodHttpPeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.solrPeriodZkPeriodHost != null) {
      yield r'solr.zk.host';
      yield serializers.serialize(
        object.solrPeriodZkPeriodHost,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.solrPeriodCollection != null) {
      yield r'solr.collection';
      yield serializers.serialize(
        object.solrPeriodCollection,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.solrPeriodSocketPeriodTimeout != null) {
      yield r'solr.socket.timeout';
      yield serializers.serialize(
        object.solrPeriodSocketPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.solrPeriodConnectionPeriodTimeout != null) {
      yield r'solr.connection.timeout';
      yield serializers.serialize(
        object.solrPeriodConnectionPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.solrPeriodShardsPeriodNo != null) {
      yield r'solr.shards.no';
      yield serializers.serialize(
        object.solrPeriodShardsPeriodNo,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.solrPeriodReplicationPeriodFactor != null) {
      yield r'solr.replication.factor';
      yield serializers.serialize(
        object.solrPeriodReplicationPeriodFactor,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.solrPeriodConfPeriodDir != null) {
      yield r'solr.conf.dir';
      yield serializers.serialize(
        object.solrPeriodConfPeriodDir,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'solr.http.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.solrPeriodHttpPeriodUrl.replace(valueDes);
          break;
        case r'solr.zk.host':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.solrPeriodZkPeriodHost.replace(valueDes);
          break;
        case r'solr.collection':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.solrPeriodCollection.replace(valueDes);
          break;
        case r'solr.socket.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.solrPeriodSocketPeriodTimeout.replace(valueDes);
          break;
        case r'solr.connection.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.solrPeriodConnectionPeriodTimeout.replace(valueDes);
          break;
        case r'solr.shards.no':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.solrPeriodShardsPeriodNo.replace(valueDes);
          break;
        case r'solr.replication.factor':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.solrPeriodReplicationPeriodFactor.replace(valueDes);
          break;
        case r'solr.conf.dir':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.solrPeriodConfPeriodDir.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

