//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties.g.dart';

/// OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties
///
/// Properties:
/// * [maxPeriodQuartzJobPeriodDurationPeriodAcceptable] 
@BuiltValue()
abstract class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties implements Built<OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties, OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'max.quartzJob.duration.acceptable')
  ConfigNodePropertyInteger? get maxPeriodQuartzJobPeriodDurationPeriodAcceptable;

  OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties._();

  factory OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties([void updates(OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesBuilder b)]) = _$OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties> get serializer => _$OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesSerializer();
}

class _$OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties, _$OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties];

  @override
  final String wireName = r'OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxPeriodQuartzJobPeriodDurationPeriodAcceptable != null) {
      yield r'max.quartzJob.duration.acceptable';
      yield serializers.serialize(
        object.maxPeriodQuartzJobPeriodDurationPeriodAcceptable,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'max.quartzJob.duration.acceptable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxPeriodQuartzJobPeriodDurationPeriodAcceptable.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesBuilder();
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

