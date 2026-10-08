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

part 'org_apache_sling_discovery_oak_config_properties.g.dart';

/// OrgApacheSlingDiscoveryOakConfigProperties
///
/// Properties:
/// * [connectorPingTimeout] 
/// * [connectorPingInterval] 
/// * [discoveryLiteCheckInterval] 
/// * [clusterSyncServiceTimeout] 
/// * [clusterSyncServiceInterval] 
/// * [enableSyncToken] 
/// * [minEventDelay] 
/// * [socketConnectTimeout] 
/// * [soTimeout] 
/// * [topologyConnectorUrls] 
/// * [topologyConnectorWhitelist] 
/// * [autoStopLocalLoopEnabled] 
/// * [gzipConnectorRequestsEnabled] 
/// * [hmacEnabled] 
/// * [enableEncryption] 
/// * [sharedKey] 
/// * [hmacSharedKeyTTL] 
/// * [backoffStandbyFactor] 
/// * [backoffStableFactor] 
@BuiltValue()
abstract class OrgApacheSlingDiscoveryOakConfigProperties implements Built<OrgApacheSlingDiscoveryOakConfigProperties, OrgApacheSlingDiscoveryOakConfigPropertiesBuilder> {
  @BuiltValueField(wireName: r'connectorPingTimeout')
  ConfigNodePropertyInteger? get connectorPingTimeout;

  @BuiltValueField(wireName: r'connectorPingInterval')
  ConfigNodePropertyInteger? get connectorPingInterval;

  @BuiltValueField(wireName: r'discoveryLiteCheckInterval')
  ConfigNodePropertyInteger? get discoveryLiteCheckInterval;

  @BuiltValueField(wireName: r'clusterSyncServiceTimeout')
  ConfigNodePropertyInteger? get clusterSyncServiceTimeout;

  @BuiltValueField(wireName: r'clusterSyncServiceInterval')
  ConfigNodePropertyInteger? get clusterSyncServiceInterval;

  @BuiltValueField(wireName: r'enableSyncToken')
  ConfigNodePropertyBoolean? get enableSyncToken;

  @BuiltValueField(wireName: r'minEventDelay')
  ConfigNodePropertyInteger? get minEventDelay;

  @BuiltValueField(wireName: r'socketConnectTimeout')
  ConfigNodePropertyInteger? get socketConnectTimeout;

  @BuiltValueField(wireName: r'soTimeout')
  ConfigNodePropertyInteger? get soTimeout;

  @BuiltValueField(wireName: r'topologyConnectorUrls')
  ConfigNodePropertyArray? get topologyConnectorUrls;

  @BuiltValueField(wireName: r'topologyConnectorWhitelist')
  ConfigNodePropertyArray? get topologyConnectorWhitelist;

  @BuiltValueField(wireName: r'autoStopLocalLoopEnabled')
  ConfigNodePropertyBoolean? get autoStopLocalLoopEnabled;

  @BuiltValueField(wireName: r'gzipConnectorRequestsEnabled')
  ConfigNodePropertyBoolean? get gzipConnectorRequestsEnabled;

  @BuiltValueField(wireName: r'hmacEnabled')
  ConfigNodePropertyBoolean? get hmacEnabled;

  @BuiltValueField(wireName: r'enableEncryption')
  ConfigNodePropertyBoolean? get enableEncryption;

  @BuiltValueField(wireName: r'sharedKey')
  ConfigNodePropertyString? get sharedKey;

  @BuiltValueField(wireName: r'hmacSharedKeyTTL')
  ConfigNodePropertyInteger? get hmacSharedKeyTTL;

  @BuiltValueField(wireName: r'backoffStandbyFactor')
  ConfigNodePropertyString? get backoffStandbyFactor;

  @BuiltValueField(wireName: r'backoffStableFactor')
  ConfigNodePropertyString? get backoffStableFactor;

  OrgApacheSlingDiscoveryOakConfigProperties._();

  factory OrgApacheSlingDiscoveryOakConfigProperties([void updates(OrgApacheSlingDiscoveryOakConfigPropertiesBuilder b)]) = _$OrgApacheSlingDiscoveryOakConfigProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDiscoveryOakConfigPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDiscoveryOakConfigProperties> get serializer => _$OrgApacheSlingDiscoveryOakConfigPropertiesSerializer();
}

