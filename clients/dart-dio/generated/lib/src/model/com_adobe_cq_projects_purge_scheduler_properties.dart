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

part 'com_adobe_cq_projects_purge_scheduler_properties.g.dart';

/// ComAdobeCqProjectsPurgeSchedulerProperties
///
/// Properties:
/// * [scheduledpurgePeriodName] 
/// * [scheduledpurgePeriodPurgeActive] 
/// * [scheduledpurgePeriodTemplates] 
/// * [scheduledpurgePeriodPurgeGroups] 
/// * [scheduledpurgePeriodPurgeAssets] 
/// * [scheduledpurgePeriodTerminateRunningWorkflows] 
/// * [scheduledpurgePeriodDaysold] 
/// * [scheduledpurgePeriodSaveThreshold] 
@BuiltValue()
abstract class ComAdobeCqProjectsPurgeSchedulerProperties implements Built<ComAdobeCqProjectsPurgeSchedulerProperties, ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduledpurge.name')
  ConfigNodePropertyString? get scheduledpurgePeriodName;

  @BuiltValueField(wireName: r'scheduledpurge.purgeActive')
  ConfigNodePropertyBoolean? get scheduledpurgePeriodPurgeActive;

  @BuiltValueField(wireName: r'scheduledpurge.templates')
  ConfigNodePropertyArray? get scheduledpurgePeriodTemplates;

  @BuiltValueField(wireName: r'scheduledpurge.purgeGroups')
  ConfigNodePropertyBoolean? get scheduledpurgePeriodPurgeGroups;

  @BuiltValueField(wireName: r'scheduledpurge.purgeAssets')
  ConfigNodePropertyBoolean? get scheduledpurgePeriodPurgeAssets;

  @BuiltValueField(wireName: r'scheduledpurge.terminateRunningWorkflows')
  ConfigNodePropertyBoolean? get scheduledpurgePeriodTerminateRunningWorkflows;

  @BuiltValueField(wireName: r'scheduledpurge.daysold')
  ConfigNodePropertyInteger? get scheduledpurgePeriodDaysold;

  @BuiltValueField(wireName: r'scheduledpurge.saveThreshold')
  ConfigNodePropertyInteger? get scheduledpurgePeriodSaveThreshold;

  ComAdobeCqProjectsPurgeSchedulerProperties._();

  factory ComAdobeCqProjectsPurgeSchedulerProperties([void updates(ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder b)]) = _$ComAdobeCqProjectsPurgeSchedulerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqProjectsPurgeSchedulerProperties> get serializer => _$ComAdobeCqProjectsPurgeSchedulerPropertiesSerializer();
}

class _$ComAdobeCqProjectsPurgeSchedulerPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqProjectsPurgeSchedulerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqProjectsPurgeSchedulerProperties, _$ComAdobeCqProjectsPurgeSchedulerProperties];

  @override
  final String wireName = r'ComAdobeCqProjectsPurgeSchedulerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqProjectsPurgeSchedulerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.scheduledpurgePeriodName != null) {
      yield r'scheduledpurge.name';
      yield serializers.serialize(
        object.scheduledpurgePeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.scheduledpurgePeriodPurgeActive != null) {
      yield r'scheduledpurge.purgeActive';
      yield serializers.serialize(
        object.scheduledpurgePeriodPurgeActive,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.scheduledpurgePeriodTemplates != null) {
      yield r'scheduledpurge.templates';
      yield serializers.serialize(
        object.scheduledpurgePeriodTemplates,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.scheduledpurgePeriodPurgeGroups != null) {
      yield r'scheduledpurge.purgeGroups';
      yield serializers.serialize(
        object.scheduledpurgePeriodPurgeGroups,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.scheduledpurgePeriodPurgeAssets != null) {
      yield r'scheduledpurge.purgeAssets';
      yield serializers.serialize(
        object.scheduledpurgePeriodPurgeAssets,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.scheduledpurgePeriodTerminateRunningWorkflows != null) {
      yield r'scheduledpurge.terminateRunningWorkflows';
      yield serializers.serialize(
        object.scheduledpurgePeriodTerminateRunningWorkflows,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.scheduledpurgePeriodDaysold != null) {
      yield r'scheduledpurge.daysold';
      yield serializers.serialize(
        object.scheduledpurgePeriodDaysold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.scheduledpurgePeriodSaveThreshold != null) {
      yield r'scheduledpurge.saveThreshold';
      yield serializers.serialize(
        object.scheduledpurgePeriodSaveThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqProjectsPurgeSchedulerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scheduledpurge.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.scheduledpurgePeriodName.replace(valueDes);
          break;
        case r'scheduledpurge.purgeActive':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.scheduledpurgePeriodPurgeActive.replace(valueDes);
          break;
        case r'scheduledpurge.templates':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.scheduledpurgePeriodTemplates.replace(valueDes);
          break;
        case r'scheduledpurge.purgeGroups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.scheduledpurgePeriodPurgeGroups.replace(valueDes);
          break;
        case r'scheduledpurge.purgeAssets':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.scheduledpurgePeriodPurgeAssets.replace(valueDes);
          break;
        case r'scheduledpurge.terminateRunningWorkflows':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.scheduledpurgePeriodTerminateRunningWorkflows.replace(valueDes);
          break;
        case r'scheduledpurge.daysold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.scheduledpurgePeriodDaysold.replace(valueDes);
          break;
        case r'scheduledpurge.saveThreshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.scheduledpurgePeriodSaveThreshold.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqProjectsPurgeSchedulerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqProjectsPurgeSchedulerPropertiesBuilder();
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

