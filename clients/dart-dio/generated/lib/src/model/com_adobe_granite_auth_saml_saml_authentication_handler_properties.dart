//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_auth_saml_saml_authentication_handler_properties.g.dart';

/// ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties
///
/// Properties:
/// * [path] 
/// * [servicePeriodRanking] 
/// * [idpUrl] 
/// * [idpCertAlias] 
/// * [idpHttpRedirect] 
/// * [serviceProviderEntityId] 
/// * [assertionConsumerServiceURL] 
/// * [spPrivateKeyAlias] 
/// * [keyStorePassword] 
/// * [defaultRedirectUrl] 
/// * [userIDAttribute] 
/// * [useEncryption] 
/// * [createUser] 
/// * [userIntermediatePath] 
/// * [addGroupMemberships] 
/// * [groupMembershipAttribute] 
/// * [defaultGroups] 
/// * [nameIdFormat] 
/// * [synchronizeAttributes] 
/// * [handleLogout] 
/// * [logoutUrl] 
/// * [clockTolerance] 
/// * [digestMethod] 
/// * [signatureMethod] 
/// * [identitySyncType] 
/// * [idpIdentifier] 
@BuiltValue()
abstract class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties implements Built<ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties, ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyArray? get path;

  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'idpUrl')
  ConfigNodePropertyString? get idpUrl;

  @BuiltValueField(wireName: r'idpCertAlias')
  ConfigNodePropertyString? get idpCertAlias;

  @BuiltValueField(wireName: r'idpHttpRedirect')
  ConfigNodePropertyBoolean? get idpHttpRedirect;

  @BuiltValueField(wireName: r'serviceProviderEntityId')
  ConfigNodePropertyString? get serviceProviderEntityId;

  @BuiltValueField(wireName: r'assertionConsumerServiceURL')
  ConfigNodePropertyString? get assertionConsumerServiceURL;

  @BuiltValueField(wireName: r'spPrivateKeyAlias')
  ConfigNodePropertyString? get spPrivateKeyAlias;

  @BuiltValueField(wireName: r'keyStorePassword')
  ConfigNodePropertyString? get keyStorePassword;

  @BuiltValueField(wireName: r'defaultRedirectUrl')
  ConfigNodePropertyString? get defaultRedirectUrl;

  @BuiltValueField(wireName: r'userIDAttribute')
  ConfigNodePropertyString? get userIDAttribute;

  @BuiltValueField(wireName: r'useEncryption')
  ConfigNodePropertyBoolean? get useEncryption;

  @BuiltValueField(wireName: r'createUser')
  ConfigNodePropertyBoolean? get createUser;

  @BuiltValueField(wireName: r'userIntermediatePath')
  ConfigNodePropertyString? get userIntermediatePath;

  @BuiltValueField(wireName: r'addGroupMemberships')
  ConfigNodePropertyBoolean? get addGroupMemberships;

  @BuiltValueField(wireName: r'groupMembershipAttribute')
  ConfigNodePropertyString? get groupMembershipAttribute;

  @BuiltValueField(wireName: r'defaultGroups')
  ConfigNodePropertyArray? get defaultGroups;

  @BuiltValueField(wireName: r'nameIdFormat')
  ConfigNodePropertyString? get nameIdFormat;

  @BuiltValueField(wireName: r'synchronizeAttributes')
  ConfigNodePropertyArray? get synchronizeAttributes;

  @BuiltValueField(wireName: r'handleLogout')
  ConfigNodePropertyBoolean? get handleLogout;

  @BuiltValueField(wireName: r'logoutUrl')
  ConfigNodePropertyString? get logoutUrl;

  @BuiltValueField(wireName: r'clockTolerance')
  ConfigNodePropertyInteger? get clockTolerance;

  @BuiltValueField(wireName: r'digestMethod')
  ConfigNodePropertyString? get digestMethod;

  @BuiltValueField(wireName: r'signatureMethod')
  ConfigNodePropertyString? get signatureMethod;

  @BuiltValueField(wireName: r'identitySyncType')
  ConfigNodePropertyDropDown? get identitySyncType;

  @BuiltValueField(wireName: r'idpIdentifier')
  ConfigNodePropertyString? get idpIdentifier;

  ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties._();

  factory ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties([void updates(ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder b)]) = _$ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties> get serializer => _$ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesSerializer();
}

