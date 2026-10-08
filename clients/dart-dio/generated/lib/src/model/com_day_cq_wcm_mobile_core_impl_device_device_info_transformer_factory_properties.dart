//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties.g.dart';

/// ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties
///
/// Properties:
/// * [devicePeriodInfoPeriodTransformerPeriodEnabled] 
/// * [devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle] 
@BuiltValue()
abstract class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties implements Built<ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties, ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'device.info.transformer.enabled')
  ConfigNodePropertyBoolean? get devicePeriodInfoPeriodTransformerPeriodEnabled;

  @BuiltValueField(wireName: r'device.info.transformer.css.style')
  ConfigNodePropertyString? get devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle;

  ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties._();

  factory ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties([void updates(ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder b)]) = _$ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties> get serializer => _$ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesSerializer();
}

class _$ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties, _$ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties];

  @override
  final String wireName = r'ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.devicePeriodInfoPeriodTransformerPeriodEnabled != null) {
      yield r'device.info.transformer.enabled';
      yield serializers.serialize(
        object.devicePeriodInfoPeriodTransformerPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle != null) {
      yield r'device.info.transformer.css.style';
      yield serializers.serialize(
        object.devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'device.info.transformer.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.devicePeriodInfoPeriodTransformerPeriodEnabled.replace(valueDes);
          break;
        case r'device.info.transformer.css.style':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesBuilder();
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

