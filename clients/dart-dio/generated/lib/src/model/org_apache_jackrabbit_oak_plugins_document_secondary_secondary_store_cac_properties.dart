//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties
///
/// Properties:
/// * [includedPaths] 
/// * [enableAsyncObserver] 
/// * [observerQueueSize] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties implements Built<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties, OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder> {
  @BuiltValueField(wireName: r'includedPaths')
  ConfigNodePropertyArray? get includedPaths;

  @BuiltValueField(wireName: r'enableAsyncObserver')
  ConfigNodePropertyBoolean? get enableAsyncObserver;

  @BuiltValueField(wireName: r'observerQueueSize')
  ConfigNodePropertyInteger? get observerQueueSize;

  OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties._();

  factory OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties([void updates(OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties> get serializer => _$OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties, _$OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.includedPaths != null) {
      yield r'includedPaths';
      yield serializers.serialize(
        object.includedPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.enableAsyncObserver != null) {
      yield r'enableAsyncObserver';
      yield serializers.serialize(
        object.enableAsyncObserver,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.observerQueueSize != null) {
      yield r'observerQueueSize';
      yield serializers.serialize(
        object.observerQueueSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'includedPaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.includedPaths.replace(valueDes);
          break;
        case r'enableAsyncObserver':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enableAsyncObserver.replace(valueDes);
          break;
        case r'observerQueueSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.observerQueueSize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesBuilder();
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

