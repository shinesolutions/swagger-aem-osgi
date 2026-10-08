//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties.g.dart';

/// ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties
///
/// Properties:
/// * [preUpgradePeriodMaintenancePeriodTasks] 
/// * [preUpgradePeriodHcPeriodTags] 
@BuiltValue()
abstract class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties implements Built<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties, ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'pre-upgrade.maintenance.tasks')
  ConfigNodePropertyArray? get preUpgradePeriodMaintenancePeriodTasks;

  @BuiltValueField(wireName: r'pre-upgrade.hc.tags')
  ConfigNodePropertyArray? get preUpgradePeriodHcPeriodTags;

  ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties._();

  factory ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties([void updates(ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder b)]) = _$ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties> get serializer => _$ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesSerializer();
}

class _$ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties, _$ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties];

  @override
  final String wireName = r'ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.preUpgradePeriodMaintenancePeriodTasks != null) {
      yield r'pre-upgrade.maintenance.tasks';
      yield serializers.serialize(
        object.preUpgradePeriodMaintenancePeriodTasks,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.preUpgradePeriodHcPeriodTags != null) {
      yield r'pre-upgrade.hc.tags';
      yield serializers.serialize(
        object.preUpgradePeriodHcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pre-upgrade.maintenance.tasks':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.preUpgradePeriodMaintenancePeriodTasks.replace(valueDes);
          break;
        case r'pre-upgrade.hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.preUpgradePeriodHcPeriodTags.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesBuilder();
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

