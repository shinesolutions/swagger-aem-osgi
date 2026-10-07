//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties.g.dart';

/// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties
///
/// Properties:
/// * [jaasPeriodRanking] 
/// * [jaasPeriodControlFlag] 
/// * [jaasPeriodRealmName] 
/// * [idpPeriodName] 
/// * [syncPeriodHandlerName] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties implements Built<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder> {
  @BuiltValueField(wireName: r'jaas.ranking')
  ConfigNodePropertyInteger? get jaasPeriodRanking;

  @BuiltValueField(wireName: r'jaas.controlFlag')
  ConfigNodePropertyString? get jaasPeriodControlFlag;

  @BuiltValueField(wireName: r'jaas.realmName')
  ConfigNodePropertyString? get jaasPeriodRealmName;

  @BuiltValueField(wireName: r'idp.name')
  ConfigNodePropertyString? get idpPeriodName;

  @BuiltValueField(wireName: r'sync.handlerName')
  ConfigNodePropertyString? get syncPeriodHandlerName;

  OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties._();

  factory OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties([void updates(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties> get serializer => _$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties, _$OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.jaasPeriodRanking != null) {
      yield r'jaas.ranking';
      yield serializers.serialize(
        object.jaasPeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.jaasPeriodControlFlag != null) {
      yield r'jaas.controlFlag';
      yield serializers.serialize(
        object.jaasPeriodControlFlag,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jaasPeriodRealmName != null) {
      yield r'jaas.realmName';
      yield serializers.serialize(
        object.jaasPeriodRealmName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.idpPeriodName != null) {
      yield r'idp.name';
      yield serializers.serialize(
        object.idpPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.syncPeriodHandlerName != null) {
      yield r'sync.handlerName';
      yield serializers.serialize(
        object.syncPeriodHandlerName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'jaas.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.jaasPeriodRanking.replace(valueDes);
          break;
        case r'jaas.controlFlag':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jaasPeriodControlFlag.replace(valueDes);
          break;
        case r'jaas.realmName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jaasPeriodRealmName.replace(valueDes);
          break;
        case r'idp.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.idpPeriodName.replace(valueDes);
          break;
        case r'sync.handlerName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.syncPeriodHandlerName.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesBuilder();
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

