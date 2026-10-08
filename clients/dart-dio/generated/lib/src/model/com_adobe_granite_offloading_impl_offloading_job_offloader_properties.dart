//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_offloading_impl_offloading_job_offloader_properties.g.dart';

/// ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties
///
/// Properties:
/// * [offloadingPeriodOffloaderPeriodEnabled] 
@BuiltValue()
abstract class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties implements Built<ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties, ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesBuilder> {
  @BuiltValueField(wireName: r'offloading.offloader.enabled')
  ConfigNodePropertyBoolean? get offloadingPeriodOffloaderPeriodEnabled;

  ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties._();

  factory ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties([void updates(ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesBuilder b)]) = _$ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties> get serializer => _$ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesSerializer();
}

class _$ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties, _$ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties];

  @override
  final String wireName = r'ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.offloadingPeriodOffloaderPeriodEnabled != null) {
      yield r'offloading.offloader.enabled';
      yield serializers.serialize(
        object.offloadingPeriodOffloaderPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'offloading.offloader.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.offloadingPeriodOffloaderPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesBuilder();
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

