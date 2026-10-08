//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_properties.g.dart';

/// ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties
///
/// Properties:
/// * [scene7FlashTemplatesPeriodRti] 
/// * [scene7FlashTemplatesPeriodRsi] 
/// * [scene7FlashTemplatesPeriodRb] 
/// * [scene7FlashTemplatesPeriodRurl] 
/// * [scene7FlashTemplatePeriodUrlFormatParameter] 
@BuiltValue()
abstract class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties implements Built<ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties, ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'scene7FlashTemplates.rti')
  ConfigNodePropertyString? get scene7FlashTemplatesPeriodRti;

  @BuiltValueField(wireName: r'scene7FlashTemplates.rsi')
  ConfigNodePropertyString? get scene7FlashTemplatesPeriodRsi;

  @BuiltValueField(wireName: r'scene7FlashTemplates.rb')
  ConfigNodePropertyString? get scene7FlashTemplatesPeriodRb;

  @BuiltValueField(wireName: r'scene7FlashTemplates.rurl')
  ConfigNodePropertyString? get scene7FlashTemplatesPeriodRurl;

  @BuiltValueField(wireName: r'scene7FlashTemplate.urlFormatParameter')
  ConfigNodePropertyString? get scene7FlashTemplatePeriodUrlFormatParameter;

  ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties._();

  factory ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties([void updates(ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder b)]) = _$ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties> get serializer => _$ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesSerializer();
}

class _$ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties, _$ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties];

  @override
  final String wireName = r'ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.scene7FlashTemplatesPeriodRti != null) {
      yield r'scene7FlashTemplates.rti';
      yield serializers.serialize(
        object.scene7FlashTemplatesPeriodRti,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.scene7FlashTemplatesPeriodRsi != null) {
      yield r'scene7FlashTemplates.rsi';
      yield serializers.serialize(
        object.scene7FlashTemplatesPeriodRsi,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.scene7FlashTemplatesPeriodRb != null) {
      yield r'scene7FlashTemplates.rb';
      yield serializers.serialize(
        object.scene7FlashTemplatesPeriodRb,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.scene7FlashTemplatesPeriodRurl != null) {
      yield r'scene7FlashTemplates.rurl';
      yield serializers.serialize(
        object.scene7FlashTemplatesPeriodRurl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.scene7FlashTemplatePeriodUrlFormatParameter != null) {
      yield r'scene7FlashTemplate.urlFormatParameter';
      yield serializers.serialize(
        object.scene7FlashTemplatePeriodUrlFormatParameter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scene7FlashTemplates.rti':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.scene7FlashTemplatesPeriodRti.replace(valueDes);
          break;
        case r'scene7FlashTemplates.rsi':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.scene7FlashTemplatesPeriodRsi.replace(valueDes);
          break;
        case r'scene7FlashTemplates.rb':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.scene7FlashTemplatesPeriodRb.replace(valueDes);
          break;
        case r'scene7FlashTemplates.rurl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.scene7FlashTemplatesPeriodRurl.replace(valueDes);
          break;
        case r'scene7FlashTemplate.urlFormatParameter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.scene7FlashTemplatePeriodUrlFormatParameter.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder();
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

