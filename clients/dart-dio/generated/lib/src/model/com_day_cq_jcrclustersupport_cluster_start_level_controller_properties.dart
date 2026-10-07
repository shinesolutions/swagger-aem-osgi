//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_jcrclustersupport_cluster_start_level_controller_properties.g.dart';

/// ComDayCqJcrclustersupportClusterStartLevelControllerProperties
///
/// Properties:
/// * [clusterPeriodLevelPeriodEnable] 
/// * [clusterPeriodMasterPeriodLevel] 
/// * [clusterPeriodSlavePeriodLevel] 
@BuiltValue()
abstract class ComDayCqJcrclustersupportClusterStartLevelControllerProperties implements Built<ComDayCqJcrclustersupportClusterStartLevelControllerProperties, ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder> {
  @BuiltValueField(wireName: r'cluster.level.enable')
  ConfigNodePropertyBoolean? get clusterPeriodLevelPeriodEnable;

  @BuiltValueField(wireName: r'cluster.master.level')
  ConfigNodePropertyInteger? get clusterPeriodMasterPeriodLevel;

  @BuiltValueField(wireName: r'cluster.slave.level')
  ConfigNodePropertyInteger? get clusterPeriodSlavePeriodLevel;

  ComDayCqJcrclustersupportClusterStartLevelControllerProperties._();

  factory ComDayCqJcrclustersupportClusterStartLevelControllerProperties([void updates(ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder b)]) = _$ComDayCqJcrclustersupportClusterStartLevelControllerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqJcrclustersupportClusterStartLevelControllerProperties> get serializer => _$ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesSerializer();
}

class _$ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesSerializer implements PrimitiveSerializer<ComDayCqJcrclustersupportClusterStartLevelControllerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqJcrclustersupportClusterStartLevelControllerProperties, _$ComDayCqJcrclustersupportClusterStartLevelControllerProperties];

  @override
  final String wireName = r'ComDayCqJcrclustersupportClusterStartLevelControllerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqJcrclustersupportClusterStartLevelControllerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.clusterPeriodLevelPeriodEnable != null) {
      yield r'cluster.level.enable';
      yield serializers.serialize(
        object.clusterPeriodLevelPeriodEnable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.clusterPeriodMasterPeriodLevel != null) {
      yield r'cluster.master.level';
      yield serializers.serialize(
        object.clusterPeriodMasterPeriodLevel,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.clusterPeriodSlavePeriodLevel != null) {
      yield r'cluster.slave.level';
      yield serializers.serialize(
        object.clusterPeriodSlavePeriodLevel,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqJcrclustersupportClusterStartLevelControllerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cluster.level.enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.clusterPeriodLevelPeriodEnable.replace(valueDes);
          break;
        case r'cluster.master.level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodMasterPeriodLevel.replace(valueDes);
          break;
        case r'cluster.slave.level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.clusterPeriodSlavePeriodLevel.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqJcrclustersupportClusterStartLevelControllerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder();
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

