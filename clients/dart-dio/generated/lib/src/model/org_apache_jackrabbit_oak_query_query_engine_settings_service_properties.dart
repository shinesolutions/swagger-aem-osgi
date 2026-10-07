//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_query_query_engine_settings_service_properties.g.dart';

/// OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties
///
/// Properties:
/// * [queryLimitInMemory] 
/// * [queryLimitReads] 
/// * [queryFailTraversal] 
/// * [fastQuerySize] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties implements Built<OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties, OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'queryLimitInMemory')
  ConfigNodePropertyInteger? get queryLimitInMemory;

  @BuiltValueField(wireName: r'queryLimitReads')
  ConfigNodePropertyInteger? get queryLimitReads;

  @BuiltValueField(wireName: r'queryFailTraversal')
  ConfigNodePropertyBoolean? get queryFailTraversal;

  @BuiltValueField(wireName: r'fastQuerySize')
  ConfigNodePropertyBoolean? get fastQuerySize;

  OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties._();

  factory OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties([void updates(OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder b)]) = _$OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties> get serializer => _$OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesSerializer();
}

class _$OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties, _$OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.queryLimitInMemory != null) {
      yield r'queryLimitInMemory';
      yield serializers.serialize(
        object.queryLimitInMemory,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.queryLimitReads != null) {
      yield r'queryLimitReads';
      yield serializers.serialize(
        object.queryLimitReads,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.queryFailTraversal != null) {
      yield r'queryFailTraversal';
      yield serializers.serialize(
        object.queryFailTraversal,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.fastQuerySize != null) {
      yield r'fastQuerySize';
      yield serializers.serialize(
        object.fastQuerySize,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'queryLimitInMemory':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.queryLimitInMemory.replace(valueDes);
          break;
        case r'queryLimitReads':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.queryLimitReads.replace(valueDes);
          break;
        case r'queryFailTraversal':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.queryFailTraversal.replace(valueDes);
          break;
        case r'fastQuerySize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.fastQuerySize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesBuilder();
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

