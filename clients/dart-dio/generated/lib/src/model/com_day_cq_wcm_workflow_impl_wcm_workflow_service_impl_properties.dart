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

part 'com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties.g.dart';

/// ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties
///
/// Properties:
/// * [eventPeriodFilter] 
/// * [minThreadPoolSize] 
/// * [maxThreadPoolSize] 
/// * [cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate] 
/// * [cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList] 
@BuiltValue()
abstract class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties implements Built<ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties, ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.filter')
  ConfigNodePropertyString? get eventPeriodFilter;

  @BuiltValueField(wireName: r'minThreadPoolSize')
  ConfigNodePropertyInteger? get minThreadPoolSize;

  @BuiltValueField(wireName: r'maxThreadPoolSize')
  ConfigNodePropertyInteger? get maxThreadPoolSize;

  @BuiltValueField(wireName: r'cq.wcm.workflow.terminate.on.activate')
  ConfigNodePropertyBoolean? get cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate;

  @BuiltValueField(wireName: r'cq.wcm.worklfow.terminate.exclusion.list')
  ConfigNodePropertyArray? get cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList;

  ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties._();

  factory ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties([void updates(ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder b)]) = _$ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties> get serializer => _$ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesSerializer();
}

class _$ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties, _$ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties];

  @override
  final String wireName = r'ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventPeriodFilter != null) {
      yield r'event.filter';
      yield serializers.serialize(
        object.eventPeriodFilter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.minThreadPoolSize != null) {
      yield r'minThreadPoolSize';
      yield serializers.serialize(
        object.minThreadPoolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxThreadPoolSize != null) {
      yield r'maxThreadPoolSize';
      yield serializers.serialize(
        object.maxThreadPoolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate != null) {
      yield r'cq.wcm.workflow.terminate.on.activate';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList != null) {
      yield r'cq.wcm.worklfow.terminate.exclusion.list';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event.filter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.eventPeriodFilter.replace(valueDes);
          break;
        case r'minThreadPoolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.minThreadPoolSize.replace(valueDes);
          break;
        case r'maxThreadPoolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxThreadPoolSize.replace(valueDes);
          break;
        case r'cq.wcm.workflow.terminate.on.activate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate.replace(valueDes);
          break;
        case r'cq.wcm.worklfow.terminate.exclusion.list':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder();
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

