//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties
///
/// Properties:
/// * [persistentCacheIncludes] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties implements Built<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties, OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesBuilder> {
  @BuiltValueField(wireName: r'persistentCacheIncludes')
  ConfigNodePropertyArray? get persistentCacheIncludes;

  OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties._();

  factory OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties([void updates(OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties> get serializer => _$OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties, _$OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.persistentCacheIncludes != null) {
      yield r'persistentCacheIncludes';
      yield serializers.serialize(
        object.persistentCacheIncludes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'persistentCacheIncludes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.persistentCacheIncludes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesBuilder();
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

