//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties.g.dart';

/// ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties
///
/// Properties:
/// * [dimPeriodDefaultPeriodMode] 
/// * [dimPeriodAppcachePeriodEnabled] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties implements Built<ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties, ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'dim.default.mode')
  ConfigNodePropertyDropDown? get dimPeriodDefaultPeriodMode;

  @BuiltValueField(wireName: r'dim.appcache.enabled')
  ConfigNodePropertyBoolean? get dimPeriodAppcachePeriodEnabled;

  ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties._();

  factory ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties([void updates(ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties> get serializer => _$ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties, _$ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.dimPeriodDefaultPeriodMode != null) {
      yield r'dim.default.mode';
      yield serializers.serialize(
        object.dimPeriodDefaultPeriodMode,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.dimPeriodAppcachePeriodEnabled != null) {
      yield r'dim.appcache.enabled';
      yield serializers.serialize(
        object.dimPeriodAppcachePeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'dim.default.mode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.dimPeriodDefaultPeriodMode.replace(valueDes);
          break;
        case r'dim.appcache.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.dimPeriodAppcachePeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesBuilder();
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

