//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties.g.dart';

/// ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties
///
/// Properties:
/// * [path] 
/// * [servicePeriodRanking] 
@BuiltValue()
abstract class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties implements Built<ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties, ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder> {
  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyArray? get path;

  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties._();

  factory ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties([void updates(ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder b)]) = _$ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties> get serializer => _$ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesSerializer();
}

class _$ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties, _$ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties];

  @override
  final String wireName = r'ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.path.replace(valueDes);
          break;
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesBuilder();
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

