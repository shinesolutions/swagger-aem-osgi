//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_float.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties.g.dart';

/// ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties
///
/// Properties:
/// * [servicePeriodRanking] 
/// * [globalPeriodSize] 
/// * [maxPeriodDiskPeriodUsage] 
/// * [persistencePeriodEnabled] 
/// * [threadPeriodPoolPeriodMaxPeriodSize] 
/// * [scheduledPeriodThreadPeriodPoolPeriodMaxPeriodSize] 
/// * [gracefulPeriodShutdownPeriodTimeout] 
/// * [queues] 
/// * [topics] 
/// * [addressesPeriodMaxPeriodDeliveryPeriodAttempts] 
/// * [addressesPeriodExpiryPeriodDelay] 
/// * [addressesPeriodAddressPeriodFullPeriodMessagePeriodPolicy] 
/// * [addressesPeriodMaxPeriodSizePeriodBytes] 
/// * [addressesPeriodPagePeriodSizePeriodBytes] 
/// * [addressesPeriodPagePeriodCachePeriodMaxPeriodSize] 
/// * [clusterPeriodUser] 
/// * [clusterPeriodPassword] 
/// * [clusterPeriodCallPeriodTimeout] 
/// * [clusterPeriodCallPeriodFailoverPeriodTimeout] 
/// * [clusterPeriodClientPeriodFailurePeriodCheckPeriodPeriod] 
/// * [clusterPeriodNotificationPeriodAttempts] 
/// * [clusterPeriodNotificationPeriodInterval] 
/// * [idPeriodCachePeriodSize] 
/// * [clusterPeriodConfirmationPeriodWindowPeriodSize] 
/// * [clusterPeriodConnectionPeriodTtl] 
/// * [clusterPeriodDuplicatePeriodDetection] 
/// * [clusterPeriodInitialPeriodConnectPeriodAttempts] 
/// * [clusterPeriodMaxPeriodRetryPeriodInterval] 
/// * [clusterPeriodMinPeriodLargePeriodMessagePeriodSize] 
/// * [clusterPeriodProducerPeriodWindowPeriodSize] 
/// * [clusterPeriodReconnectPeriodAttempts] 
/// * [clusterPeriodRetryPeriodInterval] 
/// * [clusterPeriodRetryPeriodIntervalPeriodMultiplier] 
@BuiltValue()
abstract class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties implements Built<ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties, ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'global.size')
  ConfigNodePropertyInteger? get globalPeriodSize;

  @BuiltValueField(wireName: r'max.disk.usage')
  ConfigNodePropertyInteger? get maxPeriodDiskPeriodUsage;

  @BuiltValueField(wireName: r'persistence.enabled')
  ConfigNodePropertyBoolean? get persistencePeriodEnabled;

  @BuiltValueField(wireName: r'thread.pool.max.size')
  ConfigNodePropertyInteger? get threadPeriodPoolPeriodMaxPeriodSize;

  @BuiltValueField(wireName: r'scheduled.thread.pool.max.size')
  ConfigNodePropertyInteger? get scheduledPeriodThreadPeriodPoolPeriodMaxPeriodSize;

  @BuiltValueField(wireName: r'graceful.shutdown.timeout')
  ConfigNodePropertyInteger? get gracefulPeriodShutdownPeriodTimeout;

  @BuiltValueField(wireName: r'queues')
  ConfigNodePropertyArray? get queues;

  @BuiltValueField(wireName: r'topics')
  ConfigNodePropertyArray? get topics;

  @BuiltValueField(wireName: r'addresses.max.delivery.attempts')
  ConfigNodePropertyInteger? get addressesPeriodMaxPeriodDeliveryPeriodAttempts;

  @BuiltValueField(wireName: r'addresses.expiry.delay')
  ConfigNodePropertyInteger? get addressesPeriodExpiryPeriodDelay;

  @BuiltValueField(wireName: r'addresses.address.full.message.policy')
  ConfigNodePropertyDropDown? get addressesPeriodAddressPeriodFullPeriodMessagePeriodPolicy;

  @BuiltValueField(wireName: r'addresses.max.size.bytes')
  ConfigNodePropertyInteger? get addressesPeriodMaxPeriodSizePeriodBytes;

  @BuiltValueField(wireName: r'addresses.page.size.bytes')
  ConfigNodePropertyInteger? get addressesPeriodPagePeriodSizePeriodBytes;

  @BuiltValueField(wireName: r'addresses.page.cache.max.size')
  ConfigNodePropertyInteger? get addressesPeriodPagePeriodCachePeriodMaxPeriodSize;

  @BuiltValueField(wireName: r'cluster.user')
  ConfigNodePropertyString? get clusterPeriodUser;

  @BuiltValueField(wireName: r'cluster.password')
  ConfigNodePropertyString? get clusterPeriodPassword;

  @BuiltValueField(wireName: r'cluster.call.timeout')
  ConfigNodePropertyInteger? get clusterPeriodCallPeriodTimeout;

  @BuiltValueField(wireName: r'cluster.call.failover.timeout')
  ConfigNodePropertyInteger? get clusterPeriodCallPeriodFailoverPeriodTimeout;

  @BuiltValueField(wireName: r'cluster.client.failure.check.period')
  ConfigNodePropertyInteger? get clusterPeriodClientPeriodFailurePeriodCheckPeriodPeriod;

  @BuiltValueField(wireName: r'cluster.notification.attempts')
  ConfigNodePropertyInteger? get clusterPeriodNotificationPeriodAttempts;

  @BuiltValueField(wireName: r'cluster.notification.interval')
  ConfigNodePropertyInteger? get clusterPeriodNotificationPeriodInterval;

  @BuiltValueField(wireName: r'id.cache.size')
  ConfigNodePropertyInteger? get idPeriodCachePeriodSize;

  @BuiltValueField(wireName: r'cluster.confirmation.window.size')
  ConfigNodePropertyInteger? get clusterPeriodConfirmationPeriodWindowPeriodSize;

  @BuiltValueField(wireName: r'cluster.connection.ttl')
  ConfigNodePropertyInteger? get clusterPeriodConnectionPeriodTtl;

  @BuiltValueField(wireName: r'cluster.duplicate.detection')
  ConfigNodePropertyBoolean? get clusterPeriodDuplicatePeriodDetection;

  @BuiltValueField(wireName: r'cluster.initial.connect.attempts')
  ConfigNodePropertyInteger? get clusterPeriodInitialPeriodConnectPeriodAttempts;

  @BuiltValueField(wireName: r'cluster.max.retry.interval')
  ConfigNodePropertyInteger? get clusterPeriodMaxPeriodRetryPeriodInterval;

  @BuiltValueField(wireName: r'cluster.min.large.message.size')
  ConfigNodePropertyInteger? get clusterPeriodMinPeriodLargePeriodMessagePeriodSize;

  @BuiltValueField(wireName: r'cluster.producer.window.size')
  ConfigNodePropertyInteger? get clusterPeriodProducerPeriodWindowPeriodSize;

  @BuiltValueField(wireName: r'cluster.reconnect.attempts')
  ConfigNodePropertyInteger? get clusterPeriodReconnectPeriodAttempts;

  @BuiltValueField(wireName: r'cluster.retry.interval')
  ConfigNodePropertyInteger? get clusterPeriodRetryPeriodInterval;

  @BuiltValueField(wireName: r'cluster.retry.interval.multiplier')
  ConfigNodePropertyFloat? get clusterPeriodRetryPeriodIntervalPeriodMultiplier;

  ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties._();

  factory ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties([void updates(ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder b)]) = _$ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties> get serializer => _$ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesSerializer();
}

