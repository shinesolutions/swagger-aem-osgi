//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_mailer_impl_email_cq_email_template_factory_properties.g.dart';

/// ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties
///
/// Properties:
/// * [mailerPeriodEmailPeriodCharset] 
@BuiltValue()
abstract class ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties implements Built<ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties, ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'mailer.email.charset')
  ConfigNodePropertyString? get mailerPeriodEmailPeriodCharset;

  ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties._();

  factory ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties([void updates(ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesBuilder b)]) = _$ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties> get serializer => _$ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesSerializer();
}

class _$ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesSerializer implements PrimitiveSerializer<ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties, _$ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties];

  @override
  final String wireName = r'ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.mailerPeriodEmailPeriodCharset != null) {
      yield r'mailer.email.charset';
      yield serializers.serialize(
        object.mailerPeriodEmailPeriodCharset,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'mailer.email.charset':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.mailerPeriodEmailPeriodCharset.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesBuilder();
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

