//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_offloading_impl_offloading_job_cloner_properties.g.dart';

/// ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties
///
/// Properties:
/// * [offloadingPeriodJobclonerPeriodEnabled] 
@BuiltValue()
abstract class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties implements Built<ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties, ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesBuilder> {
  @BuiltValueField(wireName: r'offloading.jobcloner.enabled')
  ConfigNodePropertyBoolean? get offloadingPeriodJobclonerPeriodEnabled;

  ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties._();

  factory ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties([void updates(ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesBuilder b)]) = _$ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties> get serializer => _$ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesSerializer();
}

class _$ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties, _$ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties];

  @override
  final String wireName = r'ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.offloadingPeriodJobclonerPeriodEnabled != null) {
      yield r'offloading.jobcloner.enabled';
      yield serializers.serialize(
        object.offloadingPeriodJobclonerPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'offloading.jobcloner.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.offloadingPeriodJobclonerPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesBuilder();
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

