//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties.g.dart';

/// ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties
///
/// Properties:
/// * [nonValidChars] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties implements Built<ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties, ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesBuilder> {
  @BuiltValueField(wireName: r'nonValidChars')
  ConfigNodePropertyString? get nonValidChars;

  ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties._();

  factory ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties([void updates(ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties> get serializer => _$ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties, _$ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.nonValidChars != null) {
      yield r'nonValidChars';
      yield serializers.serialize(
        object.nonValidChars,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'nonValidChars':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.nonValidChars.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesBuilder();
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

