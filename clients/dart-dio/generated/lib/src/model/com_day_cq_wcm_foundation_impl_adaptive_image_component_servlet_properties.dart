//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties.g.dart';

/// ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties
///
/// Properties:
/// * [adaptPeriodSupportedPeriodWidths] 
@BuiltValue()
abstract class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties implements Built<ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties, ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'adapt.supported.widths')
  ConfigNodePropertyArray? get adaptPeriodSupportedPeriodWidths;

  ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties._();

  factory ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties([void updates(ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesBuilder b)]) = _$ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties> get serializer => _$ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesSerializer();
}

class _$ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties, _$ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties];

  @override
  final String wireName = r'ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adaptPeriodSupportedPeriodWidths != null) {
      yield r'adapt.supported.widths';
      yield serializers.serialize(
        object.adaptPeriodSupportedPeriodWidths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'adapt.supported.widths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.adaptPeriodSupportedPeriodWidths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesBuilder();
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

