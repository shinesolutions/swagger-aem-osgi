//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_oauth_impl_facebook_provider_impl_properties.g.dart';

/// ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties
///
/// Properties:
/// * [oauthPeriodProviderPeriodId] 
@BuiltValue()
abstract class ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties implements Built<ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties, ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'oauth.provider.id')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodId;

  ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties._();

  factory ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties([void updates(ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesBuilder b)]) = _$ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties> get serializer => _$ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesSerializer();
}

class _$ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties, _$ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties object, {
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
    ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesBuilder result,
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
  ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesBuilder();
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

