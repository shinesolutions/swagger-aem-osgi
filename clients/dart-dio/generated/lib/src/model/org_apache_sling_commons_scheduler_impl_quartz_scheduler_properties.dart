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

part 'org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties.g.dart';

/// OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties
///
/// Properties:
/// * [poolName] 
/// * [allowedPoolNames] 
/// * [schedulerPeriodUseleaderforsingle] 
/// * [metricsPeriodFilters] 
/// * [slowThresholdMillis] 
@BuiltValue()
abstract class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties implements Built<OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties, OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder> {
  @BuiltValueField(wireName: r'poolName')
  ConfigNodePropertyString? get poolName;

  @BuiltValueField(wireName: r'allowedPoolNames')
  ConfigNodePropertyArray? get allowedPoolNames;

  @BuiltValueField(wireName: r'scheduler.useleaderforsingle')
  ConfigNodePropertyBoolean? get schedulerPeriodUseleaderforsingle;

  @BuiltValueField(wireName: r'metrics.filters')
  ConfigNodePropertyArray? get metricsPeriodFilters;

  @BuiltValueField(wireName: r'slowThresholdMillis')
  ConfigNodePropertyInteger? get slowThresholdMillis;

  OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties._();

  factory OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties([void updates(OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder b)]) = _$OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties> get serializer => _$OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesSerializer();
}

class _$OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties, _$OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties];

  @override
  final String wireName = r'OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.poolName != null) {
      yield r'poolName';
      yield serializers.serialize(
        object.poolName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.allowedPoolNames != null) {
      yield r'allowedPoolNames';
      yield serializers.serialize(
        object.allowedPoolNames,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.schedulerPeriodUseleaderforsingle != null) {
      yield r'scheduler.useleaderforsingle';
      yield serializers.serialize(
        object.schedulerPeriodUseleaderforsingle,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.metricsPeriodFilters != null) {
      yield r'metrics.filters';
      yield serializers.serialize(
        object.metricsPeriodFilters,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.slowThresholdMillis != null) {
      yield r'slowThresholdMillis';
      yield serializers.serialize(
        object.slowThresholdMillis,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'poolName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.poolName.replace(valueDes);
          break;
        case r'allowedPoolNames':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.allowedPoolNames.replace(valueDes);
          break;
        case r'scheduler.useleaderforsingle':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.schedulerPeriodUseleaderforsingle.replace(valueDes);
          break;
        case r'metrics.filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.metricsPeriodFilters.replace(valueDes);
          break;
        case r'slowThresholdMillis':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.slowThresholdMillis.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesBuilder();
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

