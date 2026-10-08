//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_mailer_impl_email_cq_retriever_template_factory_properties.g.dart';

/// ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties
///
/// Properties:
/// * [mailerPeriodEmailPeriodEmbed] 
/// * [mailerPeriodEmailPeriodCharset] 
/// * [mailerPeriodEmailPeriodRetrieverUserID] 
/// * [mailerPeriodEmailPeriodRetrieverUserPWD] 
@BuiltValue()
abstract class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties implements Built<ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties, ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'mailer.email.embed')
  ConfigNodePropertyBoolean? get mailerPeriodEmailPeriodEmbed;

  @BuiltValueField(wireName: r'mailer.email.charset')
  ConfigNodePropertyString? get mailerPeriodEmailPeriodCharset;

  @BuiltValueField(wireName: r'mailer.email.retrieverUserID')
  ConfigNodePropertyString? get mailerPeriodEmailPeriodRetrieverUserID;

  @BuiltValueField(wireName: r'mailer.email.retrieverUserPWD')
  ConfigNodePropertyString? get mailerPeriodEmailPeriodRetrieverUserPWD;

  ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties._();

  factory ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties([void updates(ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder b)]) = _$ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties> get serializer => _$ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesSerializer();
}

class _$ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesSerializer implements PrimitiveSerializer<ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties, _$ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties];

  @override
  final String wireName = r'ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.mailerPeriodEmailPeriodEmbed != null) {
      yield r'mailer.email.embed';
      yield serializers.serialize(
        object.mailerPeriodEmailPeriodEmbed,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.mailerPeriodEmailPeriodCharset != null) {
      yield r'mailer.email.charset';
      yield serializers.serialize(
        object.mailerPeriodEmailPeriodCharset,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.mailerPeriodEmailPeriodRetrieverUserID != null) {
      yield r'mailer.email.retrieverUserID';
      yield serializers.serialize(
        object.mailerPeriodEmailPeriodRetrieverUserID,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.mailerPeriodEmailPeriodRetrieverUserPWD != null) {
      yield r'mailer.email.retrieverUserPWD';
      yield serializers.serialize(
        object.mailerPeriodEmailPeriodRetrieverUserPWD,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'mailer.email.embed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.mailerPeriodEmailPeriodEmbed.replace(valueDes);
          break;
        case r'mailer.email.charset':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.mailerPeriodEmailPeriodCharset.replace(valueDes);
          break;
        case r'mailer.email.retrieverUserID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.mailerPeriodEmailPeriodRetrieverUserID.replace(valueDes);
          break;
        case r'mailer.email.retrieverUserPWD':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.mailerPeriodEmailPeriodRetrieverUserPWD.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesBuilder();
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

