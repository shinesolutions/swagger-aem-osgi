//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl_properties.g.dart';

/// ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties
///
/// Properties:
/// * [jmxPeriodObjectname] 
@BuiltValue()
abstract class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties implements Built<ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties, ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'jmx.objectname')
  ConfigNodePropertyString? get jmxPeriodObjectname;

  ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties._();

  factory ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties([void updates(ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesBuilder b)]) = _$ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties> get serializer => _$ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesSerializer();
}

class _$ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties, _$ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.jmxPeriodObjectname != null) {
      yield r'jmx.objectname';
      yield serializers.serialize(
        object.jmxPeriodObjectname,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesBuilder();
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