class _$ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties, _$ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties];

  @override
  final String wireName = r'ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties object, {
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
    if (object.idpUrl != null) {
      yield r'idpUrl';
      yield serializers.serialize(
        object.idpUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.idpCertAlias != null) {
      yield r'idpCertAlias';
      yield serializers.serialize(
        object.idpCertAlias,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.idpHttpRedirect != null) {
      yield r'idpHttpRedirect';
      yield serializers.serialize(
        object.idpHttpRedirect,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.serviceProviderEntityId != null) {
      yield r'serviceProviderEntityId';
      yield serializers.serialize(
        object.serviceProviderEntityId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.assertionConsumerServiceURL != null) {
      yield r'assertionConsumerServiceURL';
      yield serializers.serialize(
        object.assertionConsumerServiceURL,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.spPrivateKeyAlias != null) {
      yield r'spPrivateKeyAlias';
      yield serializers.serialize(
        object.spPrivateKeyAlias,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.keyStorePassword != null) {
      yield r'keyStorePassword';
      yield serializers.serialize(
        object.keyStorePassword,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultRedirectUrl != null) {
      yield r'defaultRedirectUrl';
      yield serializers.serialize(
        object.defaultRedirectUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.userIDAttribute != null) {
      yield r'userIDAttribute';
      yield serializers.serialize(
        object.userIDAttribute,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.useEncryption != null) {
      yield r'useEncryption';
      yield serializers.serialize(
        object.useEncryption,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.createUser != null) {
      yield r'createUser';
      yield serializers.serialize(
        object.createUser,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.userIntermediatePath != null) {
      yield r'userIntermediatePath';
      yield serializers.serialize(
        object.userIntermediatePath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.addGroupMemberships != null) {
      yield r'addGroupMemberships';
      yield serializers.serialize(
        object.addGroupMemberships,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.groupMembershipAttribute != null) {
      yield r'groupMembershipAttribute';
      yield serializers.serialize(
        object.groupMembershipAttribute,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultGroups != null) {
      yield r'defaultGroups';
      yield serializers.serialize(
        object.defaultGroups,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.nameIdFormat != null) {
      yield r'nameIdFormat';
      yield serializers.serialize(
        object.nameIdFormat,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.synchronizeAttributes != null) {
      yield r'synchronizeAttributes';
      yield serializers.serialize(
        object.synchronizeAttributes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.handleLogout != null) {
      yield r'handleLogout';
      yield serializers.serialize(
        object.handleLogout,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.logoutUrl != null) {
      yield r'logoutUrl';
      yield serializers.serialize(
        object.logoutUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.clockTolerance != null) {
      yield r'clockTolerance';
      yield serializers.serialize(
        object.clockTolerance,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.digestMethod != null) {
      yield r'digestMethod';
      yield serializers.serialize(
        object.digestMethod,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.signatureMethod != null) {
      yield r'signatureMethod';
      yield serializers.serialize(
        object.signatureMethod,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.identitySyncType != null) {
      yield r'identitySyncType';
      yield serializers.serialize(
        object.identitySyncType,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.idpIdentifier != null) {
      yield r'idpIdentifier';
      yield serializers.serialize(
        object.idpIdentifier,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder result,
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
        case r'idpUrl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.idpUrl.replace(valueDes);
          break;
        case r'idpCertAlias':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.idpCertAlias.replace(valueDes);
          break;
        case r'idpHttpRedirect':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.idpHttpRedirect.replace(valueDes);
          break;
        case r'serviceProviderEntityId':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.serviceProviderEntityId.replace(valueDes);
          break;
        case r'assertionConsumerServiceURL':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.assertionConsumerServiceURL.replace(valueDes);
          break;
        case r'spPrivateKeyAlias':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.spPrivateKeyAlias.replace(valueDes);
          break;
        case r'keyStorePassword':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.keyStorePassword.replace(valueDes);
          break;
        case r'defaultRedirectUrl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultRedirectUrl.replace(valueDes);
          break;
        case r'userIDAttribute':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.userIDAttribute.replace(valueDes);
          break;
        case r'useEncryption':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.useEncryption.replace(valueDes);
          break;
        case r'createUser':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.createUser.replace(valueDes);
          break;
        case r'userIntermediatePath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.userIntermediatePath.replace(valueDes);
          break;
        case r'addGroupMemberships':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.addGroupMemberships.replace(valueDes);
          break;
        case r'groupMembershipAttribute':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.groupMembershipAttribute.replace(valueDes);
          break;
        case r'defaultGroups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.defaultGroups.replace(valueDes);
          break;
        case r'nameIdFormat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.nameIdFormat.replace(valueDes);
          break;
        case r'synchronizeAttributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.synchronizeAttributes.replace(valueDes);
          break;
        case r'handleLogout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.handleLogout.replace(valueDes);
          break;
        case r'logoutUrl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.logoutUrl.replace(valueDes);
          break;
        case r'clockTolerance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clockTolerance.replace(valueDes);
          break;
        case r'digestMethod':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.digestMethod.replace(valueDes);
          break;
        case r'signatureMethod':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.signatureMethod.replace(valueDes);
          break;
        case r'identitySyncType':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.identitySyncType.replace(valueDes);
          break;
        case r'idpIdentifier':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.idpIdentifier.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesBuilder();
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

