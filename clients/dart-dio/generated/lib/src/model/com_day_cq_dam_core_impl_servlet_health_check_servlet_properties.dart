//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_health_check_servlet_properties.g.dart';

/// ComDayCqDamCoreImplServletHealthCheckServletProperties
///
/// Properties:
/// * [cqPeriodDamPeriodSyncPeriodWorkflowPeriodId] 
/// * [cqPeriodDamPeriodSyncPeriodFolderPeriodTypes] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletHealthCheckServletProperties implements Built<ComDayCqDamCoreImplServletHealthCheckServletProperties, ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.sync.workflow.id')
  ConfigNodePropertyString? get cqPeriodDamPeriodSyncPeriodWorkflowPeriodId;

  @BuiltValueField(wireName: r'cq.dam.sync.folder.types')
  ConfigNodePropertyArray? get cqPeriodDamPeriodSyncPeriodFolderPeriodTypes;

  ComDayCqDamCoreImplServletHealthCheckServletProperties._();

  factory ComDayCqDamCoreImplServletHealthCheckServletProperties([void updates(ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletHealthCheckServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletHealthCheckServletProperties> get serializer => _$ComDayCqDamCoreImplServletHealthCheckServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletHealthCheckServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletHealthCheckServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletHealthCheckServletProperties, _$ComDayCqDamCoreImplServletHealthCheckServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletHealthCheckServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletHealthCheckServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodSyncPeriodWorkflowPeriodId != null) {
      yield r'cq.dam.sync.workflow.id';
      yield serializers.serialize(
        object.cqPeriodDamPeriodSyncPeriodWorkflowPeriodId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodDamPeriodSyncPeriodFolderPeriodTypes != null) {
      yield r'cq.dam.sync.folder.types';
      yield serializers.serialize(
        object.cqPeriodDamPeriodSyncPeriodFolderPeriodTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplServletHealthCheckServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.sync.workflow.id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodSyncPeriodWorkflowPeriodId.replace(valueDes);
          break;
        case r'cq.dam.sync.folder.types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodSyncPeriodFolderPeriodTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplServletHealthCheckServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletHealthCheckServletPropertiesBuilder();
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

