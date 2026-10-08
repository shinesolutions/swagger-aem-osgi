//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties
///
/// Properties:
/// * [enabled] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties implements Built<OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties, OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesBuilder> {
  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties._();

  factory OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties([void updates(OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties> get serializer => _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties, _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesBuilder();
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

