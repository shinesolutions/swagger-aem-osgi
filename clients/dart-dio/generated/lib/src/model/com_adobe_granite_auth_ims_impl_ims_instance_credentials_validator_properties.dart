//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_properties.g.dart';

/// ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties
///
/// Properties:
/// * [oauthPeriodProviderPeriodId] 
@BuiltValue()
abstract class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties implements Built<ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties, ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesBuilder> {
  @BuiltValueField(wireName: r'oauth.provider.id')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodId;

  ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties._();

  factory ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties([void updates(ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesBuilder b)]) = _$ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties> get serializer => _$ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesSerializer();
}

class _$ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties, _$ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.oauthPeriodProviderPeriodId != null) {
      yield r'oauth.provider.id';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'oauth.provider.id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodProviderPeriodId.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesBuilder();
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

