//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_offloading_impl_offloading_configurator_properties.g.dart';

/// ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties
///
/// Properties:
/// * [offloadingPeriodTransporter] 
/// * [offloadingPeriodCleanupPeriodPayload] 
@BuiltValue()
abstract class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties implements Built<ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties, ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder> {
  @BuiltValueField(wireName: r'offloading.transporter')
  ConfigNodePropertyString? get offloadingPeriodTransporter;

  @BuiltValueField(wireName: r'offloading.cleanup.payload')
  ConfigNodePropertyBoolean? get offloadingPeriodCleanupPeriodPayload;

  ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties._();

  factory ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties([void updates(ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder b)]) = _$ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties> get serializer => _$ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesSerializer();
}

class _$ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties, _$ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties];

  @override
  final String wireName = r'ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.offloadingPeriodTransporter != null) {
      yield r'offloading.transporter';
      yield serializers.serialize(
        object.offloadingPeriodTransporter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.offloadingPeriodCleanupPeriodPayload != null) {
      yield r'offloading.cleanup.payload';
      yield serializers.serialize(
        object.offloadingPeriodCleanupPeriodPayload,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'offloading.transporter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.offloadingPeriodTransporter.replace(valueDes);
          break;
        case r'offloading.cleanup.payload':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.offloadingPeriodCleanupPeriodPayload.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesBuilder();
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

