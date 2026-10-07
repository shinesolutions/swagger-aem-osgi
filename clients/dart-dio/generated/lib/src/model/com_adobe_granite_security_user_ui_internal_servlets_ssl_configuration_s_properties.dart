//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties.g.dart';

/// ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties
///
/// Properties:
/// * [hcPeriodTags] 
@BuiltValue()
abstract class ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties implements Built<ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties, ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties._();

  factory ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties([void updates(ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesBuilder b)]) = _$ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties> get serializer => _$ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesSerializer();
}

class _$ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties, _$ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties];

  @override
  final String wireName = r'ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesBuilder();
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

