//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_oauth_impl_twitter_provider_impl_properties.g.dart';

/// ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties
///
/// Properties:
/// * [oauthPeriodProviderPeriodId] 
@BuiltValue()
abstract class ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties implements Built<ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties, ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'oauth.provider.id')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodId;

  ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties._();

  factory ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties([void updates(ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesBuilder b)]) = _$ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties> get serializer => _$ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesSerializer();
}

class _$ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties, _$ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties object, {
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
    ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesBuilder result,
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
  ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesBuilder();
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

