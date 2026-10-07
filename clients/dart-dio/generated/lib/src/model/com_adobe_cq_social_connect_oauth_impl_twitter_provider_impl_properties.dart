//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties.g.dart';

/// ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties
///
/// Properties:
/// * [oauthPeriodProviderPeriodId] 
/// * [oauthPeriodCloudPeriodConfigPeriodRoot] 
/// * [providerPeriodConfigPeriodRoot] 
/// * [providerPeriodConfigPeriodUserPeriodFolder] 
/// * [providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams] 
/// * [providerPeriodConfigPeriodTwitterPeriodParams] 
/// * [providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled] 
@BuiltValue()
abstract class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties implements Built<ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties, ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'oauth.provider.id')
  ConfigNodePropertyString? get oauthPeriodProviderPeriodId;

  @BuiltValueField(wireName: r'oauth.cloud.config.root')
  ConfigNodePropertyString? get oauthPeriodCloudPeriodConfigPeriodRoot;

  @BuiltValueField(wireName: r'provider.config.root')
  ConfigNodePropertyString? get providerPeriodConfigPeriodRoot;

  @BuiltValueField(wireName: r'provider.config.user.folder')
  ConfigNodePropertyDropDown? get providerPeriodConfigPeriodUserPeriodFolder;

  @BuiltValueField(wireName: r'provider.config.twitter.enable.params')
  ConfigNodePropertyBoolean? get providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams;

  @BuiltValueField(wireName: r'provider.config.twitter.params')
  ConfigNodePropertyArray? get providerPeriodConfigPeriodTwitterPeriodParams;

  @BuiltValueField(wireName: r'provider.config.refresh.userdata.enabled')
  ConfigNodePropertyBoolean? get providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled;

  ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties._();

  factory ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties([void updates(ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder b)]) = _$ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties> get serializer => _$ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesSerializer();
}

class _$ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties, _$ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.oauthPeriodProviderPeriodId != null) {
      yield r'oauth.provider.id';
      yield serializers.serialize(
        object.oauthPeriodProviderPeriodId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.oauthPeriodCloudPeriodConfigPeriodRoot != null) {
      yield r'oauth.cloud.config.root';
      yield serializers.serialize(
        object.oauthPeriodCloudPeriodConfigPeriodRoot,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.providerPeriodConfigPeriodRoot != null) {
      yield r'provider.config.root';
      yield serializers.serialize(
        object.providerPeriodConfigPeriodRoot,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.providerPeriodConfigPeriodUserPeriodFolder != null) {
      yield r'provider.config.user.folder';
      yield serializers.serialize(
        object.providerPeriodConfigPeriodUserPeriodFolder,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams != null) {
      yield r'provider.config.twitter.enable.params';
      yield serializers.serialize(
        object.providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.providerPeriodConfigPeriodTwitterPeriodParams != null) {
      yield r'provider.config.twitter.params';
      yield serializers.serialize(
        object.providerPeriodConfigPeriodTwitterPeriodParams,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled != null) {
      yield r'provider.config.refresh.userdata.enabled';
      yield serializers.serialize(
        object.providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder result,
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
        case r'oauth.cloud.config.root':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.oauthPeriodCloudPeriodConfigPeriodRoot.replace(valueDes);
          break;
        case r'provider.config.root':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.providerPeriodConfigPeriodRoot.replace(valueDes);
          break;
        case r'provider.config.user.folder':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.providerPeriodConfigPeriodUserPeriodFolder.replace(valueDes);
          break;
        case r'provider.config.twitter.enable.params':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams.replace(valueDes);
          break;
        case r'provider.config.twitter.params':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.providerPeriodConfigPeriodTwitterPeriodParams.replace(valueDes);
          break;
        case r'provider.config.refresh.userdata.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesBuilder();
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