class _$ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties, _$ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties];

  @override
  final String wireName = r'ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.globalPeriodSize != null) {
      yield r'global.size';
      yield serializers.serialize(
        object.globalPeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxPeriodDiskPeriodUsage != null) {
      yield r'max.disk.usage';
      yield serializers.serialize(
        object.maxPeriodDiskPeriodUsage,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.persistencePeriodEnabled != null) {
      yield r'persistence.enabled';
      yield serializers.serialize(
        object.persistencePeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.threadPeriodPoolPeriodMaxPeriodSize != null) {
      yield r'thread.pool.max.size';
      yield serializers.serialize(
        object.threadPeriodPoolPeriodMaxPeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.scheduledPeriodThreadPeriodPoolPeriodMaxPeriodSize != null) {
      yield r'scheduled.thread.pool.max.size';
      yield serializers.serialize(
        object.scheduledPeriodThreadPeriodPoolPeriodMaxPeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.gracefulPeriodShutdownPeriodTimeout != null) {
      yield r'graceful.shutdown.timeout';
      yield serializers.serialize(
        object.gracefulPeriodShutdownPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.queues != null) {
      yield r'queues';
      yield serializers.serialize(
        object.queues,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.topics != null) {
      yield r'topics';
      yield serializers.serialize(
        object.topics,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.addressesPeriodMaxPeriodDeliveryPeriodAttempts != null) {
      yield r'addresses.max.delivery.attempts';
      yield serializers.serialize(
        object.addressesPeriodMaxPeriodDeliveryPeriodAttempts,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.addressesPeriodExpiryPeriodDelay != null) {
      yield r'addresses.expiry.delay';
      yield serializers.serialize(
        object.addressesPeriodExpiryPeriodDelay,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.addressesPeriodAddressPeriodFullPeriodMessagePeriodPolicy != null) {
      yield r'addresses.address.full.message.policy';
      yield serializers.serialize(
        object.addressesPeriodAddressPeriodFullPeriodMessagePeriodPolicy,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.addressesPeriodMaxPeriodSizePeriodBytes != null) {
      yield r'addresses.max.size.bytes';
      yield serializers.serialize(
        object.addressesPeriodMaxPeriodSizePeriodBytes,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.addressesPeriodPagePeriodSizePeriodBytes != null) {
      yield r'addresses.page.size.bytes';
      yield serializers.serialize(
        object.addressesPeriodPagePeriodSizePeriodBytes,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.addressesPeriodPagePeriodCachePeriodMaxPeriodSize != null) {
      yield r'addresses.page.cache.max.size';
      yield serializers.serialize(
        object.addressesPeriodPagePeriodCachePeriodMaxPeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodUser != null) {
      yield r'cluster.user';
      yield serializers.serialize(
        object.clusterPeriodUser,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.clusterPeriodPassword != null) {
      yield r'cluster.password';
      yield serializers.serialize(
        object.clusterPeriodPassword,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.clusterPeriodCallPeriodTimeout != null) {
      yield r'cluster.call.timeout';
      yield serializers.serialize(
        object.clusterPeriodCallPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodCallPeriodFailoverPeriodTimeout != null) {
      yield r'cluster.call.failover.timeout';
      yield serializers.serialize(
        object.clusterPeriodCallPeriodFailoverPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodClientPeriodFailurePeriodCheckPeriodPeriod != null) {
      yield r'cluster.client.failure.check.period';
      yield serializers.serialize(
        object.clusterPeriodClientPeriodFailurePeriodCheckPeriodPeriod,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodNotificationPeriodAttempts != null) {
      yield r'cluster.notification.attempts';
      yield serializers.serialize(
        object.clusterPeriodNotificationPeriodAttempts,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodNotificationPeriodInterval != null) {
      yield r'cluster.notification.interval';
      yield serializers.serialize(
        object.clusterPeriodNotificationPeriodInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.idPeriodCachePeriodSize != null) {
      yield r'id.cache.size';
      yield serializers.serialize(
        object.idPeriodCachePeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodConfirmationPeriodWindowPeriodSize != null) {
      yield r'cluster.confirmation.window.size';
      yield serializers.serialize(
        object.clusterPeriodConfirmationPeriodWindowPeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodConnectionPeriodTtl != null) {
      yield r'cluster.connection.ttl';
      yield serializers.serialize(
        object.clusterPeriodConnectionPeriodTtl,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodDuplicatePeriodDetection != null) {
      yield r'cluster.duplicate.detection';
      yield serializers.serialize(
        object.clusterPeriodDuplicatePeriodDetection,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.clusterPeriodInitialPeriodConnectPeriodAttempts != null) {
      yield r'cluster.initial.connect.attempts';
      yield serializers.serialize(
        object.clusterPeriodInitialPeriodConnectPeriodAttempts,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodMaxPeriodRetryPeriodInterval != null) {
      yield r'cluster.max.retry.interval';
      yield serializers.serialize(
        object.clusterPeriodMaxPeriodRetryPeriodInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodMinPeriodLargePeriodMessagePeriodSize != null) {
      yield r'cluster.min.large.message.size';
      yield serializers.serialize(
        object.clusterPeriodMinPeriodLargePeriodMessagePeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodProducerPeriodWindowPeriodSize != null) {
      yield r'cluster.producer.window.size';
      yield serializers.serialize(
        object.clusterPeriodProducerPeriodWindowPeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodReconnectPeriodAttempts != null) {
      yield r'cluster.reconnect.attempts';
      yield serializers.serialize(
        object.clusterPeriodReconnectPeriodAttempts,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodRetryPeriodInterval != null) {
      yield r'cluster.retry.interval';
      yield serializers.serialize(
        object.clusterPeriodRetryPeriodInterval,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodRetryPeriodIntervalPeriodMultiplier != null) {
      yield r'cluster.retry.interval.multiplier';
      yield serializers.serialize(
        object.clusterPeriodRetryPeriodIntervalPeriodMultiplier,
        specifiedType: const FullType(ConfigNodePropertyFloat),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        case r'global.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.globalPeriodSize.replace(valueDes);
          break;
        case r'max.disk.usage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxPeriodDiskPeriodUsage.replace(valueDes);
          break;
        case r'persistence.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.persistencePeriodEnabled.replace(valueDes);
          break;
        case r'thread.pool.max.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.threadPeriodPoolPeriodMaxPeriodSize.replace(valueDes);
          break;
        case r'scheduled.thread.pool.max.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.scheduledPeriodThreadPeriodPoolPeriodMaxPeriodSize.replace(valueDes);
          break;
        case r'graceful.shutdown.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.gracefulPeriodShutdownPeriodTimeout.replace(valueDes);
          break;
        case r'queues':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.queues.replace(valueDes);
          break;
        case r'topics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.topics.replace(valueDes);
          break;
        case r'addresses.max.delivery.attempts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.addressesPeriodMaxPeriodDeliveryPeriodAttempts.replace(valueDes);
          break;
        case r'addresses.expiry.delay':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.addressesPeriodExpiryPeriodDelay.replace(valueDes);
          break;
        case r'addresses.address.full.message.policy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.addressesPeriodAddressPeriodFullPeriodMessagePeriodPolicy.replace(valueDes);
          break;
        case r'addresses.max.size.bytes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.addressesPeriodMaxPeriodSizePeriodBytes.replace(valueDes);
          break;
        case r'addresses.page.size.bytes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.addressesPeriodPagePeriodSizePeriodBytes.replace(valueDes);
          break;
        case r'addresses.page.cache.max.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.addressesPeriodPagePeriodCachePeriodMaxPeriodSize.replace(valueDes);
          break;
        case r'cluster.user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.clusterPeriodUser.replace(valueDes);
          break;
        case r'cluster.password':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.clusterPeriodPassword.replace(valueDes);
          break;
        case r'cluster.call.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodCallPeriodTimeout.replace(valueDes);
          break;
        case r'cluster.call.failover.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodCallPeriodFailoverPeriodTimeout.replace(valueDes);
          break;
        case r'cluster.client.failure.check.period':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodClientPeriodFailurePeriodCheckPeriodPeriod.replace(valueDes);
          break;
        case r'cluster.notification.attempts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodNotificationPeriodAttempts.replace(valueDes);
          break;
        case r'cluster.notification.interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodNotificationPeriodInterval.replace(valueDes);
          break;
        case r'id.cache.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.idPeriodCachePeriodSize.replace(valueDes);
          break;
        case r'cluster.confirmation.window.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodConfirmationPeriodWindowPeriodSize.replace(valueDes);
          break;
        case r'cluster.connection.ttl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodConnectionPeriodTtl.replace(valueDes);
          break;
        case r'cluster.duplicate.detection':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.clusterPeriodDuplicatePeriodDetection.replace(valueDes);
          break;
        case r'cluster.initial.connect.attempts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodInitialPeriodConnectPeriodAttempts.replace(valueDes);
          break;
        case r'cluster.max.retry.interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodMaxPeriodRetryPeriodInterval.replace(valueDes);
          break;
        case r'cluster.min.large.message.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodMinPeriodLargePeriodMessagePeriodSize.replace(valueDes);
          break;
        case r'cluster.producer.window.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodProducerPeriodWindowPeriodSize.replace(valueDes);
          break;
        case r'cluster.reconnect.attempts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodReconnectPeriodAttempts.replace(valueDes);
          break;
        case r'cluster.retry.interval':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodRetryPeriodInterval.replace(valueDes);
          break;
        case r'cluster.retry.interval.multiplier':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyFloat),
          ) as ConfigNodePropertyFloat?;
          if (valueDes == null) continue;
          result.clusterPeriodRetryPeriodIntervalPeriodMultiplier.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesBuilder();
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