class _$OrgApacheSlingDiscoveryOakConfigPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDiscoveryOakConfigProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDiscoveryOakConfigProperties, _$OrgApacheSlingDiscoveryOakConfigProperties];

  @override
  final String wireName = r'OrgApacheSlingDiscoveryOakConfigProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDiscoveryOakConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.connectorPingTimeout != null) {
      yield r'connectorPingTimeout';
      yield serializers.serialize(
        object.connectorPingTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.connectorPingInterval != null) {
      yield r'connectorPingInterval';
      yield serializers.serialize(
        object.connectorPingInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.discoveryLiteCheckInterval != null) {
      yield r'discoveryLiteCheckInterval';
      yield serializers.serialize(
        object.discoveryLiteCheckInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterSyncServiceTimeout != null) {
      yield r'clusterSyncServiceTimeout';
      yield serializers.serialize(
        object.clusterSyncServiceTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterSyncServiceInterval != null) {
      yield r'clusterSyncServiceInterval';
      yield serializers.serialize(
        object.clusterSyncServiceInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.enableSyncToken != null) {
      yield r'enableSyncToken';
      yield serializers.serialize(
        object.enableSyncToken,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.minEventDelay != null) {
      yield r'minEventDelay';
      yield serializers.serialize(
        object.minEventDelay,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.socketConnectTimeout != null) {
      yield r'socketConnectTimeout';
      yield serializers.serialize(
        object.socketConnectTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.soTimeout != null) {
      yield r'soTimeout';
      yield serializers.serialize(
        object.soTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.topologyConnectorUrls != null) {
      yield r'topologyConnectorUrls';
      yield serializers.serialize(
        object.topologyConnectorUrls,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.topologyConnectorWhitelist != null) {
      yield r'topologyConnectorWhitelist';
      yield serializers.serialize(
        object.topologyConnectorWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.autoStopLocalLoopEnabled != null) {
      yield r'autoStopLocalLoopEnabled';
      yield serializers.serialize(
        object.autoStopLocalLoopEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.gzipConnectorRequestsEnabled != null) {
      yield r'gzipConnectorRequestsEnabled';
      yield serializers.serialize(
        object.gzipConnectorRequestsEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.hmacEnabled != null) {
      yield r'hmacEnabled';
      yield serializers.serialize(
        object.hmacEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.enableEncryption != null) {
      yield r'enableEncryption';
      yield serializers.serialize(
        object.enableEncryption,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.sharedKey != null) {
      yield r'sharedKey';
      yield serializers.serialize(
        object.sharedKey,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.hmacSharedKeyTTL != null) {
      yield r'hmacSharedKeyTTL';
      yield serializers.serialize(
        object.hmacSharedKeyTTL,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.backoffStandbyFactor != null) {
      yield r'backoffStandbyFactor';
      yield serializers.serialize(
        object.backoffStandbyFactor,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.backoffStableFactor != null) {
      yield r'backoffStableFactor';
      yield serializers.serialize(
        object.backoffStableFactor,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDiscoveryOakConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDiscoveryOakConfigPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'connectorPingTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.connectorPingTimeout.replace(valueDes);
          break;
        case r'connectorPingInterval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.connectorPingInterval.replace(valueDes);
          break;
        case r'discoveryLiteCheckInterval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.discoveryLiteCheckInterval.replace(valueDes);
          break;
        case r'clusterSyncServiceTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterSyncServiceTimeout.replace(valueDes);
          break;
        case r'clusterSyncServiceInterval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterSyncServiceInterval.replace(valueDes);
          break;
        case r'enableSyncToken':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enableSyncToken.replace(valueDes);
          break;
        case r'minEventDelay':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.minEventDelay.replace(valueDes);
          break;
        case r'socketConnectTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.socketConnectTimeout.replace(valueDes);
          break;
        case r'soTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.soTimeout.replace(valueDes);
          break;
        case r'topologyConnectorUrls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.topologyConnectorUrls.replace(valueDes);
          break;
        case r'topologyConnectorWhitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.topologyConnectorWhitelist.replace(valueDes);
          break;
        case r'autoStopLocalLoopEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.autoStopLocalLoopEnabled.replace(valueDes);
          break;
        case r'gzipConnectorRequestsEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.gzipConnectorRequestsEnabled.replace(valueDes);
          break;
        case r'hmacEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.hmacEnabled.replace(valueDes);
          break;
        case r'enableEncryption':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enableEncryption.replace(valueDes);
          break;
        case r'sharedKey':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.sharedKey.replace(valueDes);
          break;
        case r'hmacSharedKeyTTL':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.hmacSharedKeyTTL.replace(valueDes);
          break;
        case r'backoffStandbyFactor':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.backoffStandbyFactor.replace(valueDes);
          break;
        case r'backoffStableFactor':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.backoffStableFactor.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDiscoveryOakConfigProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDiscoveryOakConfigPropertiesBuilder();
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

