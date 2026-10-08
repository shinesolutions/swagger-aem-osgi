//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_properties.g.dart';

/// ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties
///
/// Properties:
/// * [formsManagerConfigPeriodIncludeOOTBTemplates] 
/// * [formsManagerConfigPeriodIncludeDeprecatedTemplates] 
@BuiltValue()
abstract class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties implements Built<ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties, ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder> {
  @BuiltValueField(wireName: r'formsManagerConfig.includeOOTBTemplates')
  ConfigNodePropertyBoolean? get formsManagerConfigPeriodIncludeOOTBTemplates;

  @BuiltValueField(wireName: r'formsManagerConfig.includeDeprecatedTemplates')
  ConfigNodePropertyBoolean? get formsManagerConfigPeriodIncludeDeprecatedTemplates;

  ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties._();

  factory ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties([void updates(ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder b)]) = _$ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties> get serializer => _$ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesSerializer();
}

class _$ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesSerializer implements PrimitiveSerializer<ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties, _$ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties];

  @override
  final String wireName = r'ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.formsManagerConfigPeriodIncludeOOTBTemplates != null) {
      yield r'formsManagerConfig.includeOOTBTemplates';
      yield serializers.serialize(
        object.formsManagerConfigPeriodIncludeOOTBTemplates,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.formsManagerConfigPeriodIncludeDeprecatedTemplates != null) {
      yield r'formsManagerConfig.includeDeprecatedTemplates';
      yield serializers.serialize(
        object.formsManagerConfigPeriodIncludeDeprecatedTemplates,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'formsManagerConfig.includeOOTBTemplates':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.formsManagerConfigPeriodIncludeOOTBTemplates.replace(valueDes);
          break;
        case r'formsManagerConfig.includeDeprecatedTemplates':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.formsManagerConfigPeriodIncludeDeprecatedTemplates.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesBuilder();
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

