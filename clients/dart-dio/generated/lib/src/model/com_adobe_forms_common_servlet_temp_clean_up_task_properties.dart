//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_forms_common_servlet_temp_clean_up_task_properties.g.dart';

/// ComAdobeFormsCommonServletTempCleanUpTaskProperties
///
/// Properties:
/// * [schedulerPeriodExpression] 
/// * [durationForTemporaryStorage] 
/// * [durationForAnonymousStorage] 
@BuiltValue()
abstract class ComAdobeFormsCommonServletTempCleanUpTaskProperties implements Built<ComAdobeFormsCommonServletTempCleanUpTaskProperties, ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.expression')
  ConfigNodePropertyString? get schedulerPeriodExpression;

  @BuiltValueField(wireName: r'Duration for Temporary Storage')
  ConfigNodePropertyString? get durationForTemporaryStorage;

  @BuiltValueField(wireName: r'Duration for Anonymous Storage')
  ConfigNodePropertyString? get durationForAnonymousStorage;

  ComAdobeFormsCommonServletTempCleanUpTaskProperties._();

  factory ComAdobeFormsCommonServletTempCleanUpTaskProperties([void updates(ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder b)]) = _$ComAdobeFormsCommonServletTempCleanUpTaskProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeFormsCommonServletTempCleanUpTaskProperties> get serializer => _$ComAdobeFormsCommonServletTempCleanUpTaskPropertiesSerializer();
}

class _$ComAdobeFormsCommonServletTempCleanUpTaskPropertiesSerializer implements PrimitiveSerializer<ComAdobeFormsCommonServletTempCleanUpTaskProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeFormsCommonServletTempCleanUpTaskProperties, _$ComAdobeFormsCommonServletTempCleanUpTaskProperties];

  @override
  final String wireName = r'ComAdobeFormsCommonServletTempCleanUpTaskProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeFormsCommonServletTempCleanUpTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodExpression != null) {
      yield r'scheduler.expression';
      yield serializers.serialize(
        object.schedulerPeriodExpression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.durationForTemporaryStorage != null) {
      yield r'Duration for Temporary Storage';
      yield serializers.serialize(
        object.durationForTemporaryStorage,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.durationForAnonymousStorage != null) {
      yield r'Duration for Anonymous Storage';
      yield serializers.serialize(
        object.durationForAnonymousStorage,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeFormsCommonServletTempCleanUpTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scheduler.expression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.schedulerPeriodExpression.replace(valueDes);
          break;
        case r'Duration for Temporary Storage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.durationForTemporaryStorage.replace(valueDes);
          break;
        case r'Duration for Anonymous Storage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.durationForAnonymousStorage.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeFormsCommonServletTempCleanUpTaskProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder();
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

