//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_workflow_purge_scheduler_properties.g.dart';

/// ComAdobeGraniteWorkflowPurgeSchedulerProperties
///
/// Properties:
/// * [scheduledpurgePeriodName] 
/// * [scheduledpurgePeriodWorkflowStatus] 
/// * [scheduledpurgePeriodModelIds] 
/// * [scheduledpurgePeriodDaysold] 
@BuiltValue()
abstract class ComAdobeGraniteWorkflowPurgeSchedulerProperties implements Built<ComAdobeGraniteWorkflowPurgeSchedulerProperties, ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduledpurge.name')
  ConfigNodePropertyString? get scheduledpurgePeriodName;

  @BuiltValueField(wireName: r'scheduledpurge.workflowStatus')
  ConfigNodePropertyDropDown? get scheduledpurgePeriodWorkflowStatus;

  @BuiltValueField(wireName: r'scheduledpurge.modelIds')
  ConfigNodePropertyArray? get scheduledpurgePeriodModelIds;

  @BuiltValueField(wireName: r'scheduledpurge.daysold')
  ConfigNodePropertyInteger? get scheduledpurgePeriodDaysold;

  ComAdobeGraniteWorkflowPurgeSchedulerProperties._();

  factory ComAdobeGraniteWorkflowPurgeSchedulerProperties([void updates(ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder b)]) = _$ComAdobeGraniteWorkflowPurgeSchedulerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteWorkflowPurgeSchedulerProperties> get serializer => _$ComAdobeGraniteWorkflowPurgeSchedulerPropertiesSerializer();
}

class _$ComAdobeGraniteWorkflowPurgeSchedulerPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteWorkflowPurgeSchedulerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteWorkflowPurgeSchedulerProperties, _$ComAdobeGraniteWorkflowPurgeSchedulerProperties];

  @override
  final String wireName = r'ComAdobeGraniteWorkflowPurgeSchedulerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteWorkflowPurgeSchedulerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.scheduledpurgePeriodName != null) {
      yield r'scheduledpurge.name';
      yield serializers.serialize(
        object.scheduledpurgePeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.scheduledpurgePeriodWorkflowStatus != null) {
      yield r'scheduledpurge.workflowStatus';
      yield serializers.serialize(
        object.scheduledpurgePeriodWorkflowStatus,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.scheduledpurgePeriodModelIds != null) {
      yield r'scheduledpurge.modelIds';
      yield serializers.serialize(
        object.scheduledpurgePeriodModelIds,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.scheduledpurgePeriodDaysold != null) {
      yield r'scheduledpurge.daysold';
      yield serializers.serialize(
        object.scheduledpurgePeriodDaysold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteWorkflowPurgeSchedulerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder result,
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
        case r'scheduledpurge.workflowStatus':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.scheduledpurgePeriodWorkflowStatus.replace(valueDes);
          break;
        case r'scheduledpurge.modelIds':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.scheduledpurgePeriodModelIds.replace(valueDes);
          break;
        case r'scheduledpurge.daysold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.scheduledpurgePeriodDaysold.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteWorkflowPurgeSchedulerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteWorkflowPurgeSchedulerPropertiesBuilder();
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

