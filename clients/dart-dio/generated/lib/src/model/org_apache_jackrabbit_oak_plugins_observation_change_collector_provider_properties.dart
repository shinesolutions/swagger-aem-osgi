//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties
///
/// Properties:
/// * [maxItems] 
/// * [maxPathDepth] 
/// * [enabled] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties implements Built<OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties, OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'maxItems')
  ConfigNodePropertyInteger? get maxItems;

  @BuiltValueField(wireName: r'maxPathDepth')
  ConfigNodePropertyInteger? get maxPathDepth;

  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties._();

  factory OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties([void updates(OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties> get serializer => _$OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties, _$OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxItems != null) {
      yield r'maxItems';
      yield serializers.serialize(
        object.maxItems,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxPathDepth != null) {
      yield r'maxPathDepth';
      yield serializers.serialize(
        object.maxPathDepth,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
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
    OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'maxItems':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxItems.replace(valueDes);
          break;
        case r'maxPathDepth':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxPathDepth.replace(valueDes);
          break;
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
  OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesBuilder();
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

