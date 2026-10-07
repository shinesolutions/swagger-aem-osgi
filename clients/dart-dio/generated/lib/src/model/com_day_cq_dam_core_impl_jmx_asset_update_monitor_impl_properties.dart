//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properties.g.dart';

/// ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties
///
/// Properties:
/// * [jmxPeriodObjectname] 
/// * [active] 
@BuiltValue()
abstract class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties implements Built<ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties, ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'jmx.objectname')
  ConfigNodePropertyString? get jmxPeriodObjectname;

  @BuiltValueField(wireName: r'active')
  ConfigNodePropertyBoolean? get active;

  ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties._();

  factory ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties([void updates(ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder b)]) = _$ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties> get serializer => _$ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesSerializer();
}

class _$ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties, _$ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.jmxPeriodObjectname != null) {
      yield r'jmx.objectname';
      yield serializers.serialize(
        object.jmxPeriodObjectname,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.active != null) {
      yield r'active';
      yield serializers.serialize(
        object.active,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder result,
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
        case r'active':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.active.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesBuilder();
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

