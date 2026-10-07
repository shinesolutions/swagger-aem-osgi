//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_float.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties.g.dart';

/// ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties
///
/// Properties:
/// * [jmxPeriodObjectname] 
/// * [propertyPeriodMeasurePeriodEnabled] 
/// * [propertyPeriodName] 
/// * [propertyPeriodMaxPeriodWaitPeriodMs] 
/// * [propertyPeriodMaxPeriodRate] 
/// * [fulltextPeriodMeasurePeriodEnabled] 
/// * [fulltextPeriodName] 
/// * [fulltextPeriodMaxPeriodWaitPeriodMs] 
/// * [fulltextPeriodMaxPeriodRate] 
@BuiltValue()
abstract class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties implements Built<ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties, ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder> {
  @BuiltValueField(wireName: r'jmx.objectname')
  ConfigNodePropertyString? get jmxPeriodObjectname;

  @BuiltValueField(wireName: r'property.measure.enabled')
  ConfigNodePropertyBoolean? get propertyPeriodMeasurePeriodEnabled;

  @BuiltValueField(wireName: r'property.name')
  ConfigNodePropertyString? get propertyPeriodName;

  @BuiltValueField(wireName: r'property.max.wait.ms')
  ConfigNodePropertyInteger? get propertyPeriodMaxPeriodWaitPeriodMs;

  @BuiltValueField(wireName: r'property.max.rate')
  ConfigNodePropertyFloat? get propertyPeriodMaxPeriodRate;

  @BuiltValueField(wireName: r'fulltext.measure.enabled')
  ConfigNodePropertyBoolean? get fulltextPeriodMeasurePeriodEnabled;

  @BuiltValueField(wireName: r'fulltext.name')
  ConfigNodePropertyString? get fulltextPeriodName;

  @BuiltValueField(wireName: r'fulltext.max.wait.ms')
  ConfigNodePropertyInteger? get fulltextPeriodMaxPeriodWaitPeriodMs;

  @BuiltValueField(wireName: r'fulltext.max.rate')
  ConfigNodePropertyFloat? get fulltextPeriodMaxPeriodRate;

  ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties._();

  factory ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties([void updates(ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder b)]) = _$ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties> get serializer => _$ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesSerializer();
}

class _$ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties, _$ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.jmxPeriodObjectname != null) {
      yield r'jmx.objectname';
      yield serializers.serialize(
        object.jmxPeriodObjectname,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.propertyPeriodMeasurePeriodEnabled != null) {
      yield r'property.measure.enabled';
      yield serializers.serialize(
        object.propertyPeriodMeasurePeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.propertyPeriodName != null) {
      yield r'property.name';
      yield serializers.serialize(
        object.propertyPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.propertyPeriodMaxPeriodWaitPeriodMs != null) {
      yield r'property.max.wait.ms';
      yield serializers.serialize(
        object.propertyPeriodMaxPeriodWaitPeriodMs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.propertyPeriodMaxPeriodRate != null) {
      yield r'property.max.rate';
      yield serializers.serialize(
        object.propertyPeriodMaxPeriodRate,
        specifiedType: const FullType(ConfigNodePropertyFloat),
      );
    }
    if (object.fulltextPeriodMeasurePeriodEnabled != null) {
      yield r'fulltext.measure.enabled';
      yield serializers.serialize(
        object.fulltextPeriodMeasurePeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.fulltextPeriodName != null) {
      yield r'fulltext.name';
      yield serializers.serialize(
        object.fulltextPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.fulltextPeriodMaxPeriodWaitPeriodMs != null) {
      yield r'fulltext.max.wait.ms';
      yield serializers.serialize(
        object.fulltextPeriodMaxPeriodWaitPeriodMs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.fulltextPeriodMaxPeriodRate != null) {
      yield r'fulltext.max.rate';
      yield serializers.serialize(
        object.fulltextPeriodMaxPeriodRate,
        specifiedType: const FullType(ConfigNodePropertyFloat),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'jmx.objectname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jmxPeriodObjectname.replace(valueDes);
          break;
        case r'property.measure.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.propertyPeriodMeasurePeriodEnabled.replace(valueDes);
          break;
        case r'property.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.propertyPeriodName.replace(valueDes);
          break;
        case r'property.max.wait.ms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.propertyPeriodMaxPeriodWaitPeriodMs.replace(valueDes);
          break;
        case r'property.max.rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyFloat),
          ) as ConfigNodePropertyFloat?;
          if (valueDes == null) continue;
          result.propertyPeriodMaxPeriodRate.replace(valueDes);
          break;
        case r'fulltext.measure.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.fulltextPeriodMeasurePeriodEnabled.replace(valueDes);
          break;
        case r'fulltext.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.fulltextPeriodName.replace(valueDes);
          break;
        case r'fulltext.max.wait.ms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.fulltextPeriodMaxPeriodWaitPeriodMs.replace(valueDes);
          break;
        case r'fulltext.max.rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyFloat),
          ) as ConfigNodePropertyFloat?;
          if (valueDes == null) continue;
          result.fulltextPeriodMaxPeriodRate.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesBuilder();
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

