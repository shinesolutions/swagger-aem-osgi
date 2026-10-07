//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_event_impl_jobs_jcr_persistence_handler_properties.g.dart';

/// OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties
///
/// Properties:
/// * [jobPeriodConsumermanagerPeriodDisableDistribution] 
/// * [startupPeriodDelay] 
/// * [cleanupPeriodPeriod] 
@BuiltValue()
abstract class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties implements Built<OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties, OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'job.consumermanager.disableDistribution')
  ConfigNodePropertyBoolean? get jobPeriodConsumermanagerPeriodDisableDistribution;

  @BuiltValueField(wireName: r'startup.delay')
  ConfigNodePropertyInteger? get startupPeriodDelay;

  @BuiltValueField(wireName: r'cleanup.period')
  ConfigNodePropertyInteger? get cleanupPeriodPeriod;

  OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties._();

  factory OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties([void updates(OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder b)]) = _$OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties> get serializer => _$OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesSerializer();
}

class _$OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties, _$OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties];

  @override
  final String wireName = r'OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.jobPeriodConsumermanagerPeriodDisableDistribution != null) {
      yield r'job.consumermanager.disableDistribution';
      yield serializers.serialize(
        object.jobPeriodConsumermanagerPeriodDisableDistribution,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.startupPeriodDelay != null) {
      yield r'startup.delay';
      yield serializers.serialize(
        object.startupPeriodDelay,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cleanupPeriodPeriod != null) {
      yield r'cleanup.period';
      yield serializers.serialize(
        object.cleanupPeriodPeriod,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'job.consumermanager.disableDistribution':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.jobPeriodConsumermanagerPeriodDisableDistribution.replace(valueDes);
          break;
        case r'startup.delay':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.startupPeriodDelay.replace(valueDes);
          break;
        case r'cleanup.period':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cleanupPeriodPeriod.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesBuilder();
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

