//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties
///
/// Properties:
/// * [solrPeriodHomePeriodPath] 
/// * [solrPeriodCorePeriodName] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties implements Built<OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties, OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder> {
  @BuiltValueField(wireName: r'solr.home.path')
  ConfigNodePropertyString? get solrPeriodHomePeriodPath;

  @BuiltValueField(wireName: r'solr.core.name')
  ConfigNodePropertyString? get solrPeriodCorePeriodName;

  OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties._();

  factory OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties([void updates(OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties> get serializer => _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties, _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.solrPeriodHomePeriodPath != null) {
      yield r'solr.home.path';
      yield serializers.serialize(
        object.solrPeriodHomePeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.solrPeriodCorePeriodName != null) {
      yield r'solr.core.name';
      yield serializers.serialize(
        object.solrPeriodCorePeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'solr.home.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.solrPeriodHomePeriodPath.replace(valueDes);
          break;
        case r'solr.core.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.solrPeriodCorePeriodName.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesBuilder();
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

