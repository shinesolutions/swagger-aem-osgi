//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties.g.dart';

/// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties
///
/// Properties:
/// * [handlerPeriodName] 
/// * [userPeriodExpirationTime] 
/// * [userPeriodAutoMembership] 
/// * [userPeriodPropertyMapping] 
/// * [userPeriodPathPrefix] 
/// * [userPeriodMembershipExpTime] 
/// * [userPeriodMembershipNestingDepth] 
/// * [userPeriodDynamicMembership] 
/// * [userPeriodDisableMissing] 
/// * [groupPeriodExpirationTime] 
/// * [groupPeriodAutoMembership] 
/// * [groupPeriodPropertyMapping] 
/// * [groupPeriodPathPrefix] 
/// * [enableRFC7613UsercaseMappedProfile] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties implements Built<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder> {
  @BuiltValueField(wireName: r'handler.name')
  ConfigNodePropertyString? get handlerPeriodName;

  @BuiltValueField(wireName: r'user.expirationTime')
  ConfigNodePropertyString? get userPeriodExpirationTime;

  @BuiltValueField(wireName: r'user.autoMembership')
  ConfigNodePropertyArray? get userPeriodAutoMembership;

  @BuiltValueField(wireName: r'user.propertyMapping')
  ConfigNodePropertyArray? get userPeriodPropertyMapping;

  @BuiltValueField(wireName: r'user.pathPrefix')
  ConfigNodePropertyString? get userPeriodPathPrefix;

  @BuiltValueField(wireName: r'user.membershipExpTime')
  ConfigNodePropertyString? get userPeriodMembershipExpTime;

  @BuiltValueField(wireName: r'user.membershipNestingDepth')
  ConfigNodePropertyInteger? get userPeriodMembershipNestingDepth;

  @BuiltValueField(wireName: r'user.dynamicMembership')
  ConfigNodePropertyBoolean? get userPeriodDynamicMembership;

  @BuiltValueField(wireName: r'user.disableMissing')
  ConfigNodePropertyBoolean? get userPeriodDisableMissing;

  @BuiltValueField(wireName: r'group.expirationTime')
  ConfigNodePropertyString? get groupPeriodExpirationTime;

  @BuiltValueField(wireName: r'group.autoMembership')
  ConfigNodePropertyArray? get groupPeriodAutoMembership;

  @BuiltValueField(wireName: r'group.propertyMapping')
  ConfigNodePropertyArray? get groupPeriodPropertyMapping;

  @BuiltValueField(wireName: r'group.pathPrefix')
  ConfigNodePropertyString? get groupPeriodPathPrefix;

  @BuiltValueField(wireName: r'enableRFC7613UsercaseMappedProfile')
  ConfigNodePropertyBoolean? get enableRFC7613UsercaseMappedProfile;

  OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties._();

  factory OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties([void updates(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties> get serializer => _$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties, _$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.handlerPeriodName != null) {
      yield r'handler.name';
      yield serializers.serialize(
        object.handlerPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.userPeriodExpirationTime != null) {
      yield r'user.expirationTime';
      yield serializers.serialize(
        object.userPeriodExpirationTime,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.userPeriodAutoMembership != null) {
      yield r'user.autoMembership';
      yield serializers.serialize(
        object.userPeriodAutoMembership,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.userPeriodPropertyMapping != null) {
      yield r'user.propertyMapping';
      yield serializers.serialize(
        object.userPeriodPropertyMapping,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.userPeriodPathPrefix != null) {
      yield r'user.pathPrefix';
      yield serializers.serialize(
        object.userPeriodPathPrefix,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.userPeriodMembershipExpTime != null) {
      yield r'user.membershipExpTime';
      yield serializers.serialize(
        object.userPeriodMembershipExpTime,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.userPeriodMembershipNestingDepth != null) {
      yield r'user.membershipNestingDepth';
      yield serializers.serialize(
        object.userPeriodMembershipNestingDepth,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.userPeriodDynamicMembership != null) {
      yield r'user.dynamicMembership';
      yield serializers.serialize(
        object.userPeriodDynamicMembership,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.userPeriodDisableMissing != null) {
      yield r'user.disableMissing';
      yield serializers.serialize(
        object.userPeriodDisableMissing,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.groupPeriodExpirationTime != null) {
      yield r'group.expirationTime';
      yield serializers.serialize(
        object.groupPeriodExpirationTime,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.groupPeriodAutoMembership != null) {
      yield r'group.autoMembership';
      yield serializers.serialize(
        object.groupPeriodAutoMembership,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.groupPeriodPropertyMapping != null) {
      yield r'group.propertyMapping';
      yield serializers.serialize(
        object.groupPeriodPropertyMapping,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.groupPeriodPathPrefix != null) {
      yield r'group.pathPrefix';
      yield serializers.serialize(
        object.groupPeriodPathPrefix,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.enableRFC7613UsercaseMappedProfile != null) {
      yield r'enableRFC7613UsercaseMappedProfile';
      yield serializers.serialize(
        object.enableRFC7613UsercaseMappedProfile,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'handler.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.handlerPeriodName.replace(valueDes);
          break;
        case r'user.expirationTime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.userPeriodExpirationTime.replace(valueDes);
          break;
        case r'user.autoMembership':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.userPeriodAutoMembership.replace(valueDes);
          break;
        case r'user.propertyMapping':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.userPeriodPropertyMapping.replace(valueDes);
          break;
        case r'user.pathPrefix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.userPeriodPathPrefix.replace(valueDes);
          break;
        case r'user.membershipExpTime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.userPeriodMembershipExpTime.replace(valueDes);
          break;
        case r'user.membershipNestingDepth':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.userPeriodMembershipNestingDepth.replace(valueDes);
          break;
        case r'user.dynamicMembership':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.userPeriodDynamicMembership.replace(valueDes);
          break;
        case r'user.disableMissing':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.userPeriodDisableMissing.replace(valueDes);
          break;
        case r'group.expirationTime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.groupPeriodExpirationTime.replace(valueDes);
          break;
        case r'group.autoMembership':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.groupPeriodAutoMembership.replace(valueDes);
          break;
        case r'group.propertyMapping':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.groupPeriodPropertyMapping.replace(valueDes);
          break;
        case r'group.pathPrefix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.groupPeriodPathPrefix.replace(valueDes);
          break;
        case r'enableRFC7613UsercaseMappedProfile':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enableRFC7613UsercaseMappedProfile.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesBuilder();
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

