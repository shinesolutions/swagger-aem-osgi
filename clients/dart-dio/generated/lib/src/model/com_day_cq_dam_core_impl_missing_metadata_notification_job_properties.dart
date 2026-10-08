//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_missing_metadata_notification_job_properties.g.dart';

/// ComDayCqDamCoreImplMissingMetadataNotificationJobProperties
///
/// Properties:
/// * [cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased] 
/// * [cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule] 
/// * [cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule] 
/// * [cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient] 
@BuiltValue()
abstract class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties implements Built<ComDayCqDamCoreImplMissingMetadataNotificationJobProperties, ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.missingmetadata.notification.scheduler.istimebased')
  ConfigNodePropertyBoolean? get cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased;

  @BuiltValueField(wireName: r'cq.dam.missingmetadata.notification.scheduler.timebased.rule')
  ConfigNodePropertyString? get cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule;

  @BuiltValueField(wireName: r'cq.dam.missingmetadata.notification.scheduler.period.rule')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule;

  @BuiltValueField(wireName: r'cq.dam.missingmetadata.notification.recipient')
  ConfigNodePropertyString? get cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient;

  ComDayCqDamCoreImplMissingMetadataNotificationJobProperties._();

  factory ComDayCqDamCoreImplMissingMetadataNotificationJobProperties([void updates(ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder b)]) = _$ComDayCqDamCoreImplMissingMetadataNotificationJobProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplMissingMetadataNotificationJobProperties> get serializer => _$ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesSerializer();
}

class _$ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplMissingMetadataNotificationJobProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplMissingMetadataNotificationJobProperties, _$ComDayCqDamCoreImplMissingMetadataNotificationJobProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplMissingMetadataNotificationJobProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplMissingMetadataNotificationJobProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased != null) {
      yield r'cq.dam.missingmetadata.notification.scheduler.istimebased';
      yield serializers.serialize(
        object.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule != null) {
      yield r'cq.dam.missingmetadata.notification.scheduler.timebased.rule';
      yield serializers.serialize(
        object.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule != null) {
      yield r'cq.dam.missingmetadata.notification.scheduler.period.rule';
      yield serializers.serialize(
        object.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient != null) {
      yield r'cq.dam.missingmetadata.notification.recipient';
      yield serializers.serialize(
        object.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplMissingMetadataNotificationJobProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.missingmetadata.notification.scheduler.istimebased':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodIstimebased.replace(valueDes);
          break;
        case r'cq.dam.missingmetadata.notification.scheduler.timebased.rule':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodTimebasedPeriodRule.replace(valueDes);
          break;
        case r'cq.dam.missingmetadata.notification.scheduler.period.rule':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodSchedulerPeriodPeriodPeriodRule.replace(valueDes);
          break;
        case r'cq.dam.missingmetadata.notification.recipient':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodMissingmetadataPeriodNotificationPeriodRecipient.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplMissingMetadataNotificationJobProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder();
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

