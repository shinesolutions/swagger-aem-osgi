//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties
///
/// Properties:
/// * [queryPeriodAggregation] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties implements Built<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesBuilder> {
  @BuiltValueField(wireName: r'query.aggregation')
  ConfigNodePropertyBoolean? get queryPeriodAggregation;

  OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties._();

  factory OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties([void updates(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties> get serializer => _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties, _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.queryPeriodAggregation != null) {
      yield r'query.aggregation';
      yield serializers.serialize(
        object.queryPeriodAggregation,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'query.aggregation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.queryPeriodAggregation.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesBuilder();
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

