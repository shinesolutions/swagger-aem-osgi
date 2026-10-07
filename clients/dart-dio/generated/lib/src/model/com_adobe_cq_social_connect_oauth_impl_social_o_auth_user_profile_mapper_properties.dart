//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties.g.dart';

/// ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties
///
/// Properties:
/// * [facebook] 
/// * [twitter] 
/// * [providerPeriodConfigPeriodUserPeriodFolder] 
@BuiltValue()
abstract class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties implements Built<ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties, ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder> {
  @BuiltValueField(wireName: r'facebook')
  ConfigNodePropertyArray? get facebook;

  @BuiltValueField(wireName: r'twitter')
  ConfigNodePropertyArray? get twitter;

  @BuiltValueField(wireName: r'provider.config.user.folder')
  ConfigNodePropertyString? get providerPeriodConfigPeriodUserPeriodFolder;

  ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties._();

  factory ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties([void updates(ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder b)]) = _$ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties> get serializer => _$ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesSerializer();
}

class _$ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties, _$ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties];

  @override
  final String wireName = r'ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.facebook != null) {
      yield r'facebook';
      yield serializers.serialize(
        object.facebook,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.twitter != null) {
      yield r'twitter';
      yield serializers.serialize(
        object.twitter,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.providerPeriodConfigPeriodUserPeriodFolder != null) {
      yield r'provider.config.user.folder';
      yield serializers.serialize(
        object.providerPeriodConfigPeriodUserPeriodFolder,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'facebook':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.facebook.replace(valueDes);
          break;
        case r'twitter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.twitter.replace(valueDes);
          break;
        case r'provider.config.user.folder':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.providerPeriodConfigPeriodUserPeriodFolder.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesBuilder();
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

