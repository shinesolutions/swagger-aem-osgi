//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_expiry_notification_job_impl_properties.g.dart';

/// ComDayCqDamCoreImplExpiryNotificationJobImplProperties
///
/// Properties:
/// * [cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased] 
/// * [cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule] 
/// * [cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule] 
/// * [sendEmail] 
/// * [assetExpiredLimit] 
/// * [priorNotificationSeconds] 
/// * [cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol] 
@BuiltValue()
abstract class ComDayCqDamCoreImplExpiryNotificationJobImplProperties implements Built<ComDayCqDamCoreImplExpiryNotificationJobImplProperties, ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.expiry.notification.scheduler.istimebased')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased;

  @BuiltValueField(wireName: r'cq.dam.expiry.notification.scheduler.timebased.rule')
  ConfigNodePropertyString? get cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule;

  @BuiltValueField(wireName: r'cq.dam.expiry.notification.scheduler.period.rule')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule;

  @BuiltValueField(wireName: r'send_email')
  ConfigNodePropertyBoolean? get sendEmail;

  @BuiltValueField(wireName: r'asset_expired_limit')
  ConfigNodePropertyInteger? get assetExpiredLimit;

  @BuiltValueField(wireName: r'prior_notification_seconds')
  ConfigNodePropertyInteger? get priorNotificationSeconds;

  @BuiltValueField(wireName: r'cq.dam.expiry.notification.url.protocol')
  ConfigNodePropertyString? get cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol;

  ComDayCqDamCoreImplExpiryNotificationJobImplProperties._();

  factory ComDayCqDamCoreImplExpiryNotificationJobImplProperties([void updates(ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder b)]) = _$ComDayCqDamCoreImplExpiryNotificationJobImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplExpiryNotificationJobImplProperties> get serializer => _$ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesSerializer();
}

class _$ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplExpiryNotificationJobImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplExpiryNotificationJobImplProperties, _$ComDayCqDamCoreImplExpiryNotificationJobImplProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplExpiryNotificationJobImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplExpiryNotificationJobImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased != null) {
      yield r'cq.dam.expiry.notification.scheduler.istimebased';
      yield serializers.serialize(
        object.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule != null) {
      yield r'cq.dam.expiry.notification.scheduler.timebased.rule';
      yield serializers.serialize(
        object.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule != null) {
      yield r'cq.dam.expiry.notification.scheduler.period.rule';
      yield serializers.serialize(
        object.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.sendEmail != null) {
      yield r'send_email';
      yield serializers.serialize(
        object.sendEmail,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.assetExpiredLimit != null) {
      yield r'asset_expired_limit';
      yield serializers.serialize(
        object.assetExpiredLimit,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.priorNotificationSeconds != null) {
      yield r'prior_notification_seconds';
      yield serializers.serialize(
        object.priorNotificationSeconds,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol != null) {
      yield r'cq.dam.expiry.notification.url.protocol';
      yield serializers.serialize(
        object.cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplExpiryNotificationJobImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.expiry.notification.scheduler.istimebased':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodIstimebased.replace(valueDes);
          break;
        case r'cq.dam.expiry.notification.scheduler.timebased.rule':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule.replace(valueDes);
          break;
        case r'cq.dam.expiry.notification.scheduler.period.rule':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodExpiryPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule.replace(valueDes);
          break;
        case r'send_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.sendEmail.replace(valueDes);
          break;
        case r'asset_expired_limit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.assetExpiredLimit.replace(valueDes);
          break;
        case r'prior_notification_seconds':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.priorNotificationSeconds.replace(valueDes);
          break;
        case r'cq.dam.expiry.notification.url.protocol':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodExpiryPeriodNotificationPeriodUrlPeriodProtocol.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplExpiryNotificationJobImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder();
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

