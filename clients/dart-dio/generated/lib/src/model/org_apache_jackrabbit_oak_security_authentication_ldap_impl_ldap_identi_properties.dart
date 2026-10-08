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

part 'org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties.g.dart';

/// OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
///
/// Properties:
/// * [providerPeriodName] 
/// * [hostPeriodName] 
/// * [hostPeriodPort] 
/// * [hostPeriodSsl] 
/// * [hostPeriodTls] 
/// * [hostPeriodNoCertCheck] 
/// * [bindPeriodDn] 
/// * [bindPeriodPassword] 
/// * [searchTimeout] 
/// * [adminPoolPeriodMaxActive] 
/// * [adminPoolPeriodLookupOnValidate] 
/// * [userPoolPeriodMaxActive] 
/// * [userPoolPeriodLookupOnValidate] 
/// * [userPeriodBaseDN] 
/// * [userPeriodObjectclass] 
/// * [userPeriodIdAttribute] 
/// * [userPeriodExtraFilter] 
/// * [userPeriodMakeDnPath] 
/// * [groupPeriodBaseDN] 
/// * [groupPeriodObjectclass] 
/// * [groupPeriodNameAttribute] 
/// * [groupPeriodExtraFilter] 
/// * [groupPeriodMakeDnPath] 
/// * [groupPeriodMemberAttribute] 
/// * [useUidForExtId] 
/// * [customattributes] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties implements Built<OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties, OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder> {
  @BuiltValueField(wireName: r'provider.name')
  ConfigNodePropertyString? get providerPeriodName;

  @BuiltValueField(wireName: r'host.name')
  ConfigNodePropertyString? get hostPeriodName;

  @BuiltValueField(wireName: r'host.port')
  ConfigNodePropertyInteger? get hostPeriodPort;

  @BuiltValueField(wireName: r'host.ssl')
  ConfigNodePropertyBoolean? get hostPeriodSsl;

  @BuiltValueField(wireName: r'host.tls')
  ConfigNodePropertyBoolean? get hostPeriodTls;

  @BuiltValueField(wireName: r'host.noCertCheck')
  ConfigNodePropertyBoolean? get hostPeriodNoCertCheck;

  @BuiltValueField(wireName: r'bind.dn')
  ConfigNodePropertyString? get bindPeriodDn;

  @BuiltValueField(wireName: r'bind.password')
  ConfigNodePropertyString? get bindPeriodPassword;

  @BuiltValueField(wireName: r'searchTimeout')
  ConfigNodePropertyString? get searchTimeout;

  @BuiltValueField(wireName: r'adminPool.maxActive')
  ConfigNodePropertyInteger? get adminPoolPeriodMaxActive;

  @BuiltValueField(wireName: r'adminPool.lookupOnValidate')
  ConfigNodePropertyBoolean? get adminPoolPeriodLookupOnValidate;

  @BuiltValueField(wireName: r'userPool.maxActive')
  ConfigNodePropertyInteger? get userPoolPeriodMaxActive;

  @BuiltValueField(wireName: r'userPool.lookupOnValidate')
  ConfigNodePropertyBoolean? get userPoolPeriodLookupOnValidate;

  @BuiltValueField(wireName: r'user.baseDN')
  ConfigNodePropertyString? get userPeriodBaseDN;

  @BuiltValueField(wireName: r'user.objectclass')
  ConfigNodePropertyArray? get userPeriodObjectclass;

  @BuiltValueField(wireName: r'user.idAttribute')
  ConfigNodePropertyString? get userPeriodIdAttribute;

  @BuiltValueField(wireName: r'user.extraFilter')
  ConfigNodePropertyString? get userPeriodExtraFilter;

  @BuiltValueField(wireName: r'user.makeDnPath')
  ConfigNodePropertyBoolean? get userPeriodMakeDnPath;

  @BuiltValueField(wireName: r'group.baseDN')
  ConfigNodePropertyString? get groupPeriodBaseDN;

  @BuiltValueField(wireName: r'group.objectclass')
  ConfigNodePropertyArray? get groupPeriodObjectclass;

  @BuiltValueField(wireName: r'group.nameAttribute')
  ConfigNodePropertyString? get groupPeriodNameAttribute;

  @BuiltValueField(wireName: r'group.extraFilter')
  ConfigNodePropertyString? get groupPeriodExtraFilter;

  @BuiltValueField(wireName: r'group.makeDnPath')
  ConfigNodePropertyBoolean? get groupPeriodMakeDnPath;

  @BuiltValueField(wireName: r'group.memberAttribute')
  ConfigNodePropertyString? get groupPeriodMemberAttribute;

  @BuiltValueField(wireName: r'useUidForExtId')
  ConfigNodePropertyBoolean? get useUidForExtId;

  @BuiltValueField(wireName: r'customattributes')
  ConfigNodePropertyArray? get customattributes;

  OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties._();

  factory OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties([void updates(OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties> get serializer => _$OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties, _$OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.providerPeriodName != null) {
      yield r'provider.name';
      yield serializers.serialize(
        object.providerPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.hostPeriodName != null) {
      yield r'host.name';
      yield serializers.serialize(
        object.hostPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.hostPeriodPort != null) {
      yield r'host.port';
      yield serializers.serialize(
        object.hostPeriodPort,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.hostPeriodSsl != null) {
      yield r'host.ssl';
      yield serializers.serialize(
        object.hostPeriodSsl,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.hostPeriodTls != null) {
      yield r'host.tls';
      yield serializers.serialize(
        object.hostPeriodTls,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.hostPeriodNoCertCheck != null) {
      yield r'host.noCertCheck';
      yield serializers.serialize(
        object.hostPeriodNoCertCheck,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.bindPeriodDn != null) {
      yield r'bind.dn';
      yield serializers.serialize(
        object.bindPeriodDn,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.bindPeriodPassword != null) {
      yield r'bind.password';
      yield serializers.serialize(
        object.bindPeriodPassword,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.searchTimeout != null) {
      yield r'searchTimeout';
      yield serializers.serialize(
        object.searchTimeout,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.adminPoolPeriodMaxActive != null) {
      yield r'adminPool.maxActive';
      yield serializers.serialize(
        object.adminPoolPeriodMaxActive,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.adminPoolPeriodLookupOnValidate != null) {
      yield r'adminPool.lookupOnValidate';
      yield serializers.serialize(
        object.adminPoolPeriodLookupOnValidate,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.userPoolPeriodMaxActive != null) {
      yield r'userPool.maxActive';
      yield serializers.serialize(
        object.userPoolPeriodMaxActive,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.userPoolPeriodLookupOnValidate != null) {
      yield r'userPool.lookupOnValidate';
      yield serializers.serialize(
        object.userPoolPeriodLookupOnValidate,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.userPeriodBaseDN != null) {
      yield r'user.baseDN';
      yield serializers.serialize(
        object.userPeriodBaseDN,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.userPeriodObjectclass != null) {
      yield r'user.objectclass';
      yield serializers.serialize(
        object.userPeriodObjectclass,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.userPeriodIdAttribute != null) {
      yield r'user.idAttribute';
      yield serializers.serialize(
        object.userPeriodIdAttribute,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.userPeriodExtraFilter != null) {
      yield r'user.extraFilter';
      yield serializers.serialize(
        object.userPeriodExtraFilter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.userPeriodMakeDnPath != null) {
      yield r'user.makeDnPath';
      yield serializers.serialize(
        object.userPeriodMakeDnPath,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.groupPeriodBaseDN != null) {
      yield r'group.baseDN';
      yield serializers.serialize(
        object.groupPeriodBaseDN,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.groupPeriodObjectclass != null) {
      yield r'group.objectclass';
      yield serializers.serialize(
        object.groupPeriodObjectclass,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.groupPeriodNameAttribute != null) {
      yield r'group.nameAttribute';
      yield serializers.serialize(
        object.groupPeriodNameAttribute,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.groupPeriodExtraFilter != null) {
      yield r'group.extraFilter';
      yield serializers.serialize(
        object.groupPeriodExtraFilter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.groupPeriodMakeDnPath != null) {
      yield r'group.makeDnPath';
      yield serializers.serialize(
        object.groupPeriodMakeDnPath,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.groupPeriodMemberAttribute != null) {
      yield r'group.memberAttribute';
      yield serializers.serialize(
        object.groupPeriodMemberAttribute,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.useUidForExtId != null) {
      yield r'useUidForExtId';
      yield serializers.serialize(
        object.useUidForExtId,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.customattributes != null) {
      yield r'customattributes';
      yield serializers.serialize(
        object.customattributes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'provider.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.providerPeriodName.replace(valueDes);
          break;
        case r'host.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.hostPeriodName.replace(valueDes);
          break;
        case r'host.port':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.hostPeriodPort.replace(valueDes);
          break;
        case r'host.ssl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.hostPeriodSsl.replace(valueDes);
          break;
        case r'host.tls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.hostPeriodTls.replace(valueDes);
          break;
        case r'host.noCertCheck':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.hostPeriodNoCertCheck.replace(valueDes);
          break;
        case r'bind.dn':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.bindPeriodDn.replace(valueDes);
          break;
        case r'bind.password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.bindPeriodPassword.replace(valueDes);
          break;
        case r'searchTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.searchTimeout.replace(valueDes);
          break;
        case r'adminPool.maxActive':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.adminPoolPeriodMaxActive.replace(valueDes);
          break;
        case r'adminPool.lookupOnValidate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.adminPoolPeriodLookupOnValidate.replace(valueDes);
          break;
        case r'userPool.maxActive':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.userPoolPeriodMaxActive.replace(valueDes);
          break;
        case r'userPool.lookupOnValidate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.userPoolPeriodLookupOnValidate.replace(valueDes);
          break;
        case r'user.baseDN':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.userPeriodBaseDN.replace(valueDes);
          break;
        case r'user.objectclass':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.userPeriodObjectclass.replace(valueDes);
          break;
        case r'user.idAttribute':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.userPeriodIdAttribute.replace(valueDes);
          break;
        case r'user.extraFilter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.userPeriodExtraFilter.replace(valueDes);
          break;
        case r'user.makeDnPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.userPeriodMakeDnPath.replace(valueDes);
          break;
        case r'group.baseDN':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.groupPeriodBaseDN.replace(valueDes);
          break;
        case r'group.objectclass':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.groupPeriodObjectclass.replace(valueDes);
          break;
        case r'group.nameAttribute':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.groupPeriodNameAttribute.replace(valueDes);
          break;
        case r'group.extraFilter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.groupPeriodExtraFilter.replace(valueDes);
          break;
        case r'group.makeDnPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.groupPeriodMakeDnPath.replace(valueDes);
          break;
        case r'group.memberAttribute':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.groupPeriodMemberAttribute.replace(valueDes);
          break;
        case r'useUidForExtId':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.useUidForExtId.replace(valueDes);
          break;
        case r'customattributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.customattributes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBuilder();
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

