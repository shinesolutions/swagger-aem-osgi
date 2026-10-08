//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties.g.dart';

/// ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties
///
/// Properties:
/// * [formsPeriodFormparagraphpostprocessorPeriodEnabled] 
/// * [formsPeriodFormparagraphpostprocessorPeriodFormresourcetypes] 
@BuiltValue()
abstract class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties implements Built<ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties, ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder> {
  @BuiltValueField(wireName: r'forms.formparagraphpostprocessor.enabled')
  ConfigNodePropertyBoolean? get formsPeriodFormparagraphpostprocessorPeriodEnabled;

  @BuiltValueField(wireName: r'forms.formparagraphpostprocessor.formresourcetypes')
  ConfigNodePropertyArray? get formsPeriodFormparagraphpostprocessorPeriodFormresourcetypes;

  ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties._();

  factory ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties([void updates(ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder b)]) = _$ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties> get serializer => _$ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesSerializer();
}

class _$ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties, _$ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties];

  @override
  final String wireName = r'ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.formsPeriodFormparagraphpostprocessorPeriodEnabled != null) {
      yield r'forms.formparagraphpostprocessor.enabled';
      yield serializers.serialize(
        object.formsPeriodFormparagraphpostprocessorPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.formsPeriodFormparagraphpostprocessorPeriodFormresourcetypes != null) {
      yield r'forms.formparagraphpostprocessor.formresourcetypes';
      yield serializers.serialize(
        object.formsPeriodFormparagraphpostprocessorPeriodFormresourcetypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'forms.formparagraphpostprocessor.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.formsPeriodFormparagraphpostprocessorPeriodEnabled.replace(valueDes);
          break;
        case r'forms.formparagraphpostprocessor.formresourcetypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.formsPeriodFormparagraphpostprocessorPeriodFormresourcetypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder();
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

