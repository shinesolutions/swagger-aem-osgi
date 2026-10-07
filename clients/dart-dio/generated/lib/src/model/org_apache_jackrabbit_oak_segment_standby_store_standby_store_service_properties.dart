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

part 'org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties.g.dart';

/// OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties
///
/// Properties:
/// * [orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist] 
/// * [mode] 
/// * [port] 
/// * [primaryPeriodHost] 
/// * [interval] 
/// * [primaryPeriodAllowedClientIpRanges] 
/// * [secure] 
/// * [standbyPeriodReadtimeout] 
/// * [standbyPeriodAutoclean] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties implements Built<OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties, OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'org.apache.sling.installer.configuration.persist')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist;

  @BuiltValueField(wireName: r'mode')
  ConfigNodePropertyDropDown? get mode;

  @BuiltValueField(wireName: r'port')
  ConfigNodePropertyInteger? get port;

  @BuiltValueField(wireName: r'primary.host')
  ConfigNodePropertyString? get primaryPeriodHost;

  @BuiltValueField(wireName: r'interval')
  ConfigNodePropertyInteger? get interval;

  @BuiltValueField(wireName: r'primary.allowed-client-ip-ranges')
  ConfigNodePropertyArray? get primaryPeriodAllowedClientIpRanges;

  @BuiltValueField(wireName: r'secure')
  ConfigNodePropertyBoolean? get secure;

  @BuiltValueField(wireName: r'standby.readtimeout')
  ConfigNodePropertyInteger? get standbyPeriodReadtimeout;

  @BuiltValueField(wireName: r'standby.autoclean')
  ConfigNodePropertyBoolean? get standbyPeriodAutoclean;

  OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties._();

  factory OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties([void updates(OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties> get serializer => _$OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties, _$OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist != null) {
      yield r'org.apache.sling.installer.configuration.persist';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.mode != null) {
      yield r'mode';
      yield serializers.serialize(
        object.mode,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.port != null) {
      yield r'port';
      yield serializers.serialize(
        object.port,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.primaryPeriodHost != null) {
      yield r'primary.host';
      yield serializers.serialize(
        object.primaryPeriodHost,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.interval != null) {
      yield r'interval';
      yield serializers.serialize(
        object.interval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.primaryPeriodAllowedClientIpRanges != null) {
      yield r'primary.allowed-client-ip-ranges';
      yield serializers.serialize(
        object.primaryPeriodAllowedClientIpRanges,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.secure != null) {
      yield r'secure';
      yield serializers.serialize(
        object.secure,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.standbyPeriodReadtimeout != null) {
      yield r'standby.readtimeout';
      yield serializers.serialize(
        object.standbyPeriodReadtimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.standbyPeriodAutoclean != null) {
      yield r'standby.autoclean';
      yield serializers.serialize(
        object.standbyPeriodAutoclean,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'org.apache.sling.installer.configuration.persist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist.replace(valueDes);
          break;
        case r'mode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.mode.replace(valueDes);
          break;
        case r'port':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.port.replace(valueDes);
          break;
        case r'primary.host':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.primaryPeriodHost.replace(valueDes);
          break;
        case r'interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.interval.replace(valueDes);
          break;
        case r'primary.allowed-client-ip-ranges':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.primaryPeriodAllowedClientIpRanges.replace(valueDes);
          break;
        case r'secure':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.secure.replace(valueDes);
          break;
        case r'standby.readtimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.standbyPeriodReadtimeout.replace(valueDes);
          break;
        case r'standby.autoclean':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.standbyPeriodAutoclean.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesBuilder();
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

