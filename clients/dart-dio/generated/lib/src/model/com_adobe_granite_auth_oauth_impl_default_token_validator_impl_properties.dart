//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties.g.dart';

/// ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties
///
/// Properties:
/// * [authPeriodTokenPeriodValidatorPeriodType] 
@BuiltValue()
abstract class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties implements Built<ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties, ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'auth.token.validator.type')
  ConfigNodePropertyString? get authPeriodTokenPeriodValidatorPeriodType;

  ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties._();

  factory ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties([void updates(ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesBuilder b)]) = _$ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties> get serializer => _$ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesSerializer();
}

class _$ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties, _$ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.authPeriodTokenPeriodValidatorPeriodType != null) {
      yield r'auth.token.validator.type';
      yield serializers.serialize(
        object.authPeriodTokenPeriodValidatorPeriodType,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'auth.token.validator.type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.authPeriodTokenPeriodValidatorPeriodType.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesBuilder();
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

