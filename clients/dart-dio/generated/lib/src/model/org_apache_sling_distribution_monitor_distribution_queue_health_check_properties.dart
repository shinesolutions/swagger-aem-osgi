//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_monitor_distribution_queue_health_check_properties.g.dart';

/// OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties
///
/// Properties:
/// * [hcPeriodName] 
/// * [hcPeriodTags] 
/// * [hcPeriodMbeanPeriodName] 
/// * [numberOfRetriesAllowed] 
@BuiltValue()
abstract class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties implements Built<OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties, OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.name')
  ConfigNodePropertyString? get hcPeriodName;

  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  @BuiltValueField(wireName: r'hc.mbean.name')
  ConfigNodePropertyString? get hcPeriodMbeanPeriodName;

  @BuiltValueField(wireName: r'numberOfRetriesAllowed')
  ConfigNodePropertyInteger? get numberOfRetriesAllowed;

  OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties._();

  factory OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties([void updates(OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder b)]) = _$OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties> get serializer => _$OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesSerializer();
}

class _$OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties, _$OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodName != null) {
      yield r'hc.name';
      yield serializers.serialize(
        object.hcPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.hcPeriodMbeanPeriodName != null) {
      yield r'hc.mbean.name';
      yield serializers.serialize(
        object.hcPeriodMbeanPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.numberOfRetriesAllowed != null) {
      yield r'numberOfRetriesAllowed';
      yield serializers.serialize(
        object.numberOfRetriesAllowed,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hc.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.hcPeriodName.replace(valueDes);
          break;
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        case r'hc.mbean.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.hcPeriodMbeanPeriodName.replace(valueDes);
          break;
        case r'numberOfRetriesAllowed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.numberOfRetriesAllowed.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesBuilder();
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

